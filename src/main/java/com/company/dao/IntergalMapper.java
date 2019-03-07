package com.company.dao;

import com.company.dao.pojo.Intergal;

public interface IntergalMapper {
    int deleteByPrimaryKey(Integer intergalid);

    int insert(Intergal record);

    int insertSelective(Intergal record);

    Intergal selectByPrimaryKey(Integer intergalid);

    int updateByPrimaryKeySelective(Intergal record);

    int updateByPrimaryKey(Intergal record);
}