package com.xiaojihua.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 知识点：
 * 1、集成freemaker
 * 2、在pom引入依赖
 * 3、在templates中创建模板index.ftl
 * 4、在controller中设置值
 * 其他的都有boot自动配置。同时还可以通过application.properties文件进行微调
 */
@ComponentScan("com.xiaojihua.controller")
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        //开始运行springboot项目，入口程序
        SpringApplication.run(App.class,args);
    }
}
