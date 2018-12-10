package com.xiaojihua.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/indexController")
    public String index(){
        int i = 1/0;
        return "IndexController";
    }
}
