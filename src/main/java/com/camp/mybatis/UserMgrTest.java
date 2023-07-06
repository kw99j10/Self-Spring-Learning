package com.camp.mybatis;

import com.camp.mybatis.dto.User;
import com.camp.mybatis.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMgrTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService userService = context.getBean(UserService.class);
        {
            String name = userService.login(new User("a", "1234"));
            System.out.println("로그인 결과 : " + name);
        }
        userService.register(new User("a", "1234", "테스터", "a@naver.com"));
        {
            String name = userService.login(new User("a", "1234"));
            System.out.println("로그인 결과 : " + name);
        }
    }
}
