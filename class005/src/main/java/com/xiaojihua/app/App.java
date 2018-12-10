package com.xiaojihua.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 知识点：
 * 1、使用springjpa访问数据源
 * 2、在pom中引入相关依赖
 * 3、创建实体类User
 * 4、创建Dao层UserDao
 * 5、在本启动类中增加JPA相关注解，使之可以扫描到相关包，必须用EnableJpaRepositories（扫描dao），EntityScan(扫描entity)进行扫描
 * 6、在application.properties中配置好数据源
 * 7、在UserController中使用JPA查询数据表
 * 8、JPA和JDBCtemplate两个框架是不冲突的可以同时存在，比如在本例中：pom以及UserController中同时使用
 * 因为走得是两种框架所以不冲突。
 * 9、JPA是一套规范，hibernate是其标准实现，springbootjpa内部使用hibernate进行了封装，因此可以
 * 使用JPA所提供的一系列标准API
 */
@ComponentScan(basePackages = {"com.xiaojihua.controller","com.xiaojihua.service"})
@EnableJpaRepositories("com.xiaojihua.dao")
@EntityScan("com.xiaojihua.entity")
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        //开始运行springboot项目，入口程序
        SpringApplication.run(App.class,args);
    }
}
