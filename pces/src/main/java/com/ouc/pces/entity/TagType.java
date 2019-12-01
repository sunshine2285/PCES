package com.ouc.pces.entity;


public class TagType {

  private long id;
  private String tag;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  @Override
  public String toString() {
    return "TagType{" +
            "id=" + id +
            ", tag='" + tag + '\'' +
            '}';
  }
}


