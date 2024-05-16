package org.example.springDataJDBC01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(UserRepository userRepository) {
//        return args -> {
////            userRepository.save(new User("jung123", "jung123@exam.com"));
//
////            User user = userRepository.findById(19L).get();
////            System.out.println(user.getName());
////            System.out.println(userRepository.findByName("jung"));
//
//            PageRequest pageRequest = PageRequest.of(0, 3);
//            Page<User> allUser = userRepository.findAllUsersWithPagination(pageRequest);
//
//        };
//    }

    @Bean
    public CommandLineRunner batchUpdateDemo(JdbcTemplate jdbcTemplate) {
        return args -> {
            List<User> users = Arrays.asList(
                    new User(null,"Alice","alice@example.com"),
                    new User(null,"jung","jung111@example.com"),
                    new User(null,"hong","hong111@example.com"),
                    new User(null,"kim","kim111@example.com")
            );

            String sql = "insert into users(name,email) values(?,?)";

            int[] updateCounts = jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
                @Override
                public void setValues(PreparedStatement ps, int i) throws SQLException {
                    User user = users.get(i);
                    ps.setString(1,user.getName());
                    ps.setString(2, user.getEmail());
                }

                @Override
                public int getBatchSize() {
                    return 0;
                }
            });
            System.out.println(Arrays.toString(updateCounts));
        };
    }
}
