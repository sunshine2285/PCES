/*
 * Copyright (c) 2019
 * FileName: Major.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 21:32:30
 */

package com.ouc.pces.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Major {
    @ApiModelProperty(value = "专业ID", required = true)
    private int id;
    @ApiModelProperty(value = "专业所在学院id", required = true)
    private int collegeId;
    @ApiModelProperty(value = "专业名称", required = true)
    private String name;

    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", collegeId=" + collegeId +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
