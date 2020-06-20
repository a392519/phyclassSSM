package com.demo.mapper;

import com.demo.model.User;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> findByName(String username);
}
