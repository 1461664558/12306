package com.company.service.bo;

import com.company.service.vo.HiredateVO;

import java.io.Serializable;

public class InfoBO implements Serializable {
    private HiredateVO vo;
    private Emp emp;
    private Dept dept;

    @Override
    public String toString() {
        return "InfoBO{" +
                "vo=" + vo +
                ", emp=" + emp +
                ", dept=" + dept +
                '}';
    }

    public HiredateVO getVo() {
        return vo;
    }

    public void setVo(HiredateVO vo) {
        this.vo = vo;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public InfoBO(HiredateVO vo, Emp emp, Dept dept) {
        this.vo = vo;
        this.emp = emp;
        this.dept = dept;
    }

    public InfoBO() {
    }
}
