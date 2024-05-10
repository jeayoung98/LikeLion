package org.example.iocex.controller;

import org.example.iocex.dao.UserDao;
import org.example.iocex.domain.User;
import org.example.iocex.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void joinUser() {
        // 실제 동작할 때는 사용자로부터 정보를 받아옴 .
        User user = new User();
        user.setName("jung");
        user.setEmail("asdf@gmail.com");
        user.setPassword("asdf");

        userService.joinUser(user);
    }
}
