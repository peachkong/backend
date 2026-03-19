package com.oulim.app.kkomi.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.kkomi.dao.KkomiDAO;
import com.oulim.app.kkomi.dto.RankingJoinDTO;

public class RankingListController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		KkomiDAO kkomiDAO = new KkomiDAO();
		
		if(request.getSession().getAttribute("userNo") == null) {
			result.setPath(request.getContextPath() + "/app/user/login/login.jsp");
			result.setRedirect(true);
			return result;
		}
		
		int userNo = (Integer)request.getSession().getAttribute("userNo");
		List<RankingJoinDTO> rankingList = kkomiDAO.getRankingInfo(userNo);
		System.out.println("랭킹리스트 출력");
		for(RankingJoinDTO rank : rankingList) {
			System.out.println(rank.toString());
		}
		request.setAttribute("rankingList", rankingList);
		result.setPath("/app/kkomi/rank.jsp");
		result.setRedirect(false);
		return result;
	}
	
}
