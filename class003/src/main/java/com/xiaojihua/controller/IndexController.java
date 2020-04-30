package com.xiaojihua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 这里由于是返回页面，因此改成Controler。
 */
@Controller
public class IndexController {

    /**
     * 返回页面并且设置模板中需要的变量。
     * 说明：为什么网result参数中设置值就可以在页面上接收？
     * 这是因为springMVC在对应的方法中会默认注入一些参数比如session，response,Model以及ModelMap，
     * 这些参数可以直接在方法上写，springMvc会自动注入，其中Model以及ModelMap都是用来存储值的，并且
     * 如果使用Model,springmvc也会自动实例化成ModelMap的，而且ModelMap继承自Map，因此在这里直接写
     * Map接口也是能起到和Model以及ModelMap一样的效果，都是通过request往页面写数据
     *
     * 其实result在程序运行后也会被实例化为ModelMap
     *
     * @param result
     * @return
     */
    @RequestMapping("/indexController")
    public String index(Map<String,Object> result){
        System.out.println("IndexController.......index ");
        result.put("name", "com/xiaojihua");
        result.put("sex",0);
        List<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        result.put("userlist",list);
        return "index";
    }
}
