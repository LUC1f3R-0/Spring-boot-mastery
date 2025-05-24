package com.example.demo.Model;

import com.example.demo.Service.AccessControl;

public abstract class User implements AccessControl {
    private Long id;
    private String name;

    public abstract String getAccessLevel();

    public User(Long _id, String _name) {
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

    public void setName(String _name) {
        this.name = _name;
    }

}
