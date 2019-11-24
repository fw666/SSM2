package com.java.maven.impl;

import com.java.maven.mapper.UserMapper;
import com.java.maven.pojo.User;
import com.java.maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUser() {
        return userMapper.selectUser();
    }

    @Override
    public User selectUserById(String id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}
