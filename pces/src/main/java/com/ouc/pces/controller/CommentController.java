package com.ouc.pces.controller;

import com.ouc.pces.DTO.ResponseDTO;
import com.ouc.pces.entity.Comment;
import com.ouc.pces.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Api(value = "评论", tags = "评论接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @ApiOperation(value = "某课程评论", notes = "根据课程ID获取该课程所有评论信息")
    @GetMapping(value = "/{courseId}", produces = "application/json")
    public ArrayList<Comment> getCommentByCourseId(@PathVariable int courseId){
        return commentService.selectByCourseId(courseId);
    }

    @ApiOperation(value = "添加评论", notes = "根据课程ID给该课程添加评论")
    @PostMapping(value = "/add", produces = "application/json")
    public ResponseDTO addComment(@RequestBody Comment comment){
        int result = commentService.insert(comment);
        if(result == 1)
            return new ResponseDTO(ResponseDTO.OK);
        else
            return new ResponseDTO(ResponseDTO.FAILED);
    }

    @ApiOperation(value = "删除评论", notes = "根据评论id和用户信息删除评论")
    @DeleteMapping(value = "/{commentId}", produces = "application/json")
    public ResponseDTO deleteCommentById(@PathVariable int commentId){
        //todo 检验是否可以删除当前评论
        int result = commentService.deleteById(commentId);
        if(result == 1)
            return new ResponseDTO(ResponseDTO.OK);
        else
            return new ResponseDTO(ResponseDTO.FAILED);
    }
}
