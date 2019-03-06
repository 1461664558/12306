package com.company.service.dto;

import java.io.Serializable;

public class EmpDeptDTO implements Serializable {
    private String ename;
    private String dname;

    @Override
    public String toString() {
        return "EmpDeptDTO{" +
                "ename='" + ename + '\'' +
                ", dname='" + dname + '\'' +
                '}';
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public EmpDeptDTO(String ename, String dname) {
        this.ename = ename;
        this.dname = dname;
    }

    public EmpDeptDTO() {
    }
}
