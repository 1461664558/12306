package com.company.dao.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Train {
    private String tid;

    private Integer route;

    private String startstation;

    private String endstation;

    private Date starttime;

    private Date endtime;

    private Date last;

    private String noseatnumber;

    private BigDecimal mile;

    private String bodytype;

    private String type;

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

    public Train(String tid, Integer route, String startstation, String endstation, Date starttime, Date endtime, Date last, String noseatnumber, BigDecimal mile, String bodytype, String type, Date creattime, Date updatatime, String creatuser, String updatauser, Date deletetime, String con1, String con2, String con3, String con4, String con5) {
        this.tid = tid;
        this.route = route;
        this.startstation = startstation;
        this.endstation = endstation;
        this.starttime = starttime;
        this.endtime = endtime;
        this.last = last;
        this.noseatnumber = noseatnumber;
        this.mile = mile;
        this.bodytype = bodytype;
        this.type = type;
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

    public Train() {
        super();
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public Integer getRoute() {
        return route;
    }

    public void setRoute(Integer route) {
        this.route = route;
    }

    public String getStartstation() {
        return startstation;
    }

    public void setStartstation(String startstation) {
        this.startstation = startstation == null ? null : startstation.trim();
    }

    public String getEndstation() {
        return endstation;
    }

    public void setEndstation(String endstation) {
        this.endstation = endstation == null ? null : endstation.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getLast() {
        return last;
    }

    public void setLast(Date last) {
        this.last = last;
    }

    public String getNoseatnumber() {
        return noseatnumber;
    }

    public void setNoseatnumber(String noseatnumber) {
        this.noseatnumber = noseatnumber == null ? null : noseatnumber.trim();
    }

    public BigDecimal getMile() {
        return mile;
    }

    public void setMile(BigDecimal mile) {
        this.mile = mile;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype == null ? null : bodytype.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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