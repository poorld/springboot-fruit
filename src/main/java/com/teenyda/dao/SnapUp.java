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
public class SnapUp implements Serializable {

    private static final long serialVersionUID = 1601518183514L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer snapUpId;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 
    * isNullAble:0
    */
    private java.math.BigDecimal price;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime endTime;


    public void setSnapUpId(Integer snapUpId){this.snapUpId = snapUpId;}

    public Integer getSnapUpId(){return this.snapUpId;}

    public void setProductId(Integer productId){this.productId = productId;}

    public Integer getProductId(){return this.productId;}

    public void setPrice(java.math.BigDecimal price){this.price = price;}

    public java.math.BigDecimal getPrice(){return this.price;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setEndTime(java.time.LocalDateTime endTime){this.endTime = endTime;}

    public java.time.LocalDateTime getEndTime(){return this.endTime;}
    @Override
    public String toString() {
        return "SnapUp{" +
                "snapUpId='" + snapUpId + '\'' +
                "productId='" + productId + '\'' +
                "price='" + price + '\'' +
                "createTime='" + createTime + '\'' +
                "endTime='" + endTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private SnapUp set;

        private ConditionBuilder where;

        public UpdateBuilder set(SnapUp set){
            this.set = set;
            return this;
        }

        public SnapUp getSet(){
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

    public static class QueryBuilder extends SnapUp{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> snapUpIdList;

        public List<Integer> getSnapUpIdList(){return this.snapUpIdList;}

        private Integer snapUpIdSt;

        private Integer snapUpIdEd;

        public Integer getSnapUpIdSt(){return this.snapUpIdSt;}

        public Integer getSnapUpIdEd(){return this.snapUpIdEd;}

        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> endTimeList;

        public List<java.time.LocalDateTime> getEndTimeList(){return this.endTimeList;}

        private java.time.LocalDateTime endTimeSt;

        private java.time.LocalDateTime endTimeEd;

        public java.time.LocalDateTime getEndTimeSt(){return this.endTimeSt;}

        public java.time.LocalDateTime getEndTimeEd(){return this.endTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder snapUpIdBetWeen(Integer snapUpIdSt,Integer snapUpIdEd){
            this.snapUpIdSt = snapUpIdSt;
            this.snapUpIdEd = snapUpIdEd;
            return this;
        }

        public QueryBuilder snapUpIdGreaterEqThan(Integer snapUpIdSt){
            this.snapUpIdSt = snapUpIdSt;
            return this;
        }
        public QueryBuilder snapUpIdLessEqThan(Integer snapUpIdEd){
            this.snapUpIdEd = snapUpIdEd;
            return this;
        }


        public QueryBuilder snapUpId(Integer snapUpId){
            setSnapUpId(snapUpId);
            return this;
        }

        public QueryBuilder snapUpIdList(Integer ... snapUpId){
            this.snapUpIdList = solveNullList(snapUpId);
            return this;
        }

        public QueryBuilder snapUpIdList(List<Integer> snapUpId){
            this.snapUpIdList = snapUpId;
            return this;
        }

        public QueryBuilder fetchSnapUpId(){
            setFetchFields("fetchFields","snapUpId");
            return this;
        }

        public QueryBuilder excludeSnapUpId(){
            setFetchFields("excludeFields","snapUpId");
            return this;
        }

        public QueryBuilder productIdBetWeen(Integer productIdSt,Integer productIdEd){
            this.productIdSt = productIdSt;
            this.productIdEd = productIdEd;
            return this;
        }

        public QueryBuilder productIdGreaterEqThan(Integer productIdSt){
            this.productIdSt = productIdSt;
            return this;
        }
        public QueryBuilder productIdLessEqThan(Integer productIdEd){
            this.productIdEd = productIdEd;
            return this;
        }


        public QueryBuilder productId(Integer productId){
            setProductId(productId);
            return this;
        }

        public QueryBuilder productIdList(Integer ... productId){
            this.productIdList = solveNullList(productId);
            return this;
        }

        public QueryBuilder productIdList(List<Integer> productId){
            this.productIdList = productId;
            return this;
        }

        public QueryBuilder fetchProductId(){
            setFetchFields("fetchFields","productId");
            return this;
        }

        public QueryBuilder excludeProductId(){
            setFetchFields("excludeFields","productId");
            return this;
        }

        public QueryBuilder priceBetWeen(java.math.BigDecimal priceSt,java.math.BigDecimal priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public QueryBuilder priceGreaterEqThan(java.math.BigDecimal priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public QueryBuilder priceLessEqThan(java.math.BigDecimal priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public QueryBuilder price(java.math.BigDecimal price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(java.math.BigDecimal ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public QueryBuilder priceList(List<java.math.BigDecimal> price){
            this.priceList = price;
            return this;
        }

        public QueryBuilder fetchPrice(){
            setFetchFields("fetchFields","price");
            return this;
        }

        public QueryBuilder excludePrice(){
            setFetchFields("excludeFields","price");
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

        public QueryBuilder endTimeBetWeen(java.time.LocalDateTime endTimeSt,java.time.LocalDateTime endTimeEd){
            this.endTimeSt = endTimeSt;
            this.endTimeEd = endTimeEd;
            return this;
        }

        public QueryBuilder endTimeGreaterEqThan(java.time.LocalDateTime endTimeSt){
            this.endTimeSt = endTimeSt;
            return this;
        }
        public QueryBuilder endTimeLessEqThan(java.time.LocalDateTime endTimeEd){
            this.endTimeEd = endTimeEd;
            return this;
        }


        public QueryBuilder endTime(java.time.LocalDateTime endTime){
            setEndTime(endTime);
            return this;
        }

        public QueryBuilder endTimeList(java.time.LocalDateTime ... endTime){
            this.endTimeList = solveNullList(endTime);
            return this;
        }

        public QueryBuilder endTimeList(List<java.time.LocalDateTime> endTime){
            this.endTimeList = endTime;
            return this;
        }

        public QueryBuilder fetchEndTime(){
            setFetchFields("fetchFields","endTime");
            return this;
        }

        public QueryBuilder excludeEndTime(){
            setFetchFields("excludeFields","endTime");
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

        public SnapUp build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> snapUpIdList;

        public List<Integer> getSnapUpIdList(){return this.snapUpIdList;}

        private Integer snapUpIdSt;

        private Integer snapUpIdEd;

        public Integer getSnapUpIdSt(){return this.snapUpIdSt;}

        public Integer getSnapUpIdEd(){return this.snapUpIdEd;}

        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> endTimeList;

        public List<java.time.LocalDateTime> getEndTimeList(){return this.endTimeList;}

        private java.time.LocalDateTime endTimeSt;

        private java.time.LocalDateTime endTimeEd;

        public java.time.LocalDateTime getEndTimeSt(){return this.endTimeSt;}

        public java.time.LocalDateTime getEndTimeEd(){return this.endTimeEd;}


        public ConditionBuilder snapUpIdBetWeen(Integer snapUpIdSt,Integer snapUpIdEd){
            this.snapUpIdSt = snapUpIdSt;
            this.snapUpIdEd = snapUpIdEd;
            return this;
        }

        public ConditionBuilder snapUpIdGreaterEqThan(Integer snapUpIdSt){
            this.snapUpIdSt = snapUpIdSt;
            return this;
        }
        public ConditionBuilder snapUpIdLessEqThan(Integer snapUpIdEd){
            this.snapUpIdEd = snapUpIdEd;
            return this;
        }


        public ConditionBuilder snapUpIdList(Integer ... snapUpId){
            this.snapUpIdList = solveNullList(snapUpId);
            return this;
        }

        public ConditionBuilder snapUpIdList(List<Integer> snapUpId){
            this.snapUpIdList = snapUpId;
            return this;
        }

        public ConditionBuilder productIdBetWeen(Integer productIdSt,Integer productIdEd){
            this.productIdSt = productIdSt;
            this.productIdEd = productIdEd;
            return this;
        }

        public ConditionBuilder productIdGreaterEqThan(Integer productIdSt){
            this.productIdSt = productIdSt;
            return this;
        }
        public ConditionBuilder productIdLessEqThan(Integer productIdEd){
            this.productIdEd = productIdEd;
            return this;
        }


        public ConditionBuilder productIdList(Integer ... productId){
            this.productIdList = solveNullList(productId);
            return this;
        }

        public ConditionBuilder productIdList(List<Integer> productId){
            this.productIdList = productId;
            return this;
        }

        public ConditionBuilder priceBetWeen(java.math.BigDecimal priceSt,java.math.BigDecimal priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public ConditionBuilder priceGreaterEqThan(java.math.BigDecimal priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public ConditionBuilder priceLessEqThan(java.math.BigDecimal priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public ConditionBuilder priceList(java.math.BigDecimal ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public ConditionBuilder priceList(List<java.math.BigDecimal> price){
            this.priceList = price;
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

        public ConditionBuilder endTimeBetWeen(java.time.LocalDateTime endTimeSt,java.time.LocalDateTime endTimeEd){
            this.endTimeSt = endTimeSt;
            this.endTimeEd = endTimeEd;
            return this;
        }

        public ConditionBuilder endTimeGreaterEqThan(java.time.LocalDateTime endTimeSt){
            this.endTimeSt = endTimeSt;
            return this;
        }
        public ConditionBuilder endTimeLessEqThan(java.time.LocalDateTime endTimeEd){
            this.endTimeEd = endTimeEd;
            return this;
        }


        public ConditionBuilder endTimeList(java.time.LocalDateTime ... endTime){
            this.endTimeList = solveNullList(endTime);
            return this;
        }

        public ConditionBuilder endTimeList(List<java.time.LocalDateTime> endTime){
            this.endTimeList = endTime;
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

        private SnapUp obj;

        public Builder(){
            this.obj = new SnapUp();
        }

        public Builder snapUpId(Integer snapUpId){
            this.obj.setSnapUpId(snapUpId);
            return this;
        }
        public Builder productId(Integer productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder price(java.math.BigDecimal price){
            this.obj.setPrice(price);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder endTime(java.time.LocalDateTime endTime){
            this.obj.setEndTime(endTime);
            return this;
        }
        public SnapUp build(){return obj;}
    }

}
