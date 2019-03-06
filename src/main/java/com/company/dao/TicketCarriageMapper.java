package com.company.dao;

import com.company.dao.pojo.TicketCarriage;

public interface TicketCarriageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TicketCarriage record);

    int insertSelective(TicketCarriage record);

    TicketCarriage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TicketCarriage record);

    int updateByPrimaryKey(TicketCarriage record);
}