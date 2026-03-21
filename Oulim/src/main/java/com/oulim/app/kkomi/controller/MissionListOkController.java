package com.oulim.app.kkomi.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.common.util.DefineType;
import com.oulim.app.kkomi.dao.KkomiDAO;
import com.oulim.app.kkomi.dto.UserMissionDTO;

public class MissionListOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		KkomiDAO kkomiDAO = new KkomiDAO();
		Result result = new Result();
		if (request.getSession().getAttribute("userNo") == null) {
			result.setPath(request.getContextPath() + "/app/user/login/login.jsp");
			result.setRedirect(true);
			return result;
		}

		int userNo = (Integer) request.getSession().getAttribute("userNo");

		List<UserMissionDTO> missionList = kkomiDAO.getMyMission(userNo);
		if (missionList != null) {
			for (UserMissionDTO x : missionList) {
				//
				x.setRewardCount(DefineType.DEFAULT_MISSION_REWARD_COUNT);
				if (x.isNeedReset()) {					
					x.setMissionCurrCount(0);
					x.setMissionIsReward(false);

					// 출석 미션은 미션 창에 진입한 순간으로 설정한다.
					if (x.getMissionID() == DefineType.ATTENDANCE_MISSION_ID) {
						x.setMissionCurrCount(1);
						x.setLastUpdateDate(LocalDateTime.now());
					}
				}
			}

		}
		request.setAttribute("missionList", missionList);

		result.setPath("/app/kkomi/mission.jsp");
		result.setRedirect(false);
		return result;
	}

}
