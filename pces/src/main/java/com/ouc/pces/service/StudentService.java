/*
 * Copyright (c) 2019
 * FileName: StudentService.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 21:43:49
 */

package com.ouc.pces.service;

import com.ouc.pces.entity.Student;
import com.ouc.pces.mapper.StudentMapper;
import com.ouc.pces.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public Response login(String studentId, String password) {
        System.out.println(studentId);
        Student student = studentMapper.selectByStudentId(studentId);
        if (student == null) //用户id不存在
            return new Response(Response.NotFound, "用户不存在");
        else if (!student.getPassword().equals(password)) //密码错误
            return new Response(Response.Forbidden, "密码错误");
        else if (student.getActivate() != 1) //用户处于未激活/冻结
            return new Response(Response.Forbidden, "户处于未激活/冻结");
        else
            return new Response(Response.OK, "登录成功", student);
    }
}
