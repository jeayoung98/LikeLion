package org.example.springmvc.domain;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserForm {
    @NotEmpty(message = "username 은 공백을 허용하지 않습니다.")
    @Size(min = 4,max = 20,message = "username 은 4 ~ 20자")
    private String username;
    @NotEmpty(message = "password 는 공백을 허용하지 않습니다.")
    @Size(min = 6,message = "비밀번호는 최소 6자")
    private String password;
}
