/*
 * Copyright (c) 2019
 * FileName: StudentMapper.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 21:34:28
 */

package com.ouc.pces.mapper;

import com.ouc.pces.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
    Student selectById(int id);
    Student selectByStudentId(String studentId);
}
