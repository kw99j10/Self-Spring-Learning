package com.camp.di.step03.autowire;

public class OutputServiceConsole implements OutputService {

    public OutputServiceConsole(){
        System.out.println("OutputServiceConsole!");
    }

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}
