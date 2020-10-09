package com.teenyda.mapping.base;

import java.util.List;

import com.teenyda.domain.ConsumptionRecord;
/**
*  @author mymx.banner
*/
public interface ConsumptionRecordBaseMapper {

    int insertConsumptionRecord(ConsumptionRecord object);

    int updateConsumptionRecord(ConsumptionRecord object);

    int update(ConsumptionRecord.UpdateBuilder object);

    List<ConsumptionRecord> queryConsumptionRecord(ConsumptionRecord object);

    ConsumptionRecord queryConsumptionRecordLimit1(ConsumptionRecord object);

}