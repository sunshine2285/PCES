/*
 * Copyright (c) 2019
 * FileName: MajorMapper.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-01 17:18:16
 */

package com.ouc.pces.mapper;

import com.ouc.pces.entity.Major;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MajorMapper {
    public Major selectById(int id);
    public ArrayList<Major> selectByCollegeId(int collegeId);
}
