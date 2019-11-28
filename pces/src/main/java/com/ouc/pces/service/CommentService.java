package com.ouc.pces.service;

import com.ouc.pces.entity.Comment;
import com.ouc.pces.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class CommentService {
    @Autowired
    CommentMapper commentMapper;

    public ArrayList<Comment> selectByCourseId(int courseId){
        return commentMapper.selectByCourseId(courseId);
    }

    public int insert(Comment comment){
        comment.setId(0);
        comment.setDate(Timestamp.valueOf(LocalDateTime.now()));
        return commentMapper.insert(comment);
    }

    public int deleteById(int id){
        return commentMapper.deleteById(id);
    }
}
