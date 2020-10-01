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
public class Members implements Serializable {

    private static final long serialVersionUID = 1601518159014L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer membersId;

    /**
    * 
    * isNullAble:0
    */
    private String name;

    /**
    * 等级
    * isNullAble:0
    */
    private Integer level;

    /**
    * 购物折扣
    * isNullAble:0
    */
    private Integer discount;

    /**
    * 配送优惠
    * isNullAble:0
    */
    private Integer distribution;

    /**
    * 充值优惠
    * isNullAble:0
    */
    private Integer topup;

    /**
    * 价格/月
    * isNullAble:0
    */
    private Integer price;


    public void setMembersId(Integer membersId){this.membersId = membersId;}

    public Integer getMembersId(){return this.membersId;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setLevel(Integer level){this.level = level;}

    public Integer getLevel(){return this.level;}

    public void setDiscount(Integer discount){this.discount = discount;}

    public Integer getDiscount(){return this.discount;}

    public void setDistribution(Integer distribution){this.distribution = distribution;}

    public Integer getDistribution(){return this.distribution;}

    public void setTopup(Integer topup){this.topup = topup;}

    public Integer getTopup(){return this.topup;}

    public void setPrice(Integer price){this.price = price;}

    public Integer getPrice(){return this.price;}
    @Override
    public String toString() {
        return "Members{" +
                "membersId='" + membersId + '\'' +
                "name='" + name + '\'' +
                "level='" + level + '\'' +
                "discount='" + discount + '\'' +
                "distribution='" + distribution + '\'' +
                "topup='" + topup + '\'' +
                "price='" + price + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Members set;

        private ConditionBuilder where;

        public UpdateBuilder set(Members set){
            this.set = set;
            return this;
        }

        public Members getSet(){
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

    public static class QueryBuilder extends Members{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> membersIdList;

        public List<Integer> getMembersIdList(){return this.membersIdList;}

        private Integer membersIdSt;

        private Integer membersIdEd;

        public Integer getMembersIdSt(){return this.membersIdSt;}

        public Integer getMembersIdEd(){return this.membersIdEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> levelList;

        public List<Integer> getLevelList(){return this.levelList;}

        private Integer levelSt;

        private Integer levelEd;

        public Integer getLevelSt(){return this.levelSt;}

        public Integer getLevelEd(){return this.levelEd;}

        private List<Integer> discountList;

        public List<Integer> getDiscountList(){return this.discountList;}

        private Integer discountSt;

        private Integer discountEd;

        public Integer getDiscountSt(){return this.discountSt;}

        public Integer getDiscountEd(){return this.discountEd;}

        private List<Integer> distributionList;

        public List<Integer> getDistributionList(){return this.distributionList;}

        private Integer distributionSt;

        private Integer distributionEd;

        public Integer getDistributionSt(){return this.distributionSt;}

        public Integer getDistributionEd(){return this.distributionEd;}

        private List<Integer> topupList;

        public List<Integer> getTopupList(){return this.topupList;}

        private Integer topupSt;

        private Integer topupEd;

        public Integer getTopupSt(){return this.topupSt;}

        public Integer getTopupEd(){return this.topupEd;}

        private List<Integer> priceList;

        public List<Integer> getPriceList(){return this.priceList;}

        private Integer priceSt;

        private Integer priceEd;

        public Integer getPriceSt(){return this.priceSt;}

        public Integer getPriceEd(){return this.priceEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder membersIdBetWeen(Integer membersIdSt,Integer membersIdEd){
            this.membersIdSt = membersIdSt;
            this.membersIdEd = membersIdEd;
            return this;
        }

        public QueryBuilder membersIdGreaterEqThan(Integer membersIdSt){
            this.membersIdSt = membersIdSt;
            return this;
        }
        public QueryBuilder membersIdLessEqThan(Integer membersIdEd){
            this.membersIdEd = membersIdEd;
            return this;
        }


        public QueryBuilder membersId(Integer membersId){
            setMembersId(membersId);
            return this;
        }

        public QueryBuilder membersIdList(Integer ... membersId){
            this.membersIdList = solveNullList(membersId);
            return this;
        }

        public QueryBuilder membersIdList(List<Integer> membersId){
            this.membersIdList = membersId;
            return this;
        }

        public QueryBuilder fetchMembersId(){
            setFetchFields("fetchFields","membersId");
            return this;
        }

        public QueryBuilder excludeMembersId(){
            setFetchFields("excludeFields","membersId");
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

        public QueryBuilder levelBetWeen(Integer levelSt,Integer levelEd){
            this.levelSt = levelSt;
            this.levelEd = levelEd;
            return this;
        }

        public QueryBuilder levelGreaterEqThan(Integer levelSt){
            this.levelSt = levelSt;
            return this;
        }
        public QueryBuilder levelLessEqThan(Integer levelEd){
            this.levelEd = levelEd;
            return this;
        }


        public QueryBuilder level(Integer level){
            setLevel(level);
            return this;
        }

        public QueryBuilder levelList(Integer ... level){
            this.levelList = solveNullList(level);
            return this;
        }

        public QueryBuilder levelList(List<Integer> level){
            this.levelList = level;
            return this;
        }

        public QueryBuilder fetchLevel(){
            setFetchFields("fetchFields","level");
            return this;
        }

        public QueryBuilder excludeLevel(){
            setFetchFields("excludeFields","level");
            return this;
        }

        public QueryBuilder discountBetWeen(Integer discountSt,Integer discountEd){
            this.discountSt = discountSt;
            this.discountEd = discountEd;
            return this;
        }

        public QueryBuilder discountGreaterEqThan(Integer discountSt){
            this.discountSt = discountSt;
            return this;
        }
        public QueryBuilder discountLessEqThan(Integer discountEd){
            this.discountEd = discountEd;
            return this;
        }


        public QueryBuilder discount(Integer discount){
            setDiscount(discount);
            return this;
        }

        public QueryBuilder discountList(Integer ... discount){
            this.discountList = solveNullList(discount);
            return this;
        }

        public QueryBuilder discountList(List<Integer> discount){
            this.discountList = discount;
            return this;
        }

        public QueryBuilder fetchDiscount(){
            setFetchFields("fetchFields","discount");
            return this;
        }

        public QueryBuilder excludeDiscount(){
            setFetchFields("excludeFields","discount");
            return this;
        }

        public QueryBuilder distributionBetWeen(Integer distributionSt,Integer distributionEd){
            this.distributionSt = distributionSt;
            this.distributionEd = distributionEd;
            return this;
        }

        public QueryBuilder distributionGreaterEqThan(Integer distributionSt){
            this.distributionSt = distributionSt;
            return this;
        }
        public QueryBuilder distributionLessEqThan(Integer distributionEd){
            this.distributionEd = distributionEd;
            return this;
        }


        public QueryBuilder distribution(Integer distribution){
            setDistribution(distribution);
            return this;
        }

        public QueryBuilder distributionList(Integer ... distribution){
            this.distributionList = solveNullList(distribution);
            return this;
        }

        public QueryBuilder distributionList(List<Integer> distribution){
            this.distributionList = distribution;
            return this;
        }

        public QueryBuilder fetchDistribution(){
            setFetchFields("fetchFields","distribution");
            return this;
        }

        public QueryBuilder excludeDistribution(){
            setFetchFields("excludeFields","distribution");
            return this;
        }

        public QueryBuilder topupBetWeen(Integer topupSt,Integer topupEd){
            this.topupSt = topupSt;
            this.topupEd = topupEd;
            return this;
        }

        public QueryBuilder topupGreaterEqThan(Integer topupSt){
            this.topupSt = topupSt;
            return this;
        }
        public QueryBuilder topupLessEqThan(Integer topupEd){
            this.topupEd = topupEd;
            return this;
        }


        public QueryBuilder topup(Integer topup){
            setTopup(topup);
            return this;
        }

        public QueryBuilder topupList(Integer ... topup){
            this.topupList = solveNullList(topup);
            return this;
        }

        public QueryBuilder topupList(List<Integer> topup){
            this.topupList = topup;
            return this;
        }

        public QueryBuilder fetchTopup(){
            setFetchFields("fetchFields","topup");
            return this;
        }

        public QueryBuilder excludeTopup(){
            setFetchFields("excludeFields","topup");
            return this;
        }

        public QueryBuilder priceBetWeen(Integer priceSt,Integer priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public QueryBuilder priceGreaterEqThan(Integer priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public QueryBuilder priceLessEqThan(Integer priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public QueryBuilder price(Integer price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(Integer ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public QueryBuilder priceList(List<Integer> price){
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

        public Members build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> membersIdList;

        public List<Integer> getMembersIdList(){return this.membersIdList;}

        private Integer membersIdSt;

        private Integer membersIdEd;

        public Integer getMembersIdSt(){return this.membersIdSt;}

        public Integer getMembersIdEd(){return this.membersIdEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> levelList;

        public List<Integer> getLevelList(){return this.levelList;}

        private Integer levelSt;

        private Integer levelEd;

        public Integer getLevelSt(){return this.levelSt;}

        public Integer getLevelEd(){return this.levelEd;}

        private List<Integer> discountList;

        public List<Integer> getDiscountList(){return this.discountList;}

        private Integer discountSt;

        private Integer discountEd;

        public Integer getDiscountSt(){return this.discountSt;}

        public Integer getDiscountEd(){return this.discountEd;}

        private List<Integer> distributionList;

        public List<Integer> getDistributionList(){return this.distributionList;}

        private Integer distributionSt;

        private Integer distributionEd;

        public Integer getDistributionSt(){return this.distributionSt;}

        public Integer getDistributionEd(){return this.distributionEd;}

        private List<Integer> topupList;

        public List<Integer> getTopupList(){return this.topupList;}

        private Integer topupSt;

        private Integer topupEd;

        public Integer getTopupSt(){return this.topupSt;}

        public Integer getTopupEd(){return this.topupEd;}

        private List<Integer> priceList;

        public List<Integer> getPriceList(){return this.priceList;}

        private Integer priceSt;

        private Integer priceEd;

        public Integer getPriceSt(){return this.priceSt;}

        public Integer getPriceEd(){return this.priceEd;}


        public ConditionBuilder membersIdBetWeen(Integer membersIdSt,Integer membersIdEd){
            this.membersIdSt = membersIdSt;
            this.membersIdEd = membersIdEd;
            return this;
        }

        public ConditionBuilder membersIdGreaterEqThan(Integer membersIdSt){
            this.membersIdSt = membersIdSt;
            return this;
        }
        public ConditionBuilder membersIdLessEqThan(Integer membersIdEd){
            this.membersIdEd = membersIdEd;
            return this;
        }


        public ConditionBuilder membersIdList(Integer ... membersId){
            this.membersIdList = solveNullList(membersId);
            return this;
        }

        public ConditionBuilder membersIdList(List<Integer> membersId){
            this.membersIdList = membersId;
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

        public ConditionBuilder levelBetWeen(Integer levelSt,Integer levelEd){
            this.levelSt = levelSt;
            this.levelEd = levelEd;
            return this;
        }

        public ConditionBuilder levelGreaterEqThan(Integer levelSt){
            this.levelSt = levelSt;
            return this;
        }
        public ConditionBuilder levelLessEqThan(Integer levelEd){
            this.levelEd = levelEd;
            return this;
        }


        public ConditionBuilder levelList(Integer ... level){
            this.levelList = solveNullList(level);
            return this;
        }

        public ConditionBuilder levelList(List<Integer> level){
            this.levelList = level;
            return this;
        }

        public ConditionBuilder discountBetWeen(Integer discountSt,Integer discountEd){
            this.discountSt = discountSt;
            this.discountEd = discountEd;
            return this;
        }

        public ConditionBuilder discountGreaterEqThan(Integer discountSt){
            this.discountSt = discountSt;
            return this;
        }
        public ConditionBuilder discountLessEqThan(Integer discountEd){
            this.discountEd = discountEd;
            return this;
        }


        public ConditionBuilder discountList(Integer ... discount){
            this.discountList = solveNullList(discount);
            return this;
        }

        public ConditionBuilder discountList(List<Integer> discount){
            this.discountList = discount;
            return this;
        }

        public ConditionBuilder distributionBetWeen(Integer distributionSt,Integer distributionEd){
            this.distributionSt = distributionSt;
            this.distributionEd = distributionEd;
            return this;
        }

        public ConditionBuilder distributionGreaterEqThan(Integer distributionSt){
            this.distributionSt = distributionSt;
            return this;
        }
        public ConditionBuilder distributionLessEqThan(Integer distributionEd){
            this.distributionEd = distributionEd;
            return this;
        }


        public ConditionBuilder distributionList(Integer ... distribution){
            this.distributionList = solveNullList(distribution);
            return this;
        }

        public ConditionBuilder distributionList(List<Integer> distribution){
            this.distributionList = distribution;
            return this;
        }

        public ConditionBuilder topupBetWeen(Integer topupSt,Integer topupEd){
            this.topupSt = topupSt;
            this.topupEd = topupEd;
            return this;
        }

        public ConditionBuilder topupGreaterEqThan(Integer topupSt){
            this.topupSt = topupSt;
            return this;
        }
        public ConditionBuilder topupLessEqThan(Integer topupEd){
            this.topupEd = topupEd;
            return this;
        }


        public ConditionBuilder topupList(Integer ... topup){
            this.topupList = solveNullList(topup);
            return this;
        }

        public ConditionBuilder topupList(List<Integer> topup){
            this.topupList = topup;
            return this;
        }

        public ConditionBuilder priceBetWeen(Integer priceSt,Integer priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public ConditionBuilder priceGreaterEqThan(Integer priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public ConditionBuilder priceLessEqThan(Integer priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public ConditionBuilder priceList(Integer ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public ConditionBuilder priceList(List<Integer> price){
            this.priceList = price;
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

        private Members obj;

        public Builder(){
            this.obj = new Members();
        }

        public Builder membersId(Integer membersId){
            this.obj.setMembersId(membersId);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder level(Integer level){
            this.obj.setLevel(level);
            return this;
        }
        public Builder discount(Integer discount){
            this.obj.setDiscount(discount);
            return this;
        }
        public Builder distribution(Integer distribution){
            this.obj.setDistribution(distribution);
            return this;
        }
        public Builder topup(Integer topup){
            this.obj.setTopup(topup);
            return this;
        }
        public Builder price(Integer price){
            this.obj.setPrice(price);
            return this;
        }
        public Members build(){return obj;}
    }

}
