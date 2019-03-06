package com.company.dao;

import com.company.dao.pojo.Train;

public interface TrainMapper {
    int deleteByPrimaryKey(String tid);

    int insert(Train record);

    int insertSelective(Train record);

    Train selectByPrimaryKey(String tid);

    int updateByPrimaryKeySelective(Train record);

    int updateByPrimaryKey(Train record);
}