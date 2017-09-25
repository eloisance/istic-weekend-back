package com.eloisance.istic.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogger {

    private final static Logger logger = Logger.getLogger(MyLogger.class);

    @Before("execution(* com.eloisance.istic.controller..*(..))")
    public void logBefore(JoinPoint joinPoint) {
        String packageName = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        logger.info("hit: " + packageName + " - endpoint: " + methodName);
    }

}
