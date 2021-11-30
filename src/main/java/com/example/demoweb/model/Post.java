package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String text, Date postDate){
        this.text = text;
        creationDate = postDate;
    }

    public String getText(){
        return this.text;
    }

    public Integer getLikes(){
        return this.likes;
    }

    public Date getCreationDate(){
        return creationDate;
    }
}
