package com.camp.basic.step02.good;

public class GreetingServiceEN implements GreetingService {

    @Override
    public void sayHello(String name) {
        System.out.println("Hi "+name);
    }
}
