package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//声明当前类为Spring配置类
//@Configuration
////设置bean扫描路径，多个路径书写为字符串数组格式
//@ComponentScan({"com.itheima.service","com.itheima.dao"})
@Configuration//标识该类为配置类
@ComponentScan({"com.itheima.service","com.itheima.dao"})//替换xml的组件扫描
public class SpringConfig {
}
