package com.ouc.pces.entity;


import io.swagger.annotations.ApiModelProperty;

public class Comment {

  @ApiModelProperty(hidden = true)
  private long id;
  private long courseId;
  private String comment;
  private long userId;
  @ApiModelProperty(hidden = true)
  private java.sql.Timestamp date;

  @Override
  public String toString() {
    return "Comment{" +
            "id=" + id +
            ", courseId=" + courseId +
            ", comment='" + comment + '\'' +
            ", userId=" + userId +
            ", date=" + date +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getCourseId() {
    return courseId;
  }

  public void setCourseId(long courseId) {
    this.courseId = courseId;
  }


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public java.sql.Timestamp getDate() {
    return date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }

}
