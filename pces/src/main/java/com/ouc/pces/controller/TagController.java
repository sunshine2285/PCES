package com.ouc.pces.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "标签", tags = "标签接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tag")
public class TagController {
    @Autowired
    TagController tagController;
}
