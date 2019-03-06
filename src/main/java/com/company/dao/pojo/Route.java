package com.company.dao.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Route {
    private Integer routeid;

    private Integer tid;

    private String stationname;

    private Date endstation;

    private Date startstation;

    private BigDecimal mile;

    private Date staytime;

    private Date last;

    private Date creattime;

    private Date updatatime;

    private String creatuser;

    private String updatauser;

    private Date deletetime;

    private String con1;

    private String con2;

    private String con3;

    private String con4;

    private String con5;

    public Route(Integer routeid, Integer tid, String stationname, Date endstation, Date startstation, BigDecimal mile, Date staytime, Date last, Date creattime, Date updatatime, String creatuser, String updatauser, Date deletetime, String con1, String con2, String con3, String con4, String con5) {
        this.routeid = routeid;
        this.tid = tid;
        this.stationname = stationname;
        this.endstation = endstation;
        this.startstation = startstation;
        this.mile = mile;
        this.staytime = staytime;
        this.last = last;
        this.creattime = creattime;
        this.updatatime = updatatime;
        this.creatuser = creatuser;
        this.updatauser = updatauser;
        this.deletetime = deletetime;
        this.con1 = con1;
        this.con2 = con2;
        this.con3 = con3;
        this.con4 = con4;
        this.con5 = con5;
    }

    public Route() {
        super();
    }

    public Integer getRouteid() {
        return routeid;
    }

    public void setRouteid(Integer routeid) {
        this.routeid = routeid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname == null ? null : stationname.trim();
    }

    public Date getEndstation() {
        return endstation;
    }

    public void setEndstation(Date endstation) {
        this.endstation = endstation;
    }

    public Date getStartstation() {
        return startstation;
    }

    public void setStartstation(Date startstation) {
        this.startstation = startstation;
    }

    public BigDecimal getMile() {
        return mile;
    }

    public void setMile(BigDecimal mile) {
        this.mile = mile;
    }

    public Date getStaytime() {
        return staytime;
    }

    public void setStaytime(Date staytime) {
        this.staytime = staytime;
    }

    public Date getLast() {
        return last;
    }

    public void setLast(Date last) {
        this.last = last;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getUpdatatime() {
        return updatatime;
    }

    public void setUpdatatime(Date updatatime) {
        this.updatatime = updatatime;
    }

    public String getCreatuser() {
        return creatuser;
    }

    public void setCreatuser(String creatuser) {
        this.creatuser = creatuser == null ? null : creatuser.trim();
    }

    public String getUpdatauser() {
        return updatauser;
    }

    public void setUpdatauser(String updatauser) {
        this.updatauser = updatauser == null ? null : updatauser.trim();
    }

    public Date getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }

    public String getCon1() {
        return con1;
    }

    public void setCon1(String con1) {
        this.con1 = con1 == null ? null : con1.trim();
    }

    public String getCon2() {
        return con2;
    }

    public void setCon2(String con2) {
        this.con2 = con2 == null ? null : con2.trim();
    }

    public String getCon3() {
        return con3;
    }

    public void setCon3(String con3) {
        this.con3 = con3 == null ? null : con3.trim();
    }

    public String getCon4() {
        return con4;
    }

    public void setCon4(String con4) {
        this.con4 = con4 == null ? null : con4.trim();
    }

    public String getCon5() {
        return con5;
    }

    public void setCon5(String con5) {
        this.con5 = con5 == null ? null : con5.trim();
    }
}