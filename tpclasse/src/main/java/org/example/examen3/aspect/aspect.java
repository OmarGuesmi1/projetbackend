package org.example.examen3.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class aspect {
    @Before("execution(* org.example.examen3.service.serviceimp.ajouter*(..))")
    public void logBeforeAjouterMethods(final JoinPoint joinPoint) {
        String methodName4 = joinPoint.getSignature().getName();
        log.info("DEBUT EXECUTION : {}", methodName4);
    }
}
