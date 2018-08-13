package com.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class SsubmitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SsubmitExample() {
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

        public Criteria andSsnIsNull() {
            addCriterion("SSN is null");
            return (Criteria) this;
        }

        public Criteria andSsnIsNotNull() {
            addCriterion("SSN is not null");
            return (Criteria) this;
        }

        public Criteria andSsnEqualTo(Integer value) {
            addCriterion("SSN =", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotEqualTo(Integer value) {
            addCriterion("SSN <>", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnGreaterThan(Integer value) {
            addCriterion("SSN >", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnGreaterThanOrEqualTo(Integer value) {
            addCriterion("SSN >=", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLessThan(Integer value) {
            addCriterion("SSN <", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLessThanOrEqualTo(Integer value) {
            addCriterion("SSN <=", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnIn(List<Integer> values) {
            addCriterion("SSN in", values, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotIn(List<Integer> values) {
            addCriterion("SSN not in", values, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnBetween(Integer value1, Integer value2) {
            addCriterion("SSN between", value1, value2, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotBetween(Integer value1, Integer value2) {
            addCriterion("SSN not between", value1, value2, "ssn");
            return (Criteria) this;
        }

        public Criteria andAnoIsNull() {
            addCriterion("ANo is null");
            return (Criteria) this;
        }

        public Criteria andAnoIsNotNull() {
            addCriterion("ANo is not null");
            return (Criteria) this;
        }

        public Criteria andAnoEqualTo(Integer value) {
            addCriterion("ANo =", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotEqualTo(Integer value) {
            addCriterion("ANo <>", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThan(Integer value) {
            addCriterion("ANo >", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ANo >=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThan(Integer value) {
            addCriterion("ANo <", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThanOrEqualTo(Integer value) {
            addCriterion("ANo <=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoIn(List<Integer> values) {
            addCriterion("ANo in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotIn(List<Integer> values) {
            addCriterion("ANo not in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoBetween(Integer value1, Integer value2) {
            addCriterion("ANo between", value1, value2, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotBetween(Integer value1, Integer value2) {
            addCriterion("ANo not between", value1, value2, "ano");
            return (Criteria) this;
        }

        public Criteria andVnoIsNull() {
            addCriterion("VNo is null");
            return (Criteria) this;
        }

        public Criteria andVnoIsNotNull() {
            addCriterion("VNo is not null");
            return (Criteria) this;
        }

        public Criteria andVnoEqualTo(Integer value) {
            addCriterion("VNo =", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotEqualTo(Integer value) {
            addCriterion("VNo <>", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoGreaterThan(Integer value) {
            addCriterion("VNo >", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("VNo >=", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoLessThan(Integer value) {
            addCriterion("VNo <", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoLessThanOrEqualTo(Integer value) {
            addCriterion("VNo <=", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoIn(List<Integer> values) {
            addCriterion("VNo in", values, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotIn(List<Integer> values) {
            addCriterion("VNo not in", values, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoBetween(Integer value1, Integer value2) {
            addCriterion("VNo between", value1, value2, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotBetween(Integer value1, Integer value2) {
            addCriterion("VNo not between", value1, value2, "vno");
            return (Criteria) this;
        }

        public Criteria andSsnameIsNull() {
            addCriterion("SSName is null");
            return (Criteria) this;
        }

        public Criteria andSsnameIsNotNull() {
            addCriterion("SSName is not null");
            return (Criteria) this;
        }

        public Criteria andSsnameEqualTo(String value) {
            addCriterion("SSName =", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameNotEqualTo(String value) {
            addCriterion("SSName <>", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameGreaterThan(String value) {
            addCriterion("SSName >", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameGreaterThanOrEqualTo(String value) {
            addCriterion("SSName >=", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameLessThan(String value) {
            addCriterion("SSName <", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameLessThanOrEqualTo(String value) {
            addCriterion("SSName <=", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameLike(String value) {
            addCriterion("SSName like", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameNotLike(String value) {
            addCriterion("SSName not like", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameIn(List<String> values) {
            addCriterion("SSName in", values, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameNotIn(List<String> values) {
            addCriterion("SSName not in", values, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameBetween(String value1, String value2) {
            addCriterion("SSName between", value1, value2, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameNotBetween(String value1, String value2) {
            addCriterion("SSName not between", value1, value2, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentIsNull() {
            addCriterion("SSDepartment is null");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentIsNotNull() {
            addCriterion("SSDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentEqualTo(String value) {
            addCriterion("SSDepartment =", value, "ssdepartment");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentNotEqualTo(String value) {
            addCriterion("SSDepartment <>", value, "ssdepartment");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentGreaterThan(String value) {
            addCriterion("SSDepartment >", value, "ssdepartment");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("SSDepartment >=", value, "ssdepartment");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentLessThan(String value) {
            addCriterion("SSDepartment <", value, "ssdepartment");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentLessThanOrEqualTo(String value) {
            addCriterion("SSDepartment <=", value, "ssdepartment");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentLike(String value) {
            addCriterion("SSDepartment like", value, "ssdepartment");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentNotLike(String value) {
            addCriterion("SSDepartment not like", value, "ssdepartment");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentIn(List<String> values) {
            addCriterion("SSDepartment in", values, "ssdepartment");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentNotIn(List<String> values) {
            addCriterion("SSDepartment not in", values, "ssdepartment");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentBetween(String value1, String value2) {
            addCriterion("SSDepartment between", value1, value2, "ssdepartment");
            return (Criteria) this;
        }

        public Criteria andSsdepartmentNotBetween(String value1, String value2) {
            addCriterion("SSDepartment not between", value1, value2, "ssdepartment");
            return (Criteria) this;
        }

        public Criteria andSssnameIsNull() {
            addCriterion("SSSName is null");
            return (Criteria) this;
        }

        public Criteria andSssnameIsNotNull() {
            addCriterion("SSSName is not null");
            return (Criteria) this;
        }

        public Criteria andSssnameEqualTo(String value) {
            addCriterion("SSSName =", value, "sssname");
            return (Criteria) this;
        }

        public Criteria andSssnameNotEqualTo(String value) {
            addCriterion("SSSName <>", value, "sssname");
            return (Criteria) this;
        }

        public Criteria andSssnameGreaterThan(String value) {
            addCriterion("SSSName >", value, "sssname");
            return (Criteria) this;
        }

        public Criteria andSssnameGreaterThanOrEqualTo(String value) {
            addCriterion("SSSName >=", value, "sssname");
            return (Criteria) this;
        }

        public Criteria andSssnameLessThan(String value) {
            addCriterion("SSSName <", value, "sssname");
            return (Criteria) this;
        }

        public Criteria andSssnameLessThanOrEqualTo(String value) {
            addCriterion("SSSName <=", value, "sssname");
            return (Criteria) this;
        }

        public Criteria andSssnameLike(String value) {
            addCriterion("SSSName like", value, "sssname");
            return (Criteria) this;
        }

        public Criteria andSssnameNotLike(String value) {
            addCriterion("SSSName not like", value, "sssname");
            return (Criteria) this;
        }

        public Criteria andSssnameIn(List<String> values) {
            addCriterion("SSSName in", values, "sssname");
            return (Criteria) this;
        }

        public Criteria andSssnameNotIn(List<String> values) {
            addCriterion("SSSName not in", values, "sssname");
            return (Criteria) this;
        }

        public Criteria andSssnameBetween(String value1, String value2) {
            addCriterion("SSSName between", value1, value2, "sssname");
            return (Criteria) this;
        }

        public Criteria andSssnameNotBetween(String value1, String value2) {
            addCriterion("SSSName not between", value1, value2, "sssname");
            return (Criteria) this;
        }

        public Criteria andSsstypeIsNull() {
            addCriterion("SSSType is null");
            return (Criteria) this;
        }

        public Criteria andSsstypeIsNotNull() {
            addCriterion("SSSType is not null");
            return (Criteria) this;
        }

        public Criteria andSsstypeEqualTo(String value) {
            addCriterion("SSSType =", value, "ssstype");
            return (Criteria) this;
        }

        public Criteria andSsstypeNotEqualTo(String value) {
            addCriterion("SSSType <>", value, "ssstype");
            return (Criteria) this;
        }

        public Criteria andSsstypeGreaterThan(String value) {
            addCriterion("SSSType >", value, "ssstype");
            return (Criteria) this;
        }

        public Criteria andSsstypeGreaterThanOrEqualTo(String value) {
            addCriterion("SSSType >=", value, "ssstype");
            return (Criteria) this;
        }

        public Criteria andSsstypeLessThan(String value) {
            addCriterion("SSSType <", value, "ssstype");
            return (Criteria) this;
        }

        public Criteria andSsstypeLessThanOrEqualTo(String value) {
            addCriterion("SSSType <=", value, "ssstype");
            return (Criteria) this;
        }

        public Criteria andSsstypeLike(String value) {
            addCriterion("SSSType like", value, "ssstype");
            return (Criteria) this;
        }

        public Criteria andSsstypeNotLike(String value) {
            addCriterion("SSSType not like", value, "ssstype");
            return (Criteria) this;
        }

        public Criteria andSsstypeIn(List<String> values) {
            addCriterion("SSSType in", values, "ssstype");
            return (Criteria) this;
        }

        public Criteria andSsstypeNotIn(List<String> values) {
            addCriterion("SSSType not in", values, "ssstype");
            return (Criteria) this;
        }

        public Criteria andSsstypeBetween(String value1, String value2) {
            addCriterion("SSSType between", value1, value2, "ssstype");
            return (Criteria) this;
        }

        public Criteria andSsstypeNotBetween(String value1, String value2) {
            addCriterion("SSSType not between", value1, value2, "ssstype");
            return (Criteria) this;
        }

        public Criteria andSssnumberIsNull() {
            addCriterion("SSSNumber is null");
            return (Criteria) this;
        }

        public Criteria andSssnumberIsNotNull() {
            addCriterion("SSSNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSssnumberEqualTo(String value) {
            addCriterion("SSSNumber =", value, "sssnumber");
            return (Criteria) this;
        }

        public Criteria andSssnumberNotEqualTo(String value) {
            addCriterion("SSSNumber <>", value, "sssnumber");
            return (Criteria) this;
        }

        public Criteria andSssnumberGreaterThan(String value) {
            addCriterion("SSSNumber >", value, "sssnumber");
            return (Criteria) this;
        }

        public Criteria andSssnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SSSNumber >=", value, "sssnumber");
            return (Criteria) this;
        }

        public Criteria andSssnumberLessThan(String value) {
            addCriterion("SSSNumber <", value, "sssnumber");
            return (Criteria) this;
        }

        public Criteria andSssnumberLessThanOrEqualTo(String value) {
            addCriterion("SSSNumber <=", value, "sssnumber");
            return (Criteria) this;
        }

        public Criteria andSssnumberLike(String value) {
            addCriterion("SSSNumber like", value, "sssnumber");
            return (Criteria) this;
        }

        public Criteria andSssnumberNotLike(String value) {
            addCriterion("SSSNumber not like", value, "sssnumber");
            return (Criteria) this;
        }

        public Criteria andSssnumberIn(List<String> values) {
            addCriterion("SSSNumber in", values, "sssnumber");
            return (Criteria) this;
        }

        public Criteria andSssnumberNotIn(List<String> values) {
            addCriterion("SSSNumber not in", values, "sssnumber");
            return (Criteria) this;
        }

        public Criteria andSssnumberBetween(String value1, String value2) {
            addCriterion("SSSNumber between", value1, value2, "sssnumber");
            return (Criteria) this;
        }

        public Criteria andSssnumberNotBetween(String value1, String value2) {
            addCriterion("SSSNumber not between", value1, value2, "sssnumber");
            return (Criteria) this;
        }

        public Criteria andSstimeIsNull() {
            addCriterion("SSTime is null");
            return (Criteria) this;
        }

        public Criteria andSstimeIsNotNull() {
            addCriterion("SSTime is not null");
            return (Criteria) this;
        }

        public Criteria andSstimeEqualTo(Float value) {
            addCriterion("SSTime =", value, "sstime");
            return (Criteria) this;
        }

        public Criteria andSstimeNotEqualTo(Float value) {
            addCriterion("SSTime <>", value, "sstime");
            return (Criteria) this;
        }

        public Criteria andSstimeGreaterThan(Float value) {
            addCriterion("SSTime >", value, "sstime");
            return (Criteria) this;
        }

        public Criteria andSstimeGreaterThanOrEqualTo(Float value) {
            addCriterion("SSTime >=", value, "sstime");
            return (Criteria) this;
        }

        public Criteria andSstimeLessThan(Float value) {
            addCriterion("SSTime <", value, "sstime");
            return (Criteria) this;
        }

        public Criteria andSstimeLessThanOrEqualTo(Float value) {
            addCriterion("SSTime <=", value, "sstime");
            return (Criteria) this;
        }

        public Criteria andSstimeIn(List<Float> values) {
            addCriterion("SSTime in", values, "sstime");
            return (Criteria) this;
        }

        public Criteria andSstimeNotIn(List<Float> values) {
            addCriterion("SSTime not in", values, "sstime");
            return (Criteria) this;
        }

        public Criteria andSstimeBetween(Float value1, Float value2) {
            addCriterion("SSTime between", value1, value2, "sstime");
            return (Criteria) this;
        }

        public Criteria andSstimeNotBetween(Float value1, Float value2) {
            addCriterion("SSTime not between", value1, value2, "sstime");
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