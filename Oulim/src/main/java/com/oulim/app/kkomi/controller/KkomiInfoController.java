package com.oulim.app.kkomi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.common.util.DefineType;
import com.oulim.app.kkomi.dao.KkomiDAO;
import com.oulim.app.kkomi.dto.KkomiJoinDTO;
import com.oulim.app.kkomi.service.KkomiService;
import com.oulim.app.user.dao.UserDAO;

public class KkomiInfoController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		KkomiDAO kkomiDAO = new KkomiDAO();
		
		KkomiJoinDTO kkomiJoinDTO = new KkomiJoinDTO();	
		Result result = new Result();
		
		if(request.getSession().getAttribute("userNo") == null) {
			result.setPath(request.getContextPath() + "/app/user/login/login.jsp");
			result.setRedirect(true);
			return result;
		}
		
		int userNo = (Integer)request.getSession().getAttribute("userNo");
		
		
		kkomiJoinDTO = kkomiDAO.getKkomiInfo(userNo);
		if(kkomiJoinDTO == null) {
			result.setPath(request.getContextPath() + "/user/login.usr");
			result.setRedirect(true);
			return result;
		}
		
		if(kkomiJoinDTO.getMyRanking() == 0) {
			int totalUserCount = new UserDAO().getTotalUser(DefineType.NORMAL_USER_TYPE);
			System.out.println("총 유저수 : " + totalUserCount);
			kkomiJoinDTO.setMyRanking(totalUserCount);
		}
		KkomiService kkoService = new KkomiService();
		int currLv = kkomiJoinDTO.getKkomiLev() > 0 ? kkomiJoinDTO.getKkomiLev() : 1;
		int needExp = kkoService.getToRequireExpByLv(currLv + 1);
		kkomiJoinDTO.setNeedExp(needExp);
		request.setAttribute("kkomi", kkomiJoinDTO);
		
		System.out.println(kkomiJoinDTO.toString());
		
		result.setPath("/app/kkomi/kkomi-training-center.jsp");
		result.setRedirect(false);
		return result;
	}

}
