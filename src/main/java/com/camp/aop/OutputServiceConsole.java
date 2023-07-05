package com.camp.aop;

import org.springframework.stereotype.Service;

@Service("outputService")
public class OutputServiceConsole implements OutputService {

    public OutputServiceConsole(){
        System.out.println("OutputServiceConsole!");
    }

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}
