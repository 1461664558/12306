package com.company.dao;

import com.company.dao.pojo.Ticket;

public interface TicketMapper {
    int deleteByPrimaryKey(Integer tkid);

    int insert(Ticket record);

    int insertSelective(Ticket record);

    Ticket selectByPrimaryKey(Integer tkid);

    int updateByPrimaryKeySelective(Ticket record);

    int updateByPrimaryKey(Ticket record);
}