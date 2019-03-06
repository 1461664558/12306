package com.company.dao;

import com.company.dao.pojo.Seat;

public interface SeatMapper {
    int insert(Seat record);

    int insertSelective(Seat record);
}