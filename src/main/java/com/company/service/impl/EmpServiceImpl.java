package com.company.service.impl;

import com.company.service.bo.InfoBO;
import com.company.service.dto.EmpDeptDTO;
import com.company.service.iservice.EmpService;
import com.company.service.vo.HiredateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service("empService")
public class EmpServiceImpl implements EmpService {
    @Autowired
            @Qualifier("empDao")
    EmpDao empDao;

    @Override
    public List<Emp> findByHiredateVO(HiredateVO hiredateVO) {
        return empDao.findByHiredateVO(hiredateVO);
    }

    @Override
    public List<Emp> findByHiredateMap(Date startDate, Date endDate) {
        return empDao.findByHiredateMap(startDate,endDate);
    }

    @Override
    public List<EmpDeptDTO> findDTOByHiredate(Date startDate, Date endDate) {
        return empDao.findDTOByHiredate(startDate,endDate);
    }

    @Override
    public List<InfoBO> findBOByHiredate(HiredateVO hiredateVO) {
        return empDao.findBOByHiredate(hiredateVO);
    }
}
