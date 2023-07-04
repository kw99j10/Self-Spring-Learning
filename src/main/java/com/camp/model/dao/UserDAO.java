package com.camp.model.dao;

import com.camp.model.dto.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private List<User> users;

    private static UserDAO instance = new UserDAO();

    private UserDAO() {
        users = new ArrayList<>();
        users.add(new User("spring", "spring", "봄이", "spring@camp.com"));
        users.add(new User("java", "java", "자바짱", "java@camp.com"));
    }

    public static UserDAO getInstance(){
        return instance;
    }
    public User select(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public String select(String userId,String password) {
        User user1 = select(userId);
        if(user1!=null && user1.getPassword().equals(password)) {
            return user1.getName();
        }
        return null;
    }
    public void add(User user){
        users.add(user);
    }
}
