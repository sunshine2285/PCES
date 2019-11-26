package com.ouc.pces.mapper;

import com.ouc.pces.entity.TagType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TagTypeMapper {
    ArrayList<TagType> selectAll();
}
