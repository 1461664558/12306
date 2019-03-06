package com.company.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service("dynamicSQLService")
public class DynamicSQLService {
    @Autowired
    @Qualifier("dynamicSQLDao")
    DynamicSQLDao dynamicSQLDao;

    public List<User> dynamicSQLDemo1(String username) {
        return dynamicSQLDao.dynamicSQLDemo1(username);
    }

    public List<User> dynamicSQLDemo2(String username, BigDecimal sal, Date birthday) {
        return dynamicSQLDao.dynamicSQLDemo2(username, sal, birthday);
    }

    public List<User> dynamicSQLDemo3(String username, BigDecimal sal, Date birthday) {
        return dynamicSQLDao.dynamicSQLDemo3(username, sal, birthday);
    }

    public List<User> dynamicSQLDemo4(String username, BigDecimal sal, Date birthday) {
        return dynamicSQLDao.dynamicSQLDemo4(username, sal, birthday);
    }

    public int dynamicUpdateSQL(User user) {
        return dynamicSQLDao.dynamicUpdateSQL(user);
    }

    public List<User> findByIds1(Integer[] ids) {
        return dynamicSQLDao.findByIds1(ids);
    }

    public List<User> findByIds2(List<Integer> ids) {
        return dynamicSQLDao.findByIds2(ids);
    }

    public int deleteBatch(List<Integer> ids) {
        return dynamicSQLDao.deleteBatch(ids);
    }

    public int insertBatch(List<User> users) {
        return dynamicSQLDao.insertBatch(users);
    }

}
