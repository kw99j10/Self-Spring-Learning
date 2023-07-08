package com.camp.myapp.config;

import com.camp.myapp.listener.AppInitListener;
import jakarta.servlet.ServletContextListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/user/login_form.do")
                .setViewName("user/login");
    }

    @Bean
    public ServletListenerRegistrationBean<ServletContextListener> appInitListener() {
        ServletListenerRegistrationBean<ServletContextListener> srb =
                new ServletListenerRegistrationBean<>();

        srb.setListener(new AppInitListener());
        return srb;
    }
}
