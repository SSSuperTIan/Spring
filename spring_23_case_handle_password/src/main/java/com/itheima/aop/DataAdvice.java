package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataAdvice {

    @Pointcut("execution(boolean com.itheima.service.*Service.openURL(..))")
    private void servicePt(){}

    @Around("servicePt()")
    public Object trimString(ProceedingJoinPoint pjt) {
        Object proceed;
        try {
            Object[] args = pjt.getArgs();
            for (int i = 0; i < args.length; i++) {
                if (args[i].getClass().isInstance("")) {
                    args[i] = args[i].toString().trim();
                }
            }
            proceed = pjt.proceed(args);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return proceed;
    }
}
