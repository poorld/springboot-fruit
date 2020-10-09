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
public class Contact implements Serializable {

    private static final long serialVersionUID = 1601518143616L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer contactId;

    /**
    * 
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 
    * isNullAble:0
    */
    private String name;

    /**
    * 
    * isNullAble:0
    */
    private String mobile;

    /**
    * 
    * isNullAble:0
    */
    private String address;

    /**
    * 1 默认联系人
    * isNullAble:0,defaultVal:0
    */
    private Integer contactFlag;


    public void setContactId(Integer contactId){this.contactId = contactId;}

    public Integer getContactId(){return this.contactId;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setMobile(String mobile){this.mobile = mobile;}

    public String getMobile(){return this.mobile;}

    public void setAddress(String address){this.address = address;}

    public String getAddress(){return this.address;}

    public void setContactFlag(Integer contactFlag){this.contactFlag = contactFlag;}

    public Integer getContactFlag(){return this.contactFlag;}
    @Override
    public String toString() {
        return "Contact{" +
                "contactId='" + contactId + '\'' +
                "userId='" + userId + '\'' +
                "name='" + name + '\'' +
                "mobile='" + mobile + '\'' +
                "address='" + address + '\'' +
                "contactFlag='" + contactFlag + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Contact set;

        private ConditionBuilder where;

        public UpdateBuilder set(Contact set){
            this.set = set;
            return this;
        }

        public Contact getSet(){
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

    public static class QueryBuilder extends Contact{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> contactIdList;

        public List<Integer> getContactIdList(){return this.contactIdList;}

        private Integer contactIdSt;

        private Integer contactIdEd;

        public Integer getContactIdSt(){return this.contactIdSt;}

        public Integer getContactIdEd(){return this.contactIdEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> mobileList;

        public List<String> getMobileList(){return this.mobileList;}


        private List<String> fuzzyMobile;

        public List<String> getFuzzyMobile(){return this.fuzzyMobile;}

        private List<String> rightFuzzyMobile;

        public List<String> getRightFuzzyMobile(){return this.rightFuzzyMobile;}
        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<Integer> contactFlagList;

        public List<Integer> getContactFlagList(){return this.contactFlagList;}

        private Integer contactFlagSt;

        private Integer contactFlagEd;

        public Integer getContactFlagSt(){return this.contactFlagSt;}

        public Integer getContactFlagEd(){return this.contactFlagEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder contactIdBetWeen(Integer contactIdSt,Integer contactIdEd){
            this.contactIdSt = contactIdSt;
            this.contactIdEd = contactIdEd;
            return this;
        }

        public QueryBuilder contactIdGreaterEqThan(Integer contactIdSt){
            this.contactIdSt = contactIdSt;
            return this;
        }
        public QueryBuilder contactIdLessEqThan(Integer contactIdEd){
            this.contactIdEd = contactIdEd;
            return this;
        }


        public QueryBuilder contactId(Integer contactId){
            setContactId(contactId);
            return this;
        }

        public QueryBuilder contactIdList(Integer ... contactId){
            this.contactIdList = solveNullList(contactId);
            return this;
        }

        public QueryBuilder contactIdList(List<Integer> contactId){
            this.contactIdList = contactId;
            return this;
        }

        public QueryBuilder fetchContactId(){
            setFetchFields("fetchFields","contactId");
            return this;
        }

        public QueryBuilder excludeContactId(){
            setFetchFields("excludeFields","contactId");
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

        public QueryBuilder fuzzyMobile (List<String> fuzzyMobile){
            this.fuzzyMobile = fuzzyMobile;
            return this;
        }

        public QueryBuilder fuzzyMobile (String ... fuzzyMobile){
            this.fuzzyMobile = solveNullList(fuzzyMobile);
            return this;
        }

        public QueryBuilder rightFuzzyMobile (List<String> rightFuzzyMobile){
            this.rightFuzzyMobile = rightFuzzyMobile;
            return this;
        }

        public QueryBuilder rightFuzzyMobile (String ... rightFuzzyMobile){
            this.rightFuzzyMobile = solveNullList(rightFuzzyMobile);
            return this;
        }

        public QueryBuilder mobile(String mobile){
            setMobile(mobile);
            return this;
        }

        public QueryBuilder mobileList(String ... mobile){
            this.mobileList = solveNullList(mobile);
            return this;
        }

        public QueryBuilder mobileList(List<String> mobile){
            this.mobileList = mobile;
            return this;
        }

        public QueryBuilder fetchMobile(){
            setFetchFields("fetchFields","mobile");
            return this;
        }

        public QueryBuilder excludeMobile(){
            setFetchFields("excludeFields","mobile");
            return this;
        }

        public QueryBuilder fuzzyAddress (List<String> fuzzyAddress){
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public QueryBuilder fuzzyAddress (String ... fuzzyAddress){
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public QueryBuilder rightFuzzyAddress (List<String> rightFuzzyAddress){
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public QueryBuilder rightFuzzyAddress (String ... rightFuzzyAddress){
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public QueryBuilder address(String address){
            setAddress(address);
            return this;
        }

        public QueryBuilder addressList(String ... address){
            this.addressList = solveNullList(address);
            return this;
        }

        public QueryBuilder addressList(List<String> address){
            this.addressList = address;
            return this;
        }

        public QueryBuilder fetchAddress(){
            setFetchFields("fetchFields","address");
            return this;
        }

        public QueryBuilder excludeAddress(){
            setFetchFields("excludeFields","address");
            return this;
        }

        public QueryBuilder contactFlagBetWeen(Integer contactFlagSt,Integer contactFlagEd){
            this.contactFlagSt = contactFlagSt;
            this.contactFlagEd = contactFlagEd;
            return this;
        }

        public QueryBuilder contactFlagGreaterEqThan(Integer contactFlagSt){
            this.contactFlagSt = contactFlagSt;
            return this;
        }
        public QueryBuilder contactFlagLessEqThan(Integer contactFlagEd){
            this.contactFlagEd = contactFlagEd;
            return this;
        }


        public QueryBuilder contactFlag(Integer contactFlag){
            setContactFlag(contactFlag);
            return this;
        }

        public QueryBuilder contactFlagList(Integer ... contactFlag){
            this.contactFlagList = solveNullList(contactFlag);
            return this;
        }

        public QueryBuilder contactFlagList(List<Integer> contactFlag){
            this.contactFlagList = contactFlag;
            return this;
        }

        public QueryBuilder fetchContactFlag(){
            setFetchFields("fetchFields","contactFlag");
            return this;
        }

        public QueryBuilder excludeContactFlag(){
            setFetchFields("excludeFields","contactFlag");
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

        public Contact build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> contactIdList;

        public List<Integer> getContactIdList(){return this.contactIdList;}

        private Integer contactIdSt;

        private Integer contactIdEd;

        public Integer getContactIdSt(){return this.contactIdSt;}

        public Integer getContactIdEd(){return this.contactIdEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> mobileList;

        public List<String> getMobileList(){return this.mobileList;}


        private List<String> fuzzyMobile;

        public List<String> getFuzzyMobile(){return this.fuzzyMobile;}

        private List<String> rightFuzzyMobile;

        public List<String> getRightFuzzyMobile(){return this.rightFuzzyMobile;}
        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<Integer> contactFlagList;

        public List<Integer> getContactFlagList(){return this.contactFlagList;}

        private Integer contactFlagSt;

        private Integer contactFlagEd;

        public Integer getContactFlagSt(){return this.contactFlagSt;}

        public Integer getContactFlagEd(){return this.contactFlagEd;}


        public ConditionBuilder contactIdBetWeen(Integer contactIdSt,Integer contactIdEd){
            this.contactIdSt = contactIdSt;
            this.contactIdEd = contactIdEd;
            return this;
        }

        public ConditionBuilder contactIdGreaterEqThan(Integer contactIdSt){
            this.contactIdSt = contactIdSt;
            return this;
        }
        public ConditionBuilder contactIdLessEqThan(Integer contactIdEd){
            this.contactIdEd = contactIdEd;
            return this;
        }


        public ConditionBuilder contactIdList(Integer ... contactId){
            this.contactIdList = solveNullList(contactId);
            return this;
        }

        public ConditionBuilder contactIdList(List<Integer> contactId){
            this.contactIdList = contactId;
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

        public ConditionBuilder fuzzyMobile (List<String> fuzzyMobile){
            this.fuzzyMobile = fuzzyMobile;
            return this;
        }

        public ConditionBuilder fuzzyMobile (String ... fuzzyMobile){
            this.fuzzyMobile = solveNullList(fuzzyMobile);
            return this;
        }

        public ConditionBuilder rightFuzzyMobile (List<String> rightFuzzyMobile){
            this.rightFuzzyMobile = rightFuzzyMobile;
            return this;
        }

        public ConditionBuilder rightFuzzyMobile (String ... rightFuzzyMobile){
            this.rightFuzzyMobile = solveNullList(rightFuzzyMobile);
            return this;
        }

        public ConditionBuilder mobileList(String ... mobile){
            this.mobileList = solveNullList(mobile);
            return this;
        }

        public ConditionBuilder mobileList(List<String> mobile){
            this.mobileList = mobile;
            return this;
        }

        public ConditionBuilder fuzzyAddress (List<String> fuzzyAddress){
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public ConditionBuilder fuzzyAddress (String ... fuzzyAddress){
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyAddress (List<String> rightFuzzyAddress){
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyAddress (String ... rightFuzzyAddress){
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public ConditionBuilder addressList(String ... address){
            this.addressList = solveNullList(address);
            return this;
        }

        public ConditionBuilder addressList(List<String> address){
            this.addressList = address;
            return this;
        }

        public ConditionBuilder contactFlagBetWeen(Integer contactFlagSt,Integer contactFlagEd){
            this.contactFlagSt = contactFlagSt;
            this.contactFlagEd = contactFlagEd;
            return this;
        }

        public ConditionBuilder contactFlagGreaterEqThan(Integer contactFlagSt){
            this.contactFlagSt = contactFlagSt;
            return this;
        }
        public ConditionBuilder contactFlagLessEqThan(Integer contactFlagEd){
            this.contactFlagEd = contactFlagEd;
            return this;
        }


        public ConditionBuilder contactFlagList(Integer ... contactFlag){
            this.contactFlagList = solveNullList(contactFlag);
            return this;
        }

        public ConditionBuilder contactFlagList(List<Integer> contactFlag){
            this.contactFlagList = contactFlag;
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

        private Contact obj;

        public Builder(){
            this.obj = new Contact();
        }

        public Builder contactId(Integer contactId){
            this.obj.setContactId(contactId);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder mobile(String mobile){
            this.obj.setMobile(mobile);
            return this;
        }
        public Builder address(String address){
            this.obj.setAddress(address);
            return this;
        }
        public Builder contactFlag(Integer contactFlag){
            this.obj.setContactFlag(contactFlag);
            return this;
        }
        public Contact build(){return obj;}
    }

}
