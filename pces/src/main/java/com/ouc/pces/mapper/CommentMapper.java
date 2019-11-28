package com.ouc.pces.mapper;

import com.ouc.pces.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CommentMapper {
    public int insert(Comment comment);
    public int deleteById(int id);
    public ArrayList<Comment> selectByCourseId(int courseId);
}
