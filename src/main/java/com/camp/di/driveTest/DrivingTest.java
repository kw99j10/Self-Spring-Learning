package com.camp.di.driveTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrivingTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("driveTestBean.xml");
        Driver driver = context.getBean(Driver.class);
        driver.drive();
        driver.charge();
    }
}
