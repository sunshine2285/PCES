package com.ouc.pces.service;


import com.ouc.pces.entity.TestUser;
import com.ouc.pces.mapper.TestUserMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestUserService {
    @Autowired
    TestUserMapper testUserMapper;

    public TestUser select(int id) {
        return testUserMapper.select(id);
    }

    public int insert(String name){
        return testUserMapper.insert(name);
    }
}
