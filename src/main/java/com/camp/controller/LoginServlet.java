package com.camp.controller;

import com.camp.model.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserService userService = new UserService();

    @PostMapping("/login.do")
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");

        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        String name = userService.login(userId, password);

        if(name != null) {
            HttpSession session = request.getSession();
            session.setAttribute("userId",userId);
            session.setAttribute("userName",name);
            response.sendRedirect("main.jsp");
        }
        else {
            request.setAttribute("errorMsg","아이디 또는 비밀번호가 일치하지 않습니다.");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
    /*protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");

        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        String name = userService.login(userId, password);

        if(name != null) {
            HttpSession session = request.getSession();
            session.setAttribute("userId",userId);
            session.setAttribute("userName",name);
            response.sendRedirect("main.jsp");
        }
        else {
            request.setAttribute("errorMsg","아이디 또는 비밀번호가 일치하지 않습니다.");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }*/
}