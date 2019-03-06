package com.company.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestAction {
    @RequestMapping("hello.do")

    public String testSSM1(){
        return "test";
    }
}
