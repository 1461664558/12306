package com.company.action;

import com.company.service.iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserAction {
    @Autowired
    UserService userService;

    /**
     * 查询所有
     * @return 分页后的数据（PageHelper  默认1页的10条记录）
     */
    @RequestMapping(value = "find_all.do",method = RequestMethod.GET)
    public@ResponseBody List<User> findAll(){
        return userService.findAll();
    }

}
