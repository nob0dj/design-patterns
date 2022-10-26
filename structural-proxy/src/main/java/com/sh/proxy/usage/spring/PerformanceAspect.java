package com.sh.proxy.usage.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {

    @Around("bean(gameService)")
    public Object timestamp(ProceedingJoinPoint point) throws Throwable {
        long start = System.currentTimeMillis();
        Object returnObj = point.proceed();
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
        return returnObj;
    }
}
