/*
 * Copyright (c) 2019
 * FileName: LoginController.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 21:45:38
 */

package com.ouc.pces.controller;

import com.ouc.pces.service.StudentService;
import com.ouc.pces.util.Response;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(tags = "登录相关接口", description = "提供登录相关的 Rest API")
@CrossOrigin(origins = "*")
@RestController
public class LoginController {
    @Autowired
    StudentService studentService;


    @ApiOperation(value = "登录", notes = "学生和教师登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "params", value = "下列参数的json数据，用于post请求中后端接受", required = true),
            @ApiImplicitParam(name = "userType", value = "用户类型(封装到params)", paramType = "query"),
            @ApiImplicitParam(name = "userId", value = "用户ID(封装到params)", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "用户密码(封装到params)", paramType = "query")
    })

    @PostMapping(value = "/login", produces = "application/json;charset=UTF-8")
    public Response login(@RequestBody Map<String, Object> params ) {
        String userType = params.get("userType").toString();
        String userId = params.get("userId").toString();
        String password = params.get("password").toString();
        //type代表用户种类，1为学生，2为老师
        final String STUDENT = "1";
        final String TEACHER = "2";
        if (STUDENT.equals(userType))
            return studentService.login(userId, password);
        else if (TEACHER.equals(userType))
            return new Response();
        else
            return new Response(Response.Forbidden, "不存在该类用户");
    }
}
