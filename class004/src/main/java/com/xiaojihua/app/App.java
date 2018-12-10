package com.xiaojihua.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 知识点：
 * 1、使用jdbctemplate访问数据
 * 2、在pom引入相关依赖
 * 3、创建serverce层
 * 4、创建controller层
 * 5、配置application.properties文件中的数据库连接信息
 */
@ComponentScan(basePackages = {"com.xiaojihua.controller","com.xiaojihua.service"})
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        //开始运行springboot项目，入口程序
        SpringApplication.run(App.class,args);
    }
}
