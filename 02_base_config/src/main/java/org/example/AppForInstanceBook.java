package org.example;


import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceBook {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        BookService bookService = (BookService) ctx.getBean("service");
        //        bookDao.save();

        bookDao.save();

    }

}
