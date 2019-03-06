package com.company.service.iservice;

import com.company.service.bo.InfoBO;
import com.company.service.dto.EmpDeptDTO;
import com.company.service.vo.HiredateVO;

import java.util.Date;
import java.util.List;

public interface EmpService {
    List<Emp> findByHiredateVO(HiredateVO hiredateVO);
    List<Emp> findByHiredateMap(Date startDate,Date endDate);
    List<EmpDeptDTO> findDTOByHiredate(Date startDate, Date endDate);
    List<InfoBO> findBOByHiredate(HiredateVO hiredateVO);
}
