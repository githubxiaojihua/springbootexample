package com.xiaojihua.mapper;

import com.xiaojihua.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
    Student selectById(Integer id);
}
