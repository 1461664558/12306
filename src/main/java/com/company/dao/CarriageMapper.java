package com.company.dao;

import com.company.dao.pojo.Carriage;

public interface CarriageMapper {
    int deleteByPrimaryKey(Integer carriageid);

    int insert(Carriage record);

    int insertSelective(Carriage record);

    Carriage selectByPrimaryKey(Integer carriageid);

    int updateByPrimaryKeySelective(Carriage record);

    int updateByPrimaryKey(Carriage record);
}