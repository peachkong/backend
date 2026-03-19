package com.oulim.app.admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;

/**
 * Servlet implementation class AdminFrontController
 */

public class AdminFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestURI = request.getRequestURI();    
		String contextPath = request.getContextPath();  
		String target = requestURI.substring(contextPath.length()); 

		System.out.println("FrontController 실행");
		System.out.println("URI : " + requestURI);
		System.out.println("Target : " + target);

		Result result = null;
		Execute execute = null;
		switch(target) {
		
		case "/admin/login.adm"->
			{
				System.out.println("111로그인 페이지 요청");
				result = new AdminLoginController().execute(request, response);
				System.out.println();	
			}
		case "/admin/loginOk.adm"->
			{
				System.out.println("로그인 처리요청");
				result = new AdminLoginOkController().execute(request, response);
			}
		
		case "/admin/logout.adm"->
			{
				System.out.println("로그아웃 요청");
				result = new AdminLogoutController().execute(request, response);
			}
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
