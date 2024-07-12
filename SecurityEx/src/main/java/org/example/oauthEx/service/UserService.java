package org.example.oauthEx.service;

import lombok.RequiredArgsConstructor;
import org.example.oauthEx.domain.User;
import org.example.oauthEx.repository.RoleRepository;
import org.example.oauthEx.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.example.oauthEx.domain.Role;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    // 회원가입
    public User registerUser(User user) {
        // role 추가
        Role role = roleRepository.findByName("USER");
        user.setRoles(Collections.singleton(role));

        // password 암호화해서 넣어줘야함
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }

}
