package com.company.service.vo;

import java.math.BigDecimal;

public class FindTicketPriceVO {
    private String startStation;
    private String endStation;
    private String tid;

    public FindTicketPriceVO() {
    }

    public FindTicketPriceVO(String startStation, String endStation, String tid) {
        this.startStation = startStation;
        this.endStation = endStation;
        this.tid = tid;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "FindTicketPrice{" +
                "startStation='" + startStation + '\'' +
                ", endStation='" + endStation + '\'' +
                ", tid='" + tid + '\'' +
                '}';
    }
}
