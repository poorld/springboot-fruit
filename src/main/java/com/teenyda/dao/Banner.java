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
public class Banner implements Serializable {

    private static final long serialVersionUID = 1601517090973L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer bannerId;

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
    * isNullAble:1
    */
    private String desc;


    public void setBannerId(Integer bannerId){this.bannerId = bannerId;}

    public Integer getBannerId(){return this.bannerId;}

    public void setProductId(Integer productId){this.productId = productId;}

    public Integer getProductId(){return this.productId;}

    public void setImage(String image){this.image = image;}

    public String getImage(){return this.image;}

    public void setDesc(String desc){this.desc = desc;}

    public String getDesc(){return this.desc;}
    @Override
    public String toString() {
        return "Banner{" +
                "bannerId='" + bannerId + '\'' +
                "productId='" + productId + '\'' +
                "image='" + image + '\'' +
                "desc='" + desc + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Banner set;

        private ConditionBuilder where;

        public UpdateBuilder set(Banner set){
            this.set = set;
            return this;
        }

        public Banner getSet(){
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

    public static class QueryBuilder extends Banner{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> bannerIdList;

        public List<Integer> getBannerIdList(){return this.bannerIdList;}

        private Integer bannerIdSt;

        private Integer bannerIdEd;

        public Integer getBannerIdSt(){return this.bannerIdSt;}

        public Integer getBannerIdEd(){return this.bannerIdEd;}

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
        private List<String> descList;

        public List<String> getDescList(){return this.descList;}


        private List<String> fuzzyDesc;

        public List<String> getFuzzyDesc(){return this.fuzzyDesc;}

        private List<String> rightFuzzyDesc;

        public List<String> getRightFuzzyDesc(){return this.rightFuzzyDesc;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder bannerIdBetWeen(Integer bannerIdSt,Integer bannerIdEd){
            this.bannerIdSt = bannerIdSt;
            this.bannerIdEd = bannerIdEd;
            return this;
        }

        public QueryBuilder bannerIdGreaterEqThan(Integer bannerIdSt){
            this.bannerIdSt = bannerIdSt;
            return this;
        }
        public QueryBuilder bannerIdLessEqThan(Integer bannerIdEd){
            this.bannerIdEd = bannerIdEd;
            return this;
        }


        public QueryBuilder bannerId(Integer bannerId){
            setBannerId(bannerId);
            return this;
        }

        public QueryBuilder bannerIdList(Integer ... bannerId){
            this.bannerIdList = solveNullList(bannerId);
            return this;
        }

        public QueryBuilder bannerIdList(List<Integer> bannerId){
            this.bannerIdList = bannerId;
            return this;
        }

        public QueryBuilder fetchBannerId(){
            setFetchFields("fetchFields","bannerId");
            return this;
        }

        public QueryBuilder excludeBannerId(){
            setFetchFields("excludeFields","bannerId");
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

        public Banner build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> bannerIdList;

        public List<Integer> getBannerIdList(){return this.bannerIdList;}

        private Integer bannerIdSt;

        private Integer bannerIdEd;

        public Integer getBannerIdSt(){return this.bannerIdSt;}

        public Integer getBannerIdEd(){return this.bannerIdEd;}

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
        private List<String> descList;

        public List<String> getDescList(){return this.descList;}


        private List<String> fuzzyDesc;

        public List<String> getFuzzyDesc(){return this.fuzzyDesc;}

        private List<String> rightFuzzyDesc;

        public List<String> getRightFuzzyDesc(){return this.rightFuzzyDesc;}

        public ConditionBuilder bannerIdBetWeen(Integer bannerIdSt,Integer bannerIdEd){
            this.bannerIdSt = bannerIdSt;
            this.bannerIdEd = bannerIdEd;
            return this;
        }

        public ConditionBuilder bannerIdGreaterEqThan(Integer bannerIdSt){
            this.bannerIdSt = bannerIdSt;
            return this;
        }
        public ConditionBuilder bannerIdLessEqThan(Integer bannerIdEd){
            this.bannerIdEd = bannerIdEd;
            return this;
        }


        public ConditionBuilder bannerIdList(Integer ... bannerId){
            this.bannerIdList = solveNullList(bannerId);
            return this;
        }

        public ConditionBuilder bannerIdList(List<Integer> bannerId){
            this.bannerIdList = bannerId;
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

        private Banner obj;

        public Builder(){
            this.obj = new Banner();
        }

        public Builder bannerId(Integer bannerId){
            this.obj.setBannerId(bannerId);
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
        public Builder desc(String desc){
            this.obj.setDesc(desc);
            return this;
        }
        public Banner build(){return obj;}
    }

}
