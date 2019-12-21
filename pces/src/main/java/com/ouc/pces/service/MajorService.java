/*
 * Copyright (c) 2019
 * FileName: MajorService.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-01 17:21:09
 */

package com.ouc.pces.service;

import com.ouc.pces.entity.Major;
import com.ouc.pces.mapper.MajorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MajorService {
    @Autowired
    MajorMapper majorMapper;

    public Major selectById(int id){
        return majorMapper.selectById(id);
    }
    public ArrayList<Major> selectByCollegeId(int collegeId){
        return majorMapper.selectByCollegeId(collegeId);
    }
}
