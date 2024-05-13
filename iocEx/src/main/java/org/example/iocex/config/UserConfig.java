package org.example.iocex.config;

import org.example.iocex.controller.UserController;
import org.example.iocex.dao.UserDao;
import org.example.iocex.dao.UserDaoImpl;
import org.example.iocex.service.UserService;
import org.example.iocex.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.iocex")
public class UserConfig {

    //IOC 컨테이너에 Bean 을 등록하는 방법을 생각 해보고 구현.

    // 1. javaConfig 를 이용해서 동작되도록 !
//    @Bean
//    public UserDao userDao() {
//        return new UserDaoImpl();
//    }
//
//    @Bean
//    public UserService userService(UserDao userDao) {
////        UserServiceImpl userService = new UserServiceImpl();
////        userService.setUserDao(userDao); // userDao 값을 넣어주는 setter 메서드 필요 !!
////        return userService;
//
//        return new UserServiceImpl(userDao); // userDao를 인자로 받는 생성자 필요 !!
//    }
//
//    @Bean
//    public UserController userController(UserService userService) {
//        return new UserController(userService);
//    }

    // 2. componentScan 을 이용해서 동작되도록 !


}
