/*
 * Copyright (c) 2019
 * FileName: LoginController.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 21:45:38
 */

package com.ouc.pces.controller;

import com.ouc.pces.DTO.LoginDTO;
import com.ouc.pces.service.StudentService;
import com.ouc.pces.DTO.ResponseDTO;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(value = "登录", tags = "登录接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    StudentService studentService;

    @ApiOperation(value = "学生登录", notes = "学生登录接口，登录成功后用户信息回填到ResponseDTO.data中")
    @PostMapping(value = "/student", produces = "application/json")
    public ResponseDTO studentLogin(@RequestBody LoginDTO loginDTO) {
        return studentService.login(loginDTO.getUserId(), loginDTO.getPassword());
    }

    @ApiOperation(value = "教师登录", notes = "教师登录接口，登录成功后用户信息回填到ResponseDTO.data中")
    @PostMapping(value = "/teacher", produces = "application/json")
    public ResponseDTO teacherLogin(@RequestBody LoginDTO loginDTO) {
        return new ResponseDTO();
    }
}
