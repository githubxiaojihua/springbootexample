package com.xiaojihua.controller;

import com.xiaojihua.dao.UserDao;
import com.xiaojihua.entity.User;
import com.xiaojihua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //使用JPA
    @Autowired
    private UserDao userDao;

    @RequestMapping("/createUser")
    public String createUser(String name, Integer age){
        userService.createUser(name,age);
        return "success";
    }

    //使用JPA
    @RequestMapping("/user")
    public User findUser(Integer id){
        return userDao.findOne(id);
    }
}
