package org.example.message2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ServiceConfig.class)
public class MainConfig {
    // Main configuration for the application
    // 추가적인 빈 설정은 여기
    MainConfig() {
        System.out.println("MainConfig 생성 !!");
    }
}
