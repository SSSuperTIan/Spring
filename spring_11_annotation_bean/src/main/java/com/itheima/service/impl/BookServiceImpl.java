package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component定义bean
//@Component
//@Service：@Component衍生注解
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
//    @Qualifier("")
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
    @PostConstruct
    public void init() {
        System.out.println("init ...");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("destroy ...");
    }
}
