package com.camp.di.step04.annotation;

import org.springframework.stereotype.Service;

public class OutputServiceConsole implements OutputService {

    public OutputServiceConsole(){
        System.out.println("OutputServiceConsole!");
    }

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}
