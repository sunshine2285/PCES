/*
 * Copyright (c) 2019
 * FileName: CollegeService.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-01 16:32:00
 */

package com.ouc.pces.service;

import com.ouc.pces.entity.College;
import com.ouc.pces.mapper.CollegeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CollegeService {
    @Autowired
    CollegeMapper collegeMapper;

    public ArrayList<College> selectAll(){
        return collegeMapper.selectAll();
    }
    public College selectById(int id){
        return collegeMapper.selectById(id);
    }
}
