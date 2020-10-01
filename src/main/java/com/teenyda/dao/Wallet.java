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
public class Wallet implements Serializable {

    private static final long serialVersionUID = 1601518201783L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer walletId;

    /**
    * 
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 
    * isNullAble:1,defaultVal:0.0
    */
    private java.math.BigDecimal balance;

    /**
    * 
    * isNullAble:1
    */
    private String password;


    public void setWalletId(Integer walletId){this.walletId = walletId;}

    public Integer getWalletId(){return this.walletId;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setBalance(java.math.BigDecimal balance){this.balance = balance;}

    public java.math.BigDecimal getBalance(){return this.balance;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}
    @Override
    public String toString() {
        return "Wallet{" +
                "walletId='" + walletId + '\'' +
                "userId='" + userId + '\'' +
                "balance='" + balance + '\'' +
                "password='" + password + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Wallet set;

        private ConditionBuilder where;

        public UpdateBuilder set(Wallet set){
            this.set = set;
            return this;
        }

        public Wallet getSet(){
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

    public static class QueryBuilder extends Wallet{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> walletIdList;

        public List<Integer> getWalletIdList(){return this.walletIdList;}

        private Integer walletIdSt;

        private Integer walletIdEd;

        public Integer getWalletIdSt(){return this.walletIdSt;}

        public Integer getWalletIdEd(){return this.walletIdEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<java.math.BigDecimal> balanceList;

        public List<java.math.BigDecimal> getBalanceList(){return this.balanceList;}

        private java.math.BigDecimal balanceSt;

        private java.math.BigDecimal balanceEd;

        public java.math.BigDecimal getBalanceSt(){return this.balanceSt;}

        public java.math.BigDecimal getBalanceEd(){return this.balanceEd;}

        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder walletIdBetWeen(Integer walletIdSt,Integer walletIdEd){
            this.walletIdSt = walletIdSt;
            this.walletIdEd = walletIdEd;
            return this;
        }

        public QueryBuilder walletIdGreaterEqThan(Integer walletIdSt){
            this.walletIdSt = walletIdSt;
            return this;
        }
        public QueryBuilder walletIdLessEqThan(Integer walletIdEd){
            this.walletIdEd = walletIdEd;
            return this;
        }


        public QueryBuilder walletId(Integer walletId){
            setWalletId(walletId);
            return this;
        }

        public QueryBuilder walletIdList(Integer ... walletId){
            this.walletIdList = solveNullList(walletId);
            return this;
        }

        public QueryBuilder walletIdList(List<Integer> walletId){
            this.walletIdList = walletId;
            return this;
        }

        public QueryBuilder fetchWalletId(){
            setFetchFields("fetchFields","walletId");
            return this;
        }

        public QueryBuilder excludeWalletId(){
            setFetchFields("excludeFields","walletId");
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

        public QueryBuilder balanceBetWeen(java.math.BigDecimal balanceSt,java.math.BigDecimal balanceEd){
            this.balanceSt = balanceSt;
            this.balanceEd = balanceEd;
            return this;
        }

        public QueryBuilder balanceGreaterEqThan(java.math.BigDecimal balanceSt){
            this.balanceSt = balanceSt;
            return this;
        }
        public QueryBuilder balanceLessEqThan(java.math.BigDecimal balanceEd){
            this.balanceEd = balanceEd;
            return this;
        }


        public QueryBuilder balance(java.math.BigDecimal balance){
            setBalance(balance);
            return this;
        }

        public QueryBuilder balanceList(java.math.BigDecimal ... balance){
            this.balanceList = solveNullList(balance);
            return this;
        }

        public QueryBuilder balanceList(List<java.math.BigDecimal> balance){
            this.balanceList = balance;
            return this;
        }

        public QueryBuilder fetchBalance(){
            setFetchFields("fetchFields","balance");
            return this;
        }

        public QueryBuilder excludeBalance(){
            setFetchFields("excludeFields","balance");
            return this;
        }

        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
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

        public Wallet build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> walletIdList;

        public List<Integer> getWalletIdList(){return this.walletIdList;}

        private Integer walletIdSt;

        private Integer walletIdEd;

        public Integer getWalletIdSt(){return this.walletIdSt;}

        public Integer getWalletIdEd(){return this.walletIdEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<java.math.BigDecimal> balanceList;

        public List<java.math.BigDecimal> getBalanceList(){return this.balanceList;}

        private java.math.BigDecimal balanceSt;

        private java.math.BigDecimal balanceEd;

        public java.math.BigDecimal getBalanceSt(){return this.balanceSt;}

        public java.math.BigDecimal getBalanceEd(){return this.balanceEd;}

        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}

        public ConditionBuilder walletIdBetWeen(Integer walletIdSt,Integer walletIdEd){
            this.walletIdSt = walletIdSt;
            this.walletIdEd = walletIdEd;
            return this;
        }

        public ConditionBuilder walletIdGreaterEqThan(Integer walletIdSt){
            this.walletIdSt = walletIdSt;
            return this;
        }
        public ConditionBuilder walletIdLessEqThan(Integer walletIdEd){
            this.walletIdEd = walletIdEd;
            return this;
        }


        public ConditionBuilder walletIdList(Integer ... walletId){
            this.walletIdList = solveNullList(walletId);
            return this;
        }

        public ConditionBuilder walletIdList(List<Integer> walletId){
            this.walletIdList = walletId;
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

        public ConditionBuilder balanceBetWeen(java.math.BigDecimal balanceSt,java.math.BigDecimal balanceEd){
            this.balanceSt = balanceSt;
            this.balanceEd = balanceEd;
            return this;
        }

        public ConditionBuilder balanceGreaterEqThan(java.math.BigDecimal balanceSt){
            this.balanceSt = balanceSt;
            return this;
        }
        public ConditionBuilder balanceLessEqThan(java.math.BigDecimal balanceEd){
            this.balanceEd = balanceEd;
            return this;
        }


        public ConditionBuilder balanceList(java.math.BigDecimal ... balance){
            this.balanceList = solveNullList(balance);
            return this;
        }

        public ConditionBuilder balanceList(List<java.math.BigDecimal> balance){
            this.balanceList = balance;
            return this;
        }

        public ConditionBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password){
            this.passwordList = password;
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

        private Wallet obj;

        public Builder(){
            this.obj = new Wallet();
        }

        public Builder walletId(Integer walletId){
            this.obj.setWalletId(walletId);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder balance(java.math.BigDecimal balance){
            this.obj.setBalance(balance);
            return this;
        }
        public Builder password(String password){
            this.obj.setPassword(password);
            return this;
        }
        public Wallet build(){return obj;}
    }

}
