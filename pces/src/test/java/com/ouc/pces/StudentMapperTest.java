package com.ouc.pces;

import com.ouc.pces.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentMapperTest {
    @Autowired
    StudentMapper studentMapper;

    //passed
    @Test
    void selectTest() {
        System.out.println(studentMapper.selectById(1));
        System.out.println(studentMapper.selectByStudentId("17020031062"));
    }

}
