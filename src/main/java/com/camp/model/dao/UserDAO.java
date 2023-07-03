package com.camp.model.dao;

import com.camp.model.dto.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private List<User> users;

    public UserDAO(){
        users = new ArrayList<>();
        users.add(new User("spring", "spring", "길동", "spring@camp.com"));
        users.add(new User("java", "123", "길순", "java@camp.com"));
    }

    public String select(String userId, String password) {
        for (User user : users) {
            if (user.getUserId().equals(userId) && user.getPassword().equals(password)) {
                return user.getName();
            }
        }
        return null;
    }
}
