package com.company.service.iservice;

import com.company.service.vo.FindTicketPriceVO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


public interface TicketService {
    BigDecimal ticketPrice(FindTicketPriceVO vo);
}
