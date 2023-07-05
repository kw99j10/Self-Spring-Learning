package com.camp.di.step01.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");

        //GreetingService greetingService = (GreetingService) context.getBean("greeting");
        GreetingService greetingService = context.getBean(GreetingService.class);
        greetingService.sayHello("김민수");
    }
}
