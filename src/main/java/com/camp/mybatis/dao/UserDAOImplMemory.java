package com.camp.mybatis.dao;

import java.util.ArrayList;
import java.util.List;

import com.camp.mybatis.dto.User;
import org.springframework.stereotype.Repository;

//@Repository
public class UserDAOImplMemory implements UserDAO {

    private List<User> users;
    public UserDAOImplMemory() {
        users = new ArrayList<User>();
        users.add(new User("spring", "spring", "봄이", "spring@camp.com"));
        users.add(new User("java", "java", "자바짱", "java@camp.com"));
    }

    @Override
    public String selectName(User user) {
        User sUser = selectUser(user.getUserId());
        if(sUser != null && sUser.getPassword().equals(user.getPassword())) {
            return sUser.getName();
        }
        return null;
    }
    @Override
    public User selectUser(String userId) {
        for (User user : users) {
            if(user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }
    @Override
    public void add(User user) {
        users.add(user);

        System.out.println("============추가================");
        for (User users : users) {
            System.out.println(users.toString());
        }
    }

    @Override
    public void deleteUser(String userId) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateUser(User user) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<User> selectUsers() {
        // TODO Auto-generated method stub
        return null;
    }

}












