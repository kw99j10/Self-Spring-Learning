package com.camp.mybatis.dao;

import com.camp.mybatis.dto.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImplMemory implements UserDAO {

    private List<User> users;

    private UserDAOImplMemory() {
        users = new ArrayList<>();
        users.add(new User("spring", "spring", "봄이", "spring@camp.com"));
        users.add(new User("java", "java", "자바짱", "java@camp.com"));
    }
    @Override
    public User selectName(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public String selectUser(User user) {
        User user1 = selectName(user.getUserId());
        if(user1!=null && user1.getPassword().equals(user.getPassword())) {
            return user1.getName();
        }
        return null;
    }
    @Override
    public void add(User user){
        users.add(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void findAll() {

    }
}
