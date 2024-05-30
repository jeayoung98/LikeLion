package org.example.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = true)
class UserRepositoryTest {
    @Autowired
    private UserRepository repository;

    @Test
    void save() {
        User user = new User("jung", "jung@!gmail.com");
        repository.save(user);

        System.out.println(user.getId());
    }

    @Test
    void findByName() {
        List<User> users = repository.findByName("jung");
        assertThat(users.size()).isEqualTo(5);
    }

    @Test
    void findByEmail() {
        List<User> users = repository.findByEmail("jung@gmail.com");
        assertThat(users.size()).isEqualTo(3);
    }

    @Test
    void findByNameAndEmail() {
        List<User> users = repository.findByNameAndEmail("jung", "jung@gmail.com");
        assertThat(users.size()).isEqualTo(3);
    }

    @Test
    void findByNameOrEmail() {
        List<User> users = repository.findByNameOrEmail("hong", "jung@gmail.com");
        assertThat(users.size()).isEqualTo(4);
    }

    @Test
    void updateUserEmail() {
        repository.updateUserEmail(3L, "new_jung@gmail.com");
        Optional<User> user = repository.findById(3L);
        assertThat(user.get().getEmail()).isEqualTo("new_jung@gmail.com");
    }

    @Test
    void deleteById() {
        repository.deleteByEmail("jung@gmail.com");
        List<User> users = repository.findByEmail("jung@gmail.com");
        assertThat(users.isEmpty()).isTrue();
    }
}