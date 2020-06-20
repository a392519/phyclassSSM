package com.demo.service;

import com.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getByName(String username);
}
