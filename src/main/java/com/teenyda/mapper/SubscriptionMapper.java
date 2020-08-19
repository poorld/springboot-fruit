package com.teenyda.mapper;

import com.teenyda.model.Subscription;
import com.teenyda.model.SubscriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubscriptionMapper {
    int deleteByExample(SubscriptionExample example);

    int deleteByPrimaryKey(Integer subId);

    int insert(Subscription record);

    int insertSelective(Subscription record);

    List<Subscription> selectByExample(SubscriptionExample example);

    Subscription selectByPrimaryKey(Integer subId);

    int updateByExampleSelective(@Param("record") Subscription record, @Param("example") SubscriptionExample example);

    int updateByExample(@Param("record") Subscription record, @Param("example") SubscriptionExample example);

    int updateByPrimaryKeySelective(Subscription record);

    int updateByPrimaryKey(Subscription record);
}