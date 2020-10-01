package com.teenyda.dao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author mymx.banner
*/
public class ConsumptionRecord implements Serializable {

    private static final long serialVersionUID = 1601518138503L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer consumptionId;

    /**
    * 
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 消费金额
    * isNullAble:1,defaultVal:0.0
    */
    private java.math.BigDecimal consumption;

    /**
    * 消费来源:购物/充值/vip
    * isNullAble:1
    */
    private String source;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;


    public void setConsumptionId(Integer consumptionId){this.consumptionId = consumptionId;}

    public Integer getConsumptionId(){return this.consumptionId;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setConsumption(java.math.BigDecimal consumption){this.consumption = consumption;}

    public java.math.BigDecimal getConsumption(){return this.consumption;}

    public void setSource(String source){this.source = source;}

    public String getSource(){return this.source;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}
    @Override
    public String toString() {
        return "ConsumptionRecord{" +
                "consumptionId='" + consumptionId + '\'' +
                "userId='" + userId + '\'' +
                "consumption='" + consumption + '\'' +
                "source='" + source + '\'' +
                "createTime='" + createTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ConsumptionRecord set;

        private ConditionBuilder where;

        public UpdateBuilder set(ConsumptionRecord set){
            this.set = set;
            return this;
        }

        public ConsumptionRecord getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends ConsumptionRecord{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> consumptionIdList;

        public List<Integer> getConsumptionIdList(){return this.consumptionIdList;}

        private Integer consumptionIdSt;

        private Integer consumptionIdEd;

        public Integer getConsumptionIdSt(){return this.consumptionIdSt;}

        public Integer getConsumptionIdEd(){return this.consumptionIdEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<java.math.BigDecimal> consumptionList;

        public List<java.math.BigDecimal> getConsumptionList(){return this.consumptionList;}

        private java.math.BigDecimal consumptionSt;

        private java.math.BigDecimal consumptionEd;

        public java.math.BigDecimal getConsumptionSt(){return this.consumptionSt;}

        public java.math.BigDecimal getConsumptionEd(){return this.consumptionEd;}

        private List<String> sourceList;

        public List<String> getSourceList(){return this.sourceList;}


        private List<String> fuzzySource;

        public List<String> getFuzzySource(){return this.fuzzySource;}

        private List<String> rightFuzzySource;

        public List<String> getRightFuzzySource(){return this.rightFuzzySource;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder consumptionIdBetWeen(Integer consumptionIdSt,Integer consumptionIdEd){
            this.consumptionIdSt = consumptionIdSt;
            this.consumptionIdEd = consumptionIdEd;
            return this;
        }

        public QueryBuilder consumptionIdGreaterEqThan(Integer consumptionIdSt){
            this.consumptionIdSt = consumptionIdSt;
            return this;
        }
        public QueryBuilder consumptionIdLessEqThan(Integer consumptionIdEd){
            this.consumptionIdEd = consumptionIdEd;
            return this;
        }


        public QueryBuilder consumptionId(Integer consumptionId){
            setConsumptionId(consumptionId);
            return this;
        }

        public QueryBuilder consumptionIdList(Integer ... consumptionId){
            this.consumptionIdList = solveNullList(consumptionId);
            return this;
        }

        public QueryBuilder consumptionIdList(List<Integer> consumptionId){
            this.consumptionIdList = consumptionId;
            return this;
        }

        public QueryBuilder fetchConsumptionId(){
            setFetchFields("fetchFields","consumptionId");
            return this;
        }

        public QueryBuilder excludeConsumptionId(){
            setFetchFields("excludeFields","consumptionId");
            return this;
        }

        public QueryBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public QueryBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public QueryBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public QueryBuilder userId(Integer userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public QueryBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
            return this;
        }

        public QueryBuilder consumptionBetWeen(java.math.BigDecimal consumptionSt,java.math.BigDecimal consumptionEd){
            this.consumptionSt = consumptionSt;
            this.consumptionEd = consumptionEd;
            return this;
        }

        public QueryBuilder consumptionGreaterEqThan(java.math.BigDecimal consumptionSt){
            this.consumptionSt = consumptionSt;
            return this;
        }
        public QueryBuilder consumptionLessEqThan(java.math.BigDecimal consumptionEd){
            this.consumptionEd = consumptionEd;
            return this;
        }


        public QueryBuilder consumption(java.math.BigDecimal consumption){
            setConsumption(consumption);
            return this;
        }

        public QueryBuilder consumptionList(java.math.BigDecimal ... consumption){
            this.consumptionList = solveNullList(consumption);
            return this;
        }

        public QueryBuilder consumptionList(List<java.math.BigDecimal> consumption){
            this.consumptionList = consumption;
            return this;
        }

        public QueryBuilder fetchConsumption(){
            setFetchFields("fetchFields","consumption");
            return this;
        }

        public QueryBuilder excludeConsumption(){
            setFetchFields("excludeFields","consumption");
            return this;
        }

        public QueryBuilder fuzzySource (List<String> fuzzySource){
            this.fuzzySource = fuzzySource;
            return this;
        }

        public QueryBuilder fuzzySource (String ... fuzzySource){
            this.fuzzySource = solveNullList(fuzzySource);
            return this;
        }

        public QueryBuilder rightFuzzySource (List<String> rightFuzzySource){
            this.rightFuzzySource = rightFuzzySource;
            return this;
        }

        public QueryBuilder rightFuzzySource (String ... rightFuzzySource){
            this.rightFuzzySource = solveNullList(rightFuzzySource);
            return this;
        }

        public QueryBuilder source(String source){
            setSource(source);
            return this;
        }

        public QueryBuilder sourceList(String ... source){
            this.sourceList = solveNullList(source);
            return this;
        }

        public QueryBuilder sourceList(List<String> source){
            this.sourceList = source;
            return this;
        }

        public QueryBuilder fetchSource(){
            setFetchFields("fetchFields","source");
            return this;
        }

        public QueryBuilder excludeSource(){
            setFetchFields("excludeFields","source");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public ConsumptionRecord build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> consumptionIdList;

        public List<Integer> getConsumptionIdList(){return this.consumptionIdList;}

        private Integer consumptionIdSt;

        private Integer consumptionIdEd;

        public Integer getConsumptionIdSt(){return this.consumptionIdSt;}

        public Integer getConsumptionIdEd(){return this.consumptionIdEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<java.math.BigDecimal> consumptionList;

        public List<java.math.BigDecimal> getConsumptionList(){return this.consumptionList;}

        private java.math.BigDecimal consumptionSt;

        private java.math.BigDecimal consumptionEd;

        public java.math.BigDecimal getConsumptionSt(){return this.consumptionSt;}

        public java.math.BigDecimal getConsumptionEd(){return this.consumptionEd;}

        private List<String> sourceList;

        public List<String> getSourceList(){return this.sourceList;}


        private List<String> fuzzySource;

        public List<String> getFuzzySource(){return this.fuzzySource;}

        private List<String> rightFuzzySource;

        public List<String> getRightFuzzySource(){return this.rightFuzzySource;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}


        public ConditionBuilder consumptionIdBetWeen(Integer consumptionIdSt,Integer consumptionIdEd){
            this.consumptionIdSt = consumptionIdSt;
            this.consumptionIdEd = consumptionIdEd;
            return this;
        }

        public ConditionBuilder consumptionIdGreaterEqThan(Integer consumptionIdSt){
            this.consumptionIdSt = consumptionIdSt;
            return this;
        }
        public ConditionBuilder consumptionIdLessEqThan(Integer consumptionIdEd){
            this.consumptionIdEd = consumptionIdEd;
            return this;
        }


        public ConditionBuilder consumptionIdList(Integer ... consumptionId){
            this.consumptionIdList = solveNullList(consumptionId);
            return this;
        }

        public ConditionBuilder consumptionIdList(List<Integer> consumptionId){
            this.consumptionIdList = consumptionId;
            return this;
        }

        public ConditionBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public ConditionBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public ConditionBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public ConditionBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public ConditionBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public ConditionBuilder consumptionBetWeen(java.math.BigDecimal consumptionSt,java.math.BigDecimal consumptionEd){
            this.consumptionSt = consumptionSt;
            this.consumptionEd = consumptionEd;
            return this;
        }

        public ConditionBuilder consumptionGreaterEqThan(java.math.BigDecimal consumptionSt){
            this.consumptionSt = consumptionSt;
            return this;
        }
        public ConditionBuilder consumptionLessEqThan(java.math.BigDecimal consumptionEd){
            this.consumptionEd = consumptionEd;
            return this;
        }


        public ConditionBuilder consumptionList(java.math.BigDecimal ... consumption){
            this.consumptionList = solveNullList(consumption);
            return this;
        }

        public ConditionBuilder consumptionList(List<java.math.BigDecimal> consumption){
            this.consumptionList = consumption;
            return this;
        }

        public ConditionBuilder fuzzySource (List<String> fuzzySource){
            this.fuzzySource = fuzzySource;
            return this;
        }

        public ConditionBuilder fuzzySource (String ... fuzzySource){
            this.fuzzySource = solveNullList(fuzzySource);
            return this;
        }

        public ConditionBuilder rightFuzzySource (List<String> rightFuzzySource){
            this.rightFuzzySource = rightFuzzySource;
            return this;
        }

        public ConditionBuilder rightFuzzySource (String ... rightFuzzySource){
            this.rightFuzzySource = solveNullList(rightFuzzySource);
            return this;
        }

        public ConditionBuilder sourceList(String ... source){
            this.sourceList = solveNullList(source);
            return this;
        }

        public ConditionBuilder sourceList(List<String> source){
            this.sourceList = source;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private ConsumptionRecord obj;

        public Builder(){
            this.obj = new ConsumptionRecord();
        }

        public Builder consumptionId(Integer consumptionId){
            this.obj.setConsumptionId(consumptionId);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder consumption(java.math.BigDecimal consumption){
            this.obj.setConsumption(consumption);
            return this;
        }
        public Builder source(String source){
            this.obj.setSource(source);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public ConsumptionRecord build(){return obj;}
    }

}
