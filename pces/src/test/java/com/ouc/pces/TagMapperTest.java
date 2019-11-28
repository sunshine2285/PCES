package com.ouc.pces;

import com.ouc.pces.entity.Tag;
import com.ouc.pces.mapper.TagMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;


@SpringBootTest
public class TagMapperTest {
    @Autowired
    TagMapper tagMapper;

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
}
