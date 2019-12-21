/*
 * Copyright (c) 2019
 * FileName: Student.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 21:31:24
 */

package com.ouc.pces.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Student {
    @ApiModelProperty("ID")
    private int id;
    @ApiModelProperty(value = "学号",required = true)
    private String studentId;
    @ApiModelProperty(value = "姓名",required = true)
    private String name;
    @ApiModelProperty(value = "账户昵称",required = true)
    private String nickname;
    @ApiModelProperty(value = "邮箱",required = true)
    private String mail;
    @ApiModelProperty("用户密码")
    private String password;
    @ApiModelProperty(value = "学院id",required = true)
    private int college;
    @ApiModelProperty(value = "专业id",required = true)
    private int major;
    @ApiModelProperty(value = "年级(例如2017)",required = true)
    private String grade;
    @ApiModelProperty(value = "学生类型(1-本科生，2-研究生)",required = true)
    private int type;
    @ApiModelProperty(value = "激活状态(1-激活，0-冻结)")
    private int activate;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentID='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", college=" + college +
                ", major=" + major +
                ", grade='" + grade + '\'' +
                ", type=" + type +
                ", activate=" + activate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCollege() {
        return college;
    }

    public void setCollege(int college) {
        this.college = college;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getActivate() {
        return activate;
    }

    public void setActivate(int activate) {
        this.activate = activate;
    }
}
