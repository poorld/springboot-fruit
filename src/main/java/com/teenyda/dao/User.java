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
public class User implements Serializable {

    private static final long serialVersionUID = 1601518193261L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 
    * isNullAble:0
    */
    private String username;

    /**
    * 
    * isNullAble:0
    */
    private String password;

    /**
    * 
    * isNullAble:1
    */
    private String nickname;

    /**
    * 
    * isNullAble:1
    */
    private String email;

    /**
    * 
    * isNullAble:1
    */
    private String image;

    /**
    * 
    * isNullAble:1
    */
    private String QQ;

    /**
    * 
    * isNullAble:1
    */
    private String mobile;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime lastLoginTime;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime registerTime;


    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setUsername(String username){this.username = username;}

    public String getUsername(){return this.username;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}

    public void setNickname(String nickname){this.nickname = nickname;}

    public String getNickname(){return this.nickname;}

    public void setEmail(String email){this.email = email;}

    public String getEmail(){return this.email;}

    public void setImage(String image){this.image = image;}

    public String getImage(){return this.image;}

    public void setQQ(String QQ){this.QQ = QQ;}

    public String getQQ(){return this.QQ;}

    public void setMobile(String mobile){this.mobile = mobile;}

    public String getMobile(){return this.mobile;}

    public void setLastLoginTime(java.time.LocalDateTime lastLoginTime){this.lastLoginTime = lastLoginTime;}

    public java.time.LocalDateTime getLastLoginTime(){return this.lastLoginTime;}

    public void setRegisterTime(java.time.LocalDateTime registerTime){this.registerTime = registerTime;}

    public java.time.LocalDateTime getRegisterTime(){return this.registerTime;}
    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                "username='" + username + '\'' +
                "password='" + password + '\'' +
                "nickname='" + nickname + '\'' +
                "email='" + email + '\'' +
                "image='" + image + '\'' +
                "QQ='" + QQ + '\'' +
                "mobile='" + mobile + '\'' +
                "lastLoginTime='" + lastLoginTime + '\'' +
                "registerTime='" + registerTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private User set;

        private ConditionBuilder where;

        public UpdateBuilder set(User set){
            this.set = set;
            return this;
        }

        public User getSet(){
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

    public static class QueryBuilder extends User{
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

        private List<String> usernameList;

        public List<String> getUsernameList(){return this.usernameList;}


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){return this.fuzzyUsername;}

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){return this.rightFuzzyUsername;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> nicknameList;

        public List<String> getNicknameList(){return this.nicknameList;}


        private List<String> fuzzyNickname;

        public List<String> getFuzzyNickname(){return this.fuzzyNickname;}

        private List<String> rightFuzzyNickname;

        public List<String> getRightFuzzyNickname(){return this.rightFuzzyNickname;}
        private List<String> emailList;

        public List<String> getEmailList(){return this.emailList;}


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail(){return this.fuzzyEmail;}

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail(){return this.rightFuzzyEmail;}
        private List<String> imageList;

        public List<String> getImageList(){return this.imageList;}


        private List<String> fuzzyImage;

        public List<String> getFuzzyImage(){return this.fuzzyImage;}

        private List<String> rightFuzzyImage;

        public List<String> getRightFuzzyImage(){return this.rightFuzzyImage;}
        private List<String> QQList;

        public List<String> getQQList(){return this.QQList;}


        private List<String> fuzzyQQ;

        public List<String> getFuzzyQQ(){return this.fuzzyQQ;}

        private List<String> rightFuzzyQQ;

        public List<String> getRightFuzzyQQ(){return this.rightFuzzyQQ;}
        private List<String> mobileList;

        public List<String> getMobileList(){return this.mobileList;}


        private List<String> fuzzyMobile;

        public List<String> getFuzzyMobile(){return this.fuzzyMobile;}

        private List<String> rightFuzzyMobile;

        public List<String> getRightFuzzyMobile(){return this.rightFuzzyMobile;}
        private List<java.time.LocalDateTime> lastLoginTimeList;

        public List<java.time.LocalDateTime> getLastLoginTimeList(){return this.lastLoginTimeList;}

        private java.time.LocalDateTime lastLoginTimeSt;

        private java.time.LocalDateTime lastLoginTimeEd;

        public java.time.LocalDateTime getLastLoginTimeSt(){return this.lastLoginTimeSt;}

        public java.time.LocalDateTime getLastLoginTimeEd(){return this.lastLoginTimeEd;}

        private List<java.time.LocalDateTime> registerTimeList;

        public List<java.time.LocalDateTime> getRegisterTimeList(){return this.registerTimeList;}

        private java.time.LocalDateTime registerTimeSt;

        private java.time.LocalDateTime registerTimeEd;

        public java.time.LocalDateTime getRegisterTimeSt(){return this.registerTimeSt;}

        public java.time.LocalDateTime getRegisterTimeEd(){return this.registerTimeEd;}

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

        public QueryBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public QueryBuilder fuzzyUsername (String ... fuzzyUsername){
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public QueryBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public QueryBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public QueryBuilder username(String username){
            setUsername(username);
            return this;
        }

        public QueryBuilder usernameList(String ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public QueryBuilder usernameList(List<String> username){
            this.usernameList = username;
            return this;
        }

        public QueryBuilder fetchUsername(){
            setFetchFields("fetchFields","username");
            return this;
        }

        public QueryBuilder excludeUsername(){
            setFetchFields("excludeFields","username");
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

        public QueryBuilder fuzzyNickname (List<String> fuzzyNickname){
            this.fuzzyNickname = fuzzyNickname;
            return this;
        }

        public QueryBuilder fuzzyNickname (String ... fuzzyNickname){
            this.fuzzyNickname = solveNullList(fuzzyNickname);
            return this;
        }

        public QueryBuilder rightFuzzyNickname (List<String> rightFuzzyNickname){
            this.rightFuzzyNickname = rightFuzzyNickname;
            return this;
        }

        public QueryBuilder rightFuzzyNickname (String ... rightFuzzyNickname){
            this.rightFuzzyNickname = solveNullList(rightFuzzyNickname);
            return this;
        }

        public QueryBuilder nickname(String nickname){
            setNickname(nickname);
            return this;
        }

        public QueryBuilder nicknameList(String ... nickname){
            this.nicknameList = solveNullList(nickname);
            return this;
        }

        public QueryBuilder nicknameList(List<String> nickname){
            this.nicknameList = nickname;
            return this;
        }

        public QueryBuilder fetchNickname(){
            setFetchFields("fetchFields","nickname");
            return this;
        }

        public QueryBuilder excludeNickname(){
            setFetchFields("excludeFields","nickname");
            return this;
        }

        public QueryBuilder fuzzyEmail (List<String> fuzzyEmail){
            this.fuzzyEmail = fuzzyEmail;
            return this;
        }

        public QueryBuilder fuzzyEmail (String ... fuzzyEmail){
            this.fuzzyEmail = solveNullList(fuzzyEmail);
            return this;
        }

        public QueryBuilder rightFuzzyEmail (List<String> rightFuzzyEmail){
            this.rightFuzzyEmail = rightFuzzyEmail;
            return this;
        }

        public QueryBuilder rightFuzzyEmail (String ... rightFuzzyEmail){
            this.rightFuzzyEmail = solveNullList(rightFuzzyEmail);
            return this;
        }

        public QueryBuilder email(String email){
            setEmail(email);
            return this;
        }

        public QueryBuilder emailList(String ... email){
            this.emailList = solveNullList(email);
            return this;
        }

        public QueryBuilder emailList(List<String> email){
            this.emailList = email;
            return this;
        }

        public QueryBuilder fetchEmail(){
            setFetchFields("fetchFields","email");
            return this;
        }

        public QueryBuilder excludeEmail(){
            setFetchFields("excludeFields","email");
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

        public QueryBuilder fuzzyQQ (List<String> fuzzyQQ){
            this.fuzzyQQ = fuzzyQQ;
            return this;
        }

        public QueryBuilder fuzzyQQ (String ... fuzzyQQ){
            this.fuzzyQQ = solveNullList(fuzzyQQ);
            return this;
        }

        public QueryBuilder rightFuzzyQQ (List<String> rightFuzzyQQ){
            this.rightFuzzyQQ = rightFuzzyQQ;
            return this;
        }

        public QueryBuilder rightFuzzyQQ (String ... rightFuzzyQQ){
            this.rightFuzzyQQ = solveNullList(rightFuzzyQQ);
            return this;
        }

        public QueryBuilder QQ(String QQ){
            setQQ(QQ);
            return this;
        }

        public QueryBuilder QQList(String ... QQ){
            this.QQList = solveNullList(QQ);
            return this;
        }

        public QueryBuilder QQList(List<String> QQ){
            this.QQList = QQ;
            return this;
        }

        public QueryBuilder fetchQQ(){
            setFetchFields("fetchFields","QQ");
            return this;
        }

        public QueryBuilder excludeQQ(){
            setFetchFields("excludeFields","QQ");
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

        public QueryBuilder lastLoginTimeBetWeen(java.time.LocalDateTime lastLoginTimeSt,java.time.LocalDateTime lastLoginTimeEd){
            this.lastLoginTimeSt = lastLoginTimeSt;
            this.lastLoginTimeEd = lastLoginTimeEd;
            return this;
        }

        public QueryBuilder lastLoginTimeGreaterEqThan(java.time.LocalDateTime lastLoginTimeSt){
            this.lastLoginTimeSt = lastLoginTimeSt;
            return this;
        }
        public QueryBuilder lastLoginTimeLessEqThan(java.time.LocalDateTime lastLoginTimeEd){
            this.lastLoginTimeEd = lastLoginTimeEd;
            return this;
        }


        public QueryBuilder lastLoginTime(java.time.LocalDateTime lastLoginTime){
            setLastLoginTime(lastLoginTime);
            return this;
        }

        public QueryBuilder lastLoginTimeList(java.time.LocalDateTime ... lastLoginTime){
            this.lastLoginTimeList = solveNullList(lastLoginTime);
            return this;
        }

        public QueryBuilder lastLoginTimeList(List<java.time.LocalDateTime> lastLoginTime){
            this.lastLoginTimeList = lastLoginTime;
            return this;
        }

        public QueryBuilder fetchLastLoginTime(){
            setFetchFields("fetchFields","lastLoginTime");
            return this;
        }

        public QueryBuilder excludeLastLoginTime(){
            setFetchFields("excludeFields","lastLoginTime");
            return this;
        }

        public QueryBuilder registerTimeBetWeen(java.time.LocalDateTime registerTimeSt,java.time.LocalDateTime registerTimeEd){
            this.registerTimeSt = registerTimeSt;
            this.registerTimeEd = registerTimeEd;
            return this;
        }

        public QueryBuilder registerTimeGreaterEqThan(java.time.LocalDateTime registerTimeSt){
            this.registerTimeSt = registerTimeSt;
            return this;
        }
        public QueryBuilder registerTimeLessEqThan(java.time.LocalDateTime registerTimeEd){
            this.registerTimeEd = registerTimeEd;
            return this;
        }


        public QueryBuilder registerTime(java.time.LocalDateTime registerTime){
            setRegisterTime(registerTime);
            return this;
        }

        public QueryBuilder registerTimeList(java.time.LocalDateTime ... registerTime){
            this.registerTimeList = solveNullList(registerTime);
            return this;
        }

        public QueryBuilder registerTimeList(List<java.time.LocalDateTime> registerTime){
            this.registerTimeList = registerTime;
            return this;
        }

        public QueryBuilder fetchRegisterTime(){
            setFetchFields("fetchFields","registerTime");
            return this;
        }

        public QueryBuilder excludeRegisterTime(){
            setFetchFields("excludeFields","registerTime");
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

        public User build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> usernameList;

        public List<String> getUsernameList(){return this.usernameList;}


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){return this.fuzzyUsername;}

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){return this.rightFuzzyUsername;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> nicknameList;

        public List<String> getNicknameList(){return this.nicknameList;}


        private List<String> fuzzyNickname;

        public List<String> getFuzzyNickname(){return this.fuzzyNickname;}

        private List<String> rightFuzzyNickname;

        public List<String> getRightFuzzyNickname(){return this.rightFuzzyNickname;}
        private List<String> emailList;

        public List<String> getEmailList(){return this.emailList;}


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail(){return this.fuzzyEmail;}

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail(){return this.rightFuzzyEmail;}
        private List<String> imageList;

        public List<String> getImageList(){return this.imageList;}


        private List<String> fuzzyImage;

        public List<String> getFuzzyImage(){return this.fuzzyImage;}

        private List<String> rightFuzzyImage;

        public List<String> getRightFuzzyImage(){return this.rightFuzzyImage;}
        private List<String> QQList;

        public List<String> getQQList(){return this.QQList;}


        private List<String> fuzzyQQ;

        public List<String> getFuzzyQQ(){return this.fuzzyQQ;}

        private List<String> rightFuzzyQQ;

        public List<String> getRightFuzzyQQ(){return this.rightFuzzyQQ;}
        private List<String> mobileList;

        public List<String> getMobileList(){return this.mobileList;}


        private List<String> fuzzyMobile;

        public List<String> getFuzzyMobile(){return this.fuzzyMobile;}

        private List<String> rightFuzzyMobile;

        public List<String> getRightFuzzyMobile(){return this.rightFuzzyMobile;}
        private List<java.time.LocalDateTime> lastLoginTimeList;

        public List<java.time.LocalDateTime> getLastLoginTimeList(){return this.lastLoginTimeList;}

        private java.time.LocalDateTime lastLoginTimeSt;

        private java.time.LocalDateTime lastLoginTimeEd;

        public java.time.LocalDateTime getLastLoginTimeSt(){return this.lastLoginTimeSt;}

        public java.time.LocalDateTime getLastLoginTimeEd(){return this.lastLoginTimeEd;}

        private List<java.time.LocalDateTime> registerTimeList;

        public List<java.time.LocalDateTime> getRegisterTimeList(){return this.registerTimeList;}

        private java.time.LocalDateTime registerTimeSt;

        private java.time.LocalDateTime registerTimeEd;

        public java.time.LocalDateTime getRegisterTimeSt(){return this.registerTimeSt;}

        public java.time.LocalDateTime getRegisterTimeEd(){return this.registerTimeEd;}


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

        public ConditionBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public ConditionBuilder fuzzyUsername (String ... fuzzyUsername){
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public ConditionBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public ConditionBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public ConditionBuilder usernameList(String ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public ConditionBuilder usernameList(List<String> username){
            this.usernameList = username;
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

        public ConditionBuilder fuzzyNickname (List<String> fuzzyNickname){
            this.fuzzyNickname = fuzzyNickname;
            return this;
        }

        public ConditionBuilder fuzzyNickname (String ... fuzzyNickname){
            this.fuzzyNickname = solveNullList(fuzzyNickname);
            return this;
        }

        public ConditionBuilder rightFuzzyNickname (List<String> rightFuzzyNickname){
            this.rightFuzzyNickname = rightFuzzyNickname;
            return this;
        }

        public ConditionBuilder rightFuzzyNickname (String ... rightFuzzyNickname){
            this.rightFuzzyNickname = solveNullList(rightFuzzyNickname);
            return this;
        }

        public ConditionBuilder nicknameList(String ... nickname){
            this.nicknameList = solveNullList(nickname);
            return this;
        }

        public ConditionBuilder nicknameList(List<String> nickname){
            this.nicknameList = nickname;
            return this;
        }

        public ConditionBuilder fuzzyEmail (List<String> fuzzyEmail){
            this.fuzzyEmail = fuzzyEmail;
            return this;
        }

        public ConditionBuilder fuzzyEmail (String ... fuzzyEmail){
            this.fuzzyEmail = solveNullList(fuzzyEmail);
            return this;
        }

        public ConditionBuilder rightFuzzyEmail (List<String> rightFuzzyEmail){
            this.rightFuzzyEmail = rightFuzzyEmail;
            return this;
        }

        public ConditionBuilder rightFuzzyEmail (String ... rightFuzzyEmail){
            this.rightFuzzyEmail = solveNullList(rightFuzzyEmail);
            return this;
        }

        public ConditionBuilder emailList(String ... email){
            this.emailList = solveNullList(email);
            return this;
        }

        public ConditionBuilder emailList(List<String> email){
            this.emailList = email;
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

        public ConditionBuilder fuzzyQQ (List<String> fuzzyQQ){
            this.fuzzyQQ = fuzzyQQ;
            return this;
        }

        public ConditionBuilder fuzzyQQ (String ... fuzzyQQ){
            this.fuzzyQQ = solveNullList(fuzzyQQ);
            return this;
        }

        public ConditionBuilder rightFuzzyQQ (List<String> rightFuzzyQQ){
            this.rightFuzzyQQ = rightFuzzyQQ;
            return this;
        }

        public ConditionBuilder rightFuzzyQQ (String ... rightFuzzyQQ){
            this.rightFuzzyQQ = solveNullList(rightFuzzyQQ);
            return this;
        }

        public ConditionBuilder QQList(String ... QQ){
            this.QQList = solveNullList(QQ);
            return this;
        }

        public ConditionBuilder QQList(List<String> QQ){
            this.QQList = QQ;
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

        public ConditionBuilder lastLoginTimeBetWeen(java.time.LocalDateTime lastLoginTimeSt,java.time.LocalDateTime lastLoginTimeEd){
            this.lastLoginTimeSt = lastLoginTimeSt;
            this.lastLoginTimeEd = lastLoginTimeEd;
            return this;
        }

        public ConditionBuilder lastLoginTimeGreaterEqThan(java.time.LocalDateTime lastLoginTimeSt){
            this.lastLoginTimeSt = lastLoginTimeSt;
            return this;
        }
        public ConditionBuilder lastLoginTimeLessEqThan(java.time.LocalDateTime lastLoginTimeEd){
            this.lastLoginTimeEd = lastLoginTimeEd;
            return this;
        }


        public ConditionBuilder lastLoginTimeList(java.time.LocalDateTime ... lastLoginTime){
            this.lastLoginTimeList = solveNullList(lastLoginTime);
            return this;
        }

        public ConditionBuilder lastLoginTimeList(List<java.time.LocalDateTime> lastLoginTime){
            this.lastLoginTimeList = lastLoginTime;
            return this;
        }

        public ConditionBuilder registerTimeBetWeen(java.time.LocalDateTime registerTimeSt,java.time.LocalDateTime registerTimeEd){
            this.registerTimeSt = registerTimeSt;
            this.registerTimeEd = registerTimeEd;
            return this;
        }

        public ConditionBuilder registerTimeGreaterEqThan(java.time.LocalDateTime registerTimeSt){
            this.registerTimeSt = registerTimeSt;
            return this;
        }
        public ConditionBuilder registerTimeLessEqThan(java.time.LocalDateTime registerTimeEd){
            this.registerTimeEd = registerTimeEd;
            return this;
        }


        public ConditionBuilder registerTimeList(java.time.LocalDateTime ... registerTime){
            this.registerTimeList = solveNullList(registerTime);
            return this;
        }

        public ConditionBuilder registerTimeList(List<java.time.LocalDateTime> registerTime){
            this.registerTimeList = registerTime;
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

        private User obj;

        public Builder(){
            this.obj = new User();
        }

        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder username(String username){
            this.obj.setUsername(username);
            return this;
        }
        public Builder password(String password){
            this.obj.setPassword(password);
            return this;
        }
        public Builder nickname(String nickname){
            this.obj.setNickname(nickname);
            return this;
        }
        public Builder email(String email){
            this.obj.setEmail(email);
            return this;
        }
        public Builder image(String image){
            this.obj.setImage(image);
            return this;
        }
        public Builder QQ(String QQ){
            this.obj.setQQ(QQ);
            return this;
        }
        public Builder mobile(String mobile){
            this.obj.setMobile(mobile);
            return this;
        }
        public Builder lastLoginTime(java.time.LocalDateTime lastLoginTime){
            this.obj.setLastLoginTime(lastLoginTime);
            return this;
        }
        public Builder registerTime(java.time.LocalDateTime registerTime){
            this.obj.setRegisterTime(registerTime);
            return this;
        }
        public User build(){return obj;}
    }

}
