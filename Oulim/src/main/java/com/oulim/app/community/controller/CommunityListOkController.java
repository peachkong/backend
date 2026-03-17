package com.oulim.app.community.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.community.dao.CommunityDAO;

public class CommunityListOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("communityListOk Controller");
		CommunityDAO commuDAO = new CommunityDAO(); 
		
		return null;
	}

}
