package com.demo.app;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorLoggingAspect {

    private Log log = LogFactory.getLog(this.getClass());
    
    @Pointcut("@within(com.demo.app.LoggingRequired)")
    public void loggingOperation() {}

    @Before("loggingOperation()")
    public void logBefore(JoinPoint joinPoint) {
    	System.out.println("before called");
        log.info("The method " + joinPoint.getSignature().getName()
              + "() begins with " + Arrays.toString(joinPoint.getArgs()));
    }

    @After("loggingOperation()")
    public void logAfter(JoinPoint joinPoint) {
    	System.out.println("after called");
        log.info("The method " + joinPoint.getSignature().getName()
                + "() ends");
    }

}