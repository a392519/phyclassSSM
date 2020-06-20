package com.demo.model;

public class Question {
    private Integer id;

    private String type;

    private Integer number;

    private String title;

    private String imagelist;

    private String questionoption;

    private String answer;

    private String resolves;

    private String answerimagelist;

    private Integer vid;

    private Integer difficulty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImagelist() {
        return imagelist;
    }

    public void setImagelist(String imagelist) {
        this.imagelist = imagelist == null ? null : imagelist.trim();
    }

    public String getQuestionoption() {
        return questionoption;
    }

    public void setQuestionoption(String questionoption) {
        this.questionoption = questionoption == null ? null : questionoption.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getResolves() {
        return resolves;
    }

    public void setResolves(String resolves) {
        this.resolves = resolves == null ? null : resolves.trim();
    }

    public String getAnswerimagelist() {
        return answerimagelist;
    }

    public void setAnswerimagelist(String answerimagelist) {
        this.answerimagelist = answerimagelist == null ? null : answerimagelist.trim();
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