package com.camp.controller;

import com.camp.model.service.UserService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class LoginServlet2 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserService userService = new UserService();

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");

        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        String name = userService.login(userId, password);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='utf-8'/>");
        out.println("</head>");
        out.println("<body>");
        if(name != null) {
            out.println("<h1>"+name+" 로그인 성공</h1>");
        }else {
            out.println("<h1>로그인 실패</h1>");
            out.println("<a href='login.jsp'>로그인 다시 하기</a>");
        }
        out.println("</body>");
        out.println("</html>");
//		String gender = request.getParameter("gender");
//		String[] hobby = request.getParameterValues("hobby");
//
//		System.out.println(userId);
//		System.out.println(password);
//		System.out.println(gender);
//		System.out.println(Arrays.toString(hobby));
    }

}