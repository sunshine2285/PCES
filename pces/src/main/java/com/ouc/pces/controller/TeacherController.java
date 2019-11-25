/*
 * Copyright (c) 2019
 * FileName: TeacherController.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-03 10:05:19
 */

package com.ouc.pces.controller;

import com.ouc.pces.DTO.ResponseDTO;
import com.ouc.pces.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "教师", tags = "教师接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @ApiOperation(value = "修改邮箱", notes = "根据邮箱验证码修改新邮箱")
    @PostMapping(value = "/mail", produces = "application/json")
    public ResponseDTO updateMail(){
        return teacherService.updateMail();
    }

    @ApiOperation(value = "修改密码", notes = "根据邮箱验证码和旧密码修改新邮箱")
    @PostMapping(value = "/password", produces = "application/json")
    public ResponseDTO updatePassword(){
        return teacherService.updatePassword();
    }
}
