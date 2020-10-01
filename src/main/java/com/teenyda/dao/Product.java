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
public class Product implements Serializable {

    private static final long serialVersionUID = 1601518173353L;


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
    private String explain;

    /**
    * 
    * isNullAble:1
    */
    private java.math.BigDecimal shopPrice;

    /**
    * 
    * isNullAble:1
    */
    private java.math.BigDecimal price;

    /**
    * 
    * isNullAble:1
    */
    private Integer hot;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer productStatus;

    /**
    * 
    * isNullAble:1
    */
    private String defaultImg;

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

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;

    /**
    * 
    * isNullAble:1
    */
    private Integer createUserId;


    public void setProductId(Integer productId){this.productId = productId;}

    public Integer getProductId(){return this.productId;}

    public void setProductCategoryId(Integer productCategoryId){this.productCategoryId = productCategoryId;}

    public Integer getProductCategoryId(){return this.productCategoryId;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setExplain(String explain){this.explain = explain;}

    public String getExplain(){return this.explain;}

    public void setShopPrice(java.math.BigDecimal shopPrice){this.shopPrice = shopPrice;}

    public java.math.BigDecimal getShopPrice(){return this.shopPrice;}

    public void setPrice(java.math.BigDecimal price){this.price = price;}

    public java.math.BigDecimal getPrice(){return this.price;}

    public void setHot(Integer hot){this.hot = hot;}

    public Integer getHot(){return this.hot;}

    public void setProductStatus(Integer productStatus){this.productStatus = productStatus;}

    public Integer getProductStatus(){return this.productStatus;}

    public void setDefaultImg(String defaultImg){this.defaultImg = defaultImg;}

    public String getDefaultImg(){return this.defaultImg;}

    public void setUpdateTime(java.time.LocalDateTime updateTime){this.updateTime = updateTime;}

    public java.time.LocalDateTime getUpdateTime(){return this.updateTime;}

    public void setUpdateUserId(Integer updateUserId){this.updateUserId = updateUserId;}

    public Integer getUpdateUserId(){return this.updateUserId;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setCreateUserId(Integer createUserId){this.createUserId = createUserId;}

    public Integer getCreateUserId(){return this.createUserId;}
    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                "productCategoryId='" + productCategoryId + '\'' +
                "name='" + name + '\'' +
                "explain='" + explain + '\'' +
                "shopPrice='" + shopPrice + '\'' +
                "price='" + price + '\'' +
                "hot='" + hot + '\'' +
                "productStatus='" + productStatus + '\'' +
                "defaultImg='" + defaultImg + '\'' +
                "updateTime='" + updateTime + '\'' +
                "updateUserId='" + updateUserId + '\'' +
                "createTime='" + createTime + '\'' +
                "createUserId='" + createUserId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Product set;

        private ConditionBuilder where;

        public UpdateBuilder set(Product set){
            this.set = set;
            return this;
        }

        public Product getSet(){
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

    public static class QueryBuilder extends Product{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

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
        private List<String> explainList;

        public List<String> getExplainList(){return this.explainList;}


        private List<String> fuzzyExplain;

        public List<String> getFuzzyExplain(){return this.fuzzyExplain;}

        private List<String> rightFuzzyExplain;

        public List<String> getRightFuzzyExplain(){return this.rightFuzzyExplain;}
        private List<java.math.BigDecimal> shopPriceList;

        public List<java.math.BigDecimal> getShopPriceList(){return this.shopPriceList;}

        private java.math.BigDecimal shopPriceSt;

        private java.math.BigDecimal shopPriceEd;

        public java.math.BigDecimal getShopPriceSt(){return this.shopPriceSt;}

        public java.math.BigDecimal getShopPriceEd(){return this.shopPriceEd;}

        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<Integer> hotList;

        public List<Integer> getHotList(){return this.hotList;}

        private Integer hotSt;

        private Integer hotEd;

        public Integer getHotSt(){return this.hotSt;}

        public Integer getHotEd(){return this.hotEd;}

        private List<Integer> productStatusList;

        public List<Integer> getProductStatusList(){return this.productStatusList;}

        private Integer productStatusSt;

        private Integer productStatusEd;

        public Integer getProductStatusSt(){return this.productStatusSt;}

        public Integer getProductStatusEd(){return this.productStatusEd;}

        private List<String> defaultImgList;

        public List<String> getDefaultImgList(){return this.defaultImgList;}


        private List<String> fuzzyDefaultImg;

        public List<String> getFuzzyDefaultImg(){return this.fuzzyDefaultImg;}

        private List<String> rightFuzzyDefaultImg;

        public List<String> getRightFuzzyDefaultImg(){return this.rightFuzzyDefaultImg;}
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

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<Integer> createUserIdList;

        public List<Integer> getCreateUserIdList(){return this.createUserIdList;}

        private Integer createUserIdSt;

        private Integer createUserIdEd;

        public Integer getCreateUserIdSt(){return this.createUserIdSt;}

        public Integer getCreateUserIdEd(){return this.createUserIdEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyExplain (List<String> fuzzyExplain){
            this.fuzzyExplain = fuzzyExplain;
            return this;
        }

        public QueryBuilder fuzzyExplain (String ... fuzzyExplain){
            this.fuzzyExplain = solveNullList(fuzzyExplain);
            return this;
        }

        public QueryBuilder rightFuzzyExplain (List<String> rightFuzzyExplain){
            this.rightFuzzyExplain = rightFuzzyExplain;
            return this;
        }

        public QueryBuilder rightFuzzyExplain (String ... rightFuzzyExplain){
            this.rightFuzzyExplain = solveNullList(rightFuzzyExplain);
            return this;
        }

        public QueryBuilder explain(String explain){
            setExplain(explain);
            return this;
        }

        public QueryBuilder explainList(String ... explain){
            this.explainList = solveNullList(explain);
            return this;
        }

        public QueryBuilder explainList(List<String> explain){
            this.explainList = explain;
            return this;
        }

        public QueryBuilder fetchExplain(){
            setFetchFields("fetchFields","explain");
            return this;
        }

        public QueryBuilder excludeExplain(){
            setFetchFields("excludeFields","explain");
            return this;
        }

        public QueryBuilder shopPriceBetWeen(java.math.BigDecimal shopPriceSt,java.math.BigDecimal shopPriceEd){
            this.shopPriceSt = shopPriceSt;
            this.shopPriceEd = shopPriceEd;
            return this;
        }

        public QueryBuilder shopPriceGreaterEqThan(java.math.BigDecimal shopPriceSt){
            this.shopPriceSt = shopPriceSt;
            return this;
        }
        public QueryBuilder shopPriceLessEqThan(java.math.BigDecimal shopPriceEd){
            this.shopPriceEd = shopPriceEd;
            return this;
        }


        public QueryBuilder shopPrice(java.math.BigDecimal shopPrice){
            setShopPrice(shopPrice);
            return this;
        }

        public QueryBuilder shopPriceList(java.math.BigDecimal ... shopPrice){
            this.shopPriceList = solveNullList(shopPrice);
            return this;
        }

        public QueryBuilder shopPriceList(List<java.math.BigDecimal> shopPrice){
            this.shopPriceList = shopPrice;
            return this;
        }

        public QueryBuilder fetchShopPrice(){
            setFetchFields("fetchFields","shopPrice");
            return this;
        }

        public QueryBuilder excludeShopPrice(){
            setFetchFields("excludeFields","shopPrice");
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

        public QueryBuilder hotBetWeen(Integer hotSt,Integer hotEd){
            this.hotSt = hotSt;
            this.hotEd = hotEd;
            return this;
        }

        public QueryBuilder hotGreaterEqThan(Integer hotSt){
            this.hotSt = hotSt;
            return this;
        }
        public QueryBuilder hotLessEqThan(Integer hotEd){
            this.hotEd = hotEd;
            return this;
        }


        public QueryBuilder hot(Integer hot){
            setHot(hot);
            return this;
        }

        public QueryBuilder hotList(Integer ... hot){
            this.hotList = solveNullList(hot);
            return this;
        }

        public QueryBuilder hotList(List<Integer> hot){
            this.hotList = hot;
            return this;
        }

        public QueryBuilder fetchHot(){
            setFetchFields("fetchFields","hot");
            return this;
        }

        public QueryBuilder excludeHot(){
            setFetchFields("excludeFields","hot");
            return this;
        }

        public QueryBuilder productStatusBetWeen(Integer productStatusSt,Integer productStatusEd){
            this.productStatusSt = productStatusSt;
            this.productStatusEd = productStatusEd;
            return this;
        }

        public QueryBuilder productStatusGreaterEqThan(Integer productStatusSt){
            this.productStatusSt = productStatusSt;
            return this;
        }
        public QueryBuilder productStatusLessEqThan(Integer productStatusEd){
            this.productStatusEd = productStatusEd;
            return this;
        }


        public QueryBuilder productStatus(Integer productStatus){
            setProductStatus(productStatus);
            return this;
        }

        public QueryBuilder productStatusList(Integer ... productStatus){
            this.productStatusList = solveNullList(productStatus);
            return this;
        }

        public QueryBuilder productStatusList(List<Integer> productStatus){
            this.productStatusList = productStatus;
            return this;
        }

        public QueryBuilder fetchProductStatus(){
            setFetchFields("fetchFields","productStatus");
            return this;
        }

        public QueryBuilder excludeProductStatus(){
            setFetchFields("excludeFields","productStatus");
            return this;
        }

        public QueryBuilder fuzzyDefaultImg (List<String> fuzzyDefaultImg){
            this.fuzzyDefaultImg = fuzzyDefaultImg;
            return this;
        }

        public QueryBuilder fuzzyDefaultImg (String ... fuzzyDefaultImg){
            this.fuzzyDefaultImg = solveNullList(fuzzyDefaultImg);
            return this;
        }

        public QueryBuilder rightFuzzyDefaultImg (List<String> rightFuzzyDefaultImg){
            this.rightFuzzyDefaultImg = rightFuzzyDefaultImg;
            return this;
        }

        public QueryBuilder rightFuzzyDefaultImg (String ... rightFuzzyDefaultImg){
            this.rightFuzzyDefaultImg = solveNullList(rightFuzzyDefaultImg);
            return this;
        }

        public QueryBuilder defaultImg(String defaultImg){
            setDefaultImg(defaultImg);
            return this;
        }

        public QueryBuilder defaultImgList(String ... defaultImg){
            this.defaultImgList = solveNullList(defaultImg);
            return this;
        }

        public QueryBuilder defaultImgList(List<String> defaultImg){
            this.defaultImgList = defaultImg;
            return this;
        }

        public QueryBuilder fetchDefaultImg(){
            setFetchFields("fetchFields","defaultImg");
            return this;
        }

        public QueryBuilder excludeDefaultImg(){
            setFetchFields("excludeFields","defaultImg");
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

        public QueryBuilder createUserIdBetWeen(Integer createUserIdSt,Integer createUserIdEd){
            this.createUserIdSt = createUserIdSt;
            this.createUserIdEd = createUserIdEd;
            return this;
        }

        public QueryBuilder createUserIdGreaterEqThan(Integer createUserIdSt){
            this.createUserIdSt = createUserIdSt;
            return this;
        }
        public QueryBuilder createUserIdLessEqThan(Integer createUserIdEd){
            this.createUserIdEd = createUserIdEd;
            return this;
        }


        public QueryBuilder createUserId(Integer createUserId){
            setCreateUserId(createUserId);
            return this;
        }

        public QueryBuilder createUserIdList(Integer ... createUserId){
            this.createUserIdList = solveNullList(createUserId);
            return this;
        }

        public QueryBuilder createUserIdList(List<Integer> createUserId){
            this.createUserIdList = createUserId;
            return this;
        }

        public QueryBuilder fetchCreateUserId(){
            setFetchFields("fetchFields","createUserId");
            return this;
        }

        public QueryBuilder excludeCreateUserId(){
            setFetchFields("excludeFields","createUserId");
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

        public Product build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

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
        private List<String> explainList;

        public List<String> getExplainList(){return this.explainList;}


        private List<String> fuzzyExplain;

        public List<String> getFuzzyExplain(){return this.fuzzyExplain;}

        private List<String> rightFuzzyExplain;

        public List<String> getRightFuzzyExplain(){return this.rightFuzzyExplain;}
        private List<java.math.BigDecimal> shopPriceList;

        public List<java.math.BigDecimal> getShopPriceList(){return this.shopPriceList;}

        private java.math.BigDecimal shopPriceSt;

        private java.math.BigDecimal shopPriceEd;

        public java.math.BigDecimal getShopPriceSt(){return this.shopPriceSt;}

        public java.math.BigDecimal getShopPriceEd(){return this.shopPriceEd;}

        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<Integer> hotList;

        public List<Integer> getHotList(){return this.hotList;}

        private Integer hotSt;

        private Integer hotEd;

        public Integer getHotSt(){return this.hotSt;}

        public Integer getHotEd(){return this.hotEd;}

        private List<Integer> productStatusList;

        public List<Integer> getProductStatusList(){return this.productStatusList;}

        private Integer productStatusSt;

        private Integer productStatusEd;

        public Integer getProductStatusSt(){return this.productStatusSt;}

        public Integer getProductStatusEd(){return this.productStatusEd;}

        private List<String> defaultImgList;

        public List<String> getDefaultImgList(){return this.defaultImgList;}


        private List<String> fuzzyDefaultImg;

        public List<String> getFuzzyDefaultImg(){return this.fuzzyDefaultImg;}

        private List<String> rightFuzzyDefaultImg;

        public List<String> getRightFuzzyDefaultImg(){return this.rightFuzzyDefaultImg;}
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

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<Integer> createUserIdList;

        public List<Integer> getCreateUserIdList(){return this.createUserIdList;}

        private Integer createUserIdSt;

        private Integer createUserIdEd;

        public Integer getCreateUserIdSt(){return this.createUserIdSt;}

        public Integer getCreateUserIdEd(){return this.createUserIdEd;}


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

        public ConditionBuilder fuzzyExplain (List<String> fuzzyExplain){
            this.fuzzyExplain = fuzzyExplain;
            return this;
        }

        public ConditionBuilder fuzzyExplain (String ... fuzzyExplain){
            this.fuzzyExplain = solveNullList(fuzzyExplain);
            return this;
        }

        public ConditionBuilder rightFuzzyExplain (List<String> rightFuzzyExplain){
            this.rightFuzzyExplain = rightFuzzyExplain;
            return this;
        }

        public ConditionBuilder rightFuzzyExplain (String ... rightFuzzyExplain){
            this.rightFuzzyExplain = solveNullList(rightFuzzyExplain);
            return this;
        }

        public ConditionBuilder explainList(String ... explain){
            this.explainList = solveNullList(explain);
            return this;
        }

        public ConditionBuilder explainList(List<String> explain){
            this.explainList = explain;
            return this;
        }

        public ConditionBuilder shopPriceBetWeen(java.math.BigDecimal shopPriceSt,java.math.BigDecimal shopPriceEd){
            this.shopPriceSt = shopPriceSt;
            this.shopPriceEd = shopPriceEd;
            return this;
        }

        public ConditionBuilder shopPriceGreaterEqThan(java.math.BigDecimal shopPriceSt){
            this.shopPriceSt = shopPriceSt;
            return this;
        }
        public ConditionBuilder shopPriceLessEqThan(java.math.BigDecimal shopPriceEd){
            this.shopPriceEd = shopPriceEd;
            return this;
        }


        public ConditionBuilder shopPriceList(java.math.BigDecimal ... shopPrice){
            this.shopPriceList = solveNullList(shopPrice);
            return this;
        }

        public ConditionBuilder shopPriceList(List<java.math.BigDecimal> shopPrice){
            this.shopPriceList = shopPrice;
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

        public ConditionBuilder hotBetWeen(Integer hotSt,Integer hotEd){
            this.hotSt = hotSt;
            this.hotEd = hotEd;
            return this;
        }

        public ConditionBuilder hotGreaterEqThan(Integer hotSt){
            this.hotSt = hotSt;
            return this;
        }
        public ConditionBuilder hotLessEqThan(Integer hotEd){
            this.hotEd = hotEd;
            return this;
        }


        public ConditionBuilder hotList(Integer ... hot){
            this.hotList = solveNullList(hot);
            return this;
        }

        public ConditionBuilder hotList(List<Integer> hot){
            this.hotList = hot;
            return this;
        }

        public ConditionBuilder productStatusBetWeen(Integer productStatusSt,Integer productStatusEd){
            this.productStatusSt = productStatusSt;
            this.productStatusEd = productStatusEd;
            return this;
        }

        public ConditionBuilder productStatusGreaterEqThan(Integer productStatusSt){
            this.productStatusSt = productStatusSt;
            return this;
        }
        public ConditionBuilder productStatusLessEqThan(Integer productStatusEd){
            this.productStatusEd = productStatusEd;
            return this;
        }


        public ConditionBuilder productStatusList(Integer ... productStatus){
            this.productStatusList = solveNullList(productStatus);
            return this;
        }

        public ConditionBuilder productStatusList(List<Integer> productStatus){
            this.productStatusList = productStatus;
            return this;
        }

        public ConditionBuilder fuzzyDefaultImg (List<String> fuzzyDefaultImg){
            this.fuzzyDefaultImg = fuzzyDefaultImg;
            return this;
        }

        public ConditionBuilder fuzzyDefaultImg (String ... fuzzyDefaultImg){
            this.fuzzyDefaultImg = solveNullList(fuzzyDefaultImg);
            return this;
        }

        public ConditionBuilder rightFuzzyDefaultImg (List<String> rightFuzzyDefaultImg){
            this.rightFuzzyDefaultImg = rightFuzzyDefaultImg;
            return this;
        }

        public ConditionBuilder rightFuzzyDefaultImg (String ... rightFuzzyDefaultImg){
            this.rightFuzzyDefaultImg = solveNullList(rightFuzzyDefaultImg);
            return this;
        }

        public ConditionBuilder defaultImgList(String ... defaultImg){
            this.defaultImgList = solveNullList(defaultImg);
            return this;
        }

        public ConditionBuilder defaultImgList(List<String> defaultImg){
            this.defaultImgList = defaultImg;
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

        public ConditionBuilder createUserIdBetWeen(Integer createUserIdSt,Integer createUserIdEd){
            this.createUserIdSt = createUserIdSt;
            this.createUserIdEd = createUserIdEd;
            return this;
        }

        public ConditionBuilder createUserIdGreaterEqThan(Integer createUserIdSt){
            this.createUserIdSt = createUserIdSt;
            return this;
        }
        public ConditionBuilder createUserIdLessEqThan(Integer createUserIdEd){
            this.createUserIdEd = createUserIdEd;
            return this;
        }


        public ConditionBuilder createUserIdList(Integer ... createUserId){
            this.createUserIdList = solveNullList(createUserId);
            return this;
        }

        public ConditionBuilder createUserIdList(List<Integer> createUserId){
            this.createUserIdList = createUserId;
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

        private Product obj;

        public Builder(){
            this.obj = new Product();
        }

        public Builder productId(Integer productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder productCategoryId(Integer productCategoryId){
            this.obj.setProductCategoryId(productCategoryId);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder explain(String explain){
            this.obj.setExplain(explain);
            return this;
        }
        public Builder shopPrice(java.math.BigDecimal shopPrice){
            this.obj.setShopPrice(shopPrice);
            return this;
        }
        public Builder price(java.math.BigDecimal price){
            this.obj.setPrice(price);
            return this;
        }
        public Builder hot(Integer hot){
            this.obj.setHot(hot);
            return this;
        }
        public Builder productStatus(Integer productStatus){
            this.obj.setProductStatus(productStatus);
            return this;
        }
        public Builder defaultImg(String defaultImg){
            this.obj.setDefaultImg(defaultImg);
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
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder createUserId(Integer createUserId){
            this.obj.setCreateUserId(createUserId);
            return this;
        }
        public Product build(){return obj;}
    }

}
