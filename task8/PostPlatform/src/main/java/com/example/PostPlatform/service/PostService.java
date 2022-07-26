package com.example.PostPlatform.service;

import com.example.PostPlatform.model.Post;
import com.example.PostPlatform.repos.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post addPost(Post post){
        return repository.save(post);
}
    public List<Post> getPosts(){return repository.findAll();}

    public Post getPost(int id){return repository.findById(id).orElse(null);}

    public String delPost(int id){repository.deleteById(id);return "Deleted Post with ID : "+id;}

    public Post updatePost(Post post){
        Post existingPost = repository.findById(post.getId()).orElse(null);
        existingPost.setPostName(post.getPostName());
        existingPost.setPostDescription(post.getPostDescription());
        existingPost.setPostUrl(post.getPostUrl());
        existingPost.setPostUser(post.getPostUser());
        return repository.save(existingPost);
    }


}
