package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {

    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://192.168.52.129:3306/mybatis?useSSL=false")
    private String url;
    @Value("root")
    private String userName;
    @Value("1234")
    private String password;
    @Bean
    public DataSource dataSource(){

        DruidDataSource db = new DruidDataSource();
        db.setDriverClassName(driver);
        db.setUrl(url);
        db.setUsername(userName);
        db.setPassword(password);
        return db;
    }
//    @Bean
//    public DataSource dataSource1(){
//        DruidDataSource db = new DruidDataSource();
//        db.setDriverClassName("com.mysql.jdbc.Driver");
//        db.setUrl("jdbc:mysql://192.168.52.129:3306/mybatis?useSSL=false");
//        db.setUsername("root");
//        db.setPassword("1234");
//        return db;
//    }

}
