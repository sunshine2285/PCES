

package com.ouc.pces.controller;

import com.ouc.pces.entity.College;
import com.ouc.pces.entity.Major;
import com.ouc.pces.entity.TagType;
import com.ouc.pces.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Api(value = "标签", tags = "标签接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tag")
public class TagController {
    @Autowired
    TagService tagService;
//
//    @ApiOperation(value = "所有标签", notes = "获取所有可添加的标签")
//    @GetMapping(value = "/tag", produces = "application/json")
//    public ArrayList<TagType> getAllTagType() {
//        return tagService.selectAll();
//    }
//
//    @ApiOperation(value = "某学院所有专业", notes = "根据学院ID获取该学院所有专业信息")
//    @GetMapping(value = "/{collegeId}", produces = "application/json")
//    public ArrayList<Major> getMajorsByCollegeId(@ApiParam(value = "学院ID", required = true)
//                                                 @PathVariable(value = "collegeId") int collegeId) {
//        return majorService.selectByCollegeId(collegeId);
//    }

}
