package com.office.pojo;

import java.util.ArrayList;
import java.util.List;

public class SqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SqExample() {
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

        public Criteria andUunameIsNull() {
            addCriterion("UUName is null");
            return (Criteria) this;
        }

        public Criteria andUunameIsNotNull() {
            addCriterion("UUName is not null");
            return (Criteria) this;
        }

        public Criteria andUunameEqualTo(String value) {
            addCriterion("UUName =", value, "uuname");
            return (Criteria) this;
        }

        public Criteria andUunameNotEqualTo(String value) {
            addCriterion("UUName <>", value, "uuname");
            return (Criteria) this;
        }

        public Criteria andUunameGreaterThan(String value) {
            addCriterion("UUName >", value, "uuname");
            return (Criteria) this;
        }

        public Criteria andUunameGreaterThanOrEqualTo(String value) {
            addCriterion("UUName >=", value, "uuname");
            return (Criteria) this;
        }

        public Criteria andUunameLessThan(String value) {
            addCriterion("UUName <", value, "uuname");
            return (Criteria) this;
        }

        public Criteria andUunameLessThanOrEqualTo(String value) {
            addCriterion("UUName <=", value, "uuname");
            return (Criteria) this;
        }

        public Criteria andUunameLike(String value) {
            addCriterion("UUName like", value, "uuname");
            return (Criteria) this;
        }

        public Criteria andUunameNotLike(String value) {
            addCriterion("UUName not like", value, "uuname");
            return (Criteria) this;
        }

        public Criteria andUunameIn(List<String> values) {
            addCriterion("UUName in", values, "uuname");
            return (Criteria) this;
        }

        public Criteria andUunameNotIn(List<String> values) {
            addCriterion("UUName not in", values, "uuname");
            return (Criteria) this;
        }

        public Criteria andUunameBetween(String value1, String value2) {
            addCriterion("UUName between", value1, value2, "uuname");
            return (Criteria) this;
        }

        public Criteria andUunameNotBetween(String value1, String value2) {
            addCriterion("UUName not between", value1, value2, "uuname");
            return (Criteria) this;
        }

        public Criteria andUudepartmentIsNull() {
            addCriterion("UUDepartment is null");
            return (Criteria) this;
        }

        public Criteria andUudepartmentIsNotNull() {
            addCriterion("UUDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andUudepartmentEqualTo(String value) {
            addCriterion("UUDepartment =", value, "uudepartment");
            return (Criteria) this;
        }

        public Criteria andUudepartmentNotEqualTo(String value) {
            addCriterion("UUDepartment <>", value, "uudepartment");
            return (Criteria) this;
        }

        public Criteria andUudepartmentGreaterThan(String value) {
            addCriterion("UUDepartment >", value, "uudepartment");
            return (Criteria) this;
        }

        public Criteria andUudepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("UUDepartment >=", value, "uudepartment");
            return (Criteria) this;
        }

        public Criteria andUudepartmentLessThan(String value) {
            addCriterion("UUDepartment <", value, "uudepartment");
            return (Criteria) this;
        }

        public Criteria andUudepartmentLessThanOrEqualTo(String value) {
            addCriterion("UUDepartment <=", value, "uudepartment");
            return (Criteria) this;
        }

        public Criteria andUudepartmentLike(String value) {
            addCriterion("UUDepartment like", value, "uudepartment");
            return (Criteria) this;
        }

        public Criteria andUudepartmentNotLike(String value) {
            addCriterion("UUDepartment not like", value, "uudepartment");
            return (Criteria) this;
        }

        public Criteria andUudepartmentIn(List<String> values) {
            addCriterion("UUDepartment in", values, "uudepartment");
            return (Criteria) this;
        }

        public Criteria andUudepartmentNotIn(List<String> values) {
            addCriterion("UUDepartment not in", values, "uudepartment");
            return (Criteria) this;
        }

        public Criteria andUudepartmentBetween(String value1, String value2) {
            addCriterion("UUDepartment between", value1, value2, "uudepartment");
            return (Criteria) this;
        }

        public Criteria andUudepartmentNotBetween(String value1, String value2) {
            addCriterion("UUDepartment not between", value1, value2, "uudepartment");
            return (Criteria) this;
        }

        public Criteria andUstypeIsNull() {
            addCriterion("USType is null");
            return (Criteria) this;
        }

        public Criteria andUstypeIsNotNull() {
            addCriterion("USType is not null");
            return (Criteria) this;
        }

        public Criteria andUstypeEqualTo(String value) {
            addCriterion("USType =", value, "ustype");
            return (Criteria) this;
        }

        public Criteria andUstypeNotEqualTo(String value) {
            addCriterion("USType <>", value, "ustype");
            return (Criteria) this;
        }

        public Criteria andUstypeGreaterThan(String value) {
            addCriterion("USType >", value, "ustype");
            return (Criteria) this;
        }

        public Criteria andUstypeGreaterThanOrEqualTo(String value) {
            addCriterion("USType >=", value, "ustype");
            return (Criteria) this;
        }

        public Criteria andUstypeLessThan(String value) {
            addCriterion("USType <", value, "ustype");
            return (Criteria) this;
        }

        public Criteria andUstypeLessThanOrEqualTo(String value) {
            addCriterion("USType <=", value, "ustype");
            return (Criteria) this;
        }

        public Criteria andUstypeLike(String value) {
            addCriterion("USType like", value, "ustype");
            return (Criteria) this;
        }

        public Criteria andUstypeNotLike(String value) {
            addCriterion("USType not like", value, "ustype");
            return (Criteria) this;
        }

        public Criteria andUstypeIn(List<String> values) {
            addCriterion("USType in", values, "ustype");
            return (Criteria) this;
        }

        public Criteria andUstypeNotIn(List<String> values) {
            addCriterion("USType not in", values, "ustype");
            return (Criteria) this;
        }

        public Criteria andUstypeBetween(String value1, String value2) {
            addCriterion("USType between", value1, value2, "ustype");
            return (Criteria) this;
        }

        public Criteria andUstypeNotBetween(String value1, String value2) {
            addCriterion("USType not between", value1, value2, "ustype");
            return (Criteria) this;
        }

        public Criteria andUsnameIsNull() {
            addCriterion("USName is null");
            return (Criteria) this;
        }

        public Criteria andUsnameIsNotNull() {
            addCriterion("USName is not null");
            return (Criteria) this;
        }

        public Criteria andUsnameEqualTo(String value) {
            addCriterion("USName =", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotEqualTo(String value) {
            addCriterion("USName <>", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameGreaterThan(String value) {
            addCriterion("USName >", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameGreaterThanOrEqualTo(String value) {
            addCriterion("USName >=", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameLessThan(String value) {
            addCriterion("USName <", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameLessThanOrEqualTo(String value) {
            addCriterion("USName <=", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameLike(String value) {
            addCriterion("USName like", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotLike(String value) {
            addCriterion("USName not like", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameIn(List<String> values) {
            addCriterion("USName in", values, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotIn(List<String> values) {
            addCriterion("USName not in", values, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameBetween(String value1, String value2) {
            addCriterion("USName between", value1, value2, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotBetween(String value1, String value2) {
            addCriterion("USName not between", value1, value2, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnumberIsNull() {
            addCriterion("USNumber is null");
            return (Criteria) this;
        }

        public Criteria andUsnumberIsNotNull() {
            addCriterion("USNumber is not null");
            return (Criteria) this;
        }

        public Criteria andUsnumberEqualTo(Integer value) {
            addCriterion("USNumber =", value, "usnumber");
            return (Criteria) this;
        }

        public Criteria andUsnumberNotEqualTo(Integer value) {
            addCriterion("USNumber <>", value, "usnumber");
            return (Criteria) this;
        }

        public Criteria andUsnumberGreaterThan(Integer value) {
            addCriterion("USNumber >", value, "usnumber");
            return (Criteria) this;
        }

        public Criteria andUsnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("USNumber >=", value, "usnumber");
            return (Criteria) this;
        }

        public Criteria andUsnumberLessThan(Integer value) {
            addCriterion("USNumber <", value, "usnumber");
            return (Criteria) this;
        }

        public Criteria andUsnumberLessThanOrEqualTo(Integer value) {
            addCriterion("USNumber <=", value, "usnumber");
            return (Criteria) this;
        }

        public Criteria andUsnumberIn(List<Integer> values) {
            addCriterion("USNumber in", values, "usnumber");
            return (Criteria) this;
        }

        public Criteria andUsnumberNotIn(List<Integer> values) {
            addCriterion("USNumber not in", values, "usnumber");
            return (Criteria) this;
        }

        public Criteria andUsnumberBetween(Integer value1, Integer value2) {
            addCriterion("USNumber between", value1, value2, "usnumber");
            return (Criteria) this;
        }

        public Criteria andUsnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("USNumber not between", value1, value2, "usnumber");
            return (Criteria) this;
        }

        public Criteria andUanameIsNull() {
            addCriterion("UAName is null");
            return (Criteria) this;
        }

        public Criteria andUanameIsNotNull() {
            addCriterion("UAName is not null");
            return (Criteria) this;
        }

        public Criteria andUanameEqualTo(String value) {
            addCriterion("UAName =", value, "uaname");
            return (Criteria) this;
        }

        public Criteria andUanameNotEqualTo(String value) {
            addCriterion("UAName <>", value, "uaname");
            return (Criteria) this;
        }

        public Criteria andUanameGreaterThan(String value) {
            addCriterion("UAName >", value, "uaname");
            return (Criteria) this;
        }

        public Criteria andUanameGreaterThanOrEqualTo(String value) {
            addCriterion("UAName >=", value, "uaname");
            return (Criteria) this;
        }

        public Criteria andUanameLessThan(String value) {
            addCriterion("UAName <", value, "uaname");
            return (Criteria) this;
        }

        public Criteria andUanameLessThanOrEqualTo(String value) {
            addCriterion("UAName <=", value, "uaname");
            return (Criteria) this;
        }

        public Criteria andUanameLike(String value) {
            addCriterion("UAName like", value, "uaname");
            return (Criteria) this;
        }

        public Criteria andUanameNotLike(String value) {
            addCriterion("UAName not like", value, "uaname");
            return (Criteria) this;
        }

        public Criteria andUanameIn(List<String> values) {
            addCriterion("UAName in", values, "uaname");
            return (Criteria) this;
        }

        public Criteria andUanameNotIn(List<String> values) {
            addCriterion("UAName not in", values, "uaname");
            return (Criteria) this;
        }

        public Criteria andUanameBetween(String value1, String value2) {
            addCriterion("UAName between", value1, value2, "uaname");
            return (Criteria) this;
        }

        public Criteria andUanameNotBetween(String value1, String value2) {
            addCriterion("UAName not between", value1, value2, "uaname");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("UTime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("UTime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Float value) {
            addCriterion("UTime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Float value) {
            addCriterion("UTime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Float value) {
            addCriterion("UTime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Float value) {
            addCriterion("UTime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Float value) {
            addCriterion("UTime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Float value) {
            addCriterion("UTime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Float> values) {
            addCriterion("UTime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Float> values) {
            addCriterion("UTime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Float value1, Float value2) {
            addCriterion("UTime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Float value1, Float value2) {
            addCriterion("UTime not between", value1, value2, "utime");
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