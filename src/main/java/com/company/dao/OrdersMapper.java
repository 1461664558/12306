package com.company.dao;

import com.company.dao.pojo.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer ordersid);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer ordersid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}