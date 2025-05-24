package com.example.demo.Service;

import com.example.demo.Model.AdminUser;
import com.example.demo.Model.CustomerUser;
import com.example.demo.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getAllUSers(){
        List<User> users = new ArrayList<>();

        users.add(new AdminUser(1L, "Nikesh", "Gold"));
        users.add(new CustomerUser(1L, "Thushan", "Platinum"));

        return users;
    }

    public List<String> getAccessInfoForAllUsers(){
        List<String> accessLevels = new ArrayList<>();
        for (User user : getAllUSers()) {
            accessLevels.add(user.getAccessLevel());
        }
        return accessLevels;
    }

}
