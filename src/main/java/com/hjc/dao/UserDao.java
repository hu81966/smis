package com.hjc.dao;

import com.hjc.entity.User;

import java.util.List;

public interface UserDao {

    User selectById(String id);

    User login(User user);

    List<User> getAll();
}
