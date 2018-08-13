package com.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdministratorsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdministratorsExample() {
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

        public Criteria andAnameIsNull() {
            addCriterion("AName is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("AName is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("AName =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("AName <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("AName >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("AName >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("AName <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("AName <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("AName like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("AName not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("AName in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("AName not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("AName between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("AName not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAsexIsNull() {
            addCriterion("ASex is null");
            return (Criteria) this;
        }

        public Criteria andAsexIsNotNull() {
            addCriterion("ASex is not null");
            return (Criteria) this;
        }

        public Criteria andAsexEqualTo(String value) {
            addCriterion("ASex =", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexNotEqualTo(String value) {
            addCriterion("ASex <>", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexGreaterThan(String value) {
            addCriterion("ASex >", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexGreaterThanOrEqualTo(String value) {
            addCriterion("ASex >=", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexLessThan(String value) {
            addCriterion("ASex <", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexLessThanOrEqualTo(String value) {
            addCriterion("ASex <=", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexLike(String value) {
            addCriterion("ASex like", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexNotLike(String value) {
            addCriterion("ASex not like", value, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexIn(List<String> values) {
            addCriterion("ASex in", values, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexNotIn(List<String> values) {
            addCriterion("ASex not in", values, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexBetween(String value1, String value2) {
            addCriterion("ASex between", value1, value2, "asex");
            return (Criteria) this;
        }

        public Criteria andAsexNotBetween(String value1, String value2) {
            addCriterion("ASex not between", value1, value2, "asex");
            return (Criteria) this;
        }

        public Criteria andAtelIsNull() {
            addCriterion("ATel is null");
            return (Criteria) this;
        }

        public Criteria andAtelIsNotNull() {
            addCriterion("ATel is not null");
            return (Criteria) this;
        }

        public Criteria andAtelEqualTo(String value) {
            addCriterion("ATel =", value, "atel");
            return (Criteria) this;
        }

        public Criteria andAtelNotEqualTo(String value) {
            addCriterion("ATel <>", value, "atel");
            return (Criteria) this;
        }

        public Criteria andAtelGreaterThan(String value) {
            addCriterion("ATel >", value, "atel");
            return (Criteria) this;
        }

        public Criteria andAtelGreaterThanOrEqualTo(String value) {
            addCriterion("ATel >=", value, "atel");
            return (Criteria) this;
        }

        public Criteria andAtelLessThan(String value) {
            addCriterion("ATel <", value, "atel");
            return (Criteria) this;
        }

        public Criteria andAtelLessThanOrEqualTo(String value) {
            addCriterion("ATel <=", value, "atel");
            return (Criteria) this;
        }

        public Criteria andAtelLike(String value) {
            addCriterion("ATel like", value, "atel");
            return (Criteria) this;
        }

        public Criteria andAtelNotLike(String value) {
            addCriterion("ATel not like", value, "atel");
            return (Criteria) this;
        }

        public Criteria andAtelIn(List<String> values) {
            addCriterion("ATel in", values, "atel");
            return (Criteria) this;
        }

        public Criteria andAtelNotIn(List<String> values) {
            addCriterion("ATel not in", values, "atel");
            return (Criteria) this;
        }

        public Criteria andAtelBetween(String value1, String value2) {
            addCriterion("ATel between", value1, value2, "atel");
            return (Criteria) this;
        }

        public Criteria andAtelNotBetween(String value1, String value2) {
            addCriterion("ATel not between", value1, value2, "atel");
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