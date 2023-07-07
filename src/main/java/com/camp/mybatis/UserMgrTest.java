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
        System.out.println(userService.getUser("a"));
        userService.modifyUser(new User("a", "a", "테스터", "aaa@camp.cmo"));
        System.out.println(userService.getUser("a"));

        System.out.println("=========================");
        userService.removeUser("a");
        for (User user : userService.getUsers()) {
            System.out.println(user.getName());
        }
    }
}
