package com.ouc.pces.mapper;

import com.ouc.pces.entity.TestUser;
import org.springframework.stereotype.Repository;

@Repository
public interface TestUserMapper {
    TestUser select(int id);
}
