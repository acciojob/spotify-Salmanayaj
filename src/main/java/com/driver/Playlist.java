package com.driver;

import java.util.List;

public class Playlist {
    private String title;

    public Playlist(){       // default constructor

    }

    public Playlist(String title){   // user defined constructor
        this.title = title;
    }

    // below is the getter and setter function
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
