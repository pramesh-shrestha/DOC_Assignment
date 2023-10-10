package com.devops.devopsassignment.repositories;

import com.devops.devopsassignment.entities.Story;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story, Integer> {
}
