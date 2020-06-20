package com.demo.service.imp;


import com.demo.mapper.UserMapper;
import com.demo.model.User;

import com.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getByName(String username) {
        return userMapper.findByName(username);
    }
}
