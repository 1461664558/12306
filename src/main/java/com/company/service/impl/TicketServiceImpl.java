package com.company.service.impl;

import com.company.dao.JourneyRateMapper;
import com.company.dao.RouteMapper;
import com.company.service.iservice.TicketService;
import com.company.service.vo.FindTicketPriceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("ticketService")
public class TicketServiceImpl implements TicketService {

    @Autowired
    RouteMapper rm;
    JourneyRateMapper jrm;

    @Override
    public BigDecimal ticketPrice(FindTicketPriceVO vo) {

        Double mile = rm.findMile(vo.getEndStation()).doubleValue() - rm.findMile(vo.getStartStation()).doubleValue();

        System.out.println(mile);
        String tid = vo.getTid();
        Double lastMile = 0.0;
        Integer id = 1;
        if(mile > 1 && mile < 200){
            id = 1;
            lastMile = mile;
        }else if(mile > 201 && mile < 500){
            lastMile = mile - 200;
            id = 2;
        }else if(mile > 501 && mile < 1000){
            id = 3;
            lastMile = mile - 500;
        }else if(mile > 1001 && mile < 1500){
            id = 4;
            lastMile = mile - 1000;
        }else if(mile > 1051 && mile < 2500){
            id = 5;
            lastMile = mile - 1500;
        }else if(mile > 2501){
            id = 6;
            lastMile = mile - 2500;
        }
        System.out.println(id);
        Double pricerate = jrm.findPricarate(id);
        Double sumprice = 0.0;
        if(id - 1 != 0){
            sumprice = jrm.findSumprice(id - 1).doubleValue();
        }else{
            sumprice = jrm.findSumprice(1).doubleValue();
        }
        BigDecimal price = new BigDecimal((lastMile * pricerate + sumprice) * 1.2 * 1.5);
        System.out.println(price);

        return new BigDecimal("1");
    }
}
