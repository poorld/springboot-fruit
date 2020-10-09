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
public class Comments implements Serializable {

    private static final long serialVersionUID = 1601518132130L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer commentsId;

    /**
    * 
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 
    * isNullAble:1
    */
    private String content;

    /**
    * 
    * isNullAble:1
    */
    private String img1;

    /**
    * 
    * isNullAble:1
    */
    private String img2;

    /**
    * 
    * isNullAble:1
    */
    private String img3;

    /**
    * 0未审核 1审核通过
    * isNullAble:0,defaultVal:0
    */
    private Integer audit;

    /**
    * 商家回复
    * isNullAble:1
    */
    private String reply;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;


    public void setCommentsId(Integer commentsId){this.commentsId = commentsId;}

    public Integer getCommentsId(){return this.commentsId;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setProductId(Integer productId){this.productId = productId;}

    public Integer getProductId(){return this.productId;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}

    public void setImg1(String img1){this.img1 = img1;}

    public String getImg1(){return this.img1;}

    public void setImg2(String img2){this.img2 = img2;}

    public String getImg2(){return this.img2;}

    public void setImg3(String img3){this.img3 = img3;}

    public String getImg3(){return this.img3;}

    public void setAudit(Integer audit){this.audit = audit;}

    public Integer getAudit(){return this.audit;}

    public void setReply(String reply){this.reply = reply;}

    public String getReply(){return this.reply;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}
    @Override
    public String toString() {
        return "Comments{" +
                "commentsId='" + commentsId + '\'' +
                "userId='" + userId + '\'' +
                "productId='" + productId + '\'' +
                "content='" + content + '\'' +
                "img1='" + img1 + '\'' +
                "img2='" + img2 + '\'' +
                "img3='" + img3 + '\'' +
                "audit='" + audit + '\'' +
                "reply='" + reply + '\'' +
                "createTime='" + createTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Comments set;

        private ConditionBuilder where;

        public UpdateBuilder set(Comments set){
            this.set = set;
            return this;
        }

        public Comments getSet(){
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

    public static class QueryBuilder extends Comments{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> commentsIdList;

        public List<Integer> getCommentsIdList(){return this.commentsIdList;}

        private Integer commentsIdSt;

        private Integer commentsIdEd;

        public Integer getCommentsIdSt(){return this.commentsIdSt;}

        public Integer getCommentsIdEd(){return this.commentsIdEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private List<String> img1List;

        public List<String> getImg1List(){return this.img1List;}


        private List<String> fuzzyImg1;

        public List<String> getFuzzyImg1(){return this.fuzzyImg1;}

        private List<String> rightFuzzyImg1;

        public List<String> getRightFuzzyImg1(){return this.rightFuzzyImg1;}
        private List<String> img2List;

        public List<String> getImg2List(){return this.img2List;}


        private List<String> fuzzyImg2;

        public List<String> getFuzzyImg2(){return this.fuzzyImg2;}

        private List<String> rightFuzzyImg2;

        public List<String> getRightFuzzyImg2(){return this.rightFuzzyImg2;}
        private List<String> img3List;

        public List<String> getImg3List(){return this.img3List;}


        private List<String> fuzzyImg3;

        public List<String> getFuzzyImg3(){return this.fuzzyImg3;}

        private List<String> rightFuzzyImg3;

        public List<String> getRightFuzzyImg3(){return this.rightFuzzyImg3;}
        private List<Integer> auditList;

        public List<Integer> getAuditList(){return this.auditList;}

        private Integer auditSt;

        private Integer auditEd;

        public Integer getAuditSt(){return this.auditSt;}

        public Integer getAuditEd(){return this.auditEd;}

        private List<String> replyList;

        public List<String> getReplyList(){return this.replyList;}


        private List<String> fuzzyReply;

        public List<String> getFuzzyReply(){return this.fuzzyReply;}

        private List<String> rightFuzzyReply;

        public List<String> getRightFuzzyReply(){return this.rightFuzzyReply;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder commentsIdBetWeen(Integer commentsIdSt,Integer commentsIdEd){
            this.commentsIdSt = commentsIdSt;
            this.commentsIdEd = commentsIdEd;
            return this;
        }

        public QueryBuilder commentsIdGreaterEqThan(Integer commentsIdSt){
            this.commentsIdSt = commentsIdSt;
            return this;
        }
        public QueryBuilder commentsIdLessEqThan(Integer commentsIdEd){
            this.commentsIdEd = commentsIdEd;
            return this;
        }


        public QueryBuilder commentsId(Integer commentsId){
            setCommentsId(commentsId);
            return this;
        }

        public QueryBuilder commentsIdList(Integer ... commentsId){
            this.commentsIdList = solveNullList(commentsId);
            return this;
        }

        public QueryBuilder commentsIdList(List<Integer> commentsId){
            this.commentsIdList = commentsId;
            return this;
        }

        public QueryBuilder fetchCommentsId(){
            setFetchFields("fetchFields","commentsId");
            return this;
        }

        public QueryBuilder excludeCommentsId(){
            setFetchFields("excludeFields","commentsId");
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

        public QueryBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public QueryBuilder fuzzyContent (String ... fuzzyContent){
            this.fuzzyContent = solveNullList(fuzzyContent);
            return this;
        }

        public QueryBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public QueryBuilder rightFuzzyContent (String ... rightFuzzyContent){
            this.rightFuzzyContent = solveNullList(rightFuzzyContent);
            return this;
        }

        public QueryBuilder content(String content){
            setContent(content);
            return this;
        }

        public QueryBuilder contentList(String ... content){
            this.contentList = solveNullList(content);
            return this;
        }

        public QueryBuilder contentList(List<String> content){
            this.contentList = content;
            return this;
        }

        public QueryBuilder fetchContent(){
            setFetchFields("fetchFields","content");
            return this;
        }

        public QueryBuilder excludeContent(){
            setFetchFields("excludeFields","content");
            return this;
        }

        public QueryBuilder fuzzyImg1 (List<String> fuzzyImg1){
            this.fuzzyImg1 = fuzzyImg1;
            return this;
        }

        public QueryBuilder fuzzyImg1 (String ... fuzzyImg1){
            this.fuzzyImg1 = solveNullList(fuzzyImg1);
            return this;
        }

        public QueryBuilder rightFuzzyImg1 (List<String> rightFuzzyImg1){
            this.rightFuzzyImg1 = rightFuzzyImg1;
            return this;
        }

        public QueryBuilder rightFuzzyImg1 (String ... rightFuzzyImg1){
            this.rightFuzzyImg1 = solveNullList(rightFuzzyImg1);
            return this;
        }

        public QueryBuilder img1(String img1){
            setImg1(img1);
            return this;
        }

        public QueryBuilder img1List(String ... img1){
            this.img1List = solveNullList(img1);
            return this;
        }

        public QueryBuilder img1List(List<String> img1){
            this.img1List = img1;
            return this;
        }

        public QueryBuilder fetchImg1(){
            setFetchFields("fetchFields","img1");
            return this;
        }

        public QueryBuilder excludeImg1(){
            setFetchFields("excludeFields","img1");
            return this;
        }

        public QueryBuilder fuzzyImg2 (List<String> fuzzyImg2){
            this.fuzzyImg2 = fuzzyImg2;
            return this;
        }

        public QueryBuilder fuzzyImg2 (String ... fuzzyImg2){
            this.fuzzyImg2 = solveNullList(fuzzyImg2);
            return this;
        }

        public QueryBuilder rightFuzzyImg2 (List<String> rightFuzzyImg2){
            this.rightFuzzyImg2 = rightFuzzyImg2;
            return this;
        }

        public QueryBuilder rightFuzzyImg2 (String ... rightFuzzyImg2){
            this.rightFuzzyImg2 = solveNullList(rightFuzzyImg2);
            return this;
        }

        public QueryBuilder img2(String img2){
            setImg2(img2);
            return this;
        }

        public QueryBuilder img2List(String ... img2){
            this.img2List = solveNullList(img2);
            return this;
        }

        public QueryBuilder img2List(List<String> img2){
            this.img2List = img2;
            return this;
        }

        public QueryBuilder fetchImg2(){
            setFetchFields("fetchFields","img2");
            return this;
        }

        public QueryBuilder excludeImg2(){
            setFetchFields("excludeFields","img2");
            return this;
        }

        public QueryBuilder fuzzyImg3 (List<String> fuzzyImg3){
            this.fuzzyImg3 = fuzzyImg3;
            return this;
        }

        public QueryBuilder fuzzyImg3 (String ... fuzzyImg3){
            this.fuzzyImg3 = solveNullList(fuzzyImg3);
            return this;
        }

        public QueryBuilder rightFuzzyImg3 (List<String> rightFuzzyImg3){
            this.rightFuzzyImg3 = rightFuzzyImg3;
            return this;
        }

        public QueryBuilder rightFuzzyImg3 (String ... rightFuzzyImg3){
            this.rightFuzzyImg3 = solveNullList(rightFuzzyImg3);
            return this;
        }

        public QueryBuilder img3(String img3){
            setImg3(img3);
            return this;
        }

        public QueryBuilder img3List(String ... img3){
            this.img3List = solveNullList(img3);
            return this;
        }

        public QueryBuilder img3List(List<String> img3){
            this.img3List = img3;
            return this;
        }

        public QueryBuilder fetchImg3(){
            setFetchFields("fetchFields","img3");
            return this;
        }

        public QueryBuilder excludeImg3(){
            setFetchFields("excludeFields","img3");
            return this;
        }

        public QueryBuilder auditBetWeen(Integer auditSt,Integer auditEd){
            this.auditSt = auditSt;
            this.auditEd = auditEd;
            return this;
        }

        public QueryBuilder auditGreaterEqThan(Integer auditSt){
            this.auditSt = auditSt;
            return this;
        }
        public QueryBuilder auditLessEqThan(Integer auditEd){
            this.auditEd = auditEd;
            return this;
        }


        public QueryBuilder audit(Integer audit){
            setAudit(audit);
            return this;
        }

        public QueryBuilder auditList(Integer ... audit){
            this.auditList = solveNullList(audit);
            return this;
        }

        public QueryBuilder auditList(List<Integer> audit){
            this.auditList = audit;
            return this;
        }

        public QueryBuilder fetchAudit(){
            setFetchFields("fetchFields","audit");
            return this;
        }

        public QueryBuilder excludeAudit(){
            setFetchFields("excludeFields","audit");
            return this;
        }

        public QueryBuilder fuzzyReply (List<String> fuzzyReply){
            this.fuzzyReply = fuzzyReply;
            return this;
        }

        public QueryBuilder fuzzyReply (String ... fuzzyReply){
            this.fuzzyReply = solveNullList(fuzzyReply);
            return this;
        }

        public QueryBuilder rightFuzzyReply (List<String> rightFuzzyReply){
            this.rightFuzzyReply = rightFuzzyReply;
            return this;
        }

        public QueryBuilder rightFuzzyReply (String ... rightFuzzyReply){
            this.rightFuzzyReply = solveNullList(rightFuzzyReply);
            return this;
        }

        public QueryBuilder reply(String reply){
            setReply(reply);
            return this;
        }

        public QueryBuilder replyList(String ... reply){
            this.replyList = solveNullList(reply);
            return this;
        }

        public QueryBuilder replyList(List<String> reply){
            this.replyList = reply;
            return this;
        }

        public QueryBuilder fetchReply(){
            setFetchFields("fetchFields","reply");
            return this;
        }

        public QueryBuilder excludeReply(){
            setFetchFields("excludeFields","reply");
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

        public Comments build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> commentsIdList;

        public List<Integer> getCommentsIdList(){return this.commentsIdList;}

        private Integer commentsIdSt;

        private Integer commentsIdEd;

        public Integer getCommentsIdSt(){return this.commentsIdSt;}

        public Integer getCommentsIdEd(){return this.commentsIdEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private List<String> img1List;

        public List<String> getImg1List(){return this.img1List;}


        private List<String> fuzzyImg1;

        public List<String> getFuzzyImg1(){return this.fuzzyImg1;}

        private List<String> rightFuzzyImg1;

        public List<String> getRightFuzzyImg1(){return this.rightFuzzyImg1;}
        private List<String> img2List;

        public List<String> getImg2List(){return this.img2List;}


        private List<String> fuzzyImg2;

        public List<String> getFuzzyImg2(){return this.fuzzyImg2;}

        private List<String> rightFuzzyImg2;

        public List<String> getRightFuzzyImg2(){return this.rightFuzzyImg2;}
        private List<String> img3List;

        public List<String> getImg3List(){return this.img3List;}


        private List<String> fuzzyImg3;

        public List<String> getFuzzyImg3(){return this.fuzzyImg3;}

        private List<String> rightFuzzyImg3;

        public List<String> getRightFuzzyImg3(){return this.rightFuzzyImg3;}
        private List<Integer> auditList;

        public List<Integer> getAuditList(){return this.auditList;}

        private Integer auditSt;

        private Integer auditEd;

        public Integer getAuditSt(){return this.auditSt;}

        public Integer getAuditEd(){return this.auditEd;}

        private List<String> replyList;

        public List<String> getReplyList(){return this.replyList;}


        private List<String> fuzzyReply;

        public List<String> getFuzzyReply(){return this.fuzzyReply;}

        private List<String> rightFuzzyReply;

        public List<String> getRightFuzzyReply(){return this.rightFuzzyReply;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}


        public ConditionBuilder commentsIdBetWeen(Integer commentsIdSt,Integer commentsIdEd){
            this.commentsIdSt = commentsIdSt;
            this.commentsIdEd = commentsIdEd;
            return this;
        }

        public ConditionBuilder commentsIdGreaterEqThan(Integer commentsIdSt){
            this.commentsIdSt = commentsIdSt;
            return this;
        }
        public ConditionBuilder commentsIdLessEqThan(Integer commentsIdEd){
            this.commentsIdEd = commentsIdEd;
            return this;
        }


        public ConditionBuilder commentsIdList(Integer ... commentsId){
            this.commentsIdList = solveNullList(commentsId);
            return this;
        }

        public ConditionBuilder commentsIdList(List<Integer> commentsId){
            this.commentsIdList = commentsId;
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

        public ConditionBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public ConditionBuilder fuzzyContent (String ... fuzzyContent){
            this.fuzzyContent = solveNullList(fuzzyContent);
            return this;
        }

        public ConditionBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public ConditionBuilder rightFuzzyContent (String ... rightFuzzyContent){
            this.rightFuzzyContent = solveNullList(rightFuzzyContent);
            return this;
        }

        public ConditionBuilder contentList(String ... content){
            this.contentList = solveNullList(content);
            return this;
        }

        public ConditionBuilder contentList(List<String> content){
            this.contentList = content;
            return this;
        }

        public ConditionBuilder fuzzyImg1 (List<String> fuzzyImg1){
            this.fuzzyImg1 = fuzzyImg1;
            return this;
        }

        public ConditionBuilder fuzzyImg1 (String ... fuzzyImg1){
            this.fuzzyImg1 = solveNullList(fuzzyImg1);
            return this;
        }

        public ConditionBuilder rightFuzzyImg1 (List<String> rightFuzzyImg1){
            this.rightFuzzyImg1 = rightFuzzyImg1;
            return this;
        }

        public ConditionBuilder rightFuzzyImg1 (String ... rightFuzzyImg1){
            this.rightFuzzyImg1 = solveNullList(rightFuzzyImg1);
            return this;
        }

        public ConditionBuilder img1List(String ... img1){
            this.img1List = solveNullList(img1);
            return this;
        }

        public ConditionBuilder img1List(List<String> img1){
            this.img1List = img1;
            return this;
        }

        public ConditionBuilder fuzzyImg2 (List<String> fuzzyImg2){
            this.fuzzyImg2 = fuzzyImg2;
            return this;
        }

        public ConditionBuilder fuzzyImg2 (String ... fuzzyImg2){
            this.fuzzyImg2 = solveNullList(fuzzyImg2);
            return this;
        }

        public ConditionBuilder rightFuzzyImg2 (List<String> rightFuzzyImg2){
            this.rightFuzzyImg2 = rightFuzzyImg2;
            return this;
        }

        public ConditionBuilder rightFuzzyImg2 (String ... rightFuzzyImg2){
            this.rightFuzzyImg2 = solveNullList(rightFuzzyImg2);
            return this;
        }

        public ConditionBuilder img2List(String ... img2){
            this.img2List = solveNullList(img2);
            return this;
        }

        public ConditionBuilder img2List(List<String> img2){
            this.img2List = img2;
            return this;
        }

        public ConditionBuilder fuzzyImg3 (List<String> fuzzyImg3){
            this.fuzzyImg3 = fuzzyImg3;
            return this;
        }

        public ConditionBuilder fuzzyImg3 (String ... fuzzyImg3){
            this.fuzzyImg3 = solveNullList(fuzzyImg3);
            return this;
        }

        public ConditionBuilder rightFuzzyImg3 (List<String> rightFuzzyImg3){
            this.rightFuzzyImg3 = rightFuzzyImg3;
            return this;
        }

        public ConditionBuilder rightFuzzyImg3 (String ... rightFuzzyImg3){
            this.rightFuzzyImg3 = solveNullList(rightFuzzyImg3);
            return this;
        }

        public ConditionBuilder img3List(String ... img3){
            this.img3List = solveNullList(img3);
            return this;
        }

        public ConditionBuilder img3List(List<String> img3){
            this.img3List = img3;
            return this;
        }

        public ConditionBuilder auditBetWeen(Integer auditSt,Integer auditEd){
            this.auditSt = auditSt;
            this.auditEd = auditEd;
            return this;
        }

        public ConditionBuilder auditGreaterEqThan(Integer auditSt){
            this.auditSt = auditSt;
            return this;
        }
        public ConditionBuilder auditLessEqThan(Integer auditEd){
            this.auditEd = auditEd;
            return this;
        }


        public ConditionBuilder auditList(Integer ... audit){
            this.auditList = solveNullList(audit);
            return this;
        }

        public ConditionBuilder auditList(List<Integer> audit){
            this.auditList = audit;
            return this;
        }

        public ConditionBuilder fuzzyReply (List<String> fuzzyReply){
            this.fuzzyReply = fuzzyReply;
            return this;
        }

        public ConditionBuilder fuzzyReply (String ... fuzzyReply){
            this.fuzzyReply = solveNullList(fuzzyReply);
            return this;
        }

        public ConditionBuilder rightFuzzyReply (List<String> rightFuzzyReply){
            this.rightFuzzyReply = rightFuzzyReply;
            return this;
        }

        public ConditionBuilder rightFuzzyReply (String ... rightFuzzyReply){
            this.rightFuzzyReply = solveNullList(rightFuzzyReply);
            return this;
        }

        public ConditionBuilder replyList(String ... reply){
            this.replyList = solveNullList(reply);
            return this;
        }

        public ConditionBuilder replyList(List<String> reply){
            this.replyList = reply;
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

        private Comments obj;

        public Builder(){
            this.obj = new Comments();
        }

        public Builder commentsId(Integer commentsId){
            this.obj.setCommentsId(commentsId);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder productId(Integer productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public Builder img1(String img1){
            this.obj.setImg1(img1);
            return this;
        }
        public Builder img2(String img2){
            this.obj.setImg2(img2);
            return this;
        }
        public Builder img3(String img3){
            this.obj.setImg3(img3);
            return this;
        }
        public Builder audit(Integer audit){
            this.obj.setAudit(audit);
            return this;
        }
        public Builder reply(String reply){
            this.obj.setReply(reply);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Comments build(){return obj;}
    }

}
