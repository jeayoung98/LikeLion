package org.example.securityEx4.service;

import lombok.RequiredArgsConstructor;
import org.example.securityEx4.domain.Role;
import org.example.securityEx4.domain.User;
import org.example.securityEx4.repository.RoleRepository;
import org.example.securityEx4.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    // 회원가입
    @Transactional
    public User registerUser(User user) {
        // role 추가
        Role role = roleRepository.findByName("USER");
        user.setRoles(Collections.singleton(role));

        // password 암호화해서 넣어줘야함
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }
}
