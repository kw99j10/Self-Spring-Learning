package com.camp.basic.step03.excellent;

public class GreetingServiceEN implements GreetingService {

    @Override
    public void sayHello(String name) {
        System.out.println("Hi "+name);
    }
}
