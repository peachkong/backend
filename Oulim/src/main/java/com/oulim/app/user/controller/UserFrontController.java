package com.oulim.app.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;

public class UserFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String requestURI = request.getRequestURI();              // /Oulim/user/loginOk.usr
		String contextPath = request.getContextPath();            // /Oulim
		String target = requestURI.substring(contextPath.length()); // /user/loginOk.usr

		System.out.println("UserFrontController 실행");
		System.out.println("URI : " + requestURI);
		System.out.println("Target : " + target);

		Result result = null;
		Execute execute = null;

		if (target.equals("/user/login.usr")) {
			System.out.println("로그인 페이지 요청");
			execute = new LoginController();

		} else if (target.equals("/user/loginOk.usr")) {
			System.out.println("로그인 처리 요청");
			execute = new LoginOkController();

		} else if (target.equals("/user/logout.usr")) {
			System.out.println("로그아웃 요청");
			execute = new LogoutController();
		}

		if (execute != null) {
			result = execute.execute(request, response);
		}

		if (result != null) {
			if (result.isRedirect()) {
				response.sendRedirect(request.getContextPath() + result.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(result.getPath());
				dispatcher.forward(request, response);
			}
		}
	}
}