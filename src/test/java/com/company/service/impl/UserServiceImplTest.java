package com.company.service.impl;

import com.company.service.iservice.UserService;
import com.github.pagehelper.PageHelper;
import commons.SpringTestCase;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class UserServiceImplTest extends SpringTestCase {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void findById() {
        System.out.println(userService);
        User user = userService.findById(1);
        System.out.println("$$$$$$$$$$$$$$$$$" + user);
    }

    @Test
    public void save() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void findByPage() {
    }

    @Test
    public void findAll() {
        //startPage应用（第一个参数是页数）
        PageHelper.startPage(2,3);
        List<User> users = userService.findAll();
        TestCase.assertTrue(users.size() > 0);
        for (User user : users) {
            logger.debug("*********************" + user.toString());
        }
        //offsetPage应用(offset忽略过多少条记录，第一个参数是偏移量)
        PageHelper.offsetPage(3,3);
        List<User> users2 = userService.findAll();
        TestCase.assertEquals(3,users2.size());
        for (User user : users2) {
            logger.debug("$$$$$$$$$$$$$$$$$$$$$" + user.toString());
        }
    }

    @Test
    public void findByName() {
    }

    @Test
    public void sessionCache() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);//Mybatis将UserDao接口与user-mapper.xml结合成一个代理对象，赋值给userDao
        User user1 = userDao.findById(1, (int) (Math.random() * 1000));
        logger.debug("***************" + user1);
        User user2 = userDao.findById(1, (int) (Math.random() * 1000));
        logger.debug("$$$$$$$$$$$$$$$" + user2);
        sqlSession.close();
    }
}