package com.teenyda.mapper;

import com.teenyda.model.Push;
import com.teenyda.model.PushExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PushMapper {
    int deleteByExample(PushExample example);

    int deleteByPrimaryKey(Integer pushId);

    int insert(Push record);

    int insertSelective(Push record);

    List<Push> selectByExample(PushExample example);

    Push selectByPrimaryKey(Integer pushId);

    int updateByExampleSelective(@Param("record") Push record, @Param("example") PushExample example);

    int updateByExample(@Param("record") Push record, @Param("example") PushExample example);

    int updateByPrimaryKeySelective(Push record);

    int updateByPrimaryKey(Push record);
}