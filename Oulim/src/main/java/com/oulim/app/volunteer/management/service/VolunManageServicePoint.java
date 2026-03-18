package com.oulim.app.volunteer.management.service;

import com.oulim.app.volunteer.dao.VolunteerMangementDAO;
import com.oulim.app.volunteer.dto.PointJoinDTO;

public class VolunManageServicePoint  {

	public void attendanceProcess(PointJoinDTO pointJoinDTO, String[] userNos) {
		 VolunteerMangementDAO volunteerMangementDAO = new VolunteerMangementDAO();
	    for (String userNoStr : userNos) {
	        int userNo = Integer.parseInt(userNoStr);

	        pointJoinDTO.setUserNo(userNo);
	        pointJoinDTO.setCurrencyId(1);
	        pointJoinDTO.setLogReason("출석 포인트 지급");

	        volunteerMangementDAO.updateCurrency(pointJoinDTO);
//	        volunteerMangementDAO.insertPointLog(pointJoinDTO);
	    }
	}
}
