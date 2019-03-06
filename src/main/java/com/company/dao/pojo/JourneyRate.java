package com.company.dao.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class JourneyRate {
    private Integer id;

    private Integer journeyfrom
journeyfrom
journeyfrom
journeyfrom
journeyfrom;

    private Integer journeyto
journeyto;

    private BigDecimal reducerate
reducerate;

    private BigDecimal pricerate
pricerate;

    private BigDecimal thisprice
thisprice;

    private BigDecimal sumprice;

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

    public JourneyRate(Integer id, Integer journeyfrom
journeyfrom
journeyfrom
journeyfrom
journeyfrom, Integer journeyto
journeyto, BigDecimal reducerate
reducerate, BigDecimal pricerate
pricerate, BigDecimal thisprice
thisprice, BigDecimal sumprice, Date creattime, Date updatatime, String creatuser, String updatauser, Date deletetime, String con1, String con2, String con3, String con4, String con5) {
        this.id = id;
        this.journeyfrom
journeyfrom
journeyfrom
journeyfrom
journeyfrom = journeyfrom
journeyfrom
journeyfrom
journeyfrom
journeyfrom;
        this.journeyto
journeyto = journeyto
journeyto;
        this.reducerate
reducerate = reducerate
reducerate;
        this.pricerate
pricerate = pricerate
pricerate;
        this.thisprice
thisprice = thisprice
thisprice;
        this.sumprice = sumprice;
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

    public JourneyRate() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJourneyfrom
journeyfrom
journeyfrom
journeyfrom
journeyfrom() {
        return journeyfrom
journeyfrom
journeyfrom
journeyfrom
journeyfrom;
    }

    public void setJourneyfrom
journeyfrom
journeyfrom
journeyfrom
journeyfrom(Integer journeyfrom
journeyfrom
journeyfrom
journeyfrom
journeyfrom) {
        this.journeyfrom
journeyfrom
journeyfrom
journeyfrom
journeyfrom = journeyfrom
journeyfrom
journeyfrom
journeyfrom
journeyfrom;
    }

    public Integer getJourneyto
journeyto() {
        return journeyto
journeyto;
    }

    public void setJourneyto
journeyto(Integer journeyto
journeyto) {
        this.journeyto
journeyto = journeyto
journeyto;
    }

    public BigDecimal getReducerate
reducerate() {
        return reducerate
reducerate;
    }

    public void setReducerate
reducerate(BigDecimal reducerate
reducerate) {
        this.reducerate
reducerate = reducerate
reducerate;
    }

    public BigDecimal getPricerate
pricerate() {
        return pricerate
pricerate;
    }

    public void setPricerate
pricerate(BigDecimal pricerate
pricerate) {
        this.pricerate
pricerate = pricerate
pricerate;
    }

    public BigDecimal getThisprice
thisprice() {
        return thisprice
thisprice;
    }

    public void setThisprice
thisprice(BigDecimal thisprice
thisprice) {
        this.thisprice
thisprice = thisprice
thisprice;
    }

    public BigDecimal getSumprice() {
        return sumprice;
    }

    public void setSumprice(BigDecimal sumprice) {
        this.sumprice = sumprice;
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