package com.company.service.impl;

import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;
import commons.SpringTestCase;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class UserServiceImplTest extends SpringTestCase {
@Autowired
UserService userService;
    @Test
    public void userRegist() {
        User user1= new User("zzz","123","f");
        userService.userRegist(user1);
    }
}