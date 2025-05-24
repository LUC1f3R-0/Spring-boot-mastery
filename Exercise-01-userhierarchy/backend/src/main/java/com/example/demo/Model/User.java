package com.example.demo.Model;

public class User {
    private Long id;
    private String name;

    //the constructor
    public User(Long _id, String _name){
        this.id = _id;
        this.name = _name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
