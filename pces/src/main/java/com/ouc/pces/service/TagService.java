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

    public int addTags(ArrayList<Tag> tags) {
        ArrayList<Tag> insert_tags = new ArrayList<>();
        ArrayList<Tag> update_tags = new ArrayList<>();
        for (Tag tag : tags) {
            if (tagMapper.checkIsExist(tag.getCourseId(), tag.getTagId()) == 0) {
                insert_tags.add(tag);
            } else {
                update_tags.add(tag);
            }
        }
        if(!insert_tags.isEmpty()) tagMapper.insertTags(insert_tags);
        if(!update_tags.isEmpty()) tagMapper.updateTags(update_tags);
        return 1;
    }
}
