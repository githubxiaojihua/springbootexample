package com.xiaojihua.app;

import com.xiaojihua.controller.C001HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 知识点：
 * 1、创建单独的应用程序启动类，将相关的注解都写在这个类上。
 * 2、ComponentScan的使用，告诉springboot扫描哪些包。
 * 3、静态资源的访问：将静态资源防盗resources/static下面然后启动应用后可以直接在浏览器输入http://localhost:8080/123.jpg，即可访问
 */
@ComponentScan("com.xiaojihua.controller")
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        //开始运行springboot项目，入口程序
        SpringApplication.run(App.class,args);
    }
}
