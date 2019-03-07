package com.company.dao;

import com.company.dao.pojo.JourneyRate;

import java.math.BigDecimal;

public interface JourneyRateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JourneyRate record);

    int insertSelective(JourneyRate record);

    JourneyRate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JourneyRate record);

    int updateByPrimaryKey(JourneyRate record);

    Double findPricarate(Integer id);

    BigDecimal findSumprice(Integer id);
}