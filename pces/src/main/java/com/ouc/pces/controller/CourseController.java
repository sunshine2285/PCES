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
    @GetMapping(value = "/basic", produces = "application/json")
    public ArrayList<Course> getBasicCourse() {
        return courseService.selectByCourseType("公共基础课");
    }

    @ApiOperation(value = "获取所有通识课程", notes = "获取所有通识课程")
    @GetMapping(value = "/common", produces = "application/json")
    public ArrayList<Course> getCommonCourse() {
        return courseService.selectByCourseType("通识选修课");
    }

    @ApiOperation(value = "获取所有专业课程", notes = "获取所有专业课程")
    @GetMapping(value = "/specialized", produces = "application/json")
    public ArrayList<Course> getSpecializedCourse() {
        return courseService.selectByCourseType("专业课");
    }

    @ApiOperation(value = "某专业的专业课程", notes = "根据专业ID获取专业课程")
    @GetMapping(value = "/specialized/{majorId}", produces = "application/json")
    public ArrayList<Course> getSpecializedCourseByMajorId(@ApiParam(value = "课程ID", required = true)
                                                           @PathVariable int majorId) {
        return courseService.selectByMajorId(majorId);
    }


    @ApiOperation(value = "根据ID获取课程", notes = "根据用户Id获取课程详情")
    @GetMapping(value = "/{id}", produces = "application/json")
    public Course getCourse(@ApiParam(value = "课程Id", required = true) @PathVariable int id) {
        return courseService.selectById(id);
    }
}
