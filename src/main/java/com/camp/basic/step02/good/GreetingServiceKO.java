package com.camp.basic.step02.good;

public class GreetingServiceKO implements GreetingService {

    @Override
    public void sayHello(String name) {
        System.out.println("안녕 "+name);
    }
}
