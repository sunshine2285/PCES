/*
 * Copyright (c) 2019
 * FileName: RegisterController.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-31 22:15:29
 */

package com.ouc.pces.controller;

import com.ouc.pces.entity.Student;
import com.ouc.pces.entity.Teacher;
import com.ouc.pces.service.StudentService;
import com.ouc.pces.DTO.ResponseDTO;
import com.ouc.pces.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "注册", tags = "注册接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    StudentService studentService;

    TeacherService teacherService;

    @ApiOperation(value = "学生注册", notes = "学生注册 Rest api")
    @PostMapping(value = "/student", produces = "application/json")
    public ResponseDTO studentRegister(@RequestBody Student student) {
        return studentService.register(student);
    }

    @ApiOperation(value = "教师注册", notes = "教师组测 Rest api")
    @PostMapping(value = "/teacher", produces = "application/json")
    public ResponseDTO teacherRegister(@RequestBody Teacher teacher) {
        return teacherService.register(teacher);
    }
}
