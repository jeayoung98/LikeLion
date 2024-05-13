package org.example.iocex.controller;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.example.iocex.domain.User;
import org.example.iocex.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;


    public UserController(UserService userService) {
        System.out.println("UserController 생성자 호출 !!");
        this.userService = userService;
    }

    @PostConstruct
    public void init() {
        // 해당 빈이 생성된 직후 !! 호출 해줌.
        System.out.println("postContruct 실행 !!");
    }
    @PreDestroy
    public void destory() {
        // 빈이 소멸되기 직전에 호출
        System.out.println("preDestory 실행 !!");
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
