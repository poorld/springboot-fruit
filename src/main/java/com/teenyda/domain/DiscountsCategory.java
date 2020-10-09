package com.teenyda.domain;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author mymx.banner
*/
public class DiscountsCategory implements Serializable {

    private static final long serialVersionUID = 1601518153730L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer discountsCategoryId;

    /**
    * 充值 满减 折扣
    * isNullAble:0
    */
    private String discountsType;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer discountsFlag;


    public void setDiscountsCategoryId(Integer discountsCategoryId){this.discountsCategoryId = discountsCategoryId;}

    public Integer getDiscountsCategoryId(){return this.discountsCategoryId;}

    public void setDiscountsType(String discountsType){this.discountsType = discountsType;}

    public String getDiscountsType(){return this.discountsType;}

    public void setDiscountsFlag(Integer discountsFlag){this.discountsFlag = discountsFlag;}

    public Integer getDiscountsFlag(){return this.discountsFlag;}
    @Override
    public String toString() {
        return "DiscountsCategory{" +
                "discountsCategoryId='" + discountsCategoryId + '\'' +
                "discountsType='" + discountsType + '\'' +
                "discountsFlag='" + discountsFlag + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private DiscountsCategory set;

        private ConditionBuilder where;

        public UpdateBuilder set(DiscountsCategory set){
            this.set = set;
            return this;
        }

        public DiscountsCategory getSet(){
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

    public static class QueryBuilder extends DiscountsCategory{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> discountsCategoryIdList;

        public List<Integer> getDiscountsCategoryIdList(){return this.discountsCategoryIdList;}

        private Integer discountsCategoryIdSt;

        private Integer discountsCategoryIdEd;

        public Integer getDiscountsCategoryIdSt(){return this.discountsCategoryIdSt;}

        public Integer getDiscountsCategoryIdEd(){return this.discountsCategoryIdEd;}

        private List<String> discountsTypeList;

        public List<String> getDiscountsTypeList(){return this.discountsTypeList;}


        private List<String> fuzzyDiscountsType;

        public List<String> getFuzzyDiscountsType(){return this.fuzzyDiscountsType;}

        private List<String> rightFuzzyDiscountsType;

        public List<String> getRightFuzzyDiscountsType(){return this.rightFuzzyDiscountsType;}
        private List<Integer> discountsFlagList;

        public List<Integer> getDiscountsFlagList(){return this.discountsFlagList;}

        private Integer discountsFlagSt;

        private Integer discountsFlagEd;

        public Integer getDiscountsFlagSt(){return this.discountsFlagSt;}

        public Integer getDiscountsFlagEd(){return this.discountsFlagEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder discountsCategoryIdBetWeen(Integer discountsCategoryIdSt,Integer discountsCategoryIdEd){
            this.discountsCategoryIdSt = discountsCategoryIdSt;
            this.discountsCategoryIdEd = discountsCategoryIdEd;
            return this;
        }

        public QueryBuilder discountsCategoryIdGreaterEqThan(Integer discountsCategoryIdSt){
            this.discountsCategoryIdSt = discountsCategoryIdSt;
            return this;
        }
        public QueryBuilder discountsCategoryIdLessEqThan(Integer discountsCategoryIdEd){
            this.discountsCategoryIdEd = discountsCategoryIdEd;
            return this;
        }


        public QueryBuilder discountsCategoryId(Integer discountsCategoryId){
            setDiscountsCategoryId(discountsCategoryId);
            return this;
        }

        public QueryBuilder discountsCategoryIdList(Integer ... discountsCategoryId){
            this.discountsCategoryIdList = solveNullList(discountsCategoryId);
            return this;
        }

        public QueryBuilder discountsCategoryIdList(List<Integer> discountsCategoryId){
            this.discountsCategoryIdList = discountsCategoryId;
            return this;
        }

        public QueryBuilder fetchDiscountsCategoryId(){
            setFetchFields("fetchFields","discountsCategoryId");
            return this;
        }

        public QueryBuilder excludeDiscountsCategoryId(){
            setFetchFields("excludeFields","discountsCategoryId");
            return this;
        }

        public QueryBuilder fuzzyDiscountsType (List<String> fuzzyDiscountsType){
            this.fuzzyDiscountsType = fuzzyDiscountsType;
            return this;
        }

        public QueryBuilder fuzzyDiscountsType (String ... fuzzyDiscountsType){
            this.fuzzyDiscountsType = solveNullList(fuzzyDiscountsType);
            return this;
        }

        public QueryBuilder rightFuzzyDiscountsType (List<String> rightFuzzyDiscountsType){
            this.rightFuzzyDiscountsType = rightFuzzyDiscountsType;
            return this;
        }

        public QueryBuilder rightFuzzyDiscountsType (String ... rightFuzzyDiscountsType){
            this.rightFuzzyDiscountsType = solveNullList(rightFuzzyDiscountsType);
            return this;
        }

        public QueryBuilder discountsType(String discountsType){
            setDiscountsType(discountsType);
            return this;
        }

        public QueryBuilder discountsTypeList(String ... discountsType){
            this.discountsTypeList = solveNullList(discountsType);
            return this;
        }

        public QueryBuilder discountsTypeList(List<String> discountsType){
            this.discountsTypeList = discountsType;
            return this;
        }

        public QueryBuilder fetchDiscountsType(){
            setFetchFields("fetchFields","discountsType");
            return this;
        }

        public QueryBuilder excludeDiscountsType(){
            setFetchFields("excludeFields","discountsType");
            return this;
        }

        public QueryBuilder discountsFlagBetWeen(Integer discountsFlagSt,Integer discountsFlagEd){
            this.discountsFlagSt = discountsFlagSt;
            this.discountsFlagEd = discountsFlagEd;
            return this;
        }

        public QueryBuilder discountsFlagGreaterEqThan(Integer discountsFlagSt){
            this.discountsFlagSt = discountsFlagSt;
            return this;
        }
        public QueryBuilder discountsFlagLessEqThan(Integer discountsFlagEd){
            this.discountsFlagEd = discountsFlagEd;
            return this;
        }


        public QueryBuilder discountsFlag(Integer discountsFlag){
            setDiscountsFlag(discountsFlag);
            return this;
        }

        public QueryBuilder discountsFlagList(Integer ... discountsFlag){
            this.discountsFlagList = solveNullList(discountsFlag);
            return this;
        }

        public QueryBuilder discountsFlagList(List<Integer> discountsFlag){
            this.discountsFlagList = discountsFlag;
            return this;
        }

        public QueryBuilder fetchDiscountsFlag(){
            setFetchFields("fetchFields","discountsFlag");
            return this;
        }

        public QueryBuilder excludeDiscountsFlag(){
            setFetchFields("excludeFields","discountsFlag");
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

        public DiscountsCategory build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> discountsCategoryIdList;

        public List<Integer> getDiscountsCategoryIdList(){return this.discountsCategoryIdList;}

        private Integer discountsCategoryIdSt;

        private Integer discountsCategoryIdEd;

        public Integer getDiscountsCategoryIdSt(){return this.discountsCategoryIdSt;}

        public Integer getDiscountsCategoryIdEd(){return this.discountsCategoryIdEd;}

        private List<String> discountsTypeList;

        public List<String> getDiscountsTypeList(){return this.discountsTypeList;}


        private List<String> fuzzyDiscountsType;

        public List<String> getFuzzyDiscountsType(){return this.fuzzyDiscountsType;}

        private List<String> rightFuzzyDiscountsType;

        public List<String> getRightFuzzyDiscountsType(){return this.rightFuzzyDiscountsType;}
        private List<Integer> discountsFlagList;

        public List<Integer> getDiscountsFlagList(){return this.discountsFlagList;}

        private Integer discountsFlagSt;

        private Integer discountsFlagEd;

        public Integer getDiscountsFlagSt(){return this.discountsFlagSt;}

        public Integer getDiscountsFlagEd(){return this.discountsFlagEd;}


        public ConditionBuilder discountsCategoryIdBetWeen(Integer discountsCategoryIdSt,Integer discountsCategoryIdEd){
            this.discountsCategoryIdSt = discountsCategoryIdSt;
            this.discountsCategoryIdEd = discountsCategoryIdEd;
            return this;
        }

        public ConditionBuilder discountsCategoryIdGreaterEqThan(Integer discountsCategoryIdSt){
            this.discountsCategoryIdSt = discountsCategoryIdSt;
            return this;
        }
        public ConditionBuilder discountsCategoryIdLessEqThan(Integer discountsCategoryIdEd){
            this.discountsCategoryIdEd = discountsCategoryIdEd;
            return this;
        }


        public ConditionBuilder discountsCategoryIdList(Integer ... discountsCategoryId){
            this.discountsCategoryIdList = solveNullList(discountsCategoryId);
            return this;
        }

        public ConditionBuilder discountsCategoryIdList(List<Integer> discountsCategoryId){
            this.discountsCategoryIdList = discountsCategoryId;
            return this;
        }

        public ConditionBuilder fuzzyDiscountsType (List<String> fuzzyDiscountsType){
            this.fuzzyDiscountsType = fuzzyDiscountsType;
            return this;
        }

        public ConditionBuilder fuzzyDiscountsType (String ... fuzzyDiscountsType){
            this.fuzzyDiscountsType = solveNullList(fuzzyDiscountsType);
            return this;
        }

        public ConditionBuilder rightFuzzyDiscountsType (List<String> rightFuzzyDiscountsType){
            this.rightFuzzyDiscountsType = rightFuzzyDiscountsType;
            return this;
        }

        public ConditionBuilder rightFuzzyDiscountsType (String ... rightFuzzyDiscountsType){
            this.rightFuzzyDiscountsType = solveNullList(rightFuzzyDiscountsType);
            return this;
        }

        public ConditionBuilder discountsTypeList(String ... discountsType){
            this.discountsTypeList = solveNullList(discountsType);
            return this;
        }

        public ConditionBuilder discountsTypeList(List<String> discountsType){
            this.discountsTypeList = discountsType;
            return this;
        }

        public ConditionBuilder discountsFlagBetWeen(Integer discountsFlagSt,Integer discountsFlagEd){
            this.discountsFlagSt = discountsFlagSt;
            this.discountsFlagEd = discountsFlagEd;
            return this;
        }

        public ConditionBuilder discountsFlagGreaterEqThan(Integer discountsFlagSt){
            this.discountsFlagSt = discountsFlagSt;
            return this;
        }
        public ConditionBuilder discountsFlagLessEqThan(Integer discountsFlagEd){
            this.discountsFlagEd = discountsFlagEd;
            return this;
        }


        public ConditionBuilder discountsFlagList(Integer ... discountsFlag){
            this.discountsFlagList = solveNullList(discountsFlag);
            return this;
        }

        public ConditionBuilder discountsFlagList(List<Integer> discountsFlag){
            this.discountsFlagList = discountsFlag;
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

        private DiscountsCategory obj;

        public Builder(){
            this.obj = new DiscountsCategory();
        }

        public Builder discountsCategoryId(Integer discountsCategoryId){
            this.obj.setDiscountsCategoryId(discountsCategoryId);
            return this;
        }
        public Builder discountsType(String discountsType){
            this.obj.setDiscountsType(discountsType);
            return this;
        }
        public Builder discountsFlag(Integer discountsFlag){
            this.obj.setDiscountsFlag(discountsFlag);
            return this;
        }
        public DiscountsCategory build(){return obj;}
    }

}
