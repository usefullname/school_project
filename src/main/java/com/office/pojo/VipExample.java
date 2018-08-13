package com.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class VipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipExample() {
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

        public Criteria andVnameIsNull() {
            addCriterion("VName is null");
            return (Criteria) this;
        }

        public Criteria andVnameIsNotNull() {
            addCriterion("VName is not null");
            return (Criteria) this;
        }

        public Criteria andVnameEqualTo(String value) {
            addCriterion("VName =", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotEqualTo(String value) {
            addCriterion("VName <>", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThan(String value) {
            addCriterion("VName >", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThanOrEqualTo(String value) {
            addCriterion("VName >=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThan(String value) {
            addCriterion("VName <", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThanOrEqualTo(String value) {
            addCriterion("VName <=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLike(String value) {
            addCriterion("VName like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotLike(String value) {
            addCriterion("VName not like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameIn(List<String> values) {
            addCriterion("VName in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotIn(List<String> values) {
            addCriterion("VName not in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameBetween(String value1, String value2) {
            addCriterion("VName between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotBetween(String value1, String value2) {
            addCriterion("VName not between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVpassIsNull() {
            addCriterion("VPass is null");
            return (Criteria) this;
        }

        public Criteria andVpassIsNotNull() {
            addCriterion("VPass is not null");
            return (Criteria) this;
        }

        public Criteria andVpassEqualTo(String value) {
            addCriterion("VPass =", value, "vpass");
            return (Criteria) this;
        }

        public Criteria andVpassNotEqualTo(String value) {
            addCriterion("VPass <>", value, "vpass");
            return (Criteria) this;
        }

        public Criteria andVpassGreaterThan(String value) {
            addCriterion("VPass >", value, "vpass");
            return (Criteria) this;
        }

        public Criteria andVpassGreaterThanOrEqualTo(String value) {
            addCriterion("VPass >=", value, "vpass");
            return (Criteria) this;
        }

        public Criteria andVpassLessThan(String value) {
            addCriterion("VPass <", value, "vpass");
            return (Criteria) this;
        }

        public Criteria andVpassLessThanOrEqualTo(String value) {
            addCriterion("VPass <=", value, "vpass");
            return (Criteria) this;
        }

        public Criteria andVpassLike(String value) {
            addCriterion("VPass like", value, "vpass");
            return (Criteria) this;
        }

        public Criteria andVpassNotLike(String value) {
            addCriterion("VPass not like", value, "vpass");
            return (Criteria) this;
        }

        public Criteria andVpassIn(List<String> values) {
            addCriterion("VPass in", values, "vpass");
            return (Criteria) this;
        }

        public Criteria andVpassNotIn(List<String> values) {
            addCriterion("VPass not in", values, "vpass");
            return (Criteria) this;
        }

        public Criteria andVpassBetween(String value1, String value2) {
            addCriterion("VPass between", value1, value2, "vpass");
            return (Criteria) this;
        }

        public Criteria andVpassNotBetween(String value1, String value2) {
            addCriterion("VPass not between", value1, value2, "vpass");
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