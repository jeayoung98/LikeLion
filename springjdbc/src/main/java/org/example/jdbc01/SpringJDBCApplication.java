package org.example.jdbc01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.util.List;

@SpringBootApplication
public class SpringJDBCApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringJDBCApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(JdbcTemplate jdbcTemplate) {
        // CommandLineRunner 를 구현하고 있는 이름없는 객체를 Lambda 표현식으로 생성
        return args -> {
            // 입력
            jdbcTemplate.update("INSERT INTO users(name, email) VALUES (?,?)"
                    , "hong","hong.example.com");

            // Read
            // RomMapper 를  이용해야하는 이유는 결과값 담을때 .. 완벽하게 같지 않을때
            // 테이블의 컬럼과 , User Class 의 필드를 직접
            // 테이블의 컬럼과, 클래스의 필드가 완전히 일치하다면 ?

//            List<User> users = jdbcTemplate.query("SELECT id, name, email FROM users"
//                    , new BeanPropertyRowMapper<>(User.class));
//            users.forEach(System.out::println);

            RowMapper<User> userRowMapper = (ResultSet rs, int rowNum) -> new User(
                    rs.getLong("id"),
                    rs.getString("name"),
                    rs.getString("email")
            );
            List<User> user = jdbcTemplate.query("select id, name, email from users",userRowMapper);
            user.forEach(System.out::println);
        };
    }
}
