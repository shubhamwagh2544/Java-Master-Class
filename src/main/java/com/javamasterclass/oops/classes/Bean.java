package com.javamasterclass.oops.classes;

import java.io.Serializable;

public class Bean implements Serializable {
    /*
            What is Bean in java ?
            - 3 conditions to define some pojo class as bean
            1. public 0-args constructor
            2. private fields and public getter setter for them
            3. may/may not implement Serializable interface
     */

    private String name;
    private String address;

    public Bean() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
