/*
 * Copyright (c) 2019
 * FileName: StudentController.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-03 10:05:01
 */

package com.ouc.pces.controller;

import com.ouc.pces.DTO.ResponseDTO;
import com.ouc.pces.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "学生", tags = "学生接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @ApiOperation(value = "修改邮箱", notes = "根据邮箱验证码修改新邮箱")
    @PostMapping(value = "/mail", produces = "application/json")
    public ResponseDTO updateMail(){
        return studentService.updateMail();
    }

    @ApiOperation(value = "修改密码", notes = "根据邮箱验证码和旧密码修改新邮箱")
    @PostMapping(value = "/password", produces = "application/json")
    public ResponseDTO updatePassword(){
        return studentService.updatePassword();
    }
}
