package com.xiaojihua.mapper.test01;

import com.xiaojihua.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapperTest01 {
    Student selectById(Integer id);
}
