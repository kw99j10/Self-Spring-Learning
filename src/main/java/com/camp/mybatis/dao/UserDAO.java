package com.camp.mybatis.dao;

import com.camp.mybatis.dto.User;


public interface UserDAO {
    User selectName(String userId);

    String selectUser(User user);

    void add(User user);

    void update(User user);

    void delete(User user);

    void findAll();
}
