package org.example.iocex;

import org.example.iocex.config.UserConfig;
import org.example.iocex.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserRun {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        UserController userController = context.getBean(UserController.class);
        userController.joinUser();
    }
}
