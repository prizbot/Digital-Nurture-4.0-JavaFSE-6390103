package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(* com.library.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        System.out.println("➡️ Starting method: " + joinPoint.getSignature().getName());
        Object result = joinPoint.proceed();
        System.out.println("✅ Finished method: " + joinPoint.getSignature().getName());

        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("⏱ Execution time: " + elapsedTime + " ms");

        return result;
    }
}
