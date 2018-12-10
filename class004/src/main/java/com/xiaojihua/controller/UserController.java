package com.xiaojihua.controller;

import com.xiaojihua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/createUser")
    public String createUser(String name, Integer age){
        userService.createUser(name,age);
        return "success";
    }
}
