package com.camp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    //(..): 포인트 컷으로 대상을 정함
    @Before("execution(* com.camp.aop.GreetingService.*(*,..))")
    public void beforeLogging(JoinPoint joinPoint){
        System.out.println("메소드 호출 전 : "+joinPoint.getSignature().getName());
        System.out.println("전달받은 매개변수 : "+joinPoint.getArgs()[0]);
    }

    @After("execution(* com.camp.aop.GreetingService.*(..))")
    public void afterLogging(JoinPoint joinPoint){
        System.out.println("메소드 호출 후 : "+joinPoint.getSignature().getName());
    }
}
