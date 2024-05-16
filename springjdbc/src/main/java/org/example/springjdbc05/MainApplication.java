package org.example.springjdbc05;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }

    @Bean
    public CommandLineRunner demoExtractor(JdbcTemplate jdbcTemplate) {
        return args -> {
            // ResultSetExtractor example
            String sql = "select id, name, email from users";
            User user = jdbcTemplate.query(sql, new UserResultSetExtractor());
            System.out.println(user);
        };
    }

    private static class UserResultSetExtractor implements ResultSetExtractor<User> {

        @Override
        public User extractData(ResultSet rs) throws SQLException, DataAccessException {
            User user = new User();
            if (rs.next()) {
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
            }
            return user;
        }
    }
}
