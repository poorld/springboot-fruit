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
public class NewProduct implements Serializable {

    private static final long serialVersionUID = 1601518162552L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer newProductId;

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
    private String image;

    /**
    * 
    * isNullAble:0
    */
    private java.math.BigDecimal price;

    /**
    * 
    * isNullAble:1
    */
    private String desc;


    public void setNewProductId(Integer newProductId){this.newProductId = newProductId;}

    public Integer getNewProductId(){return this.newProductId;}

    public void setProductId(Integer productId){this.productId = productId;}

    public Integer getProductId(){return this.productId;}

    public void setImage(String image){this.image = image;}

    public String getImage(){return this.image;}

    public void setPrice(java.math.BigDecimal price){this.price = price;}

    public java.math.BigDecimal getPrice(){return this.price;}

    public void setDesc(String desc){this.desc = desc;}

    public String getDesc(){return this.desc;}
    @Override
    public String toString() {
        return "NewProduct{" +
                "newProductId='" + newProductId + '\'' +
                "productId='" + productId + '\'' +
                "image='" + image + '\'' +
                "price='" + price + '\'' +
                "desc='" + desc + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private NewProduct set;

        private ConditionBuilder where;

        public UpdateBuilder set(NewProduct set){
            this.set = set;
            return this;
        }

        public NewProduct getSet(){
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

    public static class QueryBuilder extends NewProduct{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> newProductIdList;

        public List<Integer> getNewProductIdList(){return this.newProductIdList;}

        private Integer newProductIdSt;

        private Integer newProductIdEd;

        public Integer getNewProductIdSt(){return this.newProductIdSt;}

        public Integer getNewProductIdEd(){return this.newProductIdEd;}

        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

        private List<String> imageList;

        public List<String> getImageList(){return this.imageList;}


        private List<String> fuzzyImage;

        public List<String> getFuzzyImage(){return this.fuzzyImage;}

        private List<String> rightFuzzyImage;

        public List<String> getRightFuzzyImage(){return this.rightFuzzyImage;}
        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<String> descList;

        public List<String> getDescList(){return this.descList;}


        private List<String> fuzzyDesc;

        public List<String> getFuzzyDesc(){return this.fuzzyDesc;}

        private List<String> rightFuzzyDesc;

        public List<String> getRightFuzzyDesc(){return this.rightFuzzyDesc;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder newProductIdBetWeen(Integer newProductIdSt,Integer newProductIdEd){
            this.newProductIdSt = newProductIdSt;
            this.newProductIdEd = newProductIdEd;
            return this;
        }

        public QueryBuilder newProductIdGreaterEqThan(Integer newProductIdSt){
            this.newProductIdSt = newProductIdSt;
            return this;
        }
        public QueryBuilder newProductIdLessEqThan(Integer newProductIdEd){
            this.newProductIdEd = newProductIdEd;
            return this;
        }


        public QueryBuilder newProductId(Integer newProductId){
            setNewProductId(newProductId);
            return this;
        }

        public QueryBuilder newProductIdList(Integer ... newProductId){
            this.newProductIdList = solveNullList(newProductId);
            return this;
        }

        public QueryBuilder newProductIdList(List<Integer> newProductId){
            this.newProductIdList = newProductId;
            return this;
        }

        public QueryBuilder fetchNewProductId(){
            setFetchFields("fetchFields","newProductId");
            return this;
        }

        public QueryBuilder excludeNewProductId(){
            setFetchFields("excludeFields","newProductId");
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

        public QueryBuilder fuzzyDesc (List<String> fuzzyDesc){
            this.fuzzyDesc = fuzzyDesc;
            return this;
        }

        public QueryBuilder fuzzyDesc (String ... fuzzyDesc){
            this.fuzzyDesc = solveNullList(fuzzyDesc);
            return this;
        }

        public QueryBuilder rightFuzzyDesc (List<String> rightFuzzyDesc){
            this.rightFuzzyDesc = rightFuzzyDesc;
            return this;
        }

        public QueryBuilder rightFuzzyDesc (String ... rightFuzzyDesc){
            this.rightFuzzyDesc = solveNullList(rightFuzzyDesc);
            return this;
        }

        public QueryBuilder desc(String desc){
            setDesc(desc);
            return this;
        }

        public QueryBuilder descList(String ... desc){
            this.descList = solveNullList(desc);
            return this;
        }

        public QueryBuilder descList(List<String> desc){
            this.descList = desc;
            return this;
        }

        public QueryBuilder fetchDesc(){
            setFetchFields("fetchFields","desc");
            return this;
        }

        public QueryBuilder excludeDesc(){
            setFetchFields("excludeFields","desc");
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

        public NewProduct build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> newProductIdList;

        public List<Integer> getNewProductIdList(){return this.newProductIdList;}

        private Integer newProductIdSt;

        private Integer newProductIdEd;

        public Integer getNewProductIdSt(){return this.newProductIdSt;}

        public Integer getNewProductIdEd(){return this.newProductIdEd;}

        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

        private List<String> imageList;

        public List<String> getImageList(){return this.imageList;}


        private List<String> fuzzyImage;

        public List<String> getFuzzyImage(){return this.fuzzyImage;}

        private List<String> rightFuzzyImage;

        public List<String> getRightFuzzyImage(){return this.rightFuzzyImage;}
        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<String> descList;

        public List<String> getDescList(){return this.descList;}


        private List<String> fuzzyDesc;

        public List<String> getFuzzyDesc(){return this.fuzzyDesc;}

        private List<String> rightFuzzyDesc;

        public List<String> getRightFuzzyDesc(){return this.rightFuzzyDesc;}

        public ConditionBuilder newProductIdBetWeen(Integer newProductIdSt,Integer newProductIdEd){
            this.newProductIdSt = newProductIdSt;
            this.newProductIdEd = newProductIdEd;
            return this;
        }

        public ConditionBuilder newProductIdGreaterEqThan(Integer newProductIdSt){
            this.newProductIdSt = newProductIdSt;
            return this;
        }
        public ConditionBuilder newProductIdLessEqThan(Integer newProductIdEd){
            this.newProductIdEd = newProductIdEd;
            return this;
        }


        public ConditionBuilder newProductIdList(Integer ... newProductId){
            this.newProductIdList = solveNullList(newProductId);
            return this;
        }

        public ConditionBuilder newProductIdList(List<Integer> newProductId){
            this.newProductIdList = newProductId;
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

        public ConditionBuilder fuzzyDesc (List<String> fuzzyDesc){
            this.fuzzyDesc = fuzzyDesc;
            return this;
        }

        public ConditionBuilder fuzzyDesc (String ... fuzzyDesc){
            this.fuzzyDesc = solveNullList(fuzzyDesc);
            return this;
        }

        public ConditionBuilder rightFuzzyDesc (List<String> rightFuzzyDesc){
            this.rightFuzzyDesc = rightFuzzyDesc;
            return this;
        }

        public ConditionBuilder rightFuzzyDesc (String ... rightFuzzyDesc){
            this.rightFuzzyDesc = solveNullList(rightFuzzyDesc);
            return this;
        }

        public ConditionBuilder descList(String ... desc){
            this.descList = solveNullList(desc);
            return this;
        }

        public ConditionBuilder descList(List<String> desc){
            this.descList = desc;
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

        private NewProduct obj;

        public Builder(){
            this.obj = new NewProduct();
        }

        public Builder newProductId(Integer newProductId){
            this.obj.setNewProductId(newProductId);
            return this;
        }
        public Builder productId(Integer productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder image(String image){
            this.obj.setImage(image);
            return this;
        }
        public Builder price(java.math.BigDecimal price){
            this.obj.setPrice(price);
            return this;
        }
        public Builder desc(String desc){
            this.obj.setDesc(desc);
            return this;
        }
        public NewProduct build(){return obj;}
    }

}
