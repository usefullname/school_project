package com.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class GlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GlExample() {
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

        public Criteria andGlnoIsNull() {
            addCriterion("GLNo is null");
            return (Criteria) this;
        }

        public Criteria andGlnoIsNotNull() {
            addCriterion("GLNo is not null");
            return (Criteria) this;
        }

        public Criteria andGlnoEqualTo(Integer value) {
            addCriterion("GLNo =", value, "glno");
            return (Criteria) this;
        }

        public Criteria andGlnoNotEqualTo(Integer value) {
            addCriterion("GLNo <>", value, "glno");
            return (Criteria) this;
        }

        public Criteria andGlnoGreaterThan(Integer value) {
            addCriterion("GLNo >", value, "glno");
            return (Criteria) this;
        }

        public Criteria andGlnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLNo >=", value, "glno");
            return (Criteria) this;
        }

        public Criteria andGlnoLessThan(Integer value) {
            addCriterion("GLNo <", value, "glno");
            return (Criteria) this;
        }

        public Criteria andGlnoLessThanOrEqualTo(Integer value) {
            addCriterion("GLNo <=", value, "glno");
            return (Criteria) this;
        }

        public Criteria andGlnoIn(List<Integer> values) {
            addCriterion("GLNo in", values, "glno");
            return (Criteria) this;
        }

        public Criteria andGlnoNotIn(List<Integer> values) {
            addCriterion("GLNo not in", values, "glno");
            return (Criteria) this;
        }

        public Criteria andGlnoBetween(Integer value1, Integer value2) {
            addCriterion("GLNo between", value1, value2, "glno");
            return (Criteria) this;
        }

        public Criteria andGlnoNotBetween(Integer value1, Integer value2) {
            addCriterion("GLNo not between", value1, value2, "glno");
            return (Criteria) this;
        }

        public Criteria andGlnameIsNull() {
            addCriterion("GLName is null");
            return (Criteria) this;
        }

        public Criteria andGlnameIsNotNull() {
            addCriterion("GLName is not null");
            return (Criteria) this;
        }

        public Criteria andGlnameEqualTo(String value) {
            addCriterion("GLName =", value, "glname");
            return (Criteria) this;
        }

        public Criteria andGlnameNotEqualTo(String value) {
            addCriterion("GLName <>", value, "glname");
            return (Criteria) this;
        }

        public Criteria andGlnameGreaterThan(String value) {
            addCriterion("GLName >", value, "glname");
            return (Criteria) this;
        }

        public Criteria andGlnameGreaterThanOrEqualTo(String value) {
            addCriterion("GLName >=", value, "glname");
            return (Criteria) this;
        }

        public Criteria andGlnameLessThan(String value) {
            addCriterion("GLName <", value, "glname");
            return (Criteria) this;
        }

        public Criteria andGlnameLessThanOrEqualTo(String value) {
            addCriterion("GLName <=", value, "glname");
            return (Criteria) this;
        }

        public Criteria andGlnameLike(String value) {
            addCriterion("GLName like", value, "glname");
            return (Criteria) this;
        }

        public Criteria andGlnameNotLike(String value) {
            addCriterion("GLName not like", value, "glname");
            return (Criteria) this;
        }

        public Criteria andGlnameIn(List<String> values) {
            addCriterion("GLName in", values, "glname");
            return (Criteria) this;
        }

        public Criteria andGlnameNotIn(List<String> values) {
            addCriterion("GLName not in", values, "glname");
            return (Criteria) this;
        }

        public Criteria andGlnameBetween(String value1, String value2) {
            addCriterion("GLName between", value1, value2, "glname");
            return (Criteria) this;
        }

        public Criteria andGlnameNotBetween(String value1, String value2) {
            addCriterion("GLName not between", value1, value2, "glname");
            return (Criteria) this;
        }

        public Criteria andGlpassIsNull() {
            addCriterion("GLPass is null");
            return (Criteria) this;
        }

        public Criteria andGlpassIsNotNull() {
            addCriterion("GLPass is not null");
            return (Criteria) this;
        }

        public Criteria andGlpassEqualTo(String value) {
            addCriterion("GLPass =", value, "glpass");
            return (Criteria) this;
        }

        public Criteria andGlpassNotEqualTo(String value) {
            addCriterion("GLPass <>", value, "glpass");
            return (Criteria) this;
        }

        public Criteria andGlpassGreaterThan(String value) {
            addCriterion("GLPass >", value, "glpass");
            return (Criteria) this;
        }

        public Criteria andGlpassGreaterThanOrEqualTo(String value) {
            addCriterion("GLPass >=", value, "glpass");
            return (Criteria) this;
        }

        public Criteria andGlpassLessThan(String value) {
            addCriterion("GLPass <", value, "glpass");
            return (Criteria) this;
        }

        public Criteria andGlpassLessThanOrEqualTo(String value) {
            addCriterion("GLPass <=", value, "glpass");
            return (Criteria) this;
        }

        public Criteria andGlpassLike(String value) {
            addCriterion("GLPass like", value, "glpass");
            return (Criteria) this;
        }

        public Criteria andGlpassNotLike(String value) {
            addCriterion("GLPass not like", value, "glpass");
            return (Criteria) this;
        }

        public Criteria andGlpassIn(List<String> values) {
            addCriterion("GLPass in", values, "glpass");
            return (Criteria) this;
        }

        public Criteria andGlpassNotIn(List<String> values) {
            addCriterion("GLPass not in", values, "glpass");
            return (Criteria) this;
        }

        public Criteria andGlpassBetween(String value1, String value2) {
            addCriterion("GLPass between", value1, value2, "glpass");
            return (Criteria) this;
        }

        public Criteria andGlpassNotBetween(String value1, String value2) {
            addCriterion("GLPass not between", value1, value2, "glpass");
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