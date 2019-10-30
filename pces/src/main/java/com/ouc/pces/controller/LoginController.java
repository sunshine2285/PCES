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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/login")
    public Response login(){
        return studentService.login("17020031062", "123");
    }
}
