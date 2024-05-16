package org.example.springjdbc02;

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
    public CommandLineRunner transactionDemo(UserDao userDao) {
        return args -> {
            try {
                userDao.createAndUpdateUser("123123", "jung@exam.com", "error@exam.com");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
    }
}
