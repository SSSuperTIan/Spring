package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public String findName(int id,String pwd) {
        System.out.println("id:"+id+",pwd:"+pwd);
//        if(true)throw new NullPointerException();
        return "itcast";
    }
}
