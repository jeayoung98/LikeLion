package org.example.iocex.service;

import org.example.iocex.dao.UserDao;
import org.example.iocex.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
//    @Autowired
    private UserDao userDao; // 필드 기반 주입 (지양하는 방식)


//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
    @Autowired // ComponentScan 은 기본으로 생성자를 통해 주입하므로, 설정자를 통해 주입받고 싶다면 @AutoWired 를 붙힌다
    @Qualifier("userDaoImpl")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void joinUser(User user) {
        // 회원가입을 위한 비지니스 코드가 작성

        // 회원가입을 위한 비지니스가 수행되면 해당 데이터를 저장하는 코드가 실행
        userDao.addUser(user);
    }
}
