package com.company.service.impl;

import com.company.service.iservice.TicketService;
import com.company.service.vo.FindTicketPriceVO;
import commons.SpringTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class TicketServiceImplTest extends SpringTestCase {

    @Autowired
    TicketService ts;


    @Test
    public void ticketPrice() {
        FindTicketPriceVO vo = new FindTicketPriceVO("郑州","大连","G15");
//        System.out.println(ts.ticketPrice(vo));
        ts.ticketPrice(vo);
    }
}