package com.ouc.pces.controller;

import com.ouc.pces.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestUserController {
    @Autowired
    TestUserService testUserService;

    @RequestMapping("getTestUser/{id}")
    public String getTestUser(@PathVariable int id){
        System.out.println("hello");
        return testUserService.select(id).toString();
    }

    @RequestMapping("insertTestUser/{name}")
    public String insertTestUser(@PathVariable String name){
        System.out.println(name);
        return String.valueOf(testUserService.insert(name));
    }
}
