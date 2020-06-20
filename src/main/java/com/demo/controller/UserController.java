package com.demo.controller;

import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/getByName")
    public List<User> getByName(@RequestParam(value = "username",defaultValue = "",required = false) String username){
        return userService.getByName(username);
    }
}
