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
public class ProductDiscounts implements Serializable {

    private static final long serialVersionUID = 1601518179199L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer discountsId;


    public void setProductId(Integer productId){this.productId = productId;}

    public Integer getProductId(){return this.productId;}

    public void setDiscountsId(Integer discountsId){this.discountsId = discountsId;}

    public Integer getDiscountsId(){return this.discountsId;}
    @Override
    public String toString() {
        return "ProductDiscounts{" +
                "productId='" + productId + '\'' +
                "discountsId='" + discountsId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ProductDiscounts set;

        private ConditionBuilder where;

        public UpdateBuilder set(ProductDiscounts set){
            this.set = set;
            return this;
        }

        public ProductDiscounts getSet(){
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

    public static class QueryBuilder extends ProductDiscounts{
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

        private List<Integer> discountsIdList;

        public List<Integer> getDiscountsIdList(){return this.discountsIdList;}

        private Integer discountsIdSt;

        private Integer discountsIdEd;

        public Integer getDiscountsIdSt(){return this.discountsIdSt;}

        public Integer getDiscountsIdEd(){return this.discountsIdEd;}

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

        public QueryBuilder discountsIdBetWeen(Integer discountsIdSt,Integer discountsIdEd){
            this.discountsIdSt = discountsIdSt;
            this.discountsIdEd = discountsIdEd;
            return this;
        }

        public QueryBuilder discountsIdGreaterEqThan(Integer discountsIdSt){
            this.discountsIdSt = discountsIdSt;
            return this;
        }
        public QueryBuilder discountsIdLessEqThan(Integer discountsIdEd){
            this.discountsIdEd = discountsIdEd;
            return this;
        }


        public QueryBuilder discountsId(Integer discountsId){
            setDiscountsId(discountsId);
            return this;
        }

        public QueryBuilder discountsIdList(Integer ... discountsId){
            this.discountsIdList = solveNullList(discountsId);
            return this;
        }

        public QueryBuilder discountsIdList(List<Integer> discountsId){
            this.discountsIdList = discountsId;
            return this;
        }

        public QueryBuilder fetchDiscountsId(){
            setFetchFields("fetchFields","discountsId");
            return this;
        }

        public QueryBuilder excludeDiscountsId(){
            setFetchFields("excludeFields","discountsId");
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

        public ProductDiscounts build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

        private List<Integer> discountsIdList;

        public List<Integer> getDiscountsIdList(){return this.discountsIdList;}

        private Integer discountsIdSt;

        private Integer discountsIdEd;

        public Integer getDiscountsIdSt(){return this.discountsIdSt;}

        public Integer getDiscountsIdEd(){return this.discountsIdEd;}


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

        public ConditionBuilder discountsIdBetWeen(Integer discountsIdSt,Integer discountsIdEd){
            this.discountsIdSt = discountsIdSt;
            this.discountsIdEd = discountsIdEd;
            return this;
        }

        public ConditionBuilder discountsIdGreaterEqThan(Integer discountsIdSt){
            this.discountsIdSt = discountsIdSt;
            return this;
        }
        public ConditionBuilder discountsIdLessEqThan(Integer discountsIdEd){
            this.discountsIdEd = discountsIdEd;
            return this;
        }


        public ConditionBuilder discountsIdList(Integer ... discountsId){
            this.discountsIdList = solveNullList(discountsId);
            return this;
        }

        public ConditionBuilder discountsIdList(List<Integer> discountsId){
            this.discountsIdList = discountsId;
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

        private ProductDiscounts obj;

        public Builder(){
            this.obj = new ProductDiscounts();
        }

        public Builder productId(Integer productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder discountsId(Integer discountsId){
            this.obj.setDiscountsId(discountsId);
            return this;
        }
        public ProductDiscounts build(){return obj;}
    }

}
