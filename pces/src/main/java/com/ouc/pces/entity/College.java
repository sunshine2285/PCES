/*
 * Copyright (c) 2019
 * FileName: College.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 21:31:16
 */

package com.ouc.pces.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class College {
    @ApiModelProperty(value = "学院ID",required = true)
    private int id;
    @ApiModelProperty(value = "学院名称",required = true)
    private String name;

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
