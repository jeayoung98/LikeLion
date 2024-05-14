package org.example.jdbc02.dao;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.jdbc02.dao.User;
import org.example.jdbc02.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
@RequiredArgsConstructor //final이 붙어있는 필드에 대해서만 생성자를 기본으로 추가
public class UserDaoImpl implements UserDao {
    //jdbcTemplate 객체를 이용해서 구현
    //필드 기반
    private final JdbcTemplate jdbcTemplate;

    //생성자 기반
//    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    //setter 설정자 기반
//    @Autowired
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
    @Override
    public void insertUser(User user) {
        String sql = "insert into users (name, email) values (?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail());
    }

    @Override
    public List<User> findAllUsers() {
        RowMapper<User> rowMapper = (ResultSet rs, int rowNum) -> new User(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("email")
        );

        List<User> users = jdbcTemplate.query("select * from users", rowMapper);
        users.forEach(user -> System.out.println(user.getName() + " - " + user.getEmail()));

        return jdbcTemplate.query("select * from users", rowMapper);
    }

    @Override
    public void updateUserEmail(String name, String email) {
        jdbcTemplate.update("update users set email = ? where name = ?", email, name);
    }

    @Override
    public void deleteUser(String name) {
        jdbcTemplate.update("delete from users where name = ?", name);
    }
}