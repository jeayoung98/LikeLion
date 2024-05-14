package org.example.springDataJDBC01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
//            userRepository.save(new User("jung123", "jung123@exam.com"));

//            User user = userRepository.findById(19L).get();
//            System.out.println(user.getName());
//            System.out.println(userRepository.findByName("jung"));

            PageRequest pageRequest = PageRequest.of(0, 3);
            Page<User> allUser = userRepository.findAll()
        };
    }
}
