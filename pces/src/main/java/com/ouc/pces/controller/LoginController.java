/*
 * Copyright (c) 2019
 * FileName: LoginController.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 21:45:38
 */

package com.ouc.pces.controller;

import com.ouc.pces.service.StudentService;
import com.ouc.pces.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class LoginController {
    @Autowired
    StudentService studentService;

    @RequestMapping(path = "/login", method = RequestMethod.POST)
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
