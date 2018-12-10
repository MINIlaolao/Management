package com.laoqixin.bean;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpAgeIsNull() {
            addCriterion("emp_age is null");
            return (Criteria) this;
        }

        public Criteria andEmpAgeIsNotNull() {
            addCriterion("emp_age is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAgeEqualTo(Integer value) {
            addCriterion("emp_age =", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeNotEqualTo(Integer value) {
            addCriterion("emp_age <>", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeGreaterThan(Integer value) {
            addCriterion("emp_age >", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_age >=", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeLessThan(Integer value) {
            addCriterion("emp_age <", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeLessThanOrEqualTo(Integer value) {
            addCriterion("emp_age <=", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeIn(List<Integer> values) {
            addCriterion("emp_age in", values, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeNotIn(List<Integer> values) {
            addCriterion("emp_age not in", values, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeBetween(Integer value1, Integer value2) {
            addCriterion("emp_age between", value1, value2, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_age not between", value1, value2, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpIncomeIsNull() {
            addCriterion("emp_income is null");
            return (Criteria) this;
        }

        public Criteria andEmpIncomeIsNotNull() {
            addCriterion("emp_income is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIncomeEqualTo(Double value) {
            addCriterion("emp_income =", value, "empIncome");
            return (Criteria) this;
        }

        public Criteria andEmpIncomeNotEqualTo(Double value) {
            addCriterion("emp_income <>", value, "empIncome");
            return (Criteria) this;
        }

        public Criteria andEmpIncomeGreaterThan(Double value) {
            addCriterion("emp_income >", value, "empIncome");
            return (Criteria) this;
        }

        public Criteria andEmpIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("emp_income >=", value, "empIncome");
            return (Criteria) this;
        }

        public Criteria andEmpIncomeLessThan(Double value) {
            addCriterion("emp_income <", value, "empIncome");
            return (Criteria) this;
        }

        public Criteria andEmpIncomeLessThanOrEqualTo(Double value) {
            addCriterion("emp_income <=", value, "empIncome");
            return (Criteria) this;
        }

        public Criteria andEmpIncomeIn(List<Double> values) {
            addCriterion("emp_income in", values, "empIncome");
            return (Criteria) this;
        }

        public Criteria andEmpIncomeNotIn(List<Double> values) {
            addCriterion("emp_income not in", values, "empIncome");
            return (Criteria) this;
        }

        public Criteria andEmpIncomeBetween(Double value1, Double value2) {
            addCriterion("emp_income between", value1, value2, "empIncome");
            return (Criteria) this;
        }

        public Criteria andEmpIncomeNotBetween(Double value1, Double value2) {
            addCriterion("emp_income not between", value1, value2, "empIncome");
            return (Criteria) this;
        }

        public Criteria andEmpDepartIsNull() {
            addCriterion("emp_depart is null");
            return (Criteria) this;
        }

        public Criteria andEmpDepartIsNotNull() {
            addCriterion("emp_depart is not null");
            return (Criteria) this;
        }

        public Criteria andEmpDepartEqualTo(String value) {
            addCriterion("emp_depart =", value, "empDepart");
            return (Criteria) this;
        }

        public Criteria andEmpDepartNotEqualTo(String value) {
            addCriterion("emp_depart <>", value, "empDepart");
            return (Criteria) this;
        }

        public Criteria andEmpDepartGreaterThan(String value) {
            addCriterion("emp_depart >", value, "empDepart");
            return (Criteria) this;
        }

        public Criteria andEmpDepartGreaterThanOrEqualTo(String value) {
            addCriterion("emp_depart >=", value, "empDepart");
            return (Criteria) this;
        }

        public Criteria andEmpDepartLessThan(String value) {
            addCriterion("emp_depart <", value, "empDepart");
            return (Criteria) this;
        }

        public Criteria andEmpDepartLessThanOrEqualTo(String value) {
            addCriterion("emp_depart <=", value, "empDepart");
            return (Criteria) this;
        }

        public Criteria andEmpDepartLike(String value) {
            addCriterion("emp_depart like", value, "empDepart");
            return (Criteria) this;
        }

        public Criteria andEmpDepartNotLike(String value) {
            addCriterion("emp_depart not like", value, "empDepart");
            return (Criteria) this;
        }

        public Criteria andEmpDepartIn(List<String> values) {
            addCriterion("emp_depart in", values, "empDepart");
            return (Criteria) this;
        }

        public Criteria andEmpDepartNotIn(List<String> values) {
            addCriterion("emp_depart not in", values, "empDepart");
            return (Criteria) this;
        }

        public Criteria andEmpDepartBetween(String value1, String value2) {
            addCriterion("emp_depart between", value1, value2, "empDepart");
            return (Criteria) this;
        }

        public Criteria andEmpDepartNotBetween(String value1, String value2) {
            addCriterion("emp_depart not between", value1, value2, "empDepart");
            return (Criteria) this;
        }

        public Criteria andEmpPositionIsNull() {
            addCriterion("emp_position is null");
            return (Criteria) this;
        }

        public Criteria andEmpPositionIsNotNull() {
            addCriterion("emp_position is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPositionEqualTo(String value) {
            addCriterion("emp_position =", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionNotEqualTo(String value) {
            addCriterion("emp_position <>", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionGreaterThan(String value) {
            addCriterion("emp_position >", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionGreaterThanOrEqualTo(String value) {
            addCriterion("emp_position >=", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionLessThan(String value) {
            addCriterion("emp_position <", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionLessThanOrEqualTo(String value) {
            addCriterion("emp_position <=", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionLike(String value) {
            addCriterion("emp_position like", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionNotLike(String value) {
            addCriterion("emp_position not like", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionIn(List<String> values) {
            addCriterion("emp_position in", values, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionNotIn(List<String> values) {
            addCriterion("emp_position not in", values, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionBetween(String value1, String value2) {
            addCriterion("emp_position between", value1, value2, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionNotBetween(String value1, String value2) {
            addCriterion("emp_position not between", value1, value2, "empPosition");
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