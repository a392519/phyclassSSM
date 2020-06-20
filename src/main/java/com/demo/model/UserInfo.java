package com.demo.model;

public class UserInfo {
    private String uid;

    private String username;

    private String wxname;

    private String wxheadpic;

    public UserInfo(String uid, String username, String wxname, String wxheadpic) {
        this.uid = uid;
        this.username = username;
        this.wxname = wxname;
        this.wxheadpic = wxheadpic;
    }

    public UserInfo() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getWxname() {
        return wxname;
    }

    public void setWxname(String wxname) {
        this.wxname = wxname == null ? null : wxname.trim();
    }

    public String getWxheadpic() {
        return wxheadpic;
    }

    public void setWxheadpic(String wxheadpic) {
        this.wxheadpic = wxheadpic == null ? null : wxheadpic.trim();
    }
}