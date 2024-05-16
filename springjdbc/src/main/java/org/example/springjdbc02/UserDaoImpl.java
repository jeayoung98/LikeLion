package org.example.springjdbc02;

import lombok.RequiredArgsConstructor;
import org.example.springDataJDBC01.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class UserDaoImpl implements UserDao {
    private final JdbcTemplate jdbcTemplate;
    @Override
    public void createAndUpdateUser(String name, String email, String newEmail) {
        jdbcTemplate.update("insert into users(name,email) values (?,?)", name, email);
        if (newEmail.contains("error")) { // 일부러 예외 발생 시켜봄
            throw new RuntimeException("Simulated error");
        }
        jdbcTemplate.update("update users set email = ? where name = ? ",newEmail,name);
    }
}
