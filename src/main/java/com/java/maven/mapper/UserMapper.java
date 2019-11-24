package com.java.maven.mapper;

import com.java.maven.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select({"SELECT * FROM user"})
    List<User> selectUser();
    @Select({"SELECT * FROM user WHERE id=#{id}"})
    User selectUserById(String id);
    @Select({"INSERT INTO user VALUES(#{id},#{name},#{age},#{city},#{money})"})
    void insertUser(User user);
}
