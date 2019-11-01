/*
 * Copyright (c) 2019
 * FileName: CollegeController.java
 * @Author: 孙浩杰
 * @LastModified:2019-11-01 16:19:28
 */

package com.ouc.pces.controller;

import com.ouc.pces.entity.College;
import com.ouc.pces.entity.Major;
import com.ouc.pces.service.CollegeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(value = "学院", tags = "学院接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/college")
public class CollegeController {
    @Autowired
    CollegeService collegeServicel;

    @ApiOperation(value = "所有学院信息", notes = "获取所有学院信息，包含学院id和学院名称")
    @GetMapping(value = "", produces = "application/json")
    public ArrayList<College> getAllColleges(){
        return collegeServicel.selectAll();
    }

    public ArrayList<Major>
}
