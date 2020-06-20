package com.demo.model;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "phy")
@PropertySource("classpath:/application.properties")
public class PhyProperties {
    @Value("$(phy.videoAddress)")
    private String videoAddress;
    @Value("$(phy.grade)")
    private String grade;
    @Value("$(phy.book)")
    private String book;
    private String[] grades;
    private String[] books;

    public String[] changeToArr(String s){
        String[] arr=s.split(",");
        return arr;
    }
    public String[] getGrades() {
        this.grades=changeToArr(grade);
        return grades;
    }

    public String[] getBooks() {
        this.books=changeToArr(book);
        return books;
    }

    public String getVideoAddress() {
        return videoAddress;
    }

    public void setVideoAddress(String videoAddress) {
        this.videoAddress = videoAddress;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }
}
