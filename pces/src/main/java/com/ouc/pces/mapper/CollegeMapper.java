/*
 * Copyright (c) 2019
 * FileName: CollegeMapper.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-01 16:32:59
 */

package com.ouc.pces.mapper;

import com.ouc.pces.entity.College;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CollegeMapper {
    ArrayList<College> selectAll();
}
