package com.camp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;

@WebServlet(value = "/hello.camp",loadOnStartup = 1)
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("HelloServlet init()!!!");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("HelloServlet destroy()!!!");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet doGet()!!!!");
        response.getWriter().println("Reserved at: " + new Date());
    }
}