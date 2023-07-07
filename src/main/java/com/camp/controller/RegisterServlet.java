package com.camp.controller;

import com.camp.model.dto.User;
import com.camp.model.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

//@Controller
public class RegisterServlet {
    private UserService userService = new UserService();

    @PostMapping("/register.do")
    public void signUp(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");

        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        boolean register = userService.register(new User(userId,password,name,email));
        if(register) {
            response.sendRedirect("main.jsp");
        }
        else {
            request.setAttribute("errorMsg","중복된 아이디 입니다.");
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }
    }
}
