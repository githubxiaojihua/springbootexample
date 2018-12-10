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
