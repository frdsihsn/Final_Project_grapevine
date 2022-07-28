package com.example.PostPlatform.controller;

import com.example.PostPlatform.model.User;
import com.example.PostPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/allusers")
    public List<User> listAllUsers(){
        return userService.findAllUser();
    }

    @GetMapping("/user/{id}")
    public User findUser(@PathVariable int id){return userService.findUser(id);}

    @DeleteMapping("/user/del/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.delUser(id);
    }

    @PutMapping("/updateuser")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
}
