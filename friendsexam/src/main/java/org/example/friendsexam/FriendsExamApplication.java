package org.example.friendsexam;

import org.example.friendsexam.repository.FriendRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FriendsExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(FriendsExamApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(FriendRepository repository) {
//        return args -> {
//            repository.findAll().forEach(a -> System.out.println(a));
//        };
//    }

}
