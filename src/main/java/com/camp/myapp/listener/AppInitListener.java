package com.camp.myapp.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppInitListener implements ServletContextListener {


    public void contextDestroyed(ServletContextEvent sce)  {
         // TODO Auto-generated method stub
    }


    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext ctx = sce.getServletContext();
    	ctx.setAttribute("root", ctx.getContextPath());
    }
	
}









