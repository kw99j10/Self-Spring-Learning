package com.camp.basic.step01.bad;

public class GreetingTest {
    public static void main(String[] args) {
        GreetingServiceKO KO = new GreetingServiceKO();
        KO.sayHello("김민수");
        KO.sayHello("김민수");
        KO.sayHello("김민수");
    }
}
