package com.driver;

public class Song {
    private String title;
    private int length;
    private int likes;

    public Song(){     // default constructor

    }

    public Song(String title, int length){     // user defined constructor
        this.title = title;
        this.length = length;
    }

    // below is the getter and setter function
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
