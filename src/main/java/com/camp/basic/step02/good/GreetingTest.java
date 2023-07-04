package com.camp.basic.step02.good;

public class GreetingTest {
    public static void main(String[] args) {
        GreetingService greetingService=new GreetingServiceKO();
        greetingService.sayHello("김민수");
    }
}