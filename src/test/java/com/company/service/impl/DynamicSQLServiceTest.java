package com.company.service.impl;

import commons.SpringTestCase;
import junit.framework.TestCase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DynamicSQLServiceTest extends SpringTestCase {
    @Autowired
    DynamicSQLService dynamicSQLService;
      Logger logger = LoggerFactory.getLogger(DynamicSQLServiceTest.class);

    @Test
    public void dynamicSQLDemo1() {
        List<User> users1 = dynamicSQLService.dynamicSQLDemo1("a");
        //执行select id,username,sal,birthday from user where 1=1 and username like concat('%',?,'%')   ？='a'
        System.out.println("**************************" + users1);
        List<User> users2 = dynamicSQLService.dynamicSQLDemo1(null);
        //执行select id,username,sal,birthday from user where 1=1
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$" + users2);
    }

    @Test
    public void dynamicSQLDemo2() {
        List<User> users1 = dynamicSQLService.dynamicSQLDemo2(null, null, null);//[]空数组
        //执行select id,username,sal,birthday from user where 1=1 and sal > ?   // ？=null
        System.out.println("1111111111111111111111111111111" + users1);
        List<User> users2 = dynamicSQLService.dynamicSQLDemo2(null, new BigDecimal(1000), null);
        //select id,username,sal,birthday from user where 1=1 and sal > ?    // ？=1000
        System.out.println("2222222222222222222222222222222" + users2);
        List<User> users3 = dynamicSQLService.dynamicSQLDemo2("zhao", new BigDecimal(1000), null);
        //select id,username,sal,birthday from user where 1=1 and username like concat('%',?,'%')     //?='zhao'
        System.out.println("3333333333333333333333333333333" + users3);
        List<User> users4 = dynamicSQLService.dynamicSQLDemo2(null, new BigDecimal(1000), new Date());
        //select id,username,sal,birthday from user where 1=1 and birthday = ?    //?=2018-11-07 13:01:09.74
        System.out.println("4444444444444444444444444444444" + users4);
        List<User> users5 = dynamicSQLService.dynamicSQLDemo2("zhao", new BigDecimal(1000), new Date());
        //select id,username,sal,birthday from user where 1=1 and username like concat('%',?,'%')  //?='zhao'
        System.out.println("5555555555555555555555555555555" + users5);
    }

    @Test
    public void dynamicSQLDemo3() {
        List<User> users1 = dynamicSQLService.dynamicSQLDemo3(null, null, null);//[]空数组
        //select id,username,sal,birthday from user
        System.out.println("$$1111111111111111111111111111111" + users1);
        List<User> users2 = dynamicSQLService.dynamicSQLDemo3(null, new BigDecimal(1000), null);
        //select id,username,sal,birthday from user where sal > ?
        System.out.println("2222222222222222222222222222222" + users2);
        List<User> users3 = dynamicSQLService.dynamicSQLDemo3("zhao", new BigDecimal(1000), null);
        //select id,username,sal,birthday from user where username like concat('%',?,'%') and sal > ?
        System.out.println("3333333333333333333333333333333" + users3);
        List<User> users4 = dynamicSQLService.dynamicSQLDemo3(null, new BigDecimal(1000), new Date());
        //select id,username,sal,birthday from user where sal > ? and birthday < ?
        System.out.println("4444444444444444444444444444444" + users4);
        List<User> users5 = dynamicSQLService.dynamicSQLDemo3("zhao", new BigDecimal(1000), new Date());
        //select id,username,sal,birthday from user where username like concat('%',?,'%') and sal > ? and birthday < ?
        System.out.println("5555555555555555555555555555555" + users5);
    }
    @Test
    public void dynamicSQLDemo4() {
        List<User> users1 = dynamicSQLService.dynamicSQLDemo4(null, null, null);//[]空数组
        //select id,username,sal,birthday from user
        System.out.println("**111111111111111111111111111111" + users1);
        List<User> users2 = dynamicSQLService.dynamicSQLDemo4(null, new BigDecimal(1000), null);
        //select id,username,sal,birthday from user where sal > ?
        System.out.println("2222222222222222222222222222222" + users2);
        List<User> users3 = dynamicSQLService.dynamicSQLDemo4("a", new BigDecimal(1000), null);
        //select id,username,sal,birthday from user where username like concat('%',?,'%') and sal > ?
        System.out.println("3333333333333333333333333333333" + users3);
        List<User> users4 = dynamicSQLService.dynamicSQLDemo4(null, new BigDecimal(1000), new Date());
        //select id,username,sal,birthday from user where sal > ? and birthday < ?
        System.out.println("4444444444444444444444444444444" + users4);
        List<User> users5 = dynamicSQLService.dynamicSQLDemo4("a", new BigDecimal(1000), new Date());
        //select id,username,sal,birthday from user where username like concat('%',?,'%') and sal > ? and birthday < ?
        System.out.println("5555555555555555555555555555555" + users5);
    }

    @Test
    public void dynamicUpdateSQL() {
        User user1 = new User(2,"HAOHAO**",new BigDecimal(9900),new Date());
        int i = dynamicSQLService.dynamicUpdateSQL(user1);
        /*
        Preparing: update user SET username=?, sal = ?, birthday = ? where id = ?
        Parameters: QIAN**(String), 8900(BigDecimal), 2018-11-07 14:07:29.168(Timestamp), 2(Integer)
         */
        System.out.println("**********************"+i);//1

        User user2 = new User(2,"xyz",null,null);
        int j = dynamicSQLService.dynamicUpdateSQL(user2);
        /*
        Preparing: update user SET username=? where id = ?
        Parameters: xyz(String), 2(Integer)
         */
        System.out.println("**********************"+j);//1
    }

    @Test
    public void findByIds1() {
        Integer[] ids = {1,2,4};
        List<User> users = dynamicSQLService.findByIds1(ids);
        /*
        Preparing: select id,username,sal,birthday from user where id in ( ? , ? , ? )
        Parameters: 1(Integer), 2(Integer), 4(Integer)
         */
        TestCase.assertNotNull(users);
        TestCase.assertTrue(users.size() > 0);
        for(User user:users) {
            logger.debug("***********************"+user);
        }
    }

    @Test
    public void findByIds2() {
        List<Integer> ids = Arrays.asList(1,2,4);
        List<User> users = dynamicSQLService.findByIds2(ids);
        /*
        Preparing: select id,username,sal,birthday from user where id in ( ? , ? , ? )
        Parameters: 1(Integer), 2(Integer), 4(Integer)
         */
        TestCase.assertNotNull(users);
        TestCase.assertTrue(users.size() > 0);
        for(User user:users) {
            logger.debug("***********************"+user);
        }
    }


    @Test
    public void deleteBatch() {
        List<Integer> ids = Arrays.asList(11,13,14);
        int num = dynamicSQLService.deleteBatch(ids);
        TestCase.assertEquals(3,num);
        logger.debug("*****************delete batch success!*********************");
    }

    @Test
    public void insertBatch() {
        List<User> users = new ArrayList<User>();
        for(int i=31;i<=40;i++) {
         User user = null;
//            if (i == 35) {
//                user = new User("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",new BigDecimal(8000 + i * 200), new Date());
//            } else{
                user = new User("user" + i, new BigDecimal(8000 + i * 200), new Date());
//        }
            users.add(user);
        }
        int num = dynamicSQLService.insertBatch(users);
        TestCase.assertTrue(num>0);
        logger.debug("*****************insert batch success!*********************");

    }
}