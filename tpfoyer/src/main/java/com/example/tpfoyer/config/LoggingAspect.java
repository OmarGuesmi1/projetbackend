package com.example.tpfoyer.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Before("execution(* com.example.tpfoyer.services.FoyerService.*(..))")
    public void logBeforeFoyerService(final JoinPoint joinPoint) {
        String methodName1 = joinPoint.getSignature().getName();
        log.info("Entering method: {}", methodName1);
    }

    @After("execution(* com.example.tpfoyer.services.FoyerService.*(..))")
    public void logAfterFoyerService(final JoinPoint joinPoint) {
        String methodName2 = joinPoint.getSignature().getName();
        log.info("Exiting method: {}", methodName2);
    }

    @Before("execution(* com.example.tpfoyer.services.*.*(..))")
    public void logBeforeAllServices(final JoinPoint joinPoint) {
        String methodName3 = joinPoint.getSignature().getName();
        log.info("Entering service method: {}", methodName3);
    }

    @Before("execution(* com.example.tpfoyer.services.*.retrieve*(..))")
    public void logBeforeRetrieveMethods(final JoinPoint joinPoint) {
        String methodName4 = joinPoint.getSignature().getName();
        log.info("Entering retrieve method: {}", methodName4);
    }

    @Before("execution(* com.example.tpfoyer.services.BlocService.*(..))")
    public void logBeforeBlocService(final JoinPoint joinPoint) {
        String methodName5 = joinPoint.getSignature().getName();
        log.info("Entering BlocService method: {}", methodName5);
    }
}
