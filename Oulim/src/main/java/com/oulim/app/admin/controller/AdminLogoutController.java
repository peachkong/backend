package com.oulim.app.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;

public class AdminLogoutController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        System.out.println("로그아웃 실행");

        HttpSession session = request.getSession();

        // 세션 삭제
        session.invalidate();
        
        //결과 두개를 담아서 보내기위해
        Result result = new Result();

        // 로그인 페이지로 이동
        result.setPath("/admin/login.adm");
        result.setRedirect(true);

        return result;
	}

}
