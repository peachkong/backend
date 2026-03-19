package com.oulim.app.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.user.dao.UserDAO;

public class CheckOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDAO userDAO = new UserDAO();

		String type = request.getParameter("type");
		String value = request.getParameter("value");
		
		int count = 0;

		if ("email".equals(type)) {
			count = userDAO.checkEmail(value);
		} else if ("userId".equals(type)) {
			count = userDAO.checkId(value);
		} else if ("nickname".equals(type)) {
			count = userDAO.checkNickname(value);
		} else if ("phone".equals(type)) {
			count = userDAO.checkPhoneNum(value);
		} else {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("invalid type");
			return null;
		}

		response.getWriter().write(count > 0 ? "duplicated" : "available");

		return null;
	}

}
