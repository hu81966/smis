package com.hjc.dao;

import com.hjc.entity.User;

public interface UserDao {

    User selectById(String id);

    User login(User user);
}
