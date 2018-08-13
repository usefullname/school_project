package com.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class RkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RkExample() {
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

        public Criteria andRknoIsNull() {
            addCriterion("RKNo is null");
            return (Criteria) this;
        }

        public Criteria andRknoIsNotNull() {
            addCriterion("RKNo is not null");
            return (Criteria) this;
        }

        public Criteria andRknoEqualTo(Integer value) {
            addCriterion("RKNo =", value, "rkno");
            return (Criteria) this;
        }

        public Criteria andRknoNotEqualTo(Integer value) {
            addCriterion("RKNo <>", value, "rkno");
            return (Criteria) this;
        }

        public Criteria andRknoGreaterThan(Integer value) {
            addCriterion("RKNo >", value, "rkno");
            return (Criteria) this;
        }

        public Criteria andRknoGreaterThanOrEqualTo(Integer value) {
            addCriterion("RKNo >=", value, "rkno");
            return (Criteria) this;
        }

        public Criteria andRknoLessThan(Integer value) {
            addCriterion("RKNo <", value, "rkno");
            return (Criteria) this;
        }

        public Criteria andRknoLessThanOrEqualTo(Integer value) {
            addCriterion("RKNo <=", value, "rkno");
            return (Criteria) this;
        }

        public Criteria andRknoIn(List<Integer> values) {
            addCriterion("RKNo in", values, "rkno");
            return (Criteria) this;
        }

        public Criteria andRknoNotIn(List<Integer> values) {
            addCriterion("RKNo not in", values, "rkno");
            return (Criteria) this;
        }

        public Criteria andRknoBetween(Integer value1, Integer value2) {
            addCriterion("RKNo between", value1, value2, "rkno");
            return (Criteria) this;
        }

        public Criteria andRknoNotBetween(Integer value1, Integer value2) {
            addCriterion("RKNo not between", value1, value2, "rkno");
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

        public Criteria andRknumberIsNull() {
            addCriterion("RKNumber is null");
            return (Criteria) this;
        }

        public Criteria andRknumberIsNotNull() {
            addCriterion("RKNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRknumberEqualTo(String value) {
            addCriterion("RKNumber =", value, "rknumber");
            return (Criteria) this;
        }

        public Criteria andRknumberNotEqualTo(String value) {
            addCriterion("RKNumber <>", value, "rknumber");
            return (Criteria) this;
        }

        public Criteria andRknumberGreaterThan(String value) {
            addCriterion("RKNumber >", value, "rknumber");
            return (Criteria) this;
        }

        public Criteria andRknumberGreaterThanOrEqualTo(String value) {
            addCriterion("RKNumber >=", value, "rknumber");
            return (Criteria) this;
        }

        public Criteria andRknumberLessThan(String value) {
            addCriterion("RKNumber <", value, "rknumber");
            return (Criteria) this;
        }

        public Criteria andRknumberLessThanOrEqualTo(String value) {
            addCriterion("RKNumber <=", value, "rknumber");
            return (Criteria) this;
        }

        public Criteria andRknumberLike(String value) {
            addCriterion("RKNumber like", value, "rknumber");
            return (Criteria) this;
        }

        public Criteria andRknumberNotLike(String value) {
            addCriterion("RKNumber not like", value, "rknumber");
            return (Criteria) this;
        }

        public Criteria andRknumberIn(List<String> values) {
            addCriterion("RKNumber in", values, "rknumber");
            return (Criteria) this;
        }

        public Criteria andRknumberNotIn(List<String> values) {
            addCriterion("RKNumber not in", values, "rknumber");
            return (Criteria) this;
        }

        public Criteria andRknumberBetween(String value1, String value2) {
            addCriterion("RKNumber between", value1, value2, "rknumber");
            return (Criteria) this;
        }

        public Criteria andRknumberNotBetween(String value1, String value2) {
            addCriterion("RKNumber not between", value1, value2, "rknumber");
            return (Criteria) this;
        }

        public Criteria andRkpersonIsNull() {
            addCriterion("RKPerson is null");
            return (Criteria) this;
        }

        public Criteria andRkpersonIsNotNull() {
            addCriterion("RKPerson is not null");
            return (Criteria) this;
        }

        public Criteria andRkpersonEqualTo(String value) {
            addCriterion("RKPerson =", value, "rkperson");
            return (Criteria) this;
        }

        public Criteria andRkpersonNotEqualTo(String value) {
            addCriterion("RKPerson <>", value, "rkperson");
            return (Criteria) this;
        }

        public Criteria andRkpersonGreaterThan(String value) {
            addCriterion("RKPerson >", value, "rkperson");
            return (Criteria) this;
        }

        public Criteria andRkpersonGreaterThanOrEqualTo(String value) {
            addCriterion("RKPerson >=", value, "rkperson");
            return (Criteria) this;
        }

        public Criteria andRkpersonLessThan(String value) {
            addCriterion("RKPerson <", value, "rkperson");
            return (Criteria) this;
        }

        public Criteria andRkpersonLessThanOrEqualTo(String value) {
            addCriterion("RKPerson <=", value, "rkperson");
            return (Criteria) this;
        }

        public Criteria andRkpersonLike(String value) {
            addCriterion("RKPerson like", value, "rkperson");
            return (Criteria) this;
        }

        public Criteria andRkpersonNotLike(String value) {
            addCriterion("RKPerson not like", value, "rkperson");
            return (Criteria) this;
        }

        public Criteria andRkpersonIn(List<String> values) {
            addCriterion("RKPerson in", values, "rkperson");
            return (Criteria) this;
        }

        public Criteria andRkpersonNotIn(List<String> values) {
            addCriterion("RKPerson not in", values, "rkperson");
            return (Criteria) this;
        }

        public Criteria andRkpersonBetween(String value1, String value2) {
            addCriterion("RKPerson between", value1, value2, "rkperson");
            return (Criteria) this;
        }

        public Criteria andRkpersonNotBetween(String value1, String value2) {
            addCriterion("RKPerson not between", value1, value2, "rkperson");
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