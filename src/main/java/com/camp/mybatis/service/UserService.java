package com.camp.mybatis.service;

import com.camp.mybatis.dto.User;

public interface UserService {
    String login(User user);

    // 사용자 등록 & 중복 id 검사
    boolean register(User user);
}
