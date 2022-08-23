package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.itheima.dao.BookDao.findName(..))")
    private void pt(){}

//    @Before("pt()")
    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ...");
    }


//    @After("pt()")
    public void after() {
        System.out.println("after advice ...");
    }

    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) {
        Object[] args = pjp.getArgs();
        System.out.println("around before advice ...");
        try {
            pjp.proceed(args);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("around after advice ...");

    }

//    @Around("pt()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundSelect before advice ...");
        Integer res =(Integer) pjp.proceed();
        System.out.println("aroundSelect after advice ...");
        return res;
    }

    @AfterReturning(value = "pt()",returning = "ret2")
    public void afterReturning(Object ret2) {
        System.out.println("afterReturning advice ..."+ret2);
    }

    @AfterThrowing(value = "pt()",throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing advice ..."+t);
    }
}
