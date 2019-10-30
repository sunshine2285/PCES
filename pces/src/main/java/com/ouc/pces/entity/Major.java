/*
 * Copyright (c) 2019
 * FileName: Major.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 21:32:30
 */

package com.ouc.pces.entity;

public class Major {
    private int id;
    private int college;
    private String name;

    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", college=" + college +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCollege() {
        return college;
    }

    public void setCollege(int college) {
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
