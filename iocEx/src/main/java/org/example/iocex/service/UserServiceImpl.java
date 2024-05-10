package org.example.iocex.service;

import org.example.iocex.dao.UserDao;
import org.example.iocex.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void joinUser(User user) {
        // 회원가입을 위한 비지니스 코드가 작성

        // 회원가입을 위한 비지니스가 수행되면 해당 데이터를 저장하는 코드가 실행
        userDao.addUser(user);
    }
}
