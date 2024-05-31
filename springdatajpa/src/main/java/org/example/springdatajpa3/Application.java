package org.example.springdatajpa3;

import org.example.springdatajpa3.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {
        return (args) -> {
            // Criteria API를 사용한 사용자 조회 예제
            User usersByNameCriteria = (User) userRepository.findByName("홍길동");
            log.info("Criteria API로 찾은 사용자: " + usersByNameCriteria.getName() + ", 이메일: " + usersByNameCriteria.getEmail());
        };
    }
}
