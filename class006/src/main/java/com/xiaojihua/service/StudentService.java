package com.xiaojihua.service;

import com.xiaojihua.entity.Student;
import com.xiaojihua.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public Student selectById(Integer id){
        return studentMapper.selectById(id);
    }

    /**
     * 这个返回值成功为1
     * @param student
     * @return
     */
    public Integer insertStudent(Student student){
        return studentMapper.insertStudent(student);
    }
}
