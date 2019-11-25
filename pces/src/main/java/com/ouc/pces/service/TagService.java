package com.ouc.pces.service;

import com.ouc.pces.entity.Tag;
import com.ouc.pces.entity.TagType;
import com.ouc.pces.mapper.TagMapper;
import com.ouc.pces.mapper.TagTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TagService {
    @Autowired
    TagMapper tagMapper;
    @Autowired
    TagTypeMapper tagTypeMapper;

    public ArrayList<TagType> selectAll() {
        return tagTypeMapper.selectAll();
    }

    public ArrayList<Tag> selectTagsByCourseId(int courseId) {
        return tagMapper.selectTagsByCourseId(courseId);
    }

}
