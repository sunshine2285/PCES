/*
 * Copyright (c) 2019
 * FileName: College.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 21:31:16
 */

package com.ouc.pces.entity;

public class College {
    private int id;
    private int name;

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

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
