package xiyou.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andEmpNoIsNull() {
            addCriterion("emp_no is null");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNotNull() {
            addCriterion("emp_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNoEqualTo(String value) {
            addCriterion("emp_no =", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotEqualTo(String value) {
            addCriterion("emp_no <>", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThan(String value) {
            addCriterion("emp_no >", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThanOrEqualTo(String value) {
            addCriterion("emp_no >=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThan(String value) {
            addCriterion("emp_no <", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThanOrEqualTo(String value) {
            addCriterion("emp_no <=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLike(String value) {
            addCriterion("emp_no like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotLike(String value) {
            addCriterion("emp_no not like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoIn(List<String> values) {
            addCriterion("emp_no in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotIn(List<String> values) {
            addCriterion("emp_no not in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoBetween(String value1, String value2) {
            addCriterion("emp_no between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotBetween(String value1, String value2) {
            addCriterion("emp_no not between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpPassIsNull() {
            addCriterion("emp_pass is null");
            return (Criteria) this;
        }

        public Criteria andEmpPassIsNotNull() {
            addCriterion("emp_pass is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPassEqualTo(String value) {
            addCriterion("emp_pass =", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassNotEqualTo(String value) {
            addCriterion("emp_pass <>", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassGreaterThan(String value) {
            addCriterion("emp_pass >", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassGreaterThanOrEqualTo(String value) {
            addCriterion("emp_pass >=", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassLessThan(String value) {
            addCriterion("emp_pass <", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassLessThanOrEqualTo(String value) {
            addCriterion("emp_pass <=", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassLike(String value) {
            addCriterion("emp_pass like", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassNotLike(String value) {
            addCriterion("emp_pass not like", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassIn(List<String> values) {
            addCriterion("emp_pass in", values, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassNotIn(List<String> values) {
            addCriterion("emp_pass not in", values, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassBetween(String value1, String value2) {
            addCriterion("emp_pass between", value1, value2, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassNotBetween(String value1, String value2) {
            addCriterion("emp_pass not between", value1, value2, "empPass");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andHeadPathIsNull() {
            addCriterion("head_path is null");
            return (Criteria) this;
        }

        public Criteria andHeadPathIsNotNull() {
            addCriterion("head_path is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPathEqualTo(String value) {
            addCriterion("head_path =", value, "headPath");
            return (Criteria) this;
        }

        public Criteria andHeadPathNotEqualTo(String value) {
            addCriterion("head_path <>", value, "headPath");
            return (Criteria) this;
        }

        public Criteria andHeadPathGreaterThan(String value) {
            addCriterion("head_path >", value, "headPath");
            return (Criteria) this;
        }

        public Criteria andHeadPathGreaterThanOrEqualTo(String value) {
            addCriterion("head_path >=", value, "headPath");
            return (Criteria) this;
        }

        public Criteria andHeadPathLessThan(String value) {
            addCriterion("head_path <", value, "headPath");
            return (Criteria) this;
        }

        public Criteria andHeadPathLessThanOrEqualTo(String value) {
            addCriterion("head_path <=", value, "headPath");
            return (Criteria) this;
        }

        public Criteria andHeadPathLike(String value) {
            addCriterion("head_path like", value, "headPath");
            return (Criteria) this;
        }

        public Criteria andHeadPathNotLike(String value) {
            addCriterion("head_path not like", value, "headPath");
            return (Criteria) this;
        }

        public Criteria andHeadPathIn(List<String> values) {
            addCriterion("head_path in", values, "headPath");
            return (Criteria) this;
        }

        public Criteria andHeadPathNotIn(List<String> values) {
            addCriterion("head_path not in", values, "headPath");
            return (Criteria) this;
        }

        public Criteria andHeadPathBetween(String value1, String value2) {
            addCriterion("head_path between", value1, value2, "headPath");
            return (Criteria) this;
        }

        public Criteria andHeadPathNotBetween(String value1, String value2) {
            addCriterion("head_path not between", value1, value2, "headPath");
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