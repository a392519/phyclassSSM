package com.demo.model;

public class VideoClass extends Page {
    private Integer vid;

    private String vgrade;

    private String vbook;

    private String vcapter;

    private String vsection;

    private String vdescription;

    private Integer difficulty;

    private String vname;

    private String videosrc;

    public VideoClass(Integer vid, String vgrade, String vbook, String vcapter, String vsection, String vdescription, Integer difficulty, String vname, String videosrc) {
        this.vid = vid;
        this.vgrade = vgrade;
        this.vbook = vbook;
        this.vcapter = vcapter;
        this.vsection = vsection;
        this.vdescription = vdescription;
        this.difficulty = difficulty;
        this.vname = vname;
        this.videosrc = videosrc;
    }

    public VideoClass() {
        super();
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVgrade() {
        return vgrade;
    }

    public void setVgrade(String vgrade) {
        this.vgrade = vgrade == null ? null : vgrade.trim();
    }

    public String getVbook() {
        return vbook;
    }

    public void setVbook(String vbook) {
        this.vbook = vbook == null ? null : vbook.trim();
    }

    public String getVcapter() {
        return vcapter;
    }

    public void setVcapter(String vcapter) {
        this.vcapter = vcapter == null ? null : vcapter.trim();
    }

    public String getVsection() {
        return vsection;
    }

    public void setVsection(String vsection) {
        this.vsection = vsection == null ? null : vsection.trim();
    }

    public String getVdescription() {
        return vdescription;
    }

    public void setVdescription(String vdescription) {
        this.vdescription = vdescription == null ? null : vdescription.trim();
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname == null ? null : vname.trim();
    }

    public String getVideosrc() {
        return videosrc;
    }

    public void setVideosrc(String videosrc) {
        this.videosrc = videosrc == null ? null : videosrc.trim();
    }

    @Override
    public String toString() {
        return "VideoClass{" +
                "vid=" + vid +
                ", vgrade='" + vgrade + '\'' +
                ", vbook='" + vbook + '\'' +
                ", vcapter='" + vcapter + '\'' +
                ", vsection='" + vsection + '\'' +
                ", vdescription='" + vdescription + '\'' +
                ", difficulty=" + difficulty +
                ", vname='" + vname + '\'' +
                ", videosrc='" + videosrc + '\'' +
                '}';
    }
}