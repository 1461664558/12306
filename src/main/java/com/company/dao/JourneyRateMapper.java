package com.company.dao;

import com.company.dao.pojo.JourneyRate;

public interface JourneyRateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JourneyRate record);

    int insertSelective(JourneyRate record);

    JourneyRate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JourneyRate record);

    int updateByPrimaryKey(JourneyRate record);
}