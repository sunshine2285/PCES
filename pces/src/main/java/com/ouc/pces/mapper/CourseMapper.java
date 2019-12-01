package com.ouc.pces.mapper;

import com.ouc.pces.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CourseMapper {
    public ArrayList<Course> selectByCourseType(String courseType);
    public Course selectById(int id);
    public ArrayList<Course> selectByKeyWords(String KeyWords);
    public ArrayList<Course> selectByMajorId(int majorId);
}
