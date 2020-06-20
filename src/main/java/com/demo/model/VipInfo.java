package com.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class VipInfo {
    private Integer vipid;

    private Integer vipgrade;

    private Integer recommendnow;

    private Integer recommendtotal;

    private Date starttime;

    private Date endtime;

    private BigDecimal vipmoney;

    private String username;

    public VipInfo(Integer vipid, Integer vipgrade, Integer recommendnow, Integer recommendtotal, Date starttime, Date endtime, BigDecimal vipmoney, String username) {
        this.vipid = vipid;
        this.vipgrade = vipgrade;
        this.recommendnow = recommendnow;
        this.recommendtotal = recommendtotal;
        this.starttime = starttime;
        this.endtime = endtime;
        this.vipmoney = vipmoney;
        this.username = username;
    }

    public VipInfo() {
        super();
    }

    public Integer getVipid() {
        return vipid;
    }

    public void setVipid(Integer vipid) {
        this.vipid = vipid;
    }

    public Integer getVipgrade() {
        return vipgrade;
    }

    public void setVipgrade(Integer vipgrade) {
        this.vipgrade = vipgrade;
    }

    public Integer getRecommendnow() {
        return recommendnow;
    }

    public void setRecommendnow(Integer recommendnow) {
        this.recommendnow = recommendnow;
    }

    public Integer getRecommendtotal() {
        return recommendtotal;
    }

    public void setRecommendtotal(Integer recommendtotal) {
        this.recommendtotal = recommendtotal;
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

    public BigDecimal getVipmoney() {
        return vipmoney;
    }

    public void setVipmoney(BigDecimal vipmoney) {
        this.vipmoney = vipmoney;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}