package com.teenyda.dto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author mymx.brand
*/
public class Brand implements Serializable {

    private static final long serialVersionUID = 1601515064811L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer brandId;

    /**
    * 
    * isNullAble:1
    */
    private String brandCode;

    /**
    * 
    * isNullAble:1
    */
    private String brandName;

    /**
    * 
    * isNullAble:1
    */
    private Integer brandState;

    /**
    * 
    * isNullAble:1
    */
    private Integer userId;


    public void setBrandId(Integer brandId){this.brandId = brandId;}

    public Integer getBrandId(){return this.brandId;}

    public void setBrandCode(String brandCode){this.brandCode = brandCode;}

    public String getBrandCode(){return this.brandCode;}

    public void setBrandName(String brandName){this.brandName = brandName;}

    public String getBrandName(){return this.brandName;}

    public void setBrandState(Integer brandState){this.brandState = brandState;}

    public Integer getBrandState(){return this.brandState;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}
    @Override
    public String toString() {
        return "Brand{" +
                "brandId='" + brandId + '\'' +
                "brandCode='" + brandCode + '\'' +
                "brandName='" + brandName + '\'' +
                "brandState='" + brandState + '\'' +
                "userId='" + userId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Brand set;

        private ConditionBuilder where;

        public UpdateBuilder set(Brand set){
            this.set = set;
            return this;
        }

        public Brand getSet(){
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

    public static class QueryBuilder extends Brand{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> brandIdList;

        public List<Integer> getBrandIdList(){return this.brandIdList;}

        private Integer brandIdSt;

        private Integer brandIdEd;

        public Integer getBrandIdSt(){return this.brandIdSt;}

        public Integer getBrandIdEd(){return this.brandIdEd;}

        private List<String> brandCodeList;

        public List<String> getBrandCodeList(){return this.brandCodeList;}


        private List<String> fuzzyBrandCode;

        public List<String> getFuzzyBrandCode(){return this.fuzzyBrandCode;}

        private List<String> rightFuzzyBrandCode;

        public List<String> getRightFuzzyBrandCode(){return this.rightFuzzyBrandCode;}
        private List<String> brandNameList;

        public List<String> getBrandNameList(){return this.brandNameList;}


        private List<String> fuzzyBrandName;

        public List<String> getFuzzyBrandName(){return this.fuzzyBrandName;}

        private List<String> rightFuzzyBrandName;

        public List<String> getRightFuzzyBrandName(){return this.rightFuzzyBrandName;}
        private List<Integer> brandStateList;

        public List<Integer> getBrandStateList(){return this.brandStateList;}

        private Integer brandStateSt;

        private Integer brandStateEd;

        public Integer getBrandStateSt(){return this.brandStateSt;}

        public Integer getBrandStateEd(){return this.brandStateEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder brandIdBetWeen(Integer brandIdSt,Integer brandIdEd){
            this.brandIdSt = brandIdSt;
            this.brandIdEd = brandIdEd;
            return this;
        }

        public QueryBuilder brandIdGreaterEqThan(Integer brandIdSt){
            this.brandIdSt = brandIdSt;
            return this;
        }
        public QueryBuilder brandIdLessEqThan(Integer brandIdEd){
            this.brandIdEd = brandIdEd;
            return this;
        }


        public QueryBuilder brandId(Integer brandId){
            setBrandId(brandId);
            return this;
        }

        public QueryBuilder brandIdList(Integer ... brandId){
            this.brandIdList = solveNullList(brandId);
            return this;
        }

        public QueryBuilder brandIdList(List<Integer> brandId){
            this.brandIdList = brandId;
            return this;
        }

        public QueryBuilder fetchBrandId(){
            setFetchFields("fetchFields","brandId");
            return this;
        }

        public QueryBuilder excludeBrandId(){
            setFetchFields("excludeFields","brandId");
            return this;
        }

        public QueryBuilder fuzzyBrandCode (List<String> fuzzyBrandCode){
            this.fuzzyBrandCode = fuzzyBrandCode;
            return this;
        }

        public QueryBuilder fuzzyBrandCode (String ... fuzzyBrandCode){
            this.fuzzyBrandCode = solveNullList(fuzzyBrandCode);
            return this;
        }

        public QueryBuilder rightFuzzyBrandCode (List<String> rightFuzzyBrandCode){
            this.rightFuzzyBrandCode = rightFuzzyBrandCode;
            return this;
        }

        public QueryBuilder rightFuzzyBrandCode (String ... rightFuzzyBrandCode){
            this.rightFuzzyBrandCode = solveNullList(rightFuzzyBrandCode);
            return this;
        }

        public QueryBuilder brandCode(String brandCode){
            setBrandCode(brandCode);
            return this;
        }

        public QueryBuilder brandCodeList(String ... brandCode){
            this.brandCodeList = solveNullList(brandCode);
            return this;
        }

        public QueryBuilder brandCodeList(List<String> brandCode){
            this.brandCodeList = brandCode;
            return this;
        }

        public QueryBuilder fetchBrandCode(){
            setFetchFields("fetchFields","brandCode");
            return this;
        }

        public QueryBuilder excludeBrandCode(){
            setFetchFields("excludeFields","brandCode");
            return this;
        }

        public QueryBuilder fuzzyBrandName (List<String> fuzzyBrandName){
            this.fuzzyBrandName = fuzzyBrandName;
            return this;
        }

        public QueryBuilder fuzzyBrandName (String ... fuzzyBrandName){
            this.fuzzyBrandName = solveNullList(fuzzyBrandName);
            return this;
        }

        public QueryBuilder rightFuzzyBrandName (List<String> rightFuzzyBrandName){
            this.rightFuzzyBrandName = rightFuzzyBrandName;
            return this;
        }

        public QueryBuilder rightFuzzyBrandName (String ... rightFuzzyBrandName){
            this.rightFuzzyBrandName = solveNullList(rightFuzzyBrandName);
            return this;
        }

        public QueryBuilder brandName(String brandName){
            setBrandName(brandName);
            return this;
        }

        public QueryBuilder brandNameList(String ... brandName){
            this.brandNameList = solveNullList(brandName);
            return this;
        }

        public QueryBuilder brandNameList(List<String> brandName){
            this.brandNameList = brandName;
            return this;
        }

        public QueryBuilder fetchBrandName(){
            setFetchFields("fetchFields","brandName");
            return this;
        }

        public QueryBuilder excludeBrandName(){
            setFetchFields("excludeFields","brandName");
            return this;
        }

        public QueryBuilder brandStateBetWeen(Integer brandStateSt,Integer brandStateEd){
            this.brandStateSt = brandStateSt;
            this.brandStateEd = brandStateEd;
            return this;
        }

        public QueryBuilder brandStateGreaterEqThan(Integer brandStateSt){
            this.brandStateSt = brandStateSt;
            return this;
        }
        public QueryBuilder brandStateLessEqThan(Integer brandStateEd){
            this.brandStateEd = brandStateEd;
            return this;
        }


        public QueryBuilder brandState(Integer brandState){
            setBrandState(brandState);
            return this;
        }

        public QueryBuilder brandStateList(Integer ... brandState){
            this.brandStateList = solveNullList(brandState);
            return this;
        }

        public QueryBuilder brandStateList(List<Integer> brandState){
            this.brandStateList = brandState;
            return this;
        }

        public QueryBuilder fetchBrandState(){
            setFetchFields("fetchFields","brandState");
            return this;
        }

        public QueryBuilder excludeBrandState(){
            setFetchFields("excludeFields","brandState");
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

        public Brand build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> brandIdList;

        public List<Integer> getBrandIdList(){return this.brandIdList;}

        private Integer brandIdSt;

        private Integer brandIdEd;

        public Integer getBrandIdSt(){return this.brandIdSt;}

        public Integer getBrandIdEd(){return this.brandIdEd;}

        private List<String> brandCodeList;

        public List<String> getBrandCodeList(){return this.brandCodeList;}


        private List<String> fuzzyBrandCode;

        public List<String> getFuzzyBrandCode(){return this.fuzzyBrandCode;}

        private List<String> rightFuzzyBrandCode;

        public List<String> getRightFuzzyBrandCode(){return this.rightFuzzyBrandCode;}
        private List<String> brandNameList;

        public List<String> getBrandNameList(){return this.brandNameList;}


        private List<String> fuzzyBrandName;

        public List<String> getFuzzyBrandName(){return this.fuzzyBrandName;}

        private List<String> rightFuzzyBrandName;

        public List<String> getRightFuzzyBrandName(){return this.rightFuzzyBrandName;}
        private List<Integer> brandStateList;

        public List<Integer> getBrandStateList(){return this.brandStateList;}

        private Integer brandStateSt;

        private Integer brandStateEd;

        public Integer getBrandStateSt(){return this.brandStateSt;}

        public Integer getBrandStateEd(){return this.brandStateEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}


        public ConditionBuilder brandIdBetWeen(Integer brandIdSt,Integer brandIdEd){
            this.brandIdSt = brandIdSt;
            this.brandIdEd = brandIdEd;
            return this;
        }

        public ConditionBuilder brandIdGreaterEqThan(Integer brandIdSt){
            this.brandIdSt = brandIdSt;
            return this;
        }
        public ConditionBuilder brandIdLessEqThan(Integer brandIdEd){
            this.brandIdEd = brandIdEd;
            return this;
        }


        public ConditionBuilder brandIdList(Integer ... brandId){
            this.brandIdList = solveNullList(brandId);
            return this;
        }

        public ConditionBuilder brandIdList(List<Integer> brandId){
            this.brandIdList = brandId;
            return this;
        }

        public ConditionBuilder fuzzyBrandCode (List<String> fuzzyBrandCode){
            this.fuzzyBrandCode = fuzzyBrandCode;
            return this;
        }

        public ConditionBuilder fuzzyBrandCode (String ... fuzzyBrandCode){
            this.fuzzyBrandCode = solveNullList(fuzzyBrandCode);
            return this;
        }

        public ConditionBuilder rightFuzzyBrandCode (List<String> rightFuzzyBrandCode){
            this.rightFuzzyBrandCode = rightFuzzyBrandCode;
            return this;
        }

        public ConditionBuilder rightFuzzyBrandCode (String ... rightFuzzyBrandCode){
            this.rightFuzzyBrandCode = solveNullList(rightFuzzyBrandCode);
            return this;
        }

        public ConditionBuilder brandCodeList(String ... brandCode){
            this.brandCodeList = solveNullList(brandCode);
            return this;
        }

        public ConditionBuilder brandCodeList(List<String> brandCode){
            this.brandCodeList = brandCode;
            return this;
        }

        public ConditionBuilder fuzzyBrandName (List<String> fuzzyBrandName){
            this.fuzzyBrandName = fuzzyBrandName;
            return this;
        }

        public ConditionBuilder fuzzyBrandName (String ... fuzzyBrandName){
            this.fuzzyBrandName = solveNullList(fuzzyBrandName);
            return this;
        }

        public ConditionBuilder rightFuzzyBrandName (List<String> rightFuzzyBrandName){
            this.rightFuzzyBrandName = rightFuzzyBrandName;
            return this;
        }

        public ConditionBuilder rightFuzzyBrandName (String ... rightFuzzyBrandName){
            this.rightFuzzyBrandName = solveNullList(rightFuzzyBrandName);
            return this;
        }

        public ConditionBuilder brandNameList(String ... brandName){
            this.brandNameList = solveNullList(brandName);
            return this;
        }

        public ConditionBuilder brandNameList(List<String> brandName){
            this.brandNameList = brandName;
            return this;
        }

        public ConditionBuilder brandStateBetWeen(Integer brandStateSt,Integer brandStateEd){
            this.brandStateSt = brandStateSt;
            this.brandStateEd = brandStateEd;
            return this;
        }

        public ConditionBuilder brandStateGreaterEqThan(Integer brandStateSt){
            this.brandStateSt = brandStateSt;
            return this;
        }
        public ConditionBuilder brandStateLessEqThan(Integer brandStateEd){
            this.brandStateEd = brandStateEd;
            return this;
        }


        public ConditionBuilder brandStateList(Integer ... brandState){
            this.brandStateList = solveNullList(brandState);
            return this;
        }

        public ConditionBuilder brandStateList(List<Integer> brandState){
            this.brandStateList = brandState;
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

        private Brand obj;

        public Builder(){
            this.obj = new Brand();
        }

        public Builder brandId(Integer brandId){
            this.obj.setBrandId(brandId);
            return this;
        }
        public Builder brandCode(String brandCode){
            this.obj.setBrandCode(brandCode);
            return this;
        }
        public Builder brandName(String brandName){
            this.obj.setBrandName(brandName);
            return this;
        }
        public Builder brandState(Integer brandState){
            this.obj.setBrandState(brandState);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Brand build(){return obj;}
    }

}
