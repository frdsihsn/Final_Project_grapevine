package com.example.PostPlatform.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="postId")
    private Integer postId;

    private String postName;
    private String postDescription;
    private String postUrl;
    private String postUser;

    private Integer userId;

    private Date createdAt;

    public Post(Integer postId, String postName, String postDescription, String postUrl, String postUser, Integer userId, Date createdAt) {
        this.postId = postId;
        this.postName = postName;
        this.postDescription = postDescription;
        this.postUrl = postUrl;
        this.postUser = postUser;
        this.userId = userId;
        this.createdAt = createdAt;
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

    public String getPostUser() {
        return postUser;
    }

    public void setPostUser(String postUser) {
        this.postUser = postUser;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
