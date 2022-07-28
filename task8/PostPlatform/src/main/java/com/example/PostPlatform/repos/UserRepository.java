package com.example.PostPlatform.repos;

import com.example.PostPlatform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
