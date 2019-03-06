package com.company.dao;

import com.company.dao.pojo.Journey;

public interface JourneyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Journey record);

    int insertSelective(Journey record);

    Journey selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Journey record);

    int updateByPrimaryKey(Journey record);
}