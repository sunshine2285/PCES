/*
 * Copyright (c) 2019
 * FileName: StudentController.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-03 10:05:01
 */

package com.ouc.pces.controller;

import com.ouc.pces.DTO.ResponseDTO;
import com.ouc.pces.DTO.UpdateDTO;
import com.ouc.pces.entity.Student;
import com.ouc.pces.service.SecurityService;
import com.ouc.pces.service.StudentService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "学生", tags = "学生接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    SecurityService securityService;

    @ApiOperation(value = "获取学生信息", notes = "根据学号获取学生信息")
    @GetMapping(value = "/{studentId}", produces = "application/json")
    public ResponseDTO getStudentByStudentId(@ApiParam(value = "学号", required = true)
                                             @PathVariable("studentId") String studentId) {
        return new ResponseDTO();
    }

    @ApiOperation(value = "修改邮箱", notes = "根据邮箱验证码修改新邮箱")
    @PostMapping(value = "/mail", produces = "application/json")
    public ResponseDTO updateMail(@RequestBody UpdateDTO updateDTO) {
        if (securityService.checkUpadateMail(updateDTO.getUserId(), updateDTO.getVerificationCode())) {
            return studentService.updateMail(updateDTO.getUserId(), updateDTO.getPassword(),
                    updateDTO.getUpdateInfo());
        } else {
            return new ResponseDTO(ResponseDTO.Forbidden, "验证码错误或已失效");
        }
    }

    @ApiOperation(value = "修改密码", notes = "根据邮箱验证码和旧密码修改新邮箱")
    @PostMapping(value = "/password", produces = "application/json")
    public ResponseDTO updatePassword(@RequestBody UpdateDTO updateDTO) {
        if (securityService.checkUpadateMail(updateDTO.getUserId(), updateDTO.getVerificationCode())) {
            return studentService.updatePassword(updateDTO.getUserId(),
                    updateDTO.getPassword(), updateDTO.getUpdateInfo());
        } else {
            return new ResponseDTO(ResponseDTO.Forbidden, "验证码错误或已失效");
        }
    }
}
