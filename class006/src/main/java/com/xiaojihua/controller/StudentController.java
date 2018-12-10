package com.xiaojihua.controller;

import com.xiaojihua.entity.Student;
import com.xiaojihua.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("getStudent/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.selectById(id);
    }

    @RequestMapping("insertStudent")
    public String insertStudent(Student student){
        return studentService.insertStudent(student).toString();
    }

}
