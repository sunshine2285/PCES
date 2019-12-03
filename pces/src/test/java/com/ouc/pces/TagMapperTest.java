package com.ouc.pces;

import com.ouc.pces.entity.Tag;
import com.ouc.pces.entity.TagType;
import com.ouc.pces.mapper.TagMapper;
import com.ouc.pces.mapper.TagTypeMapper;
import com.ouc.pces.service.TagService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;


@SpringBootTest
public class TagMapperTest {
    @Autowired
    TagMapper tagMapper;
    @Autowired
    TagTypeMapper tagTypeMapper;
    @Autowired
    TagService tagService;


    @Test
    void selectTest() {
        System.out.println(tagMapper.checkIsExist(5, 6));
    }

    @Test
    void insertTest() {
        ArrayList<Tag> tags = new ArrayList<>();
        Tag tag = new Tag(1, 7, 1);
        Tag tag2 = new Tag(1, 8, 1);
        tags.add(tag);
        tags.add(tag2);
        System.out.println(tagMapper.insertTags(tags));
    }

    @Test
    void updateTest() {
        ArrayList<Tag> tags = new ArrayList<>();
        Tag tag = new Tag(1, 1, 0);
        Tag tag2 = new Tag(1, 1, 0);
        tags.add(tag);
        tags.add(tag2);
        System.out.println(tagMapper.updateTags(tags));
    }

    @Test
    void selectAllByCourseId() {
        System.out.println(tagMapper.selectTagsByCourseId(1));
    }

    @Test
    void selectAll() {
        for (TagType tagType : tagTypeMapper.selectAll()) {
            System.out.println(tagType);//tagType.toString()
        }
    }

    @Test
    void testMethod(){
        //System.out.println(tagService.selectTagsByCourseId(1));
        ArrayList<Tag> tags = new ArrayList<>();
        Tag tag = new Tag(1, 1, 1);
        Tag tag2 = new Tag(1, 202, 1);
        tags.add(tag);
        tags.add(tag2);
        System.out.println(tagService.addTags(tags));
    }
}
