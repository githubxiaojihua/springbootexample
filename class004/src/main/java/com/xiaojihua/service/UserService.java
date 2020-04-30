package com.xiaojihua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createUser(String name, Integer age){
        System.out.println("create user in UserService");
        jdbcTemplate.update("insert into student(name,age) values(?,?)",name,age);
        System.out.println("创建用户成功");
    }
}
