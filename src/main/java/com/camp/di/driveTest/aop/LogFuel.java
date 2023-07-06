package com.camp.di.driveTest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogFuel {

    @After("execution(* com.camp.di.driveTest.CarService.chargeFuel())")
    public void afterLogging(JoinPoint joinPoint) {
        System.out.println("연료충전을 끝냈습니다! " + joinPoint.getSignature().getName());
    }
}
