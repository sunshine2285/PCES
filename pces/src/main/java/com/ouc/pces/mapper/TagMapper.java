package com.ouc.pces.mapper;

import com.ouc.pces.entity.Tag;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TagMapper {
    ArrayList<Tag> selectTagsByCourseId(int courseId);
}
