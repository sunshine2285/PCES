package com.ouc.pces.controller;

import com.ouc.pces.entity.Major;
import com.ouc.pces.service.MajorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Api(value = "专业", tags = "专业接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/major")
public class MajorController {
    @Autowired
    MajorService majorService;

    @ApiOperation(value = "某学院所有专业", notes = "根据学院ID获取该学院所有专业信息")
    @GetMapping(value = "/all/{collegeId}", produces = "application/json")
    public ArrayList<Major> getMajorsByCollegeId(@ApiParam(value = "学院ID", required = true)
                                                 @PathVariable(value = "collegeId") int collegeId) {
        return majorService.selectByCollegeId(collegeId);
    }

    @ApiOperation(value = "某专业详情", notes = "根据专业ID获取该专业具体信息")
    @GetMapping(value = "/{majorId}", produces = "application/json")
    public Major getMajorById(@ApiParam(value = "学院ID", required = true)
                                                 @PathVariable(value = "majorId") int majorId) {
        return majorService.selectById(majorId);
    }
}
