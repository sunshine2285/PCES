package com.ouc.pces.entity;


public class Tag {

  private long courseId;
  private long tagId;
  private long num;
  private long id;

  @Override
  public String toString() {
    return "Tag{" +
            "courseId=" + courseId +
            ", tagId=" + tagId +
            ", num=" + num +
            ", id=" + id +
            '}';
  }

  public Tag(long courseId, long tagId, long num) {
    this.courseId = courseId;
    this.tagId = tagId;
    this.num = num;
  }

  public long getCourseId() {
    return courseId;
  }

  public void setCourseId(long courseId) {
    this.courseId = courseId;
  }


  public long getTagId() {
    return tagId;
  }

  public void setTagId(long tagId) {
    this.tagId = tagId;
  }


  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

}
