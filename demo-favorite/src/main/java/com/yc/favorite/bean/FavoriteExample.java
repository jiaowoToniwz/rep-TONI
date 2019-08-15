package com.yc.favorite.bean;

import java.util.ArrayList;
import java.util.List;

public class FavoriteExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    public FavoriteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFLabelIsNull() {
            addCriterion("f_label is null");
            return (Criteria) this;
        }

        public Criteria andFLabelIsNotNull() {
            addCriterion("f_label is not null");
            return (Criteria) this;
        }

        public Criteria andFLabelEqualTo(String value) {
            addCriterion("f_label =", value, "fLabel");
            return (Criteria) this;
        }

        public Criteria andFLabelNotEqualTo(String value) {
            addCriterion("f_label <>", value, "fLabel");
            return (Criteria) this;
        }

        public Criteria andFLabelGreaterThan(String value) {
            addCriterion("f_label >", value, "fLabel");
            return (Criteria) this;
        }

        public Criteria andFLabelGreaterThanOrEqualTo(String value) {
            addCriterion("f_label >=", value, "fLabel");
            return (Criteria) this;
        }

        public Criteria andFLabelLessThan(String value) {
            addCriterion("f_label <", value, "fLabel");
            return (Criteria) this;
        }

        public Criteria andFLabelLessThanOrEqualTo(String value) {
            addCriterion("f_label <=", value, "fLabel");
            return (Criteria) this;
        }

        public Criteria andFLabelLike(String value) {
            addCriterion("f_label like", value, "fLabel");
            return (Criteria) this;
        }

        public Criteria andFLabelNotLike(String value) {
            addCriterion("f_label not like", value, "fLabel");
            return (Criteria) this;
        }

        public Criteria andFLabelIn(List<String> values) {
            addCriterion("f_label in", values, "fLabel");
            return (Criteria) this;
        }

        public Criteria andFLabelNotIn(List<String> values) {
            addCriterion("f_label not in", values, "fLabel");
            return (Criteria) this;
        }

        public Criteria andFLabelBetween(String value1, String value2) {
            addCriterion("f_label between", value1, value2, "fLabel");
            return (Criteria) this;
        }

        public Criteria andFLabelNotBetween(String value1, String value2) {
            addCriterion("f_label not between", value1, value2, "fLabel");
            return (Criteria) this;
        }

        public Criteria andFUrlIsNull() {
            addCriterion("f_url is null");
            return (Criteria) this;
        }

        public Criteria andFUrlIsNotNull() {
            addCriterion("f_url is not null");
            return (Criteria) this;
        }

        public Criteria andFUrlEqualTo(String value) {
            addCriterion("f_url =", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlNotEqualTo(String value) {
            addCriterion("f_url <>", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlGreaterThan(String value) {
            addCriterion("f_url >", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlGreaterThanOrEqualTo(String value) {
            addCriterion("f_url >=", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlLessThan(String value) {
            addCriterion("f_url <", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlLessThanOrEqualTo(String value) {
            addCriterion("f_url <=", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlLike(String value) {
            addCriterion("f_url like", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlNotLike(String value) {
            addCriterion("f_url not like", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlIn(List<String> values) {
            addCriterion("f_url in", values, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlNotIn(List<String> values) {
            addCriterion("f_url not in", values, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlBetween(String value1, String value2) {
            addCriterion("f_url between", value1, value2, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlNotBetween(String value1, String value2) {
            addCriterion("f_url not between", value1, value2, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFTagsIsNull() {
            addCriterion("f_tags is null");
            return (Criteria) this;
        }

        public Criteria andFTagsIsNotNull() {
            addCriterion("f_tags is not null");
            return (Criteria) this;
        }

        public Criteria andFTagsEqualTo(String value) {
            addCriterion("f_tags =", value, "fTags");
            return (Criteria) this;
        }

        public Criteria andFTagsNotEqualTo(String value) {
            addCriterion("f_tags <>", value, "fTags");
            return (Criteria) this;
        }

        public Criteria andFTagsGreaterThan(String value) {
            addCriterion("f_tags >", value, "fTags");
            return (Criteria) this;
        }

        public Criteria andFTagsGreaterThanOrEqualTo(String value) {
            addCriterion("f_tags >=", value, "fTags");
            return (Criteria) this;
        }

        public Criteria andFTagsLessThan(String value) {
            addCriterion("f_tags <", value, "fTags");
            return (Criteria) this;
        }

        public Criteria andFTagsLessThanOrEqualTo(String value) {
            addCriterion("f_tags <=", value, "fTags");
            return (Criteria) this;
        }

        public Criteria andFTagsLike(String value) {
            addCriterion("f_tags like", value, "fTags");
            return (Criteria) this;
        }

        public Criteria andFTagsNotLike(String value) {
            addCriterion("f_tags not like", value, "fTags");
            return (Criteria) this;
        }

        public Criteria andFTagsIn(List<String> values) {
            addCriterion("f_tags in", values, "fTags");
            return (Criteria) this;
        }

        public Criteria andFTagsNotIn(List<String> values) {
            addCriterion("f_tags not in", values, "fTags");
            return (Criteria) this;
        }

        public Criteria andFTagsBetween(String value1, String value2) {
            addCriterion("f_tags between", value1, value2, "fTags");
            return (Criteria) this;
        }

        public Criteria andFTagsNotBetween(String value1, String value2) {
            addCriterion("f_tags not between", value1, value2, "fTags");
            return (Criteria) this;
        }

        public Criteria andFDescIsNull() {
            addCriterion("f_desc is null");
            return (Criteria) this;
        }

        public Criteria andFDescIsNotNull() {
            addCriterion("f_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFDescEqualTo(String value) {
            addCriterion("f_desc =", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotEqualTo(String value) {
            addCriterion("f_desc <>", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThan(String value) {
            addCriterion("f_desc >", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThanOrEqualTo(String value) {
            addCriterion("f_desc >=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThan(String value) {
            addCriterion("f_desc <", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThanOrEqualTo(String value) {
            addCriterion("f_desc <=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLike(String value) {
            addCriterion("f_desc like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotLike(String value) {
            addCriterion("f_desc not like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescIn(List<String> values) {
            addCriterion("f_desc in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotIn(List<String> values) {
            addCriterion("f_desc not in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescBetween(String value1, String value2) {
            addCriterion("f_desc between", value1, value2, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotBetween(String value1, String value2) {
            addCriterion("f_desc not between", value1, value2, "fDesc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table favorite
     *
     * @mbg.generated do_not_delete_during_merge Thu Aug 01 09:17:39 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table favorite
     *
     * @mbg.generated Thu Aug 01 09:17:39 CST 2019
     */
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