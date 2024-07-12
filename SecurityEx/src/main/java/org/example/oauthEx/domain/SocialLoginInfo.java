package org.example.oauthEx.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "social_login_info")
@Setter
@Getter
public class SocialLoginInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String provider;
    private String socialId;
    private LocalDateTime createdAt;
    private String uuid;

    public SocialLoginInfo() {
        // 소셜 로그인한 시간, UUID
        // 소셜 로그인 이후에 특정한 시간까지만 추가작업을 가능하게 하도록 하기위해
        this.createdAt = LocalDateTime.now();
        this.uuid = UUID.randomUUID().toString();
    }
}
