package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {
    List<Post> posts;

    public PostService(){
        posts = new ArrayList<>();
    }

    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
