package com.camp.model.service;

import com.camp.model.dao.UserDAO;
import com.camp.model.dto.User;

public class UserService {

    private final UserDAO userDao =UserDAO.getInstance();

    public String login(String userId,String password) {
        return userDao.select(userId, password);
    }

    // 사용자 등록 & 중복 id 검사
    public boolean register(User user) {
        User select = userDao.select(user.getUserId());
        if (select == null) {
            userDao.add(user);
            return true;
        }
        return false;
    }
}
