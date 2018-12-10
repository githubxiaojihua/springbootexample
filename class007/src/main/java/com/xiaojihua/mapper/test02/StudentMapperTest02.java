package com.xiaojihua.mapper.test02;

import com.xiaojihua.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapperTest02 {
    Student selectById(Integer id);
}
