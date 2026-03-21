package com.oulim.app.volunteer.management.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.volunteer.dto.VolunActivityDTO;
import com.oulim.app.volunteer.management.service.VolunManageInsertService;

public class VolunManageInsertOkController implements Execute {

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Result result = new Result();
        HttpSession session = request.getSession();

        Integer organNo = (Integer) session.getAttribute("organNo");
        String organName = (String) session.getAttribute("organName");
        VolunActivityDTO volunActivityDTO = new VolunActivityDTO();

        volunActivityDTO.setVolunActTitle(request.getParameter("volunActTitle"));
        volunActivityDTO.setVolunActRecruBegin(request.getParameter("volunActRecruBegin"));
        volunActivityDTO.setVolunActRecruEnd(request.getParameter("volunActRecruEnd"));
        volunActivityDTO.setVolunActProcBegin(request.getParameter("volunActProcBegin"));
        volunActivityDTO.setVolunActProcEnd(request.getParameter("volunActProcEnd"));
        volunActivityDTO.setVolunActAddress(request.getParameter("volunActAddress"));
        volunActivityDTO.setVolunActAddressDetail(request.getParameter("volunActAddressDetail"));
        volunActivityDTO.setVolunActDetail(request.getParameter("volunActDetail"));
        volunActivityDTO.setVolunActPostnum(request.getParameter("volunActPostnum"));
        volunActivityDTO.setVolunActOrganNo(organNo);
        volunActivityDTO.setVolunActOrginName(organName);

        try {
            volunActivityDTO.setVolunActPoint(parseRequiredInt(request.getParameter("volunActPoint")));
            volunActivityDTO.setVolunActBeginTime(parseRequiredInt(request.getParameter("volunActBeginTime")));
            volunActivityDTO.setVolunActEndTime(parseRequiredInt(request.getParameter("volunActEndTime")));
            volunActivityDTO.setVolunActActType(parseRequiredInt(request.getParameter("volunActActType")));
            volunActivityDTO.setVolunActAgeGroup(parseRequiredInt(request.getParameter("volunActAgeGroup")));
            volunActivityDTO.setVolunActRecruMaxCount(parseRequiredInt(request.getParameter("volunActRecruMaxCount")));

            VolunManageInsertService service = new VolunManageInsertService();
            service.insertVolunteer(volunActivityDTO);

            result.setRedirect(true);
            result.setPath(request.getContextPath() + "/volunteer-manage/list.vm?message=insertSuccess");

        } catch (Exception e) {
            e.printStackTrace();

            result.setRedirect(true);
            result.setPath(request.getContextPath() + "/volunteer-manage/register.vm?message=insertFail");
        }

        return result;
    }

    private int parseRequiredInt(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("필수 숫자값이 비어 있습니다.");
        }
        return Integer.parseInt(value.trim());
    }
}