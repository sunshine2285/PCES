package com.ouc.pces;

import com.ouc.pces.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommentMapperTest {
    @Autowired
    CommentMapper commentMapper;

    @Test
    void selectTest(){
        System.out.println(commentMapper.selectByCourseId(1));
    }
}
