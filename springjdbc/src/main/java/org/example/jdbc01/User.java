package org.example.jdbc01;

import lombok.*;

// 롬복 !! --
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    private Long id;
    private String name;
    private String email;
}
