package com.ouc.pces;

import com.ouc.pces.entity.Comment;
import com.ouc.pces.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@SpringBootTest
public class CommentMapperTest {
    @Autowired
    CommentMapper commentMapper;

    @Test
    void selectTest(){
        System.out.println(commentMapper.selectByCourseId(1));
    }

    @Test
    void insertTest(){
        Comment comment = new Comment();
        comment.setId(0);
        comment.setCourseId(1);
        comment.setComment("nice");
        comment.setUserId(1);
        comment.setDate(Timestamp.valueOf(LocalDateTime.now()));

        System.out.println(comment);
        System.out.println(commentMapper.insert(comment));
    }

    @Test
    void deleteTest(){
        System.out.println(commentMapper.deleteById(3));
    }
}
