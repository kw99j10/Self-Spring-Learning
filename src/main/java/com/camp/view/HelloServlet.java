package com.camp.view;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.Date;

//@Controller
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @GetMapping("/hello.camp")
    public void hello(HttpServletResponse response) throws IOException {
        System.out.println("HelloServlet doGet()");
        response.getWriter().append("Served at: ").append(new Date().toString());
    }

    public HelloServlet() {
        System.out.println("HelloServlet().....");
    }
    @Override
    public void  destroy() {
        System.out.println("HelloServlet destroy().....");
    }
    @Override
    public void init() {
        System.out.println("HelloServlet init().....");
    }

    /*protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {
        System.out.println("HelloServlet doGet()");
        response.getWriter().append("Served at: ").append(new Date().toString());
    }*/
}