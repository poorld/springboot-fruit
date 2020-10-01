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
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1601518165799L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String orderNum;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer paymentFlag;

    /**
    * 
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 
    * isNullAble:1
    */
    private String contactName;

    /**
    * 
    * isNullAble:1
    */
    private String contactMobile;

    /**
    * 
    * isNullAble:1
    */
    private String contactAddress;

    /**
    * 
    * isNullAble:1
    */
    private String message;

    /**
    * 
    * isNullAble:1
    */
    private Integer status;

    /**
    * 
    * isNullAble:0
    */
    private Integer type;

    /**
    * 
    * isNullAble:1
    */
    private Integer paymentType;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;


    public void setOrderNum(String orderNum){this.orderNum = orderNum;}

    public String getOrderNum(){return this.orderNum;}

    public void setPaymentFlag(Integer paymentFlag){this.paymentFlag = paymentFlag;}

    public Integer getPaymentFlag(){return this.paymentFlag;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setContactName(String contactName){this.contactName = contactName;}

    public String getContactName(){return this.contactName;}

    public void setContactMobile(String contactMobile){this.contactMobile = contactMobile;}

    public String getContactMobile(){return this.contactMobile;}

    public void setContactAddress(String contactAddress){this.contactAddress = contactAddress;}

    public String getContactAddress(){return this.contactAddress;}

    public void setMessage(String message){this.message = message;}

    public String getMessage(){return this.message;}

    public void setStatus(Integer status){this.status = status;}

    public Integer getStatus(){return this.status;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}

    public void setPaymentType(Integer paymentType){this.paymentType = paymentType;}

    public Integer getPaymentType(){return this.paymentType;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}
    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderNum='" + orderNum + '\'' +
                "paymentFlag='" + paymentFlag + '\'' +
                "userId='" + userId + '\'' +
                "contactName='" + contactName + '\'' +
                "contactMobile='" + contactMobile + '\'' +
                "contactAddress='" + contactAddress + '\'' +
                "message='" + message + '\'' +
                "status='" + status + '\'' +
                "type='" + type + '\'' +
                "paymentType='" + paymentType + '\'' +
                "createTime='" + createTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private OrderInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(OrderInfo set){
            this.set = set;
            return this;
        }

        public OrderInfo getSet(){
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

    public static class QueryBuilder extends OrderInfo{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> orderNumList;

        public List<String> getOrderNumList(){return this.orderNumList;}


        private List<String> fuzzyOrderNum;

        public List<String> getFuzzyOrderNum(){return this.fuzzyOrderNum;}

        private List<String> rightFuzzyOrderNum;

        public List<String> getRightFuzzyOrderNum(){return this.rightFuzzyOrderNum;}
        private List<Integer> paymentFlagList;

        public List<Integer> getPaymentFlagList(){return this.paymentFlagList;}

        private Integer paymentFlagSt;

        private Integer paymentFlagEd;

        public Integer getPaymentFlagSt(){return this.paymentFlagSt;}

        public Integer getPaymentFlagEd(){return this.paymentFlagEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> contactNameList;

        public List<String> getContactNameList(){return this.contactNameList;}


        private List<String> fuzzyContactName;

        public List<String> getFuzzyContactName(){return this.fuzzyContactName;}

        private List<String> rightFuzzyContactName;

        public List<String> getRightFuzzyContactName(){return this.rightFuzzyContactName;}
        private List<String> contactMobileList;

        public List<String> getContactMobileList(){return this.contactMobileList;}


        private List<String> fuzzyContactMobile;

        public List<String> getFuzzyContactMobile(){return this.fuzzyContactMobile;}

        private List<String> rightFuzzyContactMobile;

        public List<String> getRightFuzzyContactMobile(){return this.rightFuzzyContactMobile;}
        private List<String> contactAddressList;

        public List<String> getContactAddressList(){return this.contactAddressList;}


        private List<String> fuzzyContactAddress;

        public List<String> getFuzzyContactAddress(){return this.fuzzyContactAddress;}

        private List<String> rightFuzzyContactAddress;

        public List<String> getRightFuzzyContactAddress(){return this.rightFuzzyContactAddress;}
        private List<String> messageList;

        public List<String> getMessageList(){return this.messageList;}


        private List<String> fuzzyMessage;

        public List<String> getFuzzyMessage(){return this.fuzzyMessage;}

        private List<String> rightFuzzyMessage;

        public List<String> getRightFuzzyMessage(){return this.rightFuzzyMessage;}
        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> paymentTypeList;

        public List<Integer> getPaymentTypeList(){return this.paymentTypeList;}

        private Integer paymentTypeSt;

        private Integer paymentTypeEd;

        public Integer getPaymentTypeSt(){return this.paymentTypeSt;}

        public Integer getPaymentTypeEd(){return this.paymentTypeEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder paymentFlagBetWeen(Integer paymentFlagSt,Integer paymentFlagEd){
            this.paymentFlagSt = paymentFlagSt;
            this.paymentFlagEd = paymentFlagEd;
            return this;
        }

        public QueryBuilder paymentFlagGreaterEqThan(Integer paymentFlagSt){
            this.paymentFlagSt = paymentFlagSt;
            return this;
        }
        public QueryBuilder paymentFlagLessEqThan(Integer paymentFlagEd){
            this.paymentFlagEd = paymentFlagEd;
            return this;
        }


        public QueryBuilder paymentFlag(Integer paymentFlag){
            setPaymentFlag(paymentFlag);
            return this;
        }

        public QueryBuilder paymentFlagList(Integer ... paymentFlag){
            this.paymentFlagList = solveNullList(paymentFlag);
            return this;
        }

        public QueryBuilder paymentFlagList(List<Integer> paymentFlag){
            this.paymentFlagList = paymentFlag;
            return this;
        }

        public QueryBuilder fetchPaymentFlag(){
            setFetchFields("fetchFields","paymentFlag");
            return this;
        }

        public QueryBuilder excludePaymentFlag(){
            setFetchFields("excludeFields","paymentFlag");
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

        public QueryBuilder fuzzyContactName (List<String> fuzzyContactName){
            this.fuzzyContactName = fuzzyContactName;
            return this;
        }

        public QueryBuilder fuzzyContactName (String ... fuzzyContactName){
            this.fuzzyContactName = solveNullList(fuzzyContactName);
            return this;
        }

        public QueryBuilder rightFuzzyContactName (List<String> rightFuzzyContactName){
            this.rightFuzzyContactName = rightFuzzyContactName;
            return this;
        }

        public QueryBuilder rightFuzzyContactName (String ... rightFuzzyContactName){
            this.rightFuzzyContactName = solveNullList(rightFuzzyContactName);
            return this;
        }

        public QueryBuilder contactName(String contactName){
            setContactName(contactName);
            return this;
        }

        public QueryBuilder contactNameList(String ... contactName){
            this.contactNameList = solveNullList(contactName);
            return this;
        }

        public QueryBuilder contactNameList(List<String> contactName){
            this.contactNameList = contactName;
            return this;
        }

        public QueryBuilder fetchContactName(){
            setFetchFields("fetchFields","contactName");
            return this;
        }

        public QueryBuilder excludeContactName(){
            setFetchFields("excludeFields","contactName");
            return this;
        }

        public QueryBuilder fuzzyContactMobile (List<String> fuzzyContactMobile){
            this.fuzzyContactMobile = fuzzyContactMobile;
            return this;
        }

        public QueryBuilder fuzzyContactMobile (String ... fuzzyContactMobile){
            this.fuzzyContactMobile = solveNullList(fuzzyContactMobile);
            return this;
        }

        public QueryBuilder rightFuzzyContactMobile (List<String> rightFuzzyContactMobile){
            this.rightFuzzyContactMobile = rightFuzzyContactMobile;
            return this;
        }

        public QueryBuilder rightFuzzyContactMobile (String ... rightFuzzyContactMobile){
            this.rightFuzzyContactMobile = solveNullList(rightFuzzyContactMobile);
            return this;
        }

        public QueryBuilder contactMobile(String contactMobile){
            setContactMobile(contactMobile);
            return this;
        }

        public QueryBuilder contactMobileList(String ... contactMobile){
            this.contactMobileList = solveNullList(contactMobile);
            return this;
        }

        public QueryBuilder contactMobileList(List<String> contactMobile){
            this.contactMobileList = contactMobile;
            return this;
        }

        public QueryBuilder fetchContactMobile(){
            setFetchFields("fetchFields","contactMobile");
            return this;
        }

        public QueryBuilder excludeContactMobile(){
            setFetchFields("excludeFields","contactMobile");
            return this;
        }

        public QueryBuilder fuzzyContactAddress (List<String> fuzzyContactAddress){
            this.fuzzyContactAddress = fuzzyContactAddress;
            return this;
        }

        public QueryBuilder fuzzyContactAddress (String ... fuzzyContactAddress){
            this.fuzzyContactAddress = solveNullList(fuzzyContactAddress);
            return this;
        }

        public QueryBuilder rightFuzzyContactAddress (List<String> rightFuzzyContactAddress){
            this.rightFuzzyContactAddress = rightFuzzyContactAddress;
            return this;
        }

        public QueryBuilder rightFuzzyContactAddress (String ... rightFuzzyContactAddress){
            this.rightFuzzyContactAddress = solveNullList(rightFuzzyContactAddress);
            return this;
        }

        public QueryBuilder contactAddress(String contactAddress){
            setContactAddress(contactAddress);
            return this;
        }

        public QueryBuilder contactAddressList(String ... contactAddress){
            this.contactAddressList = solveNullList(contactAddress);
            return this;
        }

        public QueryBuilder contactAddressList(List<String> contactAddress){
            this.contactAddressList = contactAddress;
            return this;
        }

        public QueryBuilder fetchContactAddress(){
            setFetchFields("fetchFields","contactAddress");
            return this;
        }

        public QueryBuilder excludeContactAddress(){
            setFetchFields("excludeFields","contactAddress");
            return this;
        }

        public QueryBuilder fuzzyMessage (List<String> fuzzyMessage){
            this.fuzzyMessage = fuzzyMessage;
            return this;
        }

        public QueryBuilder fuzzyMessage (String ... fuzzyMessage){
            this.fuzzyMessage = solveNullList(fuzzyMessage);
            return this;
        }

        public QueryBuilder rightFuzzyMessage (List<String> rightFuzzyMessage){
            this.rightFuzzyMessage = rightFuzzyMessage;
            return this;
        }

        public QueryBuilder rightFuzzyMessage (String ... rightFuzzyMessage){
            this.rightFuzzyMessage = solveNullList(rightFuzzyMessage);
            return this;
        }

        public QueryBuilder message(String message){
            setMessage(message);
            return this;
        }

        public QueryBuilder messageList(String ... message){
            this.messageList = solveNullList(message);
            return this;
        }

        public QueryBuilder messageList(List<String> message){
            this.messageList = message;
            return this;
        }

        public QueryBuilder fetchMessage(){
            setFetchFields("fetchFields","message");
            return this;
        }

        public QueryBuilder excludeMessage(){
            setFetchFields("excludeFields","message");
            return this;
        }

        public QueryBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public QueryBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public QueryBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public QueryBuilder status(Integer status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public QueryBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
            return this;
        }

        public QueryBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public QueryBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public QueryBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public QueryBuilder type(Integer type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }

        public QueryBuilder paymentTypeBetWeen(Integer paymentTypeSt,Integer paymentTypeEd){
            this.paymentTypeSt = paymentTypeSt;
            this.paymentTypeEd = paymentTypeEd;
            return this;
        }

        public QueryBuilder paymentTypeGreaterEqThan(Integer paymentTypeSt){
            this.paymentTypeSt = paymentTypeSt;
            return this;
        }
        public QueryBuilder paymentTypeLessEqThan(Integer paymentTypeEd){
            this.paymentTypeEd = paymentTypeEd;
            return this;
        }


        public QueryBuilder paymentType(Integer paymentType){
            setPaymentType(paymentType);
            return this;
        }

        public QueryBuilder paymentTypeList(Integer ... paymentType){
            this.paymentTypeList = solveNullList(paymentType);
            return this;
        }

        public QueryBuilder paymentTypeList(List<Integer> paymentType){
            this.paymentTypeList = paymentType;
            return this;
        }

        public QueryBuilder fetchPaymentType(){
            setFetchFields("fetchFields","paymentType");
            return this;
        }

        public QueryBuilder excludePaymentType(){
            setFetchFields("excludeFields","paymentType");
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

        public OrderInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> orderNumList;

        public List<String> getOrderNumList(){return this.orderNumList;}


        private List<String> fuzzyOrderNum;

        public List<String> getFuzzyOrderNum(){return this.fuzzyOrderNum;}

        private List<String> rightFuzzyOrderNum;

        public List<String> getRightFuzzyOrderNum(){return this.rightFuzzyOrderNum;}
        private List<Integer> paymentFlagList;

        public List<Integer> getPaymentFlagList(){return this.paymentFlagList;}

        private Integer paymentFlagSt;

        private Integer paymentFlagEd;

        public Integer getPaymentFlagSt(){return this.paymentFlagSt;}

        public Integer getPaymentFlagEd(){return this.paymentFlagEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> contactNameList;

        public List<String> getContactNameList(){return this.contactNameList;}


        private List<String> fuzzyContactName;

        public List<String> getFuzzyContactName(){return this.fuzzyContactName;}

        private List<String> rightFuzzyContactName;

        public List<String> getRightFuzzyContactName(){return this.rightFuzzyContactName;}
        private List<String> contactMobileList;

        public List<String> getContactMobileList(){return this.contactMobileList;}


        private List<String> fuzzyContactMobile;

        public List<String> getFuzzyContactMobile(){return this.fuzzyContactMobile;}

        private List<String> rightFuzzyContactMobile;

        public List<String> getRightFuzzyContactMobile(){return this.rightFuzzyContactMobile;}
        private List<String> contactAddressList;

        public List<String> getContactAddressList(){return this.contactAddressList;}


        private List<String> fuzzyContactAddress;

        public List<String> getFuzzyContactAddress(){return this.fuzzyContactAddress;}

        private List<String> rightFuzzyContactAddress;

        public List<String> getRightFuzzyContactAddress(){return this.rightFuzzyContactAddress;}
        private List<String> messageList;

        public List<String> getMessageList(){return this.messageList;}


        private List<String> fuzzyMessage;

        public List<String> getFuzzyMessage(){return this.fuzzyMessage;}

        private List<String> rightFuzzyMessage;

        public List<String> getRightFuzzyMessage(){return this.rightFuzzyMessage;}
        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> paymentTypeList;

        public List<Integer> getPaymentTypeList(){return this.paymentTypeList;}

        private Integer paymentTypeSt;

        private Integer paymentTypeEd;

        public Integer getPaymentTypeSt(){return this.paymentTypeSt;}

        public Integer getPaymentTypeEd(){return this.paymentTypeEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}


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

        public ConditionBuilder paymentFlagBetWeen(Integer paymentFlagSt,Integer paymentFlagEd){
            this.paymentFlagSt = paymentFlagSt;
            this.paymentFlagEd = paymentFlagEd;
            return this;
        }

        public ConditionBuilder paymentFlagGreaterEqThan(Integer paymentFlagSt){
            this.paymentFlagSt = paymentFlagSt;
            return this;
        }
        public ConditionBuilder paymentFlagLessEqThan(Integer paymentFlagEd){
            this.paymentFlagEd = paymentFlagEd;
            return this;
        }


        public ConditionBuilder paymentFlagList(Integer ... paymentFlag){
            this.paymentFlagList = solveNullList(paymentFlag);
            return this;
        }

        public ConditionBuilder paymentFlagList(List<Integer> paymentFlag){
            this.paymentFlagList = paymentFlag;
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

        public ConditionBuilder fuzzyContactName (List<String> fuzzyContactName){
            this.fuzzyContactName = fuzzyContactName;
            return this;
        }

        public ConditionBuilder fuzzyContactName (String ... fuzzyContactName){
            this.fuzzyContactName = solveNullList(fuzzyContactName);
            return this;
        }

        public ConditionBuilder rightFuzzyContactName (List<String> rightFuzzyContactName){
            this.rightFuzzyContactName = rightFuzzyContactName;
            return this;
        }

        public ConditionBuilder rightFuzzyContactName (String ... rightFuzzyContactName){
            this.rightFuzzyContactName = solveNullList(rightFuzzyContactName);
            return this;
        }

        public ConditionBuilder contactNameList(String ... contactName){
            this.contactNameList = solveNullList(contactName);
            return this;
        }

        public ConditionBuilder contactNameList(List<String> contactName){
            this.contactNameList = contactName;
            return this;
        }

        public ConditionBuilder fuzzyContactMobile (List<String> fuzzyContactMobile){
            this.fuzzyContactMobile = fuzzyContactMobile;
            return this;
        }

        public ConditionBuilder fuzzyContactMobile (String ... fuzzyContactMobile){
            this.fuzzyContactMobile = solveNullList(fuzzyContactMobile);
            return this;
        }

        public ConditionBuilder rightFuzzyContactMobile (List<String> rightFuzzyContactMobile){
            this.rightFuzzyContactMobile = rightFuzzyContactMobile;
            return this;
        }

        public ConditionBuilder rightFuzzyContactMobile (String ... rightFuzzyContactMobile){
            this.rightFuzzyContactMobile = solveNullList(rightFuzzyContactMobile);
            return this;
        }

        public ConditionBuilder contactMobileList(String ... contactMobile){
            this.contactMobileList = solveNullList(contactMobile);
            return this;
        }

        public ConditionBuilder contactMobileList(List<String> contactMobile){
            this.contactMobileList = contactMobile;
            return this;
        }

        public ConditionBuilder fuzzyContactAddress (List<String> fuzzyContactAddress){
            this.fuzzyContactAddress = fuzzyContactAddress;
            return this;
        }

        public ConditionBuilder fuzzyContactAddress (String ... fuzzyContactAddress){
            this.fuzzyContactAddress = solveNullList(fuzzyContactAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyContactAddress (List<String> rightFuzzyContactAddress){
            this.rightFuzzyContactAddress = rightFuzzyContactAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyContactAddress (String ... rightFuzzyContactAddress){
            this.rightFuzzyContactAddress = solveNullList(rightFuzzyContactAddress);
            return this;
        }

        public ConditionBuilder contactAddressList(String ... contactAddress){
            this.contactAddressList = solveNullList(contactAddress);
            return this;
        }

        public ConditionBuilder contactAddressList(List<String> contactAddress){
            this.contactAddressList = contactAddress;
            return this;
        }

        public ConditionBuilder fuzzyMessage (List<String> fuzzyMessage){
            this.fuzzyMessage = fuzzyMessage;
            return this;
        }

        public ConditionBuilder fuzzyMessage (String ... fuzzyMessage){
            this.fuzzyMessage = solveNullList(fuzzyMessage);
            return this;
        }

        public ConditionBuilder rightFuzzyMessage (List<String> rightFuzzyMessage){
            this.rightFuzzyMessage = rightFuzzyMessage;
            return this;
        }

        public ConditionBuilder rightFuzzyMessage (String ... rightFuzzyMessage){
            this.rightFuzzyMessage = solveNullList(rightFuzzyMessage);
            return this;
        }

        public ConditionBuilder messageList(String ... message){
            this.messageList = solveNullList(message);
            return this;
        }

        public ConditionBuilder messageList(List<String> message){
            this.messageList = message;
            return this;
        }

        public ConditionBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public ConditionBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public ConditionBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public ConditionBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public ConditionBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public ConditionBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public ConditionBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public ConditionBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public ConditionBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public ConditionBuilder paymentTypeBetWeen(Integer paymentTypeSt,Integer paymentTypeEd){
            this.paymentTypeSt = paymentTypeSt;
            this.paymentTypeEd = paymentTypeEd;
            return this;
        }

        public ConditionBuilder paymentTypeGreaterEqThan(Integer paymentTypeSt){
            this.paymentTypeSt = paymentTypeSt;
            return this;
        }
        public ConditionBuilder paymentTypeLessEqThan(Integer paymentTypeEd){
            this.paymentTypeEd = paymentTypeEd;
            return this;
        }


        public ConditionBuilder paymentTypeList(Integer ... paymentType){
            this.paymentTypeList = solveNullList(paymentType);
            return this;
        }

        public ConditionBuilder paymentTypeList(List<Integer> paymentType){
            this.paymentTypeList = paymentType;
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

        private OrderInfo obj;

        public Builder(){
            this.obj = new OrderInfo();
        }

        public Builder orderNum(String orderNum){
            this.obj.setOrderNum(orderNum);
            return this;
        }
        public Builder paymentFlag(Integer paymentFlag){
            this.obj.setPaymentFlag(paymentFlag);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder contactName(String contactName){
            this.obj.setContactName(contactName);
            return this;
        }
        public Builder contactMobile(String contactMobile){
            this.obj.setContactMobile(contactMobile);
            return this;
        }
        public Builder contactAddress(String contactAddress){
            this.obj.setContactAddress(contactAddress);
            return this;
        }
        public Builder message(String message){
            this.obj.setMessage(message);
            return this;
        }
        public Builder status(Integer status){
            this.obj.setStatus(status);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public Builder paymentType(Integer paymentType){
            this.obj.setPaymentType(paymentType);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public OrderInfo build(){return obj;}
    }

}
