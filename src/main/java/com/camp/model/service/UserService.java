package com.camp.model.service;

import com.camp.model.dao.UserDAO;

public class UserService {

    private UserDAO userDAO = new UserDAO(); //위험: 값이 변할 시 코드 계속 변경 필요

    public String login(String userId, String password) {
        return userDAO.select(userId, password);
    }
}
