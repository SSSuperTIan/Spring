package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = ctx.getBean(BookDao.class);
        bean.save();
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.select();
    }
}
