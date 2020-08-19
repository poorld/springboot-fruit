package com.teenyda.model;

import java.util.ArrayList;
import java.util.List;

public class AuthorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAuthIdIsNull() {
            addCriterion("auth_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthIdIsNotNull() {
            addCriterion("auth_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthIdEqualTo(String value) {
            addCriterion("auth_id =", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotEqualTo(String value) {
            addCriterion("auth_id <>", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThan(String value) {
            addCriterion("auth_id >", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThanOrEqualTo(String value) {
            addCriterion("auth_id >=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThan(String value) {
            addCriterion("auth_id <", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThanOrEqualTo(String value) {
            addCriterion("auth_id <=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLike(String value) {
            addCriterion("auth_id like", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotLike(String value) {
            addCriterion("auth_id not like", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdIn(List<String> values) {
            addCriterion("auth_id in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotIn(List<String> values) {
            addCriterion("auth_id not in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdBetween(String value1, String value2) {
            addCriterion("auth_id between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotBetween(String value1, String value2) {
            addCriterion("auth_id not between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNull() {
            addCriterion("media_id is null");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNotNull() {
            addCriterion("media_id is not null");
            return (Criteria) this;
        }

        public Criteria andMediaIdEqualTo(String value) {
            addCriterion("media_id =", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotEqualTo(String value) {
            addCriterion("media_id <>", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThan(String value) {
            addCriterion("media_id >", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("media_id >=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThan(String value) {
            addCriterion("media_id <", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThanOrEqualTo(String value) {
            addCriterion("media_id <=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLike(String value) {
            addCriterion("media_id like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotLike(String value) {
            addCriterion("media_id not like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIn(List<String> values) {
            addCriterion("media_id in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotIn(List<String> values) {
            addCriterion("media_id not in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdBetween(String value1, String value2) {
            addCriterion("media_id between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotBetween(String value1, String value2) {
            addCriterion("media_id not between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andFollowingCountIsNull() {
            addCriterion("following_count is null");
            return (Criteria) this;
        }

        public Criteria andFollowingCountIsNotNull() {
            addCriterion("following_count is not null");
            return (Criteria) this;
        }

        public Criteria andFollowingCountEqualTo(Integer value) {
            addCriterion("following_count =", value, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountNotEqualTo(Integer value) {
            addCriterion("following_count <>", value, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountGreaterThan(Integer value) {
            addCriterion("following_count >", value, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("following_count >=", value, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountLessThan(Integer value) {
            addCriterion("following_count <", value, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountLessThanOrEqualTo(Integer value) {
            addCriterion("following_count <=", value, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountIn(List<Integer> values) {
            addCriterion("following_count in", values, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountNotIn(List<Integer> values) {
            addCriterion("following_count not in", values, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountBetween(Integer value1, Integer value2) {
            addCriterion("following_count between", value1, value2, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountNotBetween(Integer value1, Integer value2) {
            addCriterion("following_count not between", value1, value2, "followingCount");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentIsNull() {
            addCriterion("verified_content is null");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentIsNotNull() {
            addCriterion("verified_content is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentEqualTo(String value) {
            addCriterion("verified_content =", value, "verifiedContent");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentNotEqualTo(String value) {
            addCriterion("verified_content <>", value, "verifiedContent");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentGreaterThan(String value) {
            addCriterion("verified_content >", value, "verifiedContent");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentGreaterThanOrEqualTo(String value) {
            addCriterion("verified_content >=", value, "verifiedContent");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentLessThan(String value) {
            addCriterion("verified_content <", value, "verifiedContent");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentLessThanOrEqualTo(String value) {
            addCriterion("verified_content <=", value, "verifiedContent");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentLike(String value) {
            addCriterion("verified_content like", value, "verifiedContent");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentNotLike(String value) {
            addCriterion("verified_content not like", value, "verifiedContent");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentIn(List<String> values) {
            addCriterion("verified_content in", values, "verifiedContent");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentNotIn(List<String> values) {
            addCriterion("verified_content not in", values, "verifiedContent");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentBetween(String value1, String value2) {
            addCriterion("verified_content between", value1, value2, "verifiedContent");
            return (Criteria) this;
        }

        public Criteria andVerifiedContentNotBetween(String value1, String value2) {
            addCriterion("verified_content not between", value1, value2, "verifiedContent");
            return (Criteria) this;
        }

        public Criteria andFollowIsNull() {
            addCriterion("follow is null");
            return (Criteria) this;
        }

        public Criteria andFollowIsNotNull() {
            addCriterion("follow is not null");
            return (Criteria) this;
        }

        public Criteria andFollowEqualTo(Boolean value) {
            addCriterion("follow =", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowNotEqualTo(Boolean value) {
            addCriterion("follow <>", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowGreaterThan(Boolean value) {
            addCriterion("follow >", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("follow >=", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowLessThan(Boolean value) {
            addCriterion("follow <", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowLessThanOrEqualTo(Boolean value) {
            addCriterion("follow <=", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowIn(List<Boolean> values) {
            addCriterion("follow in", values, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowNotIn(List<Boolean> values) {
            addCriterion("follow not in", values, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowBetween(Boolean value1, Boolean value2) {
            addCriterion("follow between", value1, value2, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("follow not between", value1, value2, "follow");
            return (Criteria) this;
        }

        public Criteria andUserVerifiedIsNull() {
            addCriterion("user_verified is null");
            return (Criteria) this;
        }

        public Criteria andUserVerifiedIsNotNull() {
            addCriterion("user_verified is not null");
            return (Criteria) this;
        }

        public Criteria andUserVerifiedEqualTo(Boolean value) {
            addCriterion("user_verified =", value, "userVerified");
            return (Criteria) this;
        }

        public Criteria andUserVerifiedNotEqualTo(Boolean value) {
            addCriterion("user_verified <>", value, "userVerified");
            return (Criteria) this;
        }

        public Criteria andUserVerifiedGreaterThan(Boolean value) {
            addCriterion("user_verified >", value, "userVerified");
            return (Criteria) this;
        }

        public Criteria andUserVerifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_verified >=", value, "userVerified");
            return (Criteria) this;
        }

        public Criteria andUserVerifiedLessThan(Boolean value) {
            addCriterion("user_verified <", value, "userVerified");
            return (Criteria) this;
        }

        public Criteria andUserVerifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("user_verified <=", value, "userVerified");
            return (Criteria) this;
        }

        public Criteria andUserVerifiedIn(List<Boolean> values) {
            addCriterion("user_verified in", values, "userVerified");
            return (Criteria) this;
        }

        public Criteria andUserVerifiedNotIn(List<Boolean> values) {
            addCriterion("user_verified not in", values, "userVerified");
            return (Criteria) this;
        }

        public Criteria andUserVerifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("user_verified between", value1, value2, "userVerified");
            return (Criteria) this;
        }

        public Criteria andUserVerifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_verified not between", value1, value2, "userVerified");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNull() {
            addCriterion("auth_type is null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNotNull() {
            addCriterion("auth_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeEqualTo(Integer value) {
            addCriterion("auth_type =", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotEqualTo(Integer value) {
            addCriterion("auth_type <>", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThan(Integer value) {
            addCriterion("auth_type >", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_type >=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThan(Integer value) {
            addCriterion("auth_type <", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThanOrEqualTo(Integer value) {
            addCriterion("auth_type <=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIn(List<Integer> values) {
            addCriterion("auth_type in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotIn(List<Integer> values) {
            addCriterion("auth_type not in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeBetween(Integer value1, Integer value2) {
            addCriterion("auth_type between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_type not between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthInfoIsNull() {
            addCriterion("auth_info is null");
            return (Criteria) this;
        }

        public Criteria andAuthInfoIsNotNull() {
            addCriterion("auth_info is not null");
            return (Criteria) this;
        }

        public Criteria andAuthInfoEqualTo(String value) {
            addCriterion("auth_info =", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoNotEqualTo(String value) {
            addCriterion("auth_info <>", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoGreaterThan(String value) {
            addCriterion("auth_info >", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoGreaterThanOrEqualTo(String value) {
            addCriterion("auth_info >=", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoLessThan(String value) {
            addCriterion("auth_info <", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoLessThanOrEqualTo(String value) {
            addCriterion("auth_info <=", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoLike(String value) {
            addCriterion("auth_info like", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoNotLike(String value) {
            addCriterion("auth_info not like", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoIn(List<String> values) {
            addCriterion("auth_info in", values, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoNotIn(List<String> values) {
            addCriterion("auth_info not in", values, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoBetween(String value1, String value2) {
            addCriterion("auth_info between", value1, value2, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoNotBetween(String value1, String value2) {
            addCriterion("auth_info not between", value1, value2, "authInfo");
            return (Criteria) this;
        }

        public Criteria andVideoLiveAuthIsNull() {
            addCriterion("video_live_auth is null");
            return (Criteria) this;
        }

        public Criteria andVideoLiveAuthIsNotNull() {
            addCriterion("video_live_auth is not null");
            return (Criteria) this;
        }

        public Criteria andVideoLiveAuthEqualTo(Integer value) {
            addCriterion("video_live_auth =", value, "videoLiveAuth");
            return (Criteria) this;
        }

        public Criteria andVideoLiveAuthNotEqualTo(Integer value) {
            addCriterion("video_live_auth <>", value, "videoLiveAuth");
            return (Criteria) this;
        }

        public Criteria andVideoLiveAuthGreaterThan(Integer value) {
            addCriterion("video_live_auth >", value, "videoLiveAuth");
            return (Criteria) this;
        }

        public Criteria andVideoLiveAuthGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_live_auth >=", value, "videoLiveAuth");
            return (Criteria) this;
        }

        public Criteria andVideoLiveAuthLessThan(Integer value) {
            addCriterion("video_live_auth <", value, "videoLiveAuth");
            return (Criteria) this;
        }

        public Criteria andVideoLiveAuthLessThanOrEqualTo(Integer value) {
            addCriterion("video_live_auth <=", value, "videoLiveAuth");
            return (Criteria) this;
        }

        public Criteria andVideoLiveAuthIn(List<Integer> values) {
            addCriterion("video_live_auth in", values, "videoLiveAuth");
            return (Criteria) this;
        }

        public Criteria andVideoLiveAuthNotIn(List<Integer> values) {
            addCriterion("video_live_auth not in", values, "videoLiveAuth");
            return (Criteria) this;
        }

        public Criteria andVideoLiveAuthBetween(Integer value1, Integer value2) {
            addCriterion("video_live_auth between", value1, value2, "videoLiveAuth");
            return (Criteria) this;
        }

        public Criteria andVideoLiveAuthNotBetween(Integer value1, Integer value2) {
            addCriterion("video_live_auth not between", value1, value2, "videoLiveAuth");
            return (Criteria) this;
        }

        public Criteria andBanStatusIsNull() {
            addCriterion("ban_status is null");
            return (Criteria) this;
        }

        public Criteria andBanStatusIsNotNull() {
            addCriterion("ban_status is not null");
            return (Criteria) this;
        }

        public Criteria andBanStatusEqualTo(Integer value) {
            addCriterion("ban_status =", value, "banStatus");
            return (Criteria) this;
        }

        public Criteria andBanStatusNotEqualTo(Integer value) {
            addCriterion("ban_status <>", value, "banStatus");
            return (Criteria) this;
        }

        public Criteria andBanStatusGreaterThan(Integer value) {
            addCriterion("ban_status >", value, "banStatus");
            return (Criteria) this;
        }

        public Criteria andBanStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ban_status >=", value, "banStatus");
            return (Criteria) this;
        }

        public Criteria andBanStatusLessThan(Integer value) {
            addCriterion("ban_status <", value, "banStatus");
            return (Criteria) this;
        }

        public Criteria andBanStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ban_status <=", value, "banStatus");
            return (Criteria) this;
        }

        public Criteria andBanStatusIn(List<Integer> values) {
            addCriterion("ban_status in", values, "banStatus");
            return (Criteria) this;
        }

        public Criteria andBanStatusNotIn(List<Integer> values) {
            addCriterion("ban_status not in", values, "banStatus");
            return (Criteria) this;
        }

        public Criteria andBanStatusBetween(Integer value1, Integer value2) {
            addCriterion("ban_status between", value1, value2, "banStatus");
            return (Criteria) this;
        }

        public Criteria andBanStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ban_status not between", value1, value2, "banStatus");
            return (Criteria) this;
        }

        public Criteria andFollowersCountIsNull() {
            addCriterion("followers_count is null");
            return (Criteria) this;
        }

        public Criteria andFollowersCountIsNotNull() {
            addCriterion("followers_count is not null");
            return (Criteria) this;
        }

        public Criteria andFollowersCountEqualTo(Integer value) {
            addCriterion("followers_count =", value, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountNotEqualTo(Integer value) {
            addCriterion("followers_count <>", value, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountGreaterThan(Integer value) {
            addCriterion("followers_count >", value, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("followers_count >=", value, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountLessThan(Integer value) {
            addCriterion("followers_count <", value, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountLessThanOrEqualTo(Integer value) {
            addCriterion("followers_count <=", value, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountIn(List<Integer> values) {
            addCriterion("followers_count in", values, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountNotIn(List<Integer> values) {
            addCriterion("followers_count not in", values, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountBetween(Integer value1, Integer value2) {
            addCriterion("followers_count between", value1, value2, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountNotBetween(Integer value1, Integer value2) {
            addCriterion("followers_count not between", value1, value2, "followersCount");
            return (Criteria) this;
        }

        public Criteria andShareUrlIsNull() {
            addCriterion("share_url is null");
            return (Criteria) this;
        }

        public Criteria andShareUrlIsNotNull() {
            addCriterion("share_url is not null");
            return (Criteria) this;
        }

        public Criteria andShareUrlEqualTo(String value) {
            addCriterion("share_url =", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotEqualTo(String value) {
            addCriterion("share_url <>", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThan(String value) {
            addCriterion("share_url >", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThanOrEqualTo(String value) {
            addCriterion("share_url >=", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThan(String value) {
            addCriterion("share_url <", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThanOrEqualTo(String value) {
            addCriterion("share_url <=", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLike(String value) {
            addCriterion("share_url like", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotLike(String value) {
            addCriterion("share_url not like", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlIn(List<String> values) {
            addCriterion("share_url in", values, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotIn(List<String> values) {
            addCriterion("share_url not in", values, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlBetween(String value1, String value2) {
            addCriterion("share_url between", value1, value2, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotBetween(String value1, String value2) {
            addCriterion("share_url not between", value1, value2, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdIsNull() {
            addCriterion("ugc_publish_media_id is null");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdIsNotNull() {
            addCriterion("ugc_publish_media_id is not null");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdEqualTo(String value) {
            addCriterion("ugc_publish_media_id =", value, "ugcPublishMediaId");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdNotEqualTo(String value) {
            addCriterion("ugc_publish_media_id <>", value, "ugcPublishMediaId");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdGreaterThan(String value) {
            addCriterion("ugc_publish_media_id >", value, "ugcPublishMediaId");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("ugc_publish_media_id >=", value, "ugcPublishMediaId");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdLessThan(String value) {
            addCriterion("ugc_publish_media_id <", value, "ugcPublishMediaId");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdLessThanOrEqualTo(String value) {
            addCriterion("ugc_publish_media_id <=", value, "ugcPublishMediaId");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdLike(String value) {
            addCriterion("ugc_publish_media_id like", value, "ugcPublishMediaId");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdNotLike(String value) {
            addCriterion("ugc_publish_media_id not like", value, "ugcPublishMediaId");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdIn(List<String> values) {
            addCriterion("ugc_publish_media_id in", values, "ugcPublishMediaId");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdNotIn(List<String> values) {
            addCriterion("ugc_publish_media_id not in", values, "ugcPublishMediaId");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdBetween(String value1, String value2) {
            addCriterion("ugc_publish_media_id between", value1, value2, "ugcPublishMediaId");
            return (Criteria) this;
        }

        public Criteria andUgcPublishMediaIdNotBetween(String value1, String value2) {
            addCriterion("ugc_publish_media_id not between", value1, value2, "ugcPublishMediaId");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNull() {
            addCriterion("avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNotNull() {
            addCriterion("avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlEqualTo(String value) {
            addCriterion("avatar_url =", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotEqualTo(String value) {
            addCriterion("avatar_url <>", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThan(String value) {
            addCriterion("avatar_url >", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("avatar_url >=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThan(String value) {
            addCriterion("avatar_url <", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("avatar_url <=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLike(String value) {
            addCriterion("avatar_url like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotLike(String value) {
            addCriterion("avatar_url not like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIn(List<String> values) {
            addCriterion("avatar_url in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotIn(List<String> values) {
            addCriterion("avatar_url not in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlBetween(String value1, String value2) {
            addCriterion("avatar_url between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("avatar_url not between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}