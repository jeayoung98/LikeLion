package org.example.springjdbc03;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.swing.*;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }
    @Bean
    public CommandLineRunner demo(UserService userService) {
        return args -> {
            userService.executeComplexBusinessProcess("jung123123","jung123123.exam.com");
        };
    }
}
