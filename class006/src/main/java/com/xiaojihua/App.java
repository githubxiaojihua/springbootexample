package com.xiaojihua;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 知识点：整合mybatis
 * 1、引入依赖
 * 2、配置application.properties
 * 3、建立StudentMapping.xml
 * 4、建立StudentMapper.java
 * 5、建立Student.java实体类
 * 6、建立Studentservice.java
 * 7、建立StudentController.java
 * 8、配置本启动类MapperScan
 */
@MapperScan("com.xiaojihua.mapper")
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
