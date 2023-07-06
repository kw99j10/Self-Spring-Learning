package com.camp.mybatis.service;

import com.camp.mybatis.dao.UserDAOImplMemory;
import com.camp.mybatis.dto.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAOImplMemory userDao;

    public UserServiceImpl(UserDAOImplMemory userDao) {
        this.userDao = userDao;
    }

    @Override
    public String login(User user) {
        return userDao.selectUser(user);
    }

    // 사용자 등록 & 중복 id 검사
    @Override
    public boolean register(User user) {
        User select = userDao.selectName(user.getUserId());
        if (select == null) {
            userDao.add(user);
            return true;
        }
        return false;
    }
}
