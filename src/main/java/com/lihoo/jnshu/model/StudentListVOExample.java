package com.lihoo.jnshu.model;

import java.util.ArrayList;
import java.util.List;

public class StudentListVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public StudentListVOExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andQqNumIsNull() {
            addCriterion("qq_num is null");
            return (Criteria) this;
        }

        public Criteria andQqNumIsNotNull() {
            addCriterion("qq_num is not null");
            return (Criteria) this;
        }

        public Criteria andQqNumEqualTo(Long value) {
            addCriterion("qq_num =", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumNotEqualTo(Long value) {
            addCriterion("qq_num <>", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumGreaterThan(Long value) {
            addCriterion("qq_num >", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumGreaterThanOrEqualTo(Long value) {
            addCriterion("qq_num >=", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumLessThan(Long value) {
            addCriterion("qq_num <", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumLessThanOrEqualTo(Long value) {
            addCriterion("qq_num <=", value, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumIn(List<Long> values) {
            addCriterion("qq_num in", values, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumNotIn(List<Long> values) {
            addCriterion("qq_num not in", values, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumBetween(Long value1, Long value2) {
            addCriterion("qq_num between", value1, value2, "qqNum");
            return (Criteria) this;
        }

        public Criteria andQqNumNotBetween(Long value1, Long value2) {
            addCriterion("qq_num not between", value1, value2, "qqNum");
            return (Criteria) this;
        }

        public Criteria andStudyTypeIsNull() {
            addCriterion("study_type is null");
            return (Criteria) this;
        }

        public Criteria andStudyTypeIsNotNull() {
            addCriterion("study_type is not null");
            return (Criteria) this;
        }

        public Criteria andStudyTypeEqualTo(String value) {
            addCriterion("study_type =", value, "studyType");
            return (Criteria) this;
        }

        public Criteria andStudyTypeNotEqualTo(String value) {
            addCriterion("study_type <>", value, "studyType");
            return (Criteria) this;
        }

        public Criteria andStudyTypeGreaterThan(String value) {
            addCriterion("study_type >", value, "studyType");
            return (Criteria) this;
        }

        public Criteria andStudyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("study_type >=", value, "studyType");
            return (Criteria) this;
        }

        public Criteria andStudyTypeLessThan(String value) {
            addCriterion("study_type <", value, "studyType");
            return (Criteria) this;
        }

        public Criteria andStudyTypeLessThanOrEqualTo(String value) {
            addCriterion("study_type <=", value, "studyType");
            return (Criteria) this;
        }

        public Criteria andStudyTypeLike(String value) {
            addCriterion("study_type like", value, "studyType");
            return (Criteria) this;
        }

        public Criteria andStudyTypeNotLike(String value) {
            addCriterion("study_type not like", value, "studyType");
            return (Criteria) this;
        }

        public Criteria andStudyTypeIn(List<String> values) {
            addCriterion("study_type in", values, "studyType");
            return (Criteria) this;
        }

        public Criteria andStudyTypeNotIn(List<String> values) {
            addCriterion("study_type not in", values, "studyType");
            return (Criteria) this;
        }

        public Criteria andStudyTypeBetween(String value1, String value2) {
            addCriterion("study_type between", value1, value2, "studyType");
            return (Criteria) this;
        }

        public Criteria andStudyTypeNotBetween(String value1, String value2) {
            addCriterion("study_type not between", value1, value2, "studyType");
            return (Criteria) this;
        }

        public Criteria andStudyTimeIsNull() {
            addCriterion("study_time is null");
            return (Criteria) this;
        }

        public Criteria andStudyTimeIsNotNull() {
            addCriterion("study_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudyTimeEqualTo(Long value) {
            addCriterion("study_time =", value, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeNotEqualTo(Long value) {
            addCriterion("study_time <>", value, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeGreaterThan(Long value) {
            addCriterion("study_time >", value, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("study_time >=", value, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeLessThan(Long value) {
            addCriterion("study_time <", value, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeLessThanOrEqualTo(Long value) {
            addCriterion("study_time <=", value, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeIn(List<Long> values) {
            addCriterion("study_time in", values, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeNotIn(List<Long> values) {
            addCriterion("study_time not in", values, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeBetween(Long value1, Long value2) {
            addCriterion("study_time between", value1, value2, "studyTime");
            return (Criteria) this;
        }

        public Criteria andStudyTimeNotBetween(Long value1, Long value2) {
            addCriterion("study_time not between", value1, value2, "studyTime");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andStudyIdIsNull() {
            addCriterion("study_id is null");
            return (Criteria) this;
        }

        public Criteria andStudyIdIsNotNull() {
            addCriterion("study_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudyIdEqualTo(String value) {
            addCriterion("study_id =", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotEqualTo(String value) {
            addCriterion("study_id <>", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdGreaterThan(String value) {
            addCriterion("study_id >", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdGreaterThanOrEqualTo(String value) {
            addCriterion("study_id >=", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLessThan(String value) {
            addCriterion("study_id <", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLessThanOrEqualTo(String value) {
            addCriterion("study_id <=", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLike(String value) {
            addCriterion("study_id like", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotLike(String value) {
            addCriterion("study_id not like", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdIn(List<String> values) {
            addCriterion("study_id in", values, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotIn(List<String> values) {
            addCriterion("study_id not in", values, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdBetween(String value1, String value2) {
            addCriterion("study_id between", value1, value2, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotBetween(String value1, String value2) {
            addCriterion("study_id not between", value1, value2, "studyId");
            return (Criteria) this;
        }

        public Criteria andDailyLinkIsNull() {
            addCriterion("daily_link is null");
            return (Criteria) this;
        }

        public Criteria andDailyLinkIsNotNull() {
            addCriterion("daily_link is not null");
            return (Criteria) this;
        }

        public Criteria andDailyLinkEqualTo(String value) {
            addCriterion("daily_link =", value, "dailyLink");
            return (Criteria) this;
        }

        public Criteria andDailyLinkNotEqualTo(String value) {
            addCriterion("daily_link <>", value, "dailyLink");
            return (Criteria) this;
        }

        public Criteria andDailyLinkGreaterThan(String value) {
            addCriterion("daily_link >", value, "dailyLink");
            return (Criteria) this;
        }

        public Criteria andDailyLinkGreaterThanOrEqualTo(String value) {
            addCriterion("daily_link >=", value, "dailyLink");
            return (Criteria) this;
        }

        public Criteria andDailyLinkLessThan(String value) {
            addCriterion("daily_link <", value, "dailyLink");
            return (Criteria) this;
        }

        public Criteria andDailyLinkLessThanOrEqualTo(String value) {
            addCriterion("daily_link <=", value, "dailyLink");
            return (Criteria) this;
        }

        public Criteria andDailyLinkLike(String value) {
            addCriterion("daily_link like", value, "dailyLink");
            return (Criteria) this;
        }

        public Criteria andDailyLinkNotLike(String value) {
            addCriterion("daily_link not like", value, "dailyLink");
            return (Criteria) this;
        }

        public Criteria andDailyLinkIn(List<String> values) {
            addCriterion("daily_link in", values, "dailyLink");
            return (Criteria) this;
        }

        public Criteria andDailyLinkNotIn(List<String> values) {
            addCriterion("daily_link not in", values, "dailyLink");
            return (Criteria) this;
        }

        public Criteria andDailyLinkBetween(String value1, String value2) {
            addCriterion("daily_link between", value1, value2, "dailyLink");
            return (Criteria) this;
        }

        public Criteria andDailyLinkNotBetween(String value1, String value2) {
            addCriterion("daily_link not between", value1, value2, "dailyLink");
            return (Criteria) this;
        }

        public Criteria andPromiseIsNull() {
            addCriterion("promise is null");
            return (Criteria) this;
        }

        public Criteria andPromiseIsNotNull() {
            addCriterion("promise is not null");
            return (Criteria) this;
        }

        public Criteria andPromiseEqualTo(String value) {
            addCriterion("promise =", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseNotEqualTo(String value) {
            addCriterion("promise <>", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseGreaterThan(String value) {
            addCriterion("promise >", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseGreaterThanOrEqualTo(String value) {
            addCriterion("promise >=", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseLessThan(String value) {
            addCriterion("promise <", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseLessThanOrEqualTo(String value) {
            addCriterion("promise <=", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseLike(String value) {
            addCriterion("promise like", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseNotLike(String value) {
            addCriterion("promise not like", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseIn(List<String> values) {
            addCriterion("promise in", values, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseNotIn(List<String> values) {
            addCriterion("promise not in", values, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseBetween(String value1, String value2) {
            addCriterion("promise between", value1, value2, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseNotBetween(String value1, String value2) {
            addCriterion("promise not between", value1, value2, "promise");
            return (Criteria) this;
        }

        public Criteria andTeachBroIsNull() {
            addCriterion("teach_bro is null");
            return (Criteria) this;
        }

        public Criteria andTeachBroIsNotNull() {
            addCriterion("teach_bro is not null");
            return (Criteria) this;
        }

        public Criteria andTeachBroEqualTo(String value) {
            addCriterion("teach_bro =", value, "teachBro");
            return (Criteria) this;
        }

        public Criteria andTeachBroNotEqualTo(String value) {
            addCriterion("teach_bro <>", value, "teachBro");
            return (Criteria) this;
        }

        public Criteria andTeachBroGreaterThan(String value) {
            addCriterion("teach_bro >", value, "teachBro");
            return (Criteria) this;
        }

        public Criteria andTeachBroGreaterThanOrEqualTo(String value) {
            addCriterion("teach_bro >=", value, "teachBro");
            return (Criteria) this;
        }

        public Criteria andTeachBroLessThan(String value) {
            addCriterion("teach_bro <", value, "teachBro");
            return (Criteria) this;
        }

        public Criteria andTeachBroLessThanOrEqualTo(String value) {
            addCriterion("teach_bro <=", value, "teachBro");
            return (Criteria) this;
        }

        public Criteria andTeachBroLike(String value) {
            addCriterion("teach_bro like", value, "teachBro");
            return (Criteria) this;
        }

        public Criteria andTeachBroNotLike(String value) {
            addCriterion("teach_bro not like", value, "teachBro");
            return (Criteria) this;
        }

        public Criteria andTeachBroIn(List<String> values) {
            addCriterion("teach_bro in", values, "teachBro");
            return (Criteria) this;
        }

        public Criteria andTeachBroNotIn(List<String> values) {
            addCriterion("teach_bro not in", values, "teachBro");
            return (Criteria) this;
        }

        public Criteria andTeachBroBetween(String value1, String value2) {
            addCriterion("teach_bro between", value1, value2, "teachBro");
            return (Criteria) this;
        }

        public Criteria andTeachBroNotBetween(String value1, String value2) {
            addCriterion("teach_bro not between", value1, value2, "teachBro");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromIsNull() {
            addCriterion("know_us_from is null");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromIsNotNull() {
            addCriterion("know_us_from is not null");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromEqualTo(String value) {
            addCriterion("know_us_from =", value, "knowUsFrom");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromNotEqualTo(String value) {
            addCriterion("know_us_from <>", value, "knowUsFrom");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromGreaterThan(String value) {
            addCriterion("know_us_from >", value, "knowUsFrom");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromGreaterThanOrEqualTo(String value) {
            addCriterion("know_us_from >=", value, "knowUsFrom");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromLessThan(String value) {
            addCriterion("know_us_from <", value, "knowUsFrom");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromLessThanOrEqualTo(String value) {
            addCriterion("know_us_from <=", value, "knowUsFrom");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromLike(String value) {
            addCriterion("know_us_from like", value, "knowUsFrom");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromNotLike(String value) {
            addCriterion("know_us_from not like", value, "knowUsFrom");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromIn(List<String> values) {
            addCriterion("know_us_from in", values, "knowUsFrom");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromNotIn(List<String> values) {
            addCriterion("know_us_from not in", values, "knowUsFrom");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromBetween(String value1, String value2) {
            addCriterion("know_us_from between", value1, value2, "knowUsFrom");
            return (Criteria) this;
        }

        public Criteria andKnowUsFromNotBetween(String value1, String value2) {
            addCriterion("know_us_from not between", value1, value2, "knowUsFrom");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Long value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Long value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Long value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Long value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Long value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Long value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Long> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Long> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Long value1, Long value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Long value1, Long value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Long value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Long value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Long value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Long value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Long value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Long value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Long> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Long> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Long value1, Long value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Long value1, Long value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return (Criteria) this;
        }
    }

    /**
     */
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