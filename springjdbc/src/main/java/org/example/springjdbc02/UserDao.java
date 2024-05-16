package org.example.springjdbc02;

import org.springframework.transaction.annotation.Transactional;

public interface UserDao {
    @Transactional // 오류 발생 시 롤백
    void createAndUpdateUser(String name, String email, String newEmail);
}
