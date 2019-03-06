package com.company.dao;

import com.company.dao.pojo.Station;

public interface StationMapper {
    int deleteByPrimaryKey(Integer station);

    int insert(Station record);

    int insertSelective(Station record);

    Station selectByPrimaryKey(Integer station);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);
}