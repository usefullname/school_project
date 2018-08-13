package com.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class StorehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StorehouseExample() {
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

        public Criteria andSnoIsNull() {
            addCriterion("SNo is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("SNo is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(Integer value) {
            addCriterion("SNo =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(Integer value) {
            addCriterion("SNo <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(Integer value) {
            addCriterion("SNo >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SNo >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(Integer value) {
            addCriterion("SNo <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(Integer value) {
            addCriterion("SNo <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<Integer> values) {
            addCriterion("SNo in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<Integer> values) {
            addCriterion("SNo not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(Integer value1, Integer value2) {
            addCriterion("SNo between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(Integer value1, Integer value2) {
            addCriterion("SNo not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("SName is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("SName is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("SName =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("SName <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("SName >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("SName >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("SName <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("SName <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("SName like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("SName not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("SName in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("SName not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("SName between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("SName not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnumberIsNull() {
            addCriterion("SNumber is null");
            return (Criteria) this;
        }

        public Criteria andSnumberIsNotNull() {
            addCriterion("SNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSnumberEqualTo(String value) {
            addCriterion("SNumber =", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotEqualTo(String value) {
            addCriterion("SNumber <>", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberGreaterThan(String value) {
            addCriterion("SNumber >", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SNumber >=", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberLessThan(String value) {
            addCriterion("SNumber <", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberLessThanOrEqualTo(String value) {
            addCriterion("SNumber <=", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberLike(String value) {
            addCriterion("SNumber like", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotLike(String value) {
            addCriterion("SNumber not like", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberIn(List<String> values) {
            addCriterion("SNumber in", values, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotIn(List<String> values) {
            addCriterion("SNumber not in", values, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberBetween(String value1, String value2) {
            addCriterion("SNumber between", value1, value2, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotBetween(String value1, String value2) {
            addCriterion("SNumber not between", value1, value2, "snumber");
            return (Criteria) this;
        }

        public Criteria andScategoryIsNull() {
            addCriterion("SCategory is null");
            return (Criteria) this;
        }

        public Criteria andScategoryIsNotNull() {
            addCriterion("SCategory is not null");
            return (Criteria) this;
        }

        public Criteria andScategoryEqualTo(String value) {
            addCriterion("SCategory =", value, "scategory");
            return (Criteria) this;
        }

        public Criteria andScategoryNotEqualTo(String value) {
            addCriterion("SCategory <>", value, "scategory");
            return (Criteria) this;
        }

        public Criteria andScategoryGreaterThan(String value) {
            addCriterion("SCategory >", value, "scategory");
            return (Criteria) this;
        }

        public Criteria andScategoryGreaterThanOrEqualTo(String value) {
            addCriterion("SCategory >=", value, "scategory");
            return (Criteria) this;
        }

        public Criteria andScategoryLessThan(String value) {
            addCriterion("SCategory <", value, "scategory");
            return (Criteria) this;
        }

        public Criteria andScategoryLessThanOrEqualTo(String value) {
            addCriterion("SCategory <=", value, "scategory");
            return (Criteria) this;
        }

        public Criteria andScategoryLike(String value) {
            addCriterion("SCategory like", value, "scategory");
            return (Criteria) this;
        }

        public Criteria andScategoryNotLike(String value) {
            addCriterion("SCategory not like", value, "scategory");
            return (Criteria) this;
        }

        public Criteria andScategoryIn(List<String> values) {
            addCriterion("SCategory in", values, "scategory");
            return (Criteria) this;
        }

        public Criteria andScategoryNotIn(List<String> values) {
            addCriterion("SCategory not in", values, "scategory");
            return (Criteria) this;
        }

        public Criteria andScategoryBetween(String value1, String value2) {
            addCriterion("SCategory between", value1, value2, "scategory");
            return (Criteria) this;
        }

        public Criteria andScategoryNotBetween(String value1, String value2) {
            addCriterion("SCategory not between", value1, value2, "scategory");
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