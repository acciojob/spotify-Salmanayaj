package com.driver;

import java.util.Date;
import java.util.List;

public class Album {
    private String title;
    private Date releaseDate;

    public Album(){    // default contsructor

    }

    public Album(String title){     // user defined constructor
        this.title = title;
        this.releaseDate = new Date();
    }

    // below is the getter and setter function
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
