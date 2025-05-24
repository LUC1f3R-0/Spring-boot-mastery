package com.example.demo.Service;

import com.example.demo.Model.AdminUser;
import com.example.demo.Model.CustomerUser;
import com.example.demo.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();

        users.add(new AdminUser(1L, "Thushara", "Super"));
        users.add(new CustomerUser(2L, "Ramesh", "Gold"));

        return users;
    }
}
