package com.example.demoweb.model;

import java.util.Date;

public class Post {

    private String text;
    private int likes;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date postDate){
        this.id = id;
        this.text = text;
        creationDate = postDate;
    }

    public String getText(){
        return this.text;
    }

    public int getLikes(){
        return this.likes;
    }

    public void setLikes(int likes){
        this.likes = likes;
    }

    public Date getCreationDate(){
        return creationDate;
    }

    public long getId() {
        return this.id;
    }
}
