/*
 * Copyright (c) 2019
 * FileName: StudentService.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 21:43:49
 */

package com.ouc.pces.service;

import com.ouc.pces.entity.Student;
import com.ouc.pces.mapper.StudentMapper;
import com.ouc.pces.DTO.ResponseDTO;
import com.ouc.pces.utils.StringCheckUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    /**
     * 学生登录服务
     *
     * @param studentId
     * @param password
     * @return Response
     */
    public ResponseDTO login(String studentId, String password) {
        Student student = studentMapper.selectByStudentId(studentId);
        if (student == null) //用户id不存在
            return new ResponseDTO(ResponseDTO.NotFound, "用户不存在");
        else if (!student.getPassword().equals(password)) //密码错误
            return new ResponseDTO(ResponseDTO.Forbidden, "密码错误");
        else if (student.getActivate() != 1) //用户处于未激活/冻结
            return new ResponseDTO(ResponseDTO.Forbidden, "户处于未激活/冻结");
        else {
            student.setPassword(null);
            return new ResponseDTO(ResponseDTO.OK, "登录成功", student);
        }
    }

    /**
     * 学生注册服务
     *
     * @param student
     * @return Response
     */
    public ResponseDTO register(Student student) {
        //确保student不为null
        if (student == null)
            return new ResponseDTO(ResponseDTO.NotFound, "用户信息为空");
            //确保id不重复
        else if (studentMapper.checkStudentIdExist(student.getStudentId()))
            return new ResponseDTO(ResponseDTO.Forbidden, "该学号已注册");
            //确保nickname不重复
        else if (studentMapper.checkNicknameExist(student.getNickname()))
            return new ResponseDTO(ResponseDTO.Forbidden, "该昵称已被使用");
            //todo:校验注册数据合法性
        else {
            int result = 0;
            try {
                result = studentMapper.insert(student);
            } catch (Exception e) {
                return new ResponseDTO(ResponseDTO.FAILED, "注册失败:" + e.getMessage());
            }
            if (result == 1)
                return new ResponseDTO(ResponseDTO.OK, "注册成功");
            else
                return new ResponseDTO(ResponseDTO.FAILED, "");
        }
    }

    /**
     * 学生修改邮箱服务
     *
     * @param studentId
     * @param newMail
     * @return
     */
    public ResponseDTO updateMail(String studentId, String password, String newMail) {
        if (StringCheckUtils.checkIsEmpty(studentId))
            return new ResponseDTO(ResponseDTO.NotFound, "用户ID为空");
        else if(!studentMapper.checkPasswordCorrect(studentId, password))
            return new ResponseDTO(ResponseDTO.Forbidden, "密码错误");
        else {
            if(!StringCheckUtils.checkMailStr(newMail))
                return new ResponseDTO(ResponseDTO.Forbidden, "新邮箱不合法");
            try {
                if (studentMapper.updateMailByStudentId(studentId, newMail))
                    return new ResponseDTO(ResponseDTO.OK, "修改邮箱成功");
                else
                    return new ResponseDTO(ResponseDTO.Forbidden, "该用户ID不存在");
            } catch (Exception e) {
                return new ResponseDTO(ResponseDTO.FAILED, "修改邮箱失败:" + e.getMessage());
            }
        }
    }

    public ResponseDTO updatePassword(String studentId, String password, String newPassword) {
        if (StringCheckUtils.checkIsEmpty(studentId))
            return new ResponseDTO(ResponseDTO.NotFound, "用户ID为空");
        else if (studentMapper.checkPasswordCorrect(studentId, password)) {
            if(!StringCheckUtils.checkPwdStr(newPassword))
                return new ResponseDTO(ResponseDTO.Forbidden, "新密码不合法");
            try {
                if(studentMapper.updatePwdByStudentId(studentId, newPassword))
                    return new ResponseDTO(ResponseDTO.OK, "修改密码成功");
                else
                    return new ResponseDTO(ResponseDTO.Forbidden, "未知错误");
            } catch (Exception e) {
                return new ResponseDTO(ResponseDTO.FAILED, "修改密码失败:" + e.getMessage());
            }
        } else {
            return new ResponseDTO(ResponseDTO.Forbidden, "用户ID或密码错误");
        }
    }
}
