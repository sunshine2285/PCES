/*
 * Copyright (c) 2019
 * FileName: TeacherService.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-01 15:50:20
 */

package com.ouc.pces.service;

import com.ouc.pces.DTO.ResponseDTO;
import com.ouc.pces.entity.Teacher;
import com.ouc.pces.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    public ResponseDTO register(Teacher teacher){
        return new ResponseDTO();
    }

    public ResponseDTO updateMail(){
        return new ResponseDTO();
    }

    public ResponseDTO updatePassword(){
        return new ResponseDTO();
    }
}
