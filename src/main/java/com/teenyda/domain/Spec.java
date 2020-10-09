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
public class Spec implements Serializable {

    private static final long serialVersionUID = 1601518188633L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer specId;

    /**
    * 
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 
    * isNullAble:1
    */
    private String specName;

    /**
    * 
    * isNullAble:1
    */
    private java.math.BigDecimal price;

    /**
    * 
    * isNullAble:0
    */
    private Integer quantity;


    public void setSpecId(Integer specId){this.specId = specId;}

    public Integer getSpecId(){return this.specId;}

    public void setProductId(Integer productId){this.productId = productId;}

    public Integer getProductId(){return this.productId;}

    public void setSpecName(String specName){this.specName = specName;}

    public String getSpecName(){return this.specName;}

    public void setPrice(java.math.BigDecimal price){this.price = price;}

    public java.math.BigDecimal getPrice(){return this.price;}

    public void setQuantity(Integer quantity){this.quantity = quantity;}

    public Integer getQuantity(){return this.quantity;}
    @Override
    public String toString() {
        return "Spec{" +
                "specId='" + specId + '\'' +
                "productId='" + productId + '\'' +
                "specName='" + specName + '\'' +
                "price='" + price + '\'' +
                "quantity='" + quantity + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Spec set;

        private ConditionBuilder where;

        public UpdateBuilder set(Spec set){
            this.set = set;
            return this;
        }

        public Spec getSet(){
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

    public static class QueryBuilder extends Spec{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> specIdList;

        public List<Integer> getSpecIdList(){return this.specIdList;}

        private Integer specIdSt;

        private Integer specIdEd;

        public Integer getSpecIdSt(){return this.specIdSt;}

        public Integer getSpecIdEd(){return this.specIdEd;}

        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

        private List<String> specNameList;

        public List<String> getSpecNameList(){return this.specNameList;}


        private List<String> fuzzySpecName;

        public List<String> getFuzzySpecName(){return this.fuzzySpecName;}

        private List<String> rightFuzzySpecName;

        public List<String> getRightFuzzySpecName(){return this.rightFuzzySpecName;}
        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<Integer> quantityList;

        public List<Integer> getQuantityList(){return this.quantityList;}

        private Integer quantitySt;

        private Integer quantityEd;

        public Integer getQuantitySt(){return this.quantitySt;}

        public Integer getQuantityEd(){return this.quantityEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder specIdBetWeen(Integer specIdSt,Integer specIdEd){
            this.specIdSt = specIdSt;
            this.specIdEd = specIdEd;
            return this;
        }

        public QueryBuilder specIdGreaterEqThan(Integer specIdSt){
            this.specIdSt = specIdSt;
            return this;
        }
        public QueryBuilder specIdLessEqThan(Integer specIdEd){
            this.specIdEd = specIdEd;
            return this;
        }


        public QueryBuilder specId(Integer specId){
            setSpecId(specId);
            return this;
        }

        public QueryBuilder specIdList(Integer ... specId){
            this.specIdList = solveNullList(specId);
            return this;
        }

        public QueryBuilder specIdList(List<Integer> specId){
            this.specIdList = specId;
            return this;
        }

        public QueryBuilder fetchSpecId(){
            setFetchFields("fetchFields","specId");
            return this;
        }

        public QueryBuilder excludeSpecId(){
            setFetchFields("excludeFields","specId");
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

        public QueryBuilder fuzzySpecName (List<String> fuzzySpecName){
            this.fuzzySpecName = fuzzySpecName;
            return this;
        }

        public QueryBuilder fuzzySpecName (String ... fuzzySpecName){
            this.fuzzySpecName = solveNullList(fuzzySpecName);
            return this;
        }

        public QueryBuilder rightFuzzySpecName (List<String> rightFuzzySpecName){
            this.rightFuzzySpecName = rightFuzzySpecName;
            return this;
        }

        public QueryBuilder rightFuzzySpecName (String ... rightFuzzySpecName){
            this.rightFuzzySpecName = solveNullList(rightFuzzySpecName);
            return this;
        }

        public QueryBuilder specName(String specName){
            setSpecName(specName);
            return this;
        }

        public QueryBuilder specNameList(String ... specName){
            this.specNameList = solveNullList(specName);
            return this;
        }

        public QueryBuilder specNameList(List<String> specName){
            this.specNameList = specName;
            return this;
        }

        public QueryBuilder fetchSpecName(){
            setFetchFields("fetchFields","specName");
            return this;
        }

        public QueryBuilder excludeSpecName(){
            setFetchFields("excludeFields","specName");
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

        public QueryBuilder quantityBetWeen(Integer quantitySt,Integer quantityEd){
            this.quantitySt = quantitySt;
            this.quantityEd = quantityEd;
            return this;
        }

        public QueryBuilder quantityGreaterEqThan(Integer quantitySt){
            this.quantitySt = quantitySt;
            return this;
        }
        public QueryBuilder quantityLessEqThan(Integer quantityEd){
            this.quantityEd = quantityEd;
            return this;
        }


        public QueryBuilder quantity(Integer quantity){
            setQuantity(quantity);
            return this;
        }

        public QueryBuilder quantityList(Integer ... quantity){
            this.quantityList = solveNullList(quantity);
            return this;
        }

        public QueryBuilder quantityList(List<Integer> quantity){
            this.quantityList = quantity;
            return this;
        }

        public QueryBuilder fetchQuantity(){
            setFetchFields("fetchFields","quantity");
            return this;
        }

        public QueryBuilder excludeQuantity(){
            setFetchFields("excludeFields","quantity");
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

        public Spec build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> specIdList;

        public List<Integer> getSpecIdList(){return this.specIdList;}

        private Integer specIdSt;

        private Integer specIdEd;

        public Integer getSpecIdSt(){return this.specIdSt;}

        public Integer getSpecIdEd(){return this.specIdEd;}

        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

        private List<String> specNameList;

        public List<String> getSpecNameList(){return this.specNameList;}


        private List<String> fuzzySpecName;

        public List<String> getFuzzySpecName(){return this.fuzzySpecName;}

        private List<String> rightFuzzySpecName;

        public List<String> getRightFuzzySpecName(){return this.rightFuzzySpecName;}
        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<Integer> quantityList;

        public List<Integer> getQuantityList(){return this.quantityList;}

        private Integer quantitySt;

        private Integer quantityEd;

        public Integer getQuantitySt(){return this.quantitySt;}

        public Integer getQuantityEd(){return this.quantityEd;}


        public ConditionBuilder specIdBetWeen(Integer specIdSt,Integer specIdEd){
            this.specIdSt = specIdSt;
            this.specIdEd = specIdEd;
            return this;
        }

        public ConditionBuilder specIdGreaterEqThan(Integer specIdSt){
            this.specIdSt = specIdSt;
            return this;
        }
        public ConditionBuilder specIdLessEqThan(Integer specIdEd){
            this.specIdEd = specIdEd;
            return this;
        }


        public ConditionBuilder specIdList(Integer ... specId){
            this.specIdList = solveNullList(specId);
            return this;
        }

        public ConditionBuilder specIdList(List<Integer> specId){
            this.specIdList = specId;
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

        public ConditionBuilder fuzzySpecName (List<String> fuzzySpecName){
            this.fuzzySpecName = fuzzySpecName;
            return this;
        }

        public ConditionBuilder fuzzySpecName (String ... fuzzySpecName){
            this.fuzzySpecName = solveNullList(fuzzySpecName);
            return this;
        }

        public ConditionBuilder rightFuzzySpecName (List<String> rightFuzzySpecName){
            this.rightFuzzySpecName = rightFuzzySpecName;
            return this;
        }

        public ConditionBuilder rightFuzzySpecName (String ... rightFuzzySpecName){
            this.rightFuzzySpecName = solveNullList(rightFuzzySpecName);
            return this;
        }

        public ConditionBuilder specNameList(String ... specName){
            this.specNameList = solveNullList(specName);
            return this;
        }

        public ConditionBuilder specNameList(List<String> specName){
            this.specNameList = specName;
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

        public ConditionBuilder quantityBetWeen(Integer quantitySt,Integer quantityEd){
            this.quantitySt = quantitySt;
            this.quantityEd = quantityEd;
            return this;
        }

        public ConditionBuilder quantityGreaterEqThan(Integer quantitySt){
            this.quantitySt = quantitySt;
            return this;
        }
        public ConditionBuilder quantityLessEqThan(Integer quantityEd){
            this.quantityEd = quantityEd;
            return this;
        }


        public ConditionBuilder quantityList(Integer ... quantity){
            this.quantityList = solveNullList(quantity);
            return this;
        }

        public ConditionBuilder quantityList(List<Integer> quantity){
            this.quantityList = quantity;
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

        private Spec obj;

        public Builder(){
            this.obj = new Spec();
        }

        public Builder specId(Integer specId){
            this.obj.setSpecId(specId);
            return this;
        }
        public Builder productId(Integer productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder specName(String specName){
            this.obj.setSpecName(specName);
            return this;
        }
        public Builder price(java.math.BigDecimal price){
            this.obj.setPrice(price);
            return this;
        }
        public Builder quantity(Integer quantity){
            this.obj.setQuantity(quantity);
            return this;
        }
        public Spec build(){return obj;}
    }

}
