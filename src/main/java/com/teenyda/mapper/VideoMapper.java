package com.teenyda.mapper;

import com.teenyda.model.Video;
import com.teenyda.model.VideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(String videoId);

    int insert(Video record);

    int insertSelective(Video record);

    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(String videoId);

    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
}