package com.example.PostPlatform.service;


import com.example.PostPlatform.model.User;
import com.example.PostPlatform.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{
    @Autowired
    private UserRepository userRepository;


    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAllUser(){return userRepository.findAll();}

    public User findUser(int id){return userRepository.findById(id).orElse(null);}

    public String delUser(int id){
        userRepository.deleteById(id);
        return "User with id:" + id + " was deleted!";
    }

    public User updateUser(User user){
        User existingUser = userRepository.findById(user.getUserId()).orElse(null);

        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setUsername(user.getUsername());
        existingUser.setPassword(user.getPassword());

        return userRepository.save(existingUser);
    }
}
