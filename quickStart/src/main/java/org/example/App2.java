package org.example;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //获取ioc容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
         BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}