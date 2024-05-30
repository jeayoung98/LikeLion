package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.springdatajpa.User;
import org.example.springdatajpa.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Bean
	@Transactional
	public CommandLineRunner run(UserRepository repository) {
		return args -> {
//			// create
//			User user = new User("hong", "hong@example.com");
//			repository.save(user);
//			log.info("추가된 사용자 : " + user.getName());
//			log.info("사용자 아이디 : " + user.getId());
//
//			// delete
//			repository.delete(user);
//			log.info("사용자 삭제 : " + user.getName());

//			// 유저이름으로 찾기
//			List<User> users = repository.findByName("jung");
//			users.forEach(user -> log.info(user.getName()+"::::"+user.getEmail()));

			// 이메일로 찾기
			List<User> users = repository.findByEmail("jung@gmail.com");
			users.forEach(user -> log.info(user.getEmail() + ":::::" + user.getEmail()));

			// 유저,이메일 같은거 찾기
			List<User> users2 = repository.findByNameAndEmail("jung", "jung@gmail.com");
			users.forEach(user -> log.info(user.getEmail() + ":::::" + user.getEmail()));

		};
	}
}