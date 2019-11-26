package com.ouc.pces.controller;

import com.ouc.pces.entity.Course;
import com.ouc.pces.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation(value = "根据ID获取课程", notes = "根据用户Id获取课程详情")
    @PostMapping(value = "/{id}", produces = "application/json")
    public Course getCourse(@ApiParam(value = "课程Id", required = true) @PathVariable int id) {
        return new Course();
    }
}
