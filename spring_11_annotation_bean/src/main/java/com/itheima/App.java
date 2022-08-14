package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext_1.xml");
       BookDao bookDao = (BookDao)ctx.getBean("bookDao");
       bookDao.save();
        BookService bookService = ctx.getBean(BookService.class);
        BookService bookService1 = (BookService) ctx.getBean("bookService");
        System.out.println(bookService);
        System.out.println(bookService1);
    }
}
