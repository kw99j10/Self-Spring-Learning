package com.camp.myapp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public String handlerException(Exception e, Model model) {
        model.addAttribute("message", e.getMessage());
        return "common/error";
    }
}
