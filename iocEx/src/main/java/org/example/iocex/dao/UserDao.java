package org.example.iocex.dao;

import org.example.iocex.domain.User;

import java.util.List;

public interface UserDao {
    public User getUser(String email);

    public List<User> getUsers();

    public void addUser(User user);
}
