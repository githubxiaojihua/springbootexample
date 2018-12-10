package com.xiaojihua.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 知识点：
 * 1、RestController标识该接口全部返回json格式。相当与每个方法都加上了@ResponseBody
 * 2、EnableAutoConfiguration，开启自动配置，加载springboot项目的各类配置。
 * 3、通过main函数运行，其中SpringApplication.run(HelloWorldController.class,args);代表启动springboot项目
 * 4、运行的时候直接运行main函数就行，然后再浏览器中访问http://localhost:8080/index或者http://localhost:8080/getMap观察输出结果
 * 5、由于EnableAutoConfiguration只加载了本类上，因此如果在新建一个controller并且提供方法，外界是访问不了的
 */
@EnableAutoConfiguration
@RestController
public class C001HelloWorldController {

    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "success";
    }

    @RequestMapping("/getMap")
    public Map<String,Object> getMap(){
        Map<String,Object> result = new HashMap<String, Object>();
        result.put("errCode","200");
        result.put("message","成功");
        return result;
    }

    public static void main(String[] args) {
        //开始运行springboot项目，入口程序
        SpringApplication.run(C001HelloWorldController.class,args);
    }
}
