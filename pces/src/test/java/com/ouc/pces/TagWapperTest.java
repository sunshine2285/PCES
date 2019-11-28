package com.ouc.pces;

import com.ouc.pces.entity.Tag;
import com.ouc.pces.mapper.TagMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;


@SpringBootTest
public class TagWapperTest {
    @Autowired
    TagMapper tagMapper;

    @Test
    void selectTest(){
        System.out.println(tagMapper.checkIsExist(5,6));
    }

    @Test
    void insertTest(){
        ArrayList<Tag> tags = new ArrayList<>();
        Tag tag = new Tag(1, 5, 1);
        tags.add(tag);
        System.out.println(tagMapper.insertTags(tags));
    }
}
