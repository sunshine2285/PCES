package com.ouc.pces;

import com.ouc.pces.entity.Student;
import com.ouc.pces.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentMapperTest {
    @Autowired
    StudentMapper studentMapper;

    @Test
    void selectTest() {//passed
        System.out.println(studentMapper.selectById(0));//null
        System.out.println(studentMapper.selectById(1));//student.toString()
        System.out.println(studentMapper.selectByStudentId("123"));//null
        System.out.println(studentMapper.selectByStudentId("17020031062"));//student.toString()
    }

    @Test
    void checkTest() {//passed
        System.out.println(studentMapper.checkNicknameExist("123"));//false
        System.out.println(studentMapper.checkNicknameExist("sunshine"));//true
        System.out.println(studentMapper.checkStudentIdExist("123"));//false
        System.out.println(studentMapper.checkStudentIdExist("17020031062"));//true
    }

    @Test
    void InsertTest() {//passed
        Student student = new Student();
        student.setStudentId("17020031061");
        student.setName("宋自康");
        student.setNickname("牵星");
        student.setMail("1063937@qq.com");
        student.setPassword("123456");
        student.setCollege(1);
        student.setMajor(1);
        student.setGrade("2017");
        student.setType(1);

        try {
            System.out.println(studentMapper.insert(student));//1
        } catch (Exception e) {
            e.printStackTrace();
        }
        //字段不全
        student.setStudentId(null);
        student.setNickname(null);
        try {
            System.out.println(studentMapper.insert(student));
        } catch (Exception e) {
            System.out.println(e.getCause());//exception:Column 'xxx' cannot be null
        }
    }

    @Test
    void updateMailTest() {//passed
        try {//true
            System.out.println(studentMapper.updateMailByStudentId("17020031061", "123"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void updatePwdTest() {//passed
        try {//true
            System.out.println(studentMapper.updatePwdByStudentId("17020031060", "1243"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
