package com.ouc.pces.controller;

import com.ouc.pces.entity.College;
import com.ouc.pces.entity.Major;
import com.ouc.pces.entity.Tag;
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

    @ApiOperation(value = "所有标签", notes = "获取所有可添加标签")
    @GetMapping(value = "", produces = "application/json")
    public ArrayList<TagType> getAllTagType() {
        return tagService.selectAll();
    }

    @ApiOperation(value = "某课程所有已添加标签", notes = "根据课程ID获取所有已添加标签")
    @GetMapping(value = "/{courseId}", produces = "application/json")
    public ArrayList<Tag> getTagByCourseId(@ApiParam(value = "课程ID", required = true)
                                                 @PathVariable(value = "courseId") int courseId) {
        return tagService.selectTagsByCourseId(courseId);
    }
}
