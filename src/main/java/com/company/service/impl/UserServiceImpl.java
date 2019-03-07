package com.company.service.impl;

import com.company.dao.UserMapper;
import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int userRegist(User user) {
        int result = userMapper.insertSelective(user);
        return result;
    }
}
