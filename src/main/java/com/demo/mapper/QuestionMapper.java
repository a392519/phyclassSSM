package com.demo.mapper;

import com.demo.model.Question;
import com.demo.model.QuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resources;

public interface QuestionMapper {

    int insertQestion(List QestionTelList);
}