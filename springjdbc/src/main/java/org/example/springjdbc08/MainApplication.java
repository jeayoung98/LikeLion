package org.example.springjdbc08;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }

    @Bean
    public CommandLineRunner run(UserDao userDao) {
        return args -> {
            User user = new User();
            user.setName("lee");
            user.setEmail("lee.exam.com");

            User resultUser = userDao.insertUser(user);
            System.out.println(user.getId());
        };
    }
}
