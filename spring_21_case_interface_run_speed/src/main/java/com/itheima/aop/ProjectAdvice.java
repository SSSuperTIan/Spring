package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
    @Pointcut("execution(* com.itheima.service.*Service.*(..))")
    private void servicePt() {

    }

    @Around("servicePt()")
    public Object runSpeed(ProceedingJoinPoint pjt) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = null;
        for (int i = 0; i < 10000; i++) {

            proceed = pjt.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("万次测试时长"+(end - start)+"ms");
        return proceed;
    }
}
