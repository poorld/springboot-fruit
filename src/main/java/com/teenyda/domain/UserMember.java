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
public class UserMember implements Serializable {

    private static final long serialVersionUID = 1601518196169L;


    /**
    * 
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 
    * isNullAble:0
    */
    private Integer membersId;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime startTime;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime endTime;


    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setMembersId(Integer membersId){this.membersId = membersId;}

    public Integer getMembersId(){return this.membersId;}

    public void setStartTime(java.time.LocalDateTime startTime){this.startTime = startTime;}

    public java.time.LocalDateTime getStartTime(){return this.startTime;}

    public void setEndTime(java.time.LocalDateTime endTime){this.endTime = endTime;}

    public java.time.LocalDateTime getEndTime(){return this.endTime;}
    @Override
    public String toString() {
        return "UserMember{" +
                "userId='" + userId + '\'' +
                "membersId='" + membersId + '\'' +
                "startTime='" + startTime + '\'' +
                "endTime='" + endTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private UserMember set;

        private ConditionBuilder where;

        public UpdateBuilder set(UserMember set){
            this.set = set;
            return this;
        }

        public UserMember getSet(){
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

    public static class QueryBuilder extends UserMember{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<Integer> membersIdList;

        public List<Integer> getMembersIdList(){return this.membersIdList;}

        private Integer membersIdSt;

        private Integer membersIdEd;

        public Integer getMembersIdSt(){return this.membersIdSt;}

        public Integer getMembersIdEd(){return this.membersIdEd;}

        private List<java.time.LocalDateTime> startTimeList;

        public List<java.time.LocalDateTime> getStartTimeList(){return this.startTimeList;}

        private java.time.LocalDateTime startTimeSt;

        private java.time.LocalDateTime startTimeEd;

        public java.time.LocalDateTime getStartTimeSt(){return this.startTimeSt;}

        public java.time.LocalDateTime getStartTimeEd(){return this.startTimeEd;}

        private List<java.time.LocalDateTime> endTimeList;

        public List<java.time.LocalDateTime> getEndTimeList(){return this.endTimeList;}

        private java.time.LocalDateTime endTimeSt;

        private java.time.LocalDateTime endTimeEd;

        public java.time.LocalDateTime getEndTimeSt(){return this.endTimeSt;}

        public java.time.LocalDateTime getEndTimeEd(){return this.endTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder startTimeBetWeen(java.time.LocalDateTime startTimeSt,java.time.LocalDateTime startTimeEd){
            this.startTimeSt = startTimeSt;
            this.startTimeEd = startTimeEd;
            return this;
        }

        public QueryBuilder startTimeGreaterEqThan(java.time.LocalDateTime startTimeSt){
            this.startTimeSt = startTimeSt;
            return this;
        }
        public QueryBuilder startTimeLessEqThan(java.time.LocalDateTime startTimeEd){
            this.startTimeEd = startTimeEd;
            return this;
        }


        public QueryBuilder startTime(java.time.LocalDateTime startTime){
            setStartTime(startTime);
            return this;
        }

        public QueryBuilder startTimeList(java.time.LocalDateTime ... startTime){
            this.startTimeList = solveNullList(startTime);
            return this;
        }

        public QueryBuilder startTimeList(List<java.time.LocalDateTime> startTime){
            this.startTimeList = startTime;
            return this;
        }

        public QueryBuilder fetchStartTime(){
            setFetchFields("fetchFields","startTime");
            return this;
        }

        public QueryBuilder excludeStartTime(){
            setFetchFields("excludeFields","startTime");
            return this;
        }

        public QueryBuilder endTimeBetWeen(java.time.LocalDateTime endTimeSt,java.time.LocalDateTime endTimeEd){
            this.endTimeSt = endTimeSt;
            this.endTimeEd = endTimeEd;
            return this;
        }

        public QueryBuilder endTimeGreaterEqThan(java.time.LocalDateTime endTimeSt){
            this.endTimeSt = endTimeSt;
            return this;
        }
        public QueryBuilder endTimeLessEqThan(java.time.LocalDateTime endTimeEd){
            this.endTimeEd = endTimeEd;
            return this;
        }


        public QueryBuilder endTime(java.time.LocalDateTime endTime){
            setEndTime(endTime);
            return this;
        }

        public QueryBuilder endTimeList(java.time.LocalDateTime ... endTime){
            this.endTimeList = solveNullList(endTime);
            return this;
        }

        public QueryBuilder endTimeList(List<java.time.LocalDateTime> endTime){
            this.endTimeList = endTime;
            return this;
        }

        public QueryBuilder fetchEndTime(){
            setFetchFields("fetchFields","endTime");
            return this;
        }

        public QueryBuilder excludeEndTime(){
            setFetchFields("excludeFields","endTime");
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

        public UserMember build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<Integer> membersIdList;

        public List<Integer> getMembersIdList(){return this.membersIdList;}

        private Integer membersIdSt;

        private Integer membersIdEd;

        public Integer getMembersIdSt(){return this.membersIdSt;}

        public Integer getMembersIdEd(){return this.membersIdEd;}

        private List<java.time.LocalDateTime> startTimeList;

        public List<java.time.LocalDateTime> getStartTimeList(){return this.startTimeList;}

        private java.time.LocalDateTime startTimeSt;

        private java.time.LocalDateTime startTimeEd;

        public java.time.LocalDateTime getStartTimeSt(){return this.startTimeSt;}

        public java.time.LocalDateTime getStartTimeEd(){return this.startTimeEd;}

        private List<java.time.LocalDateTime> endTimeList;

        public List<java.time.LocalDateTime> getEndTimeList(){return this.endTimeList;}

        private java.time.LocalDateTime endTimeSt;

        private java.time.LocalDateTime endTimeEd;

        public java.time.LocalDateTime getEndTimeSt(){return this.endTimeSt;}

        public java.time.LocalDateTime getEndTimeEd(){return this.endTimeEd;}


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

        public ConditionBuilder startTimeBetWeen(java.time.LocalDateTime startTimeSt,java.time.LocalDateTime startTimeEd){
            this.startTimeSt = startTimeSt;
            this.startTimeEd = startTimeEd;
            return this;
        }

        public ConditionBuilder startTimeGreaterEqThan(java.time.LocalDateTime startTimeSt){
            this.startTimeSt = startTimeSt;
            return this;
        }
        public ConditionBuilder startTimeLessEqThan(java.time.LocalDateTime startTimeEd){
            this.startTimeEd = startTimeEd;
            return this;
        }


        public ConditionBuilder startTimeList(java.time.LocalDateTime ... startTime){
            this.startTimeList = solveNullList(startTime);
            return this;
        }

        public ConditionBuilder startTimeList(List<java.time.LocalDateTime> startTime){
            this.startTimeList = startTime;
            return this;
        }

        public ConditionBuilder endTimeBetWeen(java.time.LocalDateTime endTimeSt,java.time.LocalDateTime endTimeEd){
            this.endTimeSt = endTimeSt;
            this.endTimeEd = endTimeEd;
            return this;
        }

        public ConditionBuilder endTimeGreaterEqThan(java.time.LocalDateTime endTimeSt){
            this.endTimeSt = endTimeSt;
            return this;
        }
        public ConditionBuilder endTimeLessEqThan(java.time.LocalDateTime endTimeEd){
            this.endTimeEd = endTimeEd;
            return this;
        }


        public ConditionBuilder endTimeList(java.time.LocalDateTime ... endTime){
            this.endTimeList = solveNullList(endTime);
            return this;
        }

        public ConditionBuilder endTimeList(List<java.time.LocalDateTime> endTime){
            this.endTimeList = endTime;
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

        private UserMember obj;

        public Builder(){
            this.obj = new UserMember();
        }

        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder membersId(Integer membersId){
            this.obj.setMembersId(membersId);
            return this;
        }
        public Builder startTime(java.time.LocalDateTime startTime){
            this.obj.setStartTime(startTime);
            return this;
        }
        public Builder endTime(java.time.LocalDateTime endTime){
            this.obj.setEndTime(endTime);
            return this;
        }
        public UserMember build(){return obj;}
    }

}
