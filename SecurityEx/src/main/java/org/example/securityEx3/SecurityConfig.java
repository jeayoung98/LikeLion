package org.example.securityEx3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@Slf4j
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests(authorizeRequest -> authorizeRequest
                        .requestMatchers("/shop/**", "/test").permitAll() // 이때 지정한 페이지는 누구든지 접근 가능
                        .requestMatchers("/user/mypage").hasRole("USER")
                        .requestMatchers("/admin/abc").hasRole("ADMIN") // 권한의 순서 중요 !!
                        .requestMatchers("/admin/**").hasAnyRole("ADMIN","SUPERUSER")
                        .anyRequest() // 모든 요청
                        .authenticated() // 인증을 요구
                )
                .formLogin(i -> i.loginPage("/hi im every day 6 grade hyoenjin").permitAll());


        return httpSecurity.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public UserDetailsService userDetailService() {
        // 실제 프로젝트에서는 이부분을 우리 DB 에 있는 사용자 정보를 이용할 수 있도록 코드를 만들거 .
        UserDetails user = User.withUsername("user")
                .password(passwordEncoder().encode("1234"))
                .roles("USER")
                .build();

        UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder().encode("1234"))
                .roles("ADMIN")
                .build();

        UserDetails superUser = User.withUsername("superUser")
                .password(passwordEncoder().encode("1234"))
                .roles("SUPERUSER")
                .build();
        return new InMemoryUserDetailsManager(user,admin,superUser);

    }
}
