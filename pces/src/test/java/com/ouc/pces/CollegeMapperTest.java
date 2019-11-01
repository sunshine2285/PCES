/*
 * Copyright (c) 2019
 * FileName: collegeMapperTest.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-01 16:42:36
 */

package com.ouc.pces;

import com.ouc.pces.entity.College;
import com.ouc.pces.mapper.CollegeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CollegeMapperTest {
    @Autowired
    CollegeMapper collegeMapper;

    @Test
    void selectTest() {//passed
        for (College college : collegeMapper.selectAll()) {
            System.out.println(college);//college.toString()
        }
    }
}
