package com.ouc.pces.controller;

import com.ouc.pces.service.CourseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "课程", tags = "课程接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;
}
