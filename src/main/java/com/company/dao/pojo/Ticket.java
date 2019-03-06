package com.company.dao.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Ticket {
    private Integer tkid;

    private String tid;

    private Date date;

    private String gnumber;

    private String seatnumber;

    private String type;

    private String startstation;

    private String endstation;

    private BigDecimal price;

    private String name;

    private String utype;

    private String uidnumber;

    private String saletype;

    private String datailedsales;

    private Date saletime;

    private String status;

    private String statusmodifier;

    private String modifystation;

    private Date modifytime;

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

    public Ticket(Integer tkid, String tid, Date date, String gnumber, String seatnumber, String type, String startstation, String endstation, BigDecimal price, String name, String utype, String uidnumber, String saletype, String datailedsales, Date saletime, String status, String statusmodifier, String modifystation, Date modifytime, Date creattime, Date updatatime, String creatuser, String updatauser, Date deletetime, String con1, String con2, String con3, String con4, String con5) {
        this.tkid = tkid;
        this.tid = tid;
        this.date = date;
        this.gnumber = gnumber;
        this.seatnumber = seatnumber;
        this.type = type;
        this.startstation = startstation;
        this.endstation = endstation;
        this.price = price;
        this.name = name;
        this.utype = utype;
        this.uidnumber = uidnumber;
        this.saletype = saletype;
        this.datailedsales = datailedsales;
        this.saletime = saletime;
        this.status = status;
        this.statusmodifier = statusmodifier;
        this.modifystation = modifystation;
        this.modifytime = modifytime;
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

    public Ticket() {
        super();
    }

    public Integer getTkid() {
        return tkid;
    }

    public void setTkid(Integer tkid) {
        this.tkid = tkid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGnumber() {
        return gnumber;
    }

    public void setGnumber(String gnumber) {
        this.gnumber = gnumber == null ? null : gnumber.trim();
    }

    public String getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(String seatnumber) {
        this.seatnumber = seatnumber == null ? null : seatnumber.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype == null ? null : utype.trim();
    }

    public String getUidnumber() {
        return uidnumber;
    }

    public void setUidnumber(String uidnumber) {
        this.uidnumber = uidnumber == null ? null : uidnumber.trim();
    }

    public String getSaletype() {
        return saletype;
    }

    public void setSaletype(String saletype) {
        this.saletype = saletype == null ? null : saletype.trim();
    }

    public String getDatailedsales() {
        return datailedsales;
    }

    public void setDatailedsales(String datailedsales) {
        this.datailedsales = datailedsales == null ? null : datailedsales.trim();
    }

    public Date getSaletime() {
        return saletime;
    }

    public void setSaletime(Date saletime) {
        this.saletime = saletime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStatusmodifier() {
        return statusmodifier;
    }

    public void setStatusmodifier(String statusmodifier) {
        this.statusmodifier = statusmodifier == null ? null : statusmodifier.trim();
    }

    public String getModifystation() {
        return modifystation;
    }

    public void setModifystation(String modifystation) {
        this.modifystation = modifystation == null ? null : modifystation.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
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