package com.demo.service;

import org.apache.poi.hssf.usermodel.HSSFSheet;

public interface QuestionService {
    public Integer importQuestion(HSSFSheet sheet);
}
