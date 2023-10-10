package com.devops.devopsassignment.controllers;

import com.devops.devopsassignment.entities.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devops.devopsassignment.services.DepartmentService;

@RestController
//@RequestMapping("/department")
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  @GetMapping("/{id}")
  public DepartmentEntity getDepartment(@PathVariable int id){
    return departmentService.getDepartmentById(id);
  }
  @RequestMapping("/")
  public String index() {
    return "<body><h1>DevOps and Cloud</h1> " +
        "<h2>Dockerizing Spring Boot Backend Application.</h2>" +
        "<p>With Docker, we can containerize SEP4 back-end and front-end applications.</p></body>";
  }


}
