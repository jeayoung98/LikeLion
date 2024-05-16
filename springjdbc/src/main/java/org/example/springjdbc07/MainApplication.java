package org.example.springjdbc07;

import com.sun.tools.javac.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }

    @Bean
    public CommandLineRunner demo(JdbcTemplate jdbcTemplate) {
        return args -> {
          String sql = """
                  insert into users(name,email)
                  values(?,?)
                  """;
            jdbcTemplate.update(sql, "Esther", "esther.exam.com");

            // 멀티 라인 쿼리로 여러 개의 데이터 조회
            String query = """
                    select id, name, email
                    from users
                    where email like ?;
                    """;
//            jdbcTemplate.query(query, (ResultSetExtractor<Object>) rs ->{
//                while(rs.next()){
//                    System.out.println("user : " + rs.getString("name") + " - " + rs.getString("email"));
//                }
//            },"%example.com");
        };
    }
}
