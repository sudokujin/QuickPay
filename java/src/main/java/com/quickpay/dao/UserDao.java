package com.quickpay.dao;

import com.quickpay.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User getUserById(int id);
    User findByUsername(String username);

    int findIdByUsername(String username);
    boolean create(String username, String password, String role);

    boolean create(User user);
}
