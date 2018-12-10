package com.xiaojihua.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class C001HelloWorldController {

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

}
