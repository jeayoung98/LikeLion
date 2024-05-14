package org.example.jdbc03.dao;

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
