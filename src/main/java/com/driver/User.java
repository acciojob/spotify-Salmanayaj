package com.driver;

import java.util.List;

public class User {
    private String name;
    private String mobile;

    public User() {}

    public User(String name, String mobile) {  // constructor for name and mobile number.
        this.name = name;
        this.mobile = mobile;
    }
 // below is the getter and setter function.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
