package com.library.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.library.service.*.*(..))")
    public void allMethodsInService() {}

    @Before("allMethodsInService()")
    public void logBeforeMethod() {
        System.out.println("Logging before method execution");
    }

    @After("allMethodsInService()")
    public void logAfterMethod() {
        System.out.println("Logging after method execution");
    }
}
