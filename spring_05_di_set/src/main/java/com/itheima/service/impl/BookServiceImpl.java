package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.BookService;

import java.awt.print.Book;

public class BookServiceImpl implements BookService{

    private BookDao bookDao;
    private  UserDao userDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("BookService save ....");
        bookDao.save();
        userDao.save();
    }
}
