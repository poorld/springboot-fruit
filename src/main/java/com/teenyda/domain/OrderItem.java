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
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1601518168249L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String orderItemId;

    /**
    * 
    * isNullAble:0
    */
    private String orderNum;

    /**
    * 
    * isNullAble:0
    */
    private Integer productId;

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

    /**
    * 
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 
    * isNullAble:0
    */
    private Integer specId;


    public void setOrderItemId(String orderItemId){this.orderItemId = orderItemId;}

    public String getOrderItemId(){return this.orderItemId;}

    public void setOrderNum(String orderNum){this.orderNum = orderNum;}

    public String getOrderNum(){return this.orderNum;}

    public void setProductId(Integer productId){this.productId = productId;}

    public Integer getProductId(){return this.productId;}

    public void setPrice(java.math.BigDecimal price){this.price = price;}

    public java.math.BigDecimal getPrice(){return this.price;}

    public void setQuantity(Integer quantity){this.quantity = quantity;}

    public Integer getQuantity(){return this.quantity;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setSpecId(Integer specId){this.specId = specId;}

    public Integer getSpecId(){return this.specId;}
    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId='" + orderItemId + '\'' +
                "orderNum='" + orderNum + '\'' +
                "productId='" + productId + '\'' +
                "price='" + price + '\'' +
                "quantity='" + quantity + '\'' +
                "userId='" + userId + '\'' +
                "specId='" + specId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private OrderItem set;

        private ConditionBuilder where;

        public UpdateBuilder set(OrderItem set){
            this.set = set;
            return this;
        }

        public OrderItem getSet(){
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

    public static class QueryBuilder extends OrderItem{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> orderItemIdList;

        public List<String> getOrderItemIdList(){return this.orderItemIdList;}


        private List<String> fuzzyOrderItemId;

        public List<String> getFuzzyOrderItemId(){return this.fuzzyOrderItemId;}

        private List<String> rightFuzzyOrderItemId;

        public List<String> getRightFuzzyOrderItemId(){return this.rightFuzzyOrderItemId;}
        private List<String> orderNumList;

        public List<String> getOrderNumList(){return this.orderNumList;}


        private List<String> fuzzyOrderNum;

        public List<String> getFuzzyOrderNum(){return this.fuzzyOrderNum;}

        private List<String> rightFuzzyOrderNum;

        public List<String> getRightFuzzyOrderNum(){return this.rightFuzzyOrderNum;}
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

        private List<Integer> quantityList;

        public List<Integer> getQuantityList(){return this.quantityList;}

        private Integer quantitySt;

        private Integer quantityEd;

        public Integer getQuantitySt(){return this.quantitySt;}

        public Integer getQuantityEd(){return this.quantityEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<Integer> specIdList;

        public List<Integer> getSpecIdList(){return this.specIdList;}

        private Integer specIdSt;

        private Integer specIdEd;

        public Integer getSpecIdSt(){return this.specIdSt;}

        public Integer getSpecIdEd(){return this.specIdEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyOrderItemId (List<String> fuzzyOrderItemId){
            this.fuzzyOrderItemId = fuzzyOrderItemId;
            return this;
        }

        public QueryBuilder fuzzyOrderItemId (String ... fuzzyOrderItemId){
            this.fuzzyOrderItemId = solveNullList(fuzzyOrderItemId);
            return this;
        }

        public QueryBuilder rightFuzzyOrderItemId (List<String> rightFuzzyOrderItemId){
            this.rightFuzzyOrderItemId = rightFuzzyOrderItemId;
            return this;
        }

        public QueryBuilder rightFuzzyOrderItemId (String ... rightFuzzyOrderItemId){
            this.rightFuzzyOrderItemId = solveNullList(rightFuzzyOrderItemId);
            return this;
        }

        public QueryBuilder orderItemId(String orderItemId){
            setOrderItemId(orderItemId);
            return this;
        }

        public QueryBuilder orderItemIdList(String ... orderItemId){
            this.orderItemIdList = solveNullList(orderItemId);
            return this;
        }

        public QueryBuilder orderItemIdList(List<String> orderItemId){
            this.orderItemIdList = orderItemId;
            return this;
        }

        public QueryBuilder fetchOrderItemId(){
            setFetchFields("fetchFields","orderItemId");
            return this;
        }

        public QueryBuilder excludeOrderItemId(){
            setFetchFields("excludeFields","orderItemId");
            return this;
        }

        public QueryBuilder fuzzyOrderNum (List<String> fuzzyOrderNum){
            this.fuzzyOrderNum = fuzzyOrderNum;
            return this;
        }

        public QueryBuilder fuzzyOrderNum (String ... fuzzyOrderNum){
            this.fuzzyOrderNum = solveNullList(fuzzyOrderNum);
            return this;
        }

        public QueryBuilder rightFuzzyOrderNum (List<String> rightFuzzyOrderNum){
            this.rightFuzzyOrderNum = rightFuzzyOrderNum;
            return this;
        }

        public QueryBuilder rightFuzzyOrderNum (String ... rightFuzzyOrderNum){
            this.rightFuzzyOrderNum = solveNullList(rightFuzzyOrderNum);
            return this;
        }

        public QueryBuilder orderNum(String orderNum){
            setOrderNum(orderNum);
            return this;
        }

        public QueryBuilder orderNumList(String ... orderNum){
            this.orderNumList = solveNullList(orderNum);
            return this;
        }

        public QueryBuilder orderNumList(List<String> orderNum){
            this.orderNumList = orderNum;
            return this;
        }

        public QueryBuilder fetchOrderNum(){
            setFetchFields("fetchFields","orderNum");
            return this;
        }

        public QueryBuilder excludeOrderNum(){
            setFetchFields("excludeFields","orderNum");
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

        public OrderItem build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> orderItemIdList;

        public List<String> getOrderItemIdList(){return this.orderItemIdList;}


        private List<String> fuzzyOrderItemId;

        public List<String> getFuzzyOrderItemId(){return this.fuzzyOrderItemId;}

        private List<String> rightFuzzyOrderItemId;

        public List<String> getRightFuzzyOrderItemId(){return this.rightFuzzyOrderItemId;}
        private List<String> orderNumList;

        public List<String> getOrderNumList(){return this.orderNumList;}


        private List<String> fuzzyOrderNum;

        public List<String> getFuzzyOrderNum(){return this.fuzzyOrderNum;}

        private List<String> rightFuzzyOrderNum;

        public List<String> getRightFuzzyOrderNum(){return this.rightFuzzyOrderNum;}
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

        private List<Integer> quantityList;

        public List<Integer> getQuantityList(){return this.quantityList;}

        private Integer quantitySt;

        private Integer quantityEd;

        public Integer getQuantitySt(){return this.quantitySt;}

        public Integer getQuantityEd(){return this.quantityEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<Integer> specIdList;

        public List<Integer> getSpecIdList(){return this.specIdList;}

        private Integer specIdSt;

        private Integer specIdEd;

        public Integer getSpecIdSt(){return this.specIdSt;}

        public Integer getSpecIdEd(){return this.specIdEd;}


        public ConditionBuilder fuzzyOrderItemId (List<String> fuzzyOrderItemId){
            this.fuzzyOrderItemId = fuzzyOrderItemId;
            return this;
        }

        public ConditionBuilder fuzzyOrderItemId (String ... fuzzyOrderItemId){
            this.fuzzyOrderItemId = solveNullList(fuzzyOrderItemId);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderItemId (List<String> rightFuzzyOrderItemId){
            this.rightFuzzyOrderItemId = rightFuzzyOrderItemId;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderItemId (String ... rightFuzzyOrderItemId){
            this.rightFuzzyOrderItemId = solveNullList(rightFuzzyOrderItemId);
            return this;
        }

        public ConditionBuilder orderItemIdList(String ... orderItemId){
            this.orderItemIdList = solveNullList(orderItemId);
            return this;
        }

        public ConditionBuilder orderItemIdList(List<String> orderItemId){
            this.orderItemIdList = orderItemId;
            return this;
        }

        public ConditionBuilder fuzzyOrderNum (List<String> fuzzyOrderNum){
            this.fuzzyOrderNum = fuzzyOrderNum;
            return this;
        }

        public ConditionBuilder fuzzyOrderNum (String ... fuzzyOrderNum){
            this.fuzzyOrderNum = solveNullList(fuzzyOrderNum);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderNum (List<String> rightFuzzyOrderNum){
            this.rightFuzzyOrderNum = rightFuzzyOrderNum;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderNum (String ... rightFuzzyOrderNum){
            this.rightFuzzyOrderNum = solveNullList(rightFuzzyOrderNum);
            return this;
        }

        public ConditionBuilder orderNumList(String ... orderNum){
            this.orderNumList = solveNullList(orderNum);
            return this;
        }

        public ConditionBuilder orderNumList(List<String> orderNum){
            this.orderNumList = orderNum;
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

        private OrderItem obj;

        public Builder(){
            this.obj = new OrderItem();
        }

        public Builder orderItemId(String orderItemId){
            this.obj.setOrderItemId(orderItemId);
            return this;
        }
        public Builder orderNum(String orderNum){
            this.obj.setOrderNum(orderNum);
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
        public Builder quantity(Integer quantity){
            this.obj.setQuantity(quantity);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder specId(Integer specId){
            this.obj.setSpecId(specId);
            return this;
        }
        public OrderItem build(){return obj;}
    }

}
