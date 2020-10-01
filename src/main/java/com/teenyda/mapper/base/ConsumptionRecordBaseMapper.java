package com.teenyda.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.teenyda.dao.ConsumptionRecord;
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