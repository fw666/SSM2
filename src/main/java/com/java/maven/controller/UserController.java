package com.java.maven.controller;


import com.java.maven.pojo.User;
import com.java.maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectUser")
    public String selectUser(Map<String ,Object> map){
        map.put("users",userService.selectUser());
        return "success";
    }

    @RequestMapping(value="selectUserById")
    public String selectUserById(Map<String ,Object> map,@RequestParam(value = "id",required = false,defaultValue = "0") String id){
        User user = userService.selectUserById(id);
        map.put("user",user);
        return "success";
    }
    @RequestMapping(value="insertUser")
    public String insertUser(User user){
        userService.insertUser(user);
        return "success";
    }
}
