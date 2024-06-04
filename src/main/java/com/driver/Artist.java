package com.driver;

import java.util.List;

public class Artist {
    private String name;
    private int likes;

    public Artist(){     // default constructor.

    }

    public Artist(String name){    // user defined constructor
        this.name = name;
        this.likes = 0;
    }

    // below is the getter and setter function
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
