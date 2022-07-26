package com.example.PostPlatform.repos;

import com.example.PostPlatform.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
