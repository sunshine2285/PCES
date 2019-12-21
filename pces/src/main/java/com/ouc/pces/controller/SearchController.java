package com.ouc.pces.controller;

import com.ouc.pces.entity.Course;
import com.ouc.pces.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(value = "搜索", tags = "搜索接口")
@CrossOrigin("*")
@RestController
public class SearchController {
    final CourseService courseService;

    @Autowired
    public SearchController(CourseService courseService) {
        this.courseService = courseService;
    }

    @ApiOperation(value = "搜索相关课程", notes = "根据关键字通过课程名搜索")
    @GetMapping("/search/{searchStr}")
    public ArrayList<Course> search(@PathVariable String searchStr) {
        return courseService.selectByKeyWords(searchStr);
    }
}
