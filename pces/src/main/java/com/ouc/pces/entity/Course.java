package com.ouc.pces.entity;


public class Course {

    private long id;
    private long majorId;
    private String name;
    private String teacher;
    private String schoolTime;
    private String campus;
    private String courseType;
    private String remark;
    private String introduction;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", majorId=" + majorId +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", schoolTime='" + schoolTime + '\'' +
                ", campus='" + campus + '\'' +
                ", courseType='" + courseType + '\'' +
                ", remark='" + remark + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMajorId() {
        return majorId;
    }

    public void setMajorId(long majorId) {
        this.majorId = majorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }


    public String getSchoolTime() {
        return schoolTime;
    }

    public void setSchoolTime(String schoolTime) {
        this.schoolTime = schoolTime;
    }


    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }


    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

}
