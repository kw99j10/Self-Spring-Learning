package com.camp.mybatis.service;

import com.camp.mybatis.dao.UserDAO;
import com.camp.mybatis.dto.User;

import java.util.List;

//@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDao;
    public UserServiceImpl(UserDAO userDao) {
        this.userDao = userDao;
    }

    @Override
    public String login(User user) {
        return userDao.selectName(user);
    }
    @Override
    public boolean register(User user) {
        User existedUser = userDao.selectUser(user.getUserId());
        if(existedUser == null) {
            userDao.add(user);
            return true;
        }
        return false;
    }

    @Override
    public void removeUser(String userId) {
        userDao.deleteUser(userId);
    }

    @Override
    public void modifyUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public List<User> getUsers() {
        return userDao.selectUsers();
    }

    @Override
    public User getUser(String userId) {
        return userDao.selectUser(userId);
    }
}
