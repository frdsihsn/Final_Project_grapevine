package com.example.PostPlatform.controller;

import com.example.PostPlatform.model.Post;
import com.example.PostPlatform.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService service;

    @CrossOrigin
    @PostMapping("/addpost")
    public Post addPost(@RequestBody Post post){
        System.out.println(post);
        return service.addPost(post);
    }
    @GetMapping("/allposts")
    public List<Post> listAllPosts(){
        return service.getPosts();
    }
    @GetMapping("/post/{id}")
    public Post listPost(@PathVariable int id){return service.getPost(id);}
    @DeleteMapping("/del/{id}")
    public String deletePost(@PathVariable int id){
        return service.delPost(id);
    }
    @PutMapping("/updatepost")
    public Post updatePost(@RequestBody Post post){
        return service.updatePost(post);
    }
}
