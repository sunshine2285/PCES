package com.ouc.pces;

import com.ouc.pces.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseMapperTest {
    @Autowired
    CourseMapper courseMapper;

    @Test
    void selectTest(){
        System.out.println(courseMapper.selectById(1));
        System.out.println(courseMapper.selectByCourseType("专业课"));
        System.out.println(courseMapper.selectByKeyWords("网"));
    }
}
