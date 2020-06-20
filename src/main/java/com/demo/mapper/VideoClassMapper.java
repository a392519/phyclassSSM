package com.demo.mapper;


import com.demo.model.VideoClass;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VideoClassMapper {
    int deleteByPrimaryKey(Integer vid);

    int insert(VideoClass record);

    int insertSelective(VideoClass record);

    VideoClass selectByPrimaryKey(Integer vid);

    int updateByPrimaryKeySelective(VideoClass record);

    int updateByPrimaryKey(VideoClass record);

    int videoCount(VideoClass videoClass);

    List<VideoClass> videoList(VideoClass videoClass);
    List<VideoClass> selectByGrade(VideoClass videoClass);
}