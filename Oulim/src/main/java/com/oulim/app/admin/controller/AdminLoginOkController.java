package com.oulim.app.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oulim.app.admin.dao.AdminDAO;
import com.oulim.app.admin.dto.AdminDTO;
import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;

public class AdminLoginOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stuob
		
	    AdminDTO adminDTO = new AdminDTO();
	    AdminDAO adminDAO = new AdminDAO();
	    Result result = new Result();
	    //값을 받고
	    String adminId = request.getParameter("adminId");
	    String adminPw = request.getParameter("adminPw");
	    HttpSession session = request.getSession(); // 세션이 안전하대요
	    //dto에 담아서
	    adminDTO.setAdminId(adminId);
	    adminDTO.setAdminPw(adminPw);
	    //dao 호출
	    AdminDTO loginAdmin = adminDAO.login(adminDTO);

	    String path;

	    if (loginAdmin != null) {
	        // 로그인 성공
	        session.setAttribute("admin", loginAdmin);
	        path = "/app/admin/jsp/dashboard/dashboard.jsp"; // 로그인 성공 시 대시보드
	    } else {
	        // 로그인 실패
	        path = "/admin/login.adm?login=fail";
	    }
	    // 안에 바로 설정해도 된다.
	    result.setPath(path);
	    result.setRedirect(true);

	    return result;
	}

}
