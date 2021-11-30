package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();

    public List<Post> listAllPosts(){
        posts.add(new Post("Первый пост", new Date()));
        posts.add(new Post("Второй пост", new Date()));
        posts.add(new Post("Третий пост", new Date()));
        return posts;
    }
}
