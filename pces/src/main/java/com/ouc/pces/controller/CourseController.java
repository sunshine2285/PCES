package com.ouc.pces.controller;

import com.ouc.pces.entity.Course;
import com.ouc.pces.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(value = "课程", tags = "课程接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @ApiOperation(value = "获取所有公共基础课程", notes = "获取所有公共基础课程")
    @PostMapping(value = "/basicCourse", produces = "application/json")
    public ArrayList<Course> getBasicCourse() {
        return new ArrayList<>();
    }

    @ApiOperation(value = "获取所有公共基础课程", notes = "获取所有公共基础课程")
    @PostMapping(value = "/commonCourse", produces = "application/json")
    public ArrayList<Course> getCommonCourse() {
        return new ArrayList<>();
    }

    @ApiOperation(value = "获取所有公共基础课程", notes = "获取所有公共基础课程")
    @PostMapping(value = "/SpecializedCourse", produces = "application/json")
    public ArrayList<Course> getSpecializedCourse() {
        return new ArrayList<>();
    }


}
