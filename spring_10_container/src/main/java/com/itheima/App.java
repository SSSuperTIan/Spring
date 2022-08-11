package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("spring_10_container/src/main/resources/applicationContext.xml");
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
        bookDao.save();
    }
}