package com.xiaojihua.service;

import com.xiaojihua.entity.Student;
import com.xiaojihua.mapper.StudentMapper;
import com.xiaojihua.mapper.test01.StudentMapperTest01;
import com.xiaojihua.mapper.test02.StudentMapperTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private StudentMapperTest01 studentMapperTest01;

    @Autowired
    private StudentMapperTest02 studentMapperTest02;

    public Student selectById(Integer id){
        return studentMapper.selectById(id);
    }

    public Student serectByIdTest01(Integer id){
        return studentMapperTest01.selectById(id);
    }

    public Student serectByIdTest02(Integer id){

        return studentMapperTest02.selectById(id);
    }
}
