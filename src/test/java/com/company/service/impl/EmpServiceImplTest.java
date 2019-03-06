package com.company.service.impl;

import com.company.service.bo.InfoBO;
import com.company.service.dto.EmpDeptDTO;
import com.company.service.iservice.EmpService;
import com.company.service.vo.HiredateVO;
import commons.SpringTestCase;
import junit.framework.TestCase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EmpServiceImplTest extends SpringTestCase {
    @Autowired
    @Qualifier("empService")
    EmpService empService;
    private Logger logger = LoggerFactory.getLogger(EmpServiceImplTest.class);
    @Test
    public void findByHiredateVO() throws Exception {
        Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse("2010-01-01");
        Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01");
        HiredateVO hiredateVO = new HiredateVO(startDate, endDate);
        List<Emp> emps = empService.findByHiredateVO(hiredateVO);
        TestCase.assertNotNull(emps);
        TestCase.assertTrue(emps.size()>0);
        logger.info("**************findByHiredateVO  success!");
        for(Emp emp:emps){
            logger.info(emp.toString());
        }
    }

    @Test
    public void findByHiredateMap() throws ParseException {
        Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse("2010-01-01");
        Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01");
        List<Emp> emps = empService.findByHiredateMap(startDate,endDate);
        TestCase.assertNotNull(emps);
        TestCase.assertTrue(emps.size()>0);
        logger.info("**************findByHiredateMap  success!");
        for(Emp emp:emps){
            logger.info(emp.toString());
        }
    }

    @Test
    public void findDTOByHiredate() throws ParseException {
        Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse("2010-01-01");
        Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01");
        List<EmpDeptDTO> edds = empService.findDTOByHiredate(startDate,endDate);
        TestCase.assertNotNull(edds);
        TestCase.assertTrue(edds.size()>0);
        logger.info("**************findDTOByHiredate  success!");
        for(EmpDeptDTO edd:edds){
            logger.info(edd.toString());
        }
    }

    @Test
    public void findBOByHiredate() throws ParseException {
        Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse("2010-01-01");
        Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01");
        HiredateVO hiredateVO = new HiredateVO(startDate, endDate);
        List<InfoBO> infos = empService.findBOByHiredate(hiredateVO);
        TestCase.assertNotNull(infos);
        TestCase.assertTrue(infos.size()>0);
        logger.info("**************findBOByHiredateVO  success!");
        for(InfoBO info:infos){
            info.setVo(hiredateVO);
            logger.info(info.toString());
        }
    }
}