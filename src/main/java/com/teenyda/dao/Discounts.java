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
public class Discounts implements Serializable {

    private static final long serialVersionUID = 1601518148172L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer discountsId;

    /**
    * 
    * isNullAble:0
    */
    private Integer discountsCategoryId;

    /**
    * 说明
    * isNullAble:1
    */
    private String explain;

    /**
    * 满足条件的价格
    * isNullAble:1
    */
    private Integer conditions;

    /**
    * 满足条件说明
    * isNullAble:1
    */
    private String conditionsExplain;

    /**
    * 优惠
    * isNullAble:1
    */
    private String discounts;

    /**
    * 会员限制
    * isNullAble:0,defaultVal:0
    */
    private Integer members;


    public void setDiscountsId(Integer discountsId){this.discountsId = discountsId;}

    public Integer getDiscountsId(){return this.discountsId;}

    public void setDiscountsCategoryId(Integer discountsCategoryId){this.discountsCategoryId = discountsCategoryId;}

    public Integer getDiscountsCategoryId(){return this.discountsCategoryId;}

    public void setExplain(String explain){this.explain = explain;}

    public String getExplain(){return this.explain;}

    public void setConditions(Integer conditions){this.conditions = conditions;}

    public Integer getConditions(){return this.conditions;}

    public void setConditionsExplain(String conditionsExplain){this.conditionsExplain = conditionsExplain;}

    public String getConditionsExplain(){return this.conditionsExplain;}

    public void setDiscounts(String discounts){this.discounts = discounts;}

    public String getDiscounts(){return this.discounts;}

    public void setMembers(Integer members){this.members = members;}

    public Integer getMembers(){return this.members;}
    @Override
    public String toString() {
        return "Discounts{" +
                "discountsId='" + discountsId + '\'' +
                "discountsCategoryId='" + discountsCategoryId + '\'' +
                "explain='" + explain + '\'' +
                "conditions='" + conditions + '\'' +
                "conditionsExplain='" + conditionsExplain + '\'' +
                "discounts='" + discounts + '\'' +
                "members='" + members + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Discounts set;

        private ConditionBuilder where;

        public UpdateBuilder set(Discounts set){
            this.set = set;
            return this;
        }

        public Discounts getSet(){
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

    public static class QueryBuilder extends Discounts{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> discountsIdList;

        public List<Integer> getDiscountsIdList(){return this.discountsIdList;}

        private Integer discountsIdSt;

        private Integer discountsIdEd;

        public Integer getDiscountsIdSt(){return this.discountsIdSt;}

        public Integer getDiscountsIdEd(){return this.discountsIdEd;}

        private List<Integer> discountsCategoryIdList;

        public List<Integer> getDiscountsCategoryIdList(){return this.discountsCategoryIdList;}

        private Integer discountsCategoryIdSt;

        private Integer discountsCategoryIdEd;

        public Integer getDiscountsCategoryIdSt(){return this.discountsCategoryIdSt;}

        public Integer getDiscountsCategoryIdEd(){return this.discountsCategoryIdEd;}

        private List<String> explainList;

        public List<String> getExplainList(){return this.explainList;}


        private List<String> fuzzyExplain;

        public List<String> getFuzzyExplain(){return this.fuzzyExplain;}

        private List<String> rightFuzzyExplain;

        public List<String> getRightFuzzyExplain(){return this.rightFuzzyExplain;}
        private List<Integer> conditionsList;

        public List<Integer> getConditionsList(){return this.conditionsList;}

        private Integer conditionsSt;

        private Integer conditionsEd;

        public Integer getConditionsSt(){return this.conditionsSt;}

        public Integer getConditionsEd(){return this.conditionsEd;}

        private List<String> conditionsExplainList;

        public List<String> getConditionsExplainList(){return this.conditionsExplainList;}


        private List<String> fuzzyConditionsExplain;

        public List<String> getFuzzyConditionsExplain(){return this.fuzzyConditionsExplain;}

        private List<String> rightFuzzyConditionsExplain;

        public List<String> getRightFuzzyConditionsExplain(){return this.rightFuzzyConditionsExplain;}
        private List<String> discountsList;

        public List<String> getDiscountsList(){return this.discountsList;}


        private List<String> fuzzyDiscounts;

        public List<String> getFuzzyDiscounts(){return this.fuzzyDiscounts;}

        private List<String> rightFuzzyDiscounts;

        public List<String> getRightFuzzyDiscounts(){return this.rightFuzzyDiscounts;}
        private List<Integer> membersList;

        public List<Integer> getMembersList(){return this.membersList;}

        private Integer membersSt;

        private Integer membersEd;

        public Integer getMembersSt(){return this.membersSt;}

        public Integer getMembersEd(){return this.membersEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder conditionsBetWeen(Integer conditionsSt,Integer conditionsEd){
            this.conditionsSt = conditionsSt;
            this.conditionsEd = conditionsEd;
            return this;
        }

        public QueryBuilder conditionsGreaterEqThan(Integer conditionsSt){
            this.conditionsSt = conditionsSt;
            return this;
        }
        public QueryBuilder conditionsLessEqThan(Integer conditionsEd){
            this.conditionsEd = conditionsEd;
            return this;
        }


        public QueryBuilder conditions(Integer conditions){
            setConditions(conditions);
            return this;
        }

        public QueryBuilder conditionsList(Integer ... conditions){
            this.conditionsList = solveNullList(conditions);
            return this;
        }

        public QueryBuilder conditionsList(List<Integer> conditions){
            this.conditionsList = conditions;
            return this;
        }

        public QueryBuilder fetchConditions(){
            setFetchFields("fetchFields","conditions");
            return this;
        }

        public QueryBuilder excludeConditions(){
            setFetchFields("excludeFields","conditions");
            return this;
        }

        public QueryBuilder fuzzyConditionsExplain (List<String> fuzzyConditionsExplain){
            this.fuzzyConditionsExplain = fuzzyConditionsExplain;
            return this;
        }

        public QueryBuilder fuzzyConditionsExplain (String ... fuzzyConditionsExplain){
            this.fuzzyConditionsExplain = solveNullList(fuzzyConditionsExplain);
            return this;
        }

        public QueryBuilder rightFuzzyConditionsExplain (List<String> rightFuzzyConditionsExplain){
            this.rightFuzzyConditionsExplain = rightFuzzyConditionsExplain;
            return this;
        }

        public QueryBuilder rightFuzzyConditionsExplain (String ... rightFuzzyConditionsExplain){
            this.rightFuzzyConditionsExplain = solveNullList(rightFuzzyConditionsExplain);
            return this;
        }

        public QueryBuilder conditionsExplain(String conditionsExplain){
            setConditionsExplain(conditionsExplain);
            return this;
        }

        public QueryBuilder conditionsExplainList(String ... conditionsExplain){
            this.conditionsExplainList = solveNullList(conditionsExplain);
            return this;
        }

        public QueryBuilder conditionsExplainList(List<String> conditionsExplain){
            this.conditionsExplainList = conditionsExplain;
            return this;
        }

        public QueryBuilder fetchConditionsExplain(){
            setFetchFields("fetchFields","conditionsExplain");
            return this;
        }

        public QueryBuilder excludeConditionsExplain(){
            setFetchFields("excludeFields","conditionsExplain");
            return this;
        }

        public QueryBuilder fuzzyDiscounts (List<String> fuzzyDiscounts){
            this.fuzzyDiscounts = fuzzyDiscounts;
            return this;
        }

        public QueryBuilder fuzzyDiscounts (String ... fuzzyDiscounts){
            this.fuzzyDiscounts = solveNullList(fuzzyDiscounts);
            return this;
        }

        public QueryBuilder rightFuzzyDiscounts (List<String> rightFuzzyDiscounts){
            this.rightFuzzyDiscounts = rightFuzzyDiscounts;
            return this;
        }

        public QueryBuilder rightFuzzyDiscounts (String ... rightFuzzyDiscounts){
            this.rightFuzzyDiscounts = solveNullList(rightFuzzyDiscounts);
            return this;
        }

        public QueryBuilder discounts(String discounts){
            setDiscounts(discounts);
            return this;
        }

        public QueryBuilder discountsList(String ... discounts){
            this.discountsList = solveNullList(discounts);
            return this;
        }

        public QueryBuilder discountsList(List<String> discounts){
            this.discountsList = discounts;
            return this;
        }

        public QueryBuilder fetchDiscounts(){
            setFetchFields("fetchFields","discounts");
            return this;
        }

        public QueryBuilder excludeDiscounts(){
            setFetchFields("excludeFields","discounts");
            return this;
        }

        public QueryBuilder membersBetWeen(Integer membersSt,Integer membersEd){
            this.membersSt = membersSt;
            this.membersEd = membersEd;
            return this;
        }

        public QueryBuilder membersGreaterEqThan(Integer membersSt){
            this.membersSt = membersSt;
            return this;
        }
        public QueryBuilder membersLessEqThan(Integer membersEd){
            this.membersEd = membersEd;
            return this;
        }


        public QueryBuilder members(Integer members){
            setMembers(members);
            return this;
        }

        public QueryBuilder membersList(Integer ... members){
            this.membersList = solveNullList(members);
            return this;
        }

        public QueryBuilder membersList(List<Integer> members){
            this.membersList = members;
            return this;
        }

        public QueryBuilder fetchMembers(){
            setFetchFields("fetchFields","members");
            return this;
        }

        public QueryBuilder excludeMembers(){
            setFetchFields("excludeFields","members");
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

        public Discounts build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> discountsIdList;

        public List<Integer> getDiscountsIdList(){return this.discountsIdList;}

        private Integer discountsIdSt;

        private Integer discountsIdEd;

        public Integer getDiscountsIdSt(){return this.discountsIdSt;}

        public Integer getDiscountsIdEd(){return this.discountsIdEd;}

        private List<Integer> discountsCategoryIdList;

        public List<Integer> getDiscountsCategoryIdList(){return this.discountsCategoryIdList;}

        private Integer discountsCategoryIdSt;

        private Integer discountsCategoryIdEd;

        public Integer getDiscountsCategoryIdSt(){return this.discountsCategoryIdSt;}

        public Integer getDiscountsCategoryIdEd(){return this.discountsCategoryIdEd;}

        private List<String> explainList;

        public List<String> getExplainList(){return this.explainList;}


        private List<String> fuzzyExplain;

        public List<String> getFuzzyExplain(){return this.fuzzyExplain;}

        private List<String> rightFuzzyExplain;

        public List<String> getRightFuzzyExplain(){return this.rightFuzzyExplain;}
        private List<Integer> conditionsList;

        public List<Integer> getConditionsList(){return this.conditionsList;}

        private Integer conditionsSt;

        private Integer conditionsEd;

        public Integer getConditionsSt(){return this.conditionsSt;}

        public Integer getConditionsEd(){return this.conditionsEd;}

        private List<String> conditionsExplainList;

        public List<String> getConditionsExplainList(){return this.conditionsExplainList;}


        private List<String> fuzzyConditionsExplain;

        public List<String> getFuzzyConditionsExplain(){return this.fuzzyConditionsExplain;}

        private List<String> rightFuzzyConditionsExplain;

        public List<String> getRightFuzzyConditionsExplain(){return this.rightFuzzyConditionsExplain;}
        private List<String> discountsList;

        public List<String> getDiscountsList(){return this.discountsList;}


        private List<String> fuzzyDiscounts;

        public List<String> getFuzzyDiscounts(){return this.fuzzyDiscounts;}

        private List<String> rightFuzzyDiscounts;

        public List<String> getRightFuzzyDiscounts(){return this.rightFuzzyDiscounts;}
        private List<Integer> membersList;

        public List<Integer> getMembersList(){return this.membersList;}

        private Integer membersSt;

        private Integer membersEd;

        public Integer getMembersSt(){return this.membersSt;}

        public Integer getMembersEd(){return this.membersEd;}


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

        public ConditionBuilder conditionsBetWeen(Integer conditionsSt,Integer conditionsEd){
            this.conditionsSt = conditionsSt;
            this.conditionsEd = conditionsEd;
            return this;
        }

        public ConditionBuilder conditionsGreaterEqThan(Integer conditionsSt){
            this.conditionsSt = conditionsSt;
            return this;
        }
        public ConditionBuilder conditionsLessEqThan(Integer conditionsEd){
            this.conditionsEd = conditionsEd;
            return this;
        }


        public ConditionBuilder conditionsList(Integer ... conditions){
            this.conditionsList = solveNullList(conditions);
            return this;
        }

        public ConditionBuilder conditionsList(List<Integer> conditions){
            this.conditionsList = conditions;
            return this;
        }

        public ConditionBuilder fuzzyConditionsExplain (List<String> fuzzyConditionsExplain){
            this.fuzzyConditionsExplain = fuzzyConditionsExplain;
            return this;
        }

        public ConditionBuilder fuzzyConditionsExplain (String ... fuzzyConditionsExplain){
            this.fuzzyConditionsExplain = solveNullList(fuzzyConditionsExplain);
            return this;
        }

        public ConditionBuilder rightFuzzyConditionsExplain (List<String> rightFuzzyConditionsExplain){
            this.rightFuzzyConditionsExplain = rightFuzzyConditionsExplain;
            return this;
        }

        public ConditionBuilder rightFuzzyConditionsExplain (String ... rightFuzzyConditionsExplain){
            this.rightFuzzyConditionsExplain = solveNullList(rightFuzzyConditionsExplain);
            return this;
        }

        public ConditionBuilder conditionsExplainList(String ... conditionsExplain){
            this.conditionsExplainList = solveNullList(conditionsExplain);
            return this;
        }

        public ConditionBuilder conditionsExplainList(List<String> conditionsExplain){
            this.conditionsExplainList = conditionsExplain;
            return this;
        }

        public ConditionBuilder fuzzyDiscounts (List<String> fuzzyDiscounts){
            this.fuzzyDiscounts = fuzzyDiscounts;
            return this;
        }

        public ConditionBuilder fuzzyDiscounts (String ... fuzzyDiscounts){
            this.fuzzyDiscounts = solveNullList(fuzzyDiscounts);
            return this;
        }

        public ConditionBuilder rightFuzzyDiscounts (List<String> rightFuzzyDiscounts){
            this.rightFuzzyDiscounts = rightFuzzyDiscounts;
            return this;
        }

        public ConditionBuilder rightFuzzyDiscounts (String ... rightFuzzyDiscounts){
            this.rightFuzzyDiscounts = solveNullList(rightFuzzyDiscounts);
            return this;
        }

        public ConditionBuilder discountsList(String ... discounts){
            this.discountsList = solveNullList(discounts);
            return this;
        }

        public ConditionBuilder discountsList(List<String> discounts){
            this.discountsList = discounts;
            return this;
        }

        public ConditionBuilder membersBetWeen(Integer membersSt,Integer membersEd){
            this.membersSt = membersSt;
            this.membersEd = membersEd;
            return this;
        }

        public ConditionBuilder membersGreaterEqThan(Integer membersSt){
            this.membersSt = membersSt;
            return this;
        }
        public ConditionBuilder membersLessEqThan(Integer membersEd){
            this.membersEd = membersEd;
            return this;
        }


        public ConditionBuilder membersList(Integer ... members){
            this.membersList = solveNullList(members);
            return this;
        }

        public ConditionBuilder membersList(List<Integer> members){
            this.membersList = members;
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

        private Discounts obj;

        public Builder(){
            this.obj = new Discounts();
        }

        public Builder discountsId(Integer discountsId){
            this.obj.setDiscountsId(discountsId);
            return this;
        }
        public Builder discountsCategoryId(Integer discountsCategoryId){
            this.obj.setDiscountsCategoryId(discountsCategoryId);
            return this;
        }
        public Builder explain(String explain){
            this.obj.setExplain(explain);
            return this;
        }
        public Builder conditions(Integer conditions){
            this.obj.setConditions(conditions);
            return this;
        }
        public Builder conditionsExplain(String conditionsExplain){
            this.obj.setConditionsExplain(conditionsExplain);
            return this;
        }
        public Builder discounts(String discounts){
            this.obj.setDiscounts(discounts);
            return this;
        }
        public Builder members(Integer members){
            this.obj.setMembers(members);
            return this;
        }
        public Discounts build(){return obj;}
    }

}
