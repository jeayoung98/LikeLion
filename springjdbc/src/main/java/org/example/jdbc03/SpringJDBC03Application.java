package org.example.jdbc03;

import org.example.jdbc03.dao.User;
import org.example.jdbc03.dao.UserDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJDBC03Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringJDBC03Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserDao userDao) {
        return args -> {
            //insert test
//            userDao.insertUser(new User(null, "hong", "hong@naver.com"));
//            userDao.deleteUser("jung1");
//            userDao.updateUserEmail("jung","asdf@exam.com");
            userDao.findAllUsers();
            userDao.deleteUser("kim");

        };
    }
}

