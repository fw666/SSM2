package com.java.maven.service;

import com.java.maven.pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectUser();
    User selectUserById(String id);
    void insertUser(User user);
}
