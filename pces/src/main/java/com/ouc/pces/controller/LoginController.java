/*
 * Copyright (c) 2019
 * FileName: LoginController.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 21:45:38
 */

package com.ouc.pces.controller;

import com.ouc.pces.service.StudentService;
import com.ouc.pces.util.Response;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "登录相关接口", description = "提供登录相关的 Rest API")
@CrossOrigin(origins = "*")
@RestController
public class LoginController {
    @Autowired
    StudentService studentService;

    @PostMapping("/login")
    public Response login(String type, String userId, String password) {
        //type代表用户种类，1为学生，2为老师
        final String STUDENT = "1";
        final String TEACHER = "2";
        if (STUDENT.equals(type))
            return studentService.login(userId, password);
        else if (TEACHER.equals(type))
            return new Response();
        else
            return new Response(Response.Forbidden, "不存在该类用户");
    }
}
