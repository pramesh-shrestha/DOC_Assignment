package com.devops.devopsassignment.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department")
public class DepartmentEntity {
  @Id
  private int id;
  private String name;

  @OneToMany
  private List<Story> captions = new ArrayList<>();

  public DepartmentEntity(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public DepartmentEntity() {

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

  public List<Story> getCaptions() {
    return captions;
  }

  public void setCaptions(List<Story> captions) {
    this.captions = captions;
  }
}
