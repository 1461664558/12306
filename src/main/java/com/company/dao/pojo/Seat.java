package com.company.dao.pojo;

import java.util.Date;

public class Seat {
    private Integer route;

    private String tid;

    private String gnumber;

    private String gtype;

    private String seatnumbery;

    private String seatnumberx;

    private String seatstatus;

    private String seatstatuscode;

    private Date starttime;

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

    public Seat(Integer route, String tid, String gnumber, String gtype, String seatnumbery, String seatnumberx, String seatstatus, String seatstatuscode, Date starttime, Date creattime, Date updatatime, String creatuser, String updatauser, Date deletetime, String con1, String con2, String con3, String con4, String con5) {
        this.route = route;
        this.tid = tid;
        this.gnumber = gnumber;
        this.gtype = gtype;
        this.seatnumbery = seatnumbery;
        this.seatnumberx = seatnumberx;
        this.seatstatus = seatstatus;
        this.seatstatuscode = seatstatuscode;
        this.starttime = starttime;
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

    public Seat() {
        super();
    }

    public Integer getRoute() {
        return route;
    }

    public void setRoute(Integer route) {
        this.route = route;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getGnumber() {
        return gnumber;
    }

    public void setGnumber(String gnumber) {
        this.gnumber = gnumber == null ? null : gnumber.trim();
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype == null ? null : gtype.trim();
    }

    public String getSeatnumbery() {
        return seatnumbery;
    }

    public void setSeatnumbery(String seatnumbery) {
        this.seatnumbery = seatnumbery == null ? null : seatnumbery.trim();
    }

    public String getSeatnumberx() {
        return seatnumberx;
    }

    public void setSeatnumberx(String seatnumberx) {
        this.seatnumberx = seatnumberx == null ? null : seatnumberx.trim();
    }

    public String getSeatstatus() {
        return seatstatus;
    }

    public void setSeatstatus(String seatstatus) {
        this.seatstatus = seatstatus == null ? null : seatstatus.trim();
    }

    public String getSeatstatuscode() {
        return seatstatuscode;
    }

    public void setSeatstatuscode(String seatstatuscode) {
        this.seatstatuscode = seatstatuscode == null ? null : seatstatuscode.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
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