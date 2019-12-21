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
import com.ouc.pces.service.MajorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Api(value = "学院", tags = "学院接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/college")
public class CollegeController {
    @Autowired
    CollegeService collegeService;

    @ApiOperation(value = "所有学院信息", notes = "获取所有学院信息，包含学院id和学院名称")
    @GetMapping(value = "", produces = "application/json")
    public ArrayList<College> getAllColleges() {
        return collegeService.selectAll();
    }

    @ApiOperation(value = "某学院详情", notes = "根据学院ID获取该学院具体信息")
    @GetMapping(value = "/{collegeId}", produces = "application/json")
    public College getMajorById(@ApiParam(value = "学院ID", required = true)
                              @PathVariable(value = "collegeId") int collegeId) {
        return collegeService.selectById(collegeId);
    }
}
