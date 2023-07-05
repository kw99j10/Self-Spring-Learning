package com.camp.di.step02.constructor;

public class OutputServiceConsole implements OutputService {

    public OutputServiceConsole(){
        System.out.println("OutputServiceConsole!");
    }

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}
