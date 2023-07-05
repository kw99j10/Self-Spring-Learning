package com.camp.di.step03.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");

        //GreetingService greetingService = (GreetingService) context.getBean("greeting");
        GreetingService greetingService = context.getBean(GreetingService.class);
        greetingService.sayHello("김민수");
    }
}
