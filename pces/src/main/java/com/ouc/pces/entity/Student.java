/*
 * Copyright (c) 2019
 * FileName: Student.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-30 21:31:24
 */

package com.ouc.pces.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import springfox.documentation.annotations.ApiIgnore;

@ApiModel
public class Student {
    private int id;
    private String studentId;
    private String name;
    private String nickname;
    private String mail;
    @JsonIgnore
    private String password;
    private int college;
    private int major;
    private String grade;
    private int type;
    @JsonIgnore
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
