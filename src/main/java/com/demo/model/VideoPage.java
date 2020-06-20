package com.demo.model;

import java.util.List;

public class VideoPage {
    private int total;
    private List<VideoClass> rows;

    public VideoPage(int total, List<VideoClass> rows) {
        this.total = total;
        this.rows = rows;
    }

    public VideoPage() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<VideoClass> getRows() {
        return rows;
    }

    public void setRows(List<VideoClass> rows) {
        this.rows = rows;
    }
}


