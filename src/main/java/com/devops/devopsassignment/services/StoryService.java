package com.devops.devopsassignment.services;

import com.devops.devopsassignment.repositories.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoryService {

  @Autowired
  private StoryRepository storyRepository;
}
