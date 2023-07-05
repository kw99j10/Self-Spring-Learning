package com.camp.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// BeanFactory
//    ApplicationContext : ClassPathXmlApplicationContext
//		WebApplicationContext

public class GreetingTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("beans.xml");
//		GreetingService greeting = (GreetingService) context.getBean("greeting");
        GreetingService greeting = context.getBean(GreetingService.class);
        System.out.println(greeting.getClass().getName());
        greeting.sayHello("김태희");
        greeting.sayGoodbye("김태희");
        greeting.smile();
    }

}


