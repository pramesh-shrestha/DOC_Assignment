package com.devops.devopsassignment.services;

import com.devops.devopsassignment.entities.DepartmentEntity;
import com.devops.devopsassignment.entities.Story;
import com.devops.devopsassignment.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {

  @Autowired
  private DepartmentRepository departmentRepository;

  private List<Story> stories = new ArrayList<>();

  public DepartmentEntity getDepartmentById(int id) {
    return departmentRepository.findById(id).get();
  }
}
