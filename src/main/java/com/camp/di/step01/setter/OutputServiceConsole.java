package com.camp.di.step01.setter;

public class OutputServiceConsole implements OutputService{

    public OutputServiceConsole(){
        System.out.println("OutputServiceConsole!");
    }

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}
