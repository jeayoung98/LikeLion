package org.example.jwtEx.security.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginDto {
    @NotEmpty
    private String username;

    @NotEmpty
    @Pattern(regexp=  "^(?=.[a-zA-Z])(?=.\\d)(?=.*\\W).{8,20}$")
    private String password;
}
