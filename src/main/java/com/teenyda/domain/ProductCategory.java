package com.teenyda.domain;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author mymx.banner
*/

@Component
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 1601518176547L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer productCategoryId;

    /**
    * 
    * isNullAble:1
    */
    private String name;

    /**
    * 
    * isNullAble:1
    */
    private Integer sortOrder;

    /**
    * 
    * isNullAble:1
    */
    private String description;

    /**
    * 
    * isNullAble:1
    */
    private String image;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime updateTime;

    /**
    * 
    * isNullAble:1
    */
    private Integer updateUserId;


    public void setProductCategoryId(Integer productCategoryId){this.productCategoryId = productCategoryId;}

    public Integer getProductCategoryId(){return this.productCategoryId;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setSortOrder(Integer sortOrder){this.sortOrder = sortOrder;}

    public Integer getSortOrder(){return this.sortOrder;}

    public void setDescription(String description){this.description = description;}

    public String getDescription(){return this.description;}

    public void setImage(String image){this.image = image;}

    public String getImage(){return this.image;}

    public void setUpdateTime(java.time.LocalDateTime updateTime){this.updateTime = updateTime;}

    public java.time.LocalDateTime getUpdateTime(){return this.updateTime;}

    public void setUpdateUserId(Integer updateUserId){this.updateUserId = updateUserId;}

    public Integer getUpdateUserId(){return this.updateUserId;}
    @Override
    public String toString() {
        return "ProductCategory{" +
                "productCategoryId='" + productCategoryId + '\'' +
                "name='" + name + '\'' +
                "sortOrder='" + sortOrder + '\'' +
                "description='" + description + '\'' +
                "image='" + image + '\'' +
                "updateTime='" + updateTime + '\'' +
                "updateUserId='" + updateUserId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ProductCategory set;

        private ConditionBuilder where;

        public UpdateBuilder set(ProductCategory set){
            this.set = set;
            return this;
        }

        public ProductCategory getSet(){
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

    public static class QueryBuilder extends ProductCategory{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> productCategoryIdList;

        public List<Integer> getProductCategoryIdList(){return this.productCategoryIdList;}

        private Integer productCategoryIdSt;

        private Integer productCategoryIdEd;

        public Integer getProductCategoryIdSt(){return this.productCategoryIdSt;}

        public Integer getProductCategoryIdEd(){return this.productCategoryIdEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> sortOrderList;

        public List<Integer> getSortOrderList(){return this.sortOrderList;}

        private Integer sortOrderSt;

        private Integer sortOrderEd;

        public Integer getSortOrderSt(){return this.sortOrderSt;}

        public Integer getSortOrderEd(){return this.sortOrderEd;}

        private List<String> descriptionList;

        public List<String> getDescriptionList(){return this.descriptionList;}


        private List<String> fuzzyDescription;

        public List<String> getFuzzyDescription(){return this.fuzzyDescription;}

        private List<String> rightFuzzyDescription;

        public List<String> getRightFuzzyDescription(){return this.rightFuzzyDescription;}
        private List<String> imageList;

        public List<String> getImageList(){return this.imageList;}


        private List<String> fuzzyImage;

        public List<String> getFuzzyImage(){return this.fuzzyImage;}

        private List<String> rightFuzzyImage;

        public List<String> getRightFuzzyImage(){return this.rightFuzzyImage;}
        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<Integer> updateUserIdList;

        public List<Integer> getUpdateUserIdList(){return this.updateUserIdList;}

        private Integer updateUserIdSt;

        private Integer updateUserIdEd;

        public Integer getUpdateUserIdSt(){return this.updateUserIdSt;}

        public Integer getUpdateUserIdEd(){return this.updateUserIdEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder productCategoryIdBetWeen(Integer productCategoryIdSt,Integer productCategoryIdEd){
            this.productCategoryIdSt = productCategoryIdSt;
            this.productCategoryIdEd = productCategoryIdEd;
            return this;
        }

        public QueryBuilder productCategoryIdGreaterEqThan(Integer productCategoryIdSt){
            this.productCategoryIdSt = productCategoryIdSt;
            return this;
        }
        public QueryBuilder productCategoryIdLessEqThan(Integer productCategoryIdEd){
            this.productCategoryIdEd = productCategoryIdEd;
            return this;
        }


        public QueryBuilder productCategoryId(Integer productCategoryId){
            setProductCategoryId(productCategoryId);
            return this;
        }

        public QueryBuilder productCategoryIdList(Integer ... productCategoryId){
            this.productCategoryIdList = solveNullList(productCategoryId);
            return this;
        }

        public QueryBuilder productCategoryIdList(List<Integer> productCategoryId){
            this.productCategoryIdList = productCategoryId;
            return this;
        }

        public QueryBuilder fetchProductCategoryId(){
            setFetchFields("fetchFields","productCategoryId");
            return this;
        }

        public QueryBuilder excludeProductCategoryId(){
            setFetchFields("excludeFields","productCategoryId");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder sortOrderBetWeen(Integer sortOrderSt,Integer sortOrderEd){
            this.sortOrderSt = sortOrderSt;
            this.sortOrderEd = sortOrderEd;
            return this;
        }

        public QueryBuilder sortOrderGreaterEqThan(Integer sortOrderSt){
            this.sortOrderSt = sortOrderSt;
            return this;
        }
        public QueryBuilder sortOrderLessEqThan(Integer sortOrderEd){
            this.sortOrderEd = sortOrderEd;
            return this;
        }


        public QueryBuilder sortOrder(Integer sortOrder){
            setSortOrder(sortOrder);
            return this;
        }

        public QueryBuilder sortOrderList(Integer ... sortOrder){
            this.sortOrderList = solveNullList(sortOrder);
            return this;
        }

        public QueryBuilder sortOrderList(List<Integer> sortOrder){
            this.sortOrderList = sortOrder;
            return this;
        }

        public QueryBuilder fetchSortOrder(){
            setFetchFields("fetchFields","sortOrder");
            return this;
        }

        public QueryBuilder excludeSortOrder(){
            setFetchFields("excludeFields","sortOrder");
            return this;
        }

        public QueryBuilder fuzzyDescription (List<String> fuzzyDescription){
            this.fuzzyDescription = fuzzyDescription;
            return this;
        }

        public QueryBuilder fuzzyDescription (String ... fuzzyDescription){
            this.fuzzyDescription = solveNullList(fuzzyDescription);
            return this;
        }

        public QueryBuilder rightFuzzyDescription (List<String> rightFuzzyDescription){
            this.rightFuzzyDescription = rightFuzzyDescription;
            return this;
        }

        public QueryBuilder rightFuzzyDescription (String ... rightFuzzyDescription){
            this.rightFuzzyDescription = solveNullList(rightFuzzyDescription);
            return this;
        }

        public QueryBuilder description(String description){
            setDescription(description);
            return this;
        }

        public QueryBuilder descriptionList(String ... description){
            this.descriptionList = solveNullList(description);
            return this;
        }

        public QueryBuilder descriptionList(List<String> description){
            this.descriptionList = description;
            return this;
        }

        public QueryBuilder fetchDescription(){
            setFetchFields("fetchFields","description");
            return this;
        }

        public QueryBuilder excludeDescription(){
            setFetchFields("excludeFields","description");
            return this;
        }

        public QueryBuilder fuzzyImage (List<String> fuzzyImage){
            this.fuzzyImage = fuzzyImage;
            return this;
        }

        public QueryBuilder fuzzyImage (String ... fuzzyImage){
            this.fuzzyImage = solveNullList(fuzzyImage);
            return this;
        }

        public QueryBuilder rightFuzzyImage (List<String> rightFuzzyImage){
            this.rightFuzzyImage = rightFuzzyImage;
            return this;
        }

        public QueryBuilder rightFuzzyImage (String ... rightFuzzyImage){
            this.rightFuzzyImage = solveNullList(rightFuzzyImage);
            return this;
        }

        public QueryBuilder image(String image){
            setImage(image);
            return this;
        }

        public QueryBuilder imageList(String ... image){
            this.imageList = solveNullList(image);
            return this;
        }

        public QueryBuilder imageList(List<String> image){
            this.imageList = image;
            return this;
        }

        public QueryBuilder fetchImage(){
            setFetchFields("fetchFields","image");
            return this;
        }

        public QueryBuilder excludeImage(){
            setFetchFields("excludeFields","image");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.time.LocalDateTime updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }

        public QueryBuilder updateUserIdBetWeen(Integer updateUserIdSt,Integer updateUserIdEd){
            this.updateUserIdSt = updateUserIdSt;
            this.updateUserIdEd = updateUserIdEd;
            return this;
        }

        public QueryBuilder updateUserIdGreaterEqThan(Integer updateUserIdSt){
            this.updateUserIdSt = updateUserIdSt;
            return this;
        }
        public QueryBuilder updateUserIdLessEqThan(Integer updateUserIdEd){
            this.updateUserIdEd = updateUserIdEd;
            return this;
        }


        public QueryBuilder updateUserId(Integer updateUserId){
            setUpdateUserId(updateUserId);
            return this;
        }

        public QueryBuilder updateUserIdList(Integer ... updateUserId){
            this.updateUserIdList = solveNullList(updateUserId);
            return this;
        }

        public QueryBuilder updateUserIdList(List<Integer> updateUserId){
            this.updateUserIdList = updateUserId;
            return this;
        }

        public QueryBuilder fetchUpdateUserId(){
            setFetchFields("fetchFields","updateUserId");
            return this;
        }

        public QueryBuilder excludeUpdateUserId(){
            setFetchFields("excludeFields","updateUserId");
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

        public ProductCategory build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> productCategoryIdList;

        public List<Integer> getProductCategoryIdList(){return this.productCategoryIdList;}

        private Integer productCategoryIdSt;

        private Integer productCategoryIdEd;

        public Integer getProductCategoryIdSt(){return this.productCategoryIdSt;}

        public Integer getProductCategoryIdEd(){return this.productCategoryIdEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> sortOrderList;

        public List<Integer> getSortOrderList(){return this.sortOrderList;}

        private Integer sortOrderSt;

        private Integer sortOrderEd;

        public Integer getSortOrderSt(){return this.sortOrderSt;}

        public Integer getSortOrderEd(){return this.sortOrderEd;}

        private List<String> descriptionList;

        public List<String> getDescriptionList(){return this.descriptionList;}


        private List<String> fuzzyDescription;

        public List<String> getFuzzyDescription(){return this.fuzzyDescription;}

        private List<String> rightFuzzyDescription;

        public List<String> getRightFuzzyDescription(){return this.rightFuzzyDescription;}
        private List<String> imageList;

        public List<String> getImageList(){return this.imageList;}


        private List<String> fuzzyImage;

        public List<String> getFuzzyImage(){return this.fuzzyImage;}

        private List<String> rightFuzzyImage;

        public List<String> getRightFuzzyImage(){return this.rightFuzzyImage;}
        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<Integer> updateUserIdList;

        public List<Integer> getUpdateUserIdList(){return this.updateUserIdList;}

        private Integer updateUserIdSt;

        private Integer updateUserIdEd;

        public Integer getUpdateUserIdSt(){return this.updateUserIdSt;}

        public Integer getUpdateUserIdEd(){return this.updateUserIdEd;}


        public ConditionBuilder productCategoryIdBetWeen(Integer productCategoryIdSt,Integer productCategoryIdEd){
            this.productCategoryIdSt = productCategoryIdSt;
            this.productCategoryIdEd = productCategoryIdEd;
            return this;
        }

        public ConditionBuilder productCategoryIdGreaterEqThan(Integer productCategoryIdSt){
            this.productCategoryIdSt = productCategoryIdSt;
            return this;
        }
        public ConditionBuilder productCategoryIdLessEqThan(Integer productCategoryIdEd){
            this.productCategoryIdEd = productCategoryIdEd;
            return this;
        }


        public ConditionBuilder productCategoryIdList(Integer ... productCategoryId){
            this.productCategoryIdList = solveNullList(productCategoryId);
            return this;
        }

        public ConditionBuilder productCategoryIdList(List<Integer> productCategoryId){
            this.productCategoryIdList = productCategoryId;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder sortOrderBetWeen(Integer sortOrderSt,Integer sortOrderEd){
            this.sortOrderSt = sortOrderSt;
            this.sortOrderEd = sortOrderEd;
            return this;
        }

        public ConditionBuilder sortOrderGreaterEqThan(Integer sortOrderSt){
            this.sortOrderSt = sortOrderSt;
            return this;
        }
        public ConditionBuilder sortOrderLessEqThan(Integer sortOrderEd){
            this.sortOrderEd = sortOrderEd;
            return this;
        }


        public ConditionBuilder sortOrderList(Integer ... sortOrder){
            this.sortOrderList = solveNullList(sortOrder);
            return this;
        }

        public ConditionBuilder sortOrderList(List<Integer> sortOrder){
            this.sortOrderList = sortOrder;
            return this;
        }

        public ConditionBuilder fuzzyDescription (List<String> fuzzyDescription){
            this.fuzzyDescription = fuzzyDescription;
            return this;
        }

        public ConditionBuilder fuzzyDescription (String ... fuzzyDescription){
            this.fuzzyDescription = solveNullList(fuzzyDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyDescription (List<String> rightFuzzyDescription){
            this.rightFuzzyDescription = rightFuzzyDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyDescription (String ... rightFuzzyDescription){
            this.rightFuzzyDescription = solveNullList(rightFuzzyDescription);
            return this;
        }

        public ConditionBuilder descriptionList(String ... description){
            this.descriptionList = solveNullList(description);
            return this;
        }

        public ConditionBuilder descriptionList(List<String> description){
            this.descriptionList = description;
            return this;
        }

        public ConditionBuilder fuzzyImage (List<String> fuzzyImage){
            this.fuzzyImage = fuzzyImage;
            return this;
        }

        public ConditionBuilder fuzzyImage (String ... fuzzyImage){
            this.fuzzyImage = solveNullList(fuzzyImage);
            return this;
        }

        public ConditionBuilder rightFuzzyImage (List<String> rightFuzzyImage){
            this.rightFuzzyImage = rightFuzzyImage;
            return this;
        }

        public ConditionBuilder rightFuzzyImage (String ... rightFuzzyImage){
            this.rightFuzzyImage = solveNullList(rightFuzzyImage);
            return this;
        }

        public ConditionBuilder imageList(String ... image){
            this.imageList = solveNullList(image);
            return this;
        }

        public ConditionBuilder imageList(List<String> image){
            this.imageList = image;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public ConditionBuilder updateUserIdBetWeen(Integer updateUserIdSt,Integer updateUserIdEd){
            this.updateUserIdSt = updateUserIdSt;
            this.updateUserIdEd = updateUserIdEd;
            return this;
        }

        public ConditionBuilder updateUserIdGreaterEqThan(Integer updateUserIdSt){
            this.updateUserIdSt = updateUserIdSt;
            return this;
        }
        public ConditionBuilder updateUserIdLessEqThan(Integer updateUserIdEd){
            this.updateUserIdEd = updateUserIdEd;
            return this;
        }


        public ConditionBuilder updateUserIdList(Integer ... updateUserId){
            this.updateUserIdList = solveNullList(updateUserId);
            return this;
        }

        public ConditionBuilder updateUserIdList(List<Integer> updateUserId){
            this.updateUserIdList = updateUserId;
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

        private ProductCategory obj;

        public Builder(){
            this.obj = new ProductCategory();
        }

        public Builder productCategoryId(Integer productCategoryId){
            this.obj.setProductCategoryId(productCategoryId);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder sortOrder(Integer sortOrder){
            this.obj.setSortOrder(sortOrder);
            return this;
        }
        public Builder description(String description){
            this.obj.setDescription(description);
            return this;
        }
        public Builder image(String image){
            this.obj.setImage(image);
            return this;
        }
        public Builder updateTime(java.time.LocalDateTime updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public Builder updateUserId(Integer updateUserId){
            this.obj.setUpdateUserId(updateUserId);
            return this;
        }
        public ProductCategory build(){return obj;}
    }

}
