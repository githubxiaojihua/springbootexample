package com.xiaojihua;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 知识点：多数据源的配置
 * 1、application.properties中声明两个自定义的数据源
 * 2、写两个自定义数据源的配置DataSource1Config,DataSource2Config
 * 3、根据上面两个数据源的配置，在mapper下增加test01和test02两个文件盛放各自的mapper
 * 4、在resouces中同样将xml文件纷呈test1和test2，也是根据两个自定义数据元文件（文件中指定了目录位置）
 * 5、修改service和controller并运行
 * 6、事物管理与spring的事务管理一样，在service相关的方法上增加trancational注解（声明式事物），也可以
 * 用编程式事物。
 */
@MapperScan("com.xiaojihua.mapper")
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
