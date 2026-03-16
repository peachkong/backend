package com.oulim.app.common.filter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCheckFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession session = req.getSession(false);

        boolean isLogin = session != null && session.getAttribute("loginUser") != null;

        if (!isLogin) {
            res.sendRedirect(req.getContextPath() + "/app/user/login/login.jsp");
            return;
        }

        chain.doFilter(request, response);
    }
}