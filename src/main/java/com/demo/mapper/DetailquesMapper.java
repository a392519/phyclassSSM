package com.demo.mapper;

import com.demo.model.Detailques;
import com.demo.model.DetailquesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetailquesMapper {
    long countByExample(DetailquesExample example);

    int deleteByExample(DetailquesExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Detailques record);

    int insertSelective(Detailques record);

    List<Detailques> selectByExample(DetailquesExample example);

    Detailques selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Detailques record, @Param("example") DetailquesExample example);

    int updateByExample(@Param("record") Detailques record, @Param("example") DetailquesExample example);

    int updateByPrimaryKeySelective(Detailques record);

    int updateByPrimaryKey(Detailques record);
}