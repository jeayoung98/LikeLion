package org.example.springDataJDBC01;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

// 엔티티 클래스 (DTO는 단순히 값만 담아서 전달되는 객체) 엔티티는 데이터베이스와의 관계를 알려주는 역할도 함.
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table("users")
public class User {
    @Id
    private Long id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
