package com.devops.devopsassignment.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Story {
  @Id
  private int id;
  private String caption;

  public Story(int id, String caption) {
    this.id = id;
    this.caption = caption;
  }

  public Story() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }
}
