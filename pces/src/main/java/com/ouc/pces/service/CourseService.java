package com.ouc.pces.service;

import com.ouc.pces.entity.Course;
import com.ouc.pces.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CourseService {
    @Autowired
    CourseMapper courseMapper;

    public ArrayList<Course> selectByCourseType(String courseType){
        return courseMapper.selectByCourseType(courseType);
    }

    public ArrayList<Course> selectByMajorId(int majorId){
        return courseMapper.selectByMajorId(majorId);
    }

    public Course selectById(int id){
        return courseMapper.selectById(id);
    }

    public ArrayList<Course> selectByKeyWords(String keyWords){
        return courseMapper.selectByKeyWords(keyWords);
    }
}
