package com.itheima.Aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//import org
@Component
@Aspect
//通知类
public class MyAdvice {

    @Pointcut("execution(void com.itheima.dao.impl.BookDaoImpl.update())")
    private void pc(){}

    @After("pc()")
    public  void method(){
        System.out.println(System.currentTimeMillis());
    }
}
