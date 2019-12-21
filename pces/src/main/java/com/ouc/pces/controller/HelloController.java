package com.ouc.pces.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
public class HelloController {
//    @RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello() {
        return "Hello SpringBoot";
    }
}
