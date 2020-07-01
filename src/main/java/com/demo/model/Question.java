package com.demo.model;

import java.util.List;

public class Question {
    private String id;

    private String type;

    private Integer number;

    private byte[] title;

    private byte[] imagelist;

    private byte[] questionoption;

    private byte[] answer;

    private byte[] resolves;

    private  byte[] answerimagelist;

    private Integer vid;

    private Integer difficulty;
    private String vname;

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public byte[] getTitle() {
        return title;
    }

    public void setTitle(byte[] title) {
        this.title = title;
    }

    public byte[] getResolves() {
        return resolves;
    }

    public void setResolves(byte[] resolves) {
        this.resolves = resolves;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    public byte[] getAnswer() {
        return answer;
    }

    public void setAnswer(byte[] answer) {
        this.answer = answer;
    }

    public byte[] getImagelist() {
        return imagelist;
    }

    public void setImagelist(byte[] imagelist) {
        this.imagelist = imagelist;
    }

    public byte[] getQuestionoption() {
        return questionoption;
    }

    public void setQuestionoption(byte[] questionoption) {
        this.questionoption = questionoption;
    }

    public byte[] getAnswerimagelist() {
        return answerimagelist;
    }

    public void setAnswerimagelist(byte[] answerimagelist) {
        this.answerimagelist = answerimagelist;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }
}