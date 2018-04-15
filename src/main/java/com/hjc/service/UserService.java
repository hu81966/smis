package com.hjc.service;

import com.hjc.entity.User;

import java.util.List;

public interface UserService {

    public void test();

    public User SelectPwdById(String id);

    public User login(User user);

    public List<User> getAll();
}
