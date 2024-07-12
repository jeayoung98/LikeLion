package org.example.securityEx2;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@Slf4j
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests(authorizeRequest -> authorizeRequest
                        .anyRequest()
                        .authenticated()
                )
                .formLogin(Customizer.withDefaults());

        httpSecurity.rememberMe(rememberMe -> rememberMe
                .rememberMeParameter("rememeber")
                .tokenValiditySeconds(300)
        );
        return httpSecurity.build();
    }
}
