/*
 * Copyright (c) 2019
 * FileName: MajorMapperTest.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-01 17:29:16
 */

package com.ouc.pces;

import com.ouc.pces.entity.Major;
import com.ouc.pces.mapper.MajorMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MajorMapperTest {
    @Autowired
    MajorMapper majorMapper;

    @Test
    void selectTest(){//passed
        for(Major major : majorMapper.selectByCollegeId(1)){
            System.out.println(major);//major.toString()
        }
    }
}
