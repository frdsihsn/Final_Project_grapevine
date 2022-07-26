package com.example.PostPlatform.model;

import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="postId")
    private Integer postId;

    private String postName;
    private String postDescription;
    private String postUrl;
    private Integer postUser;

    public Post(Integer postId, String postName, String postDescription, String postUrl, Integer postUser) {
        this.postId = postId;
        this.postName = postName;
        this.postDescription = postDescription;
        this.postUrl = postUrl;
        this.postUser = postUser;
    }

    public Post() {
    }

    public Integer getId() {
        return postId;
    }

    public void setId(Integer postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public Integer getPostUser() {
        return postUser;
    }

    public void setPostUser(Integer postUser) {
        this.postUser = postUser;
    }
}
