package com.devops.devopsassignment.controllers;


import com.devops.devopsassignment.services.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoryController {
  @Autowired
  private StoryService storyService;
}
