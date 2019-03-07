package com.company.dao;

import com.company.dao.pojo.Route;

import java.math.BigDecimal;

public interface RouteMapper {
    int deleteByPrimaryKey(Integer routeid);

    int insert(Route record);

    int insertSelective(Route record);

    Route selectByPrimaryKey(Integer routeid);

    int updateByPrimaryKeySelective(Route record);

    int updateByPrimaryKey(Route record);

    BigDecimal findMile(String station);
}