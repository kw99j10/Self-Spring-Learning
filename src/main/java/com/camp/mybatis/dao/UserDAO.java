package com.camp.mybatis.dao;

import com.camp.mybatis.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserDAO {
    String selectName(User user);

    User selectUser(String userId);

    void add(User user);

    void updateUser(User user);

    void deleteUser(String userId);

    List<User> selectUsers();
}
