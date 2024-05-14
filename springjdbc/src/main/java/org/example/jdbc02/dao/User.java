package org.example.jdbc02.dao;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    private Long id;
    private String name;
    private String email;
}
