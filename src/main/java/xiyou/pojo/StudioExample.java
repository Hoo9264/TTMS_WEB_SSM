package xiyou.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudioExample() {
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

        public Criteria andStudioIdIsNull() {
            addCriterion("studio_id is null");
            return (Criteria) this;
        }

        public Criteria andStudioIdIsNotNull() {
            addCriterion("studio_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudioIdEqualTo(Integer value) {
            addCriterion("studio_id =", value, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdNotEqualTo(Integer value) {
            addCriterion("studio_id <>", value, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdGreaterThan(Integer value) {
            addCriterion("studio_id >", value, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("studio_id >=", value, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdLessThan(Integer value) {
            addCriterion("studio_id <", value, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdLessThanOrEqualTo(Integer value) {
            addCriterion("studio_id <=", value, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdIn(List<Integer> values) {
            addCriterion("studio_id in", values, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdNotIn(List<Integer> values) {
            addCriterion("studio_id not in", values, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdBetween(Integer value1, Integer value2) {
            addCriterion("studio_id between", value1, value2, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioIdNotBetween(Integer value1, Integer value2) {
            addCriterion("studio_id not between", value1, value2, "studioId");
            return (Criteria) this;
        }

        public Criteria andStudioNameIsNull() {
            addCriterion("studio_name is null");
            return (Criteria) this;
        }

        public Criteria andStudioNameIsNotNull() {
            addCriterion("studio_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudioNameEqualTo(String value) {
            addCriterion("studio_name =", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameNotEqualTo(String value) {
            addCriterion("studio_name <>", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameGreaterThan(String value) {
            addCriterion("studio_name >", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameGreaterThanOrEqualTo(String value) {
            addCriterion("studio_name >=", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameLessThan(String value) {
            addCriterion("studio_name <", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameLessThanOrEqualTo(String value) {
            addCriterion("studio_name <=", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameLike(String value) {
            addCriterion("studio_name like", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameNotLike(String value) {
            addCriterion("studio_name not like", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameIn(List<String> values) {
            addCriterion("studio_name in", values, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameNotIn(List<String> values) {
            addCriterion("studio_name not in", values, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameBetween(String value1, String value2) {
            addCriterion("studio_name between", value1, value2, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameNotBetween(String value1, String value2) {
            addCriterion("studio_name not between", value1, value2, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioRowCountIsNull() {
            addCriterion("studio_row_count is null");
            return (Criteria) this;
        }

        public Criteria andStudioRowCountIsNotNull() {
            addCriterion("studio_row_count is not null");
            return (Criteria) this;
        }

        public Criteria andStudioRowCountEqualTo(Integer value) {
            addCriterion("studio_row_count =", value, "studioRowCount");
            return (Criteria) this;
        }

        public Criteria andStudioRowCountNotEqualTo(Integer value) {
            addCriterion("studio_row_count <>", value, "studioRowCount");
            return (Criteria) this;
        }

        public Criteria andStudioRowCountGreaterThan(Integer value) {
            addCriterion("studio_row_count >", value, "studioRowCount");
            return (Criteria) this;
        }

        public Criteria andStudioRowCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("studio_row_count >=", value, "studioRowCount");
            return (Criteria) this;
        }

        public Criteria andStudioRowCountLessThan(Integer value) {
            addCriterion("studio_row_count <", value, "studioRowCount");
            return (Criteria) this;
        }

        public Criteria andStudioRowCountLessThanOrEqualTo(Integer value) {
            addCriterion("studio_row_count <=", value, "studioRowCount");
            return (Criteria) this;
        }

        public Criteria andStudioRowCountIn(List<Integer> values) {
            addCriterion("studio_row_count in", values, "studioRowCount");
            return (Criteria) this;
        }

        public Criteria andStudioRowCountNotIn(List<Integer> values) {
            addCriterion("studio_row_count not in", values, "studioRowCount");
            return (Criteria) this;
        }

        public Criteria andStudioRowCountBetween(Integer value1, Integer value2) {
            addCriterion("studio_row_count between", value1, value2, "studioRowCount");
            return (Criteria) this;
        }

        public Criteria andStudioRowCountNotBetween(Integer value1, Integer value2) {
            addCriterion("studio_row_count not between", value1, value2, "studioRowCount");
            return (Criteria) this;
        }

        public Criteria andStudioColCountIsNull() {
            addCriterion("studio_col_count is null");
            return (Criteria) this;
        }

        public Criteria andStudioColCountIsNotNull() {
            addCriterion("studio_col_count is not null");
            return (Criteria) this;
        }

        public Criteria andStudioColCountEqualTo(Integer value) {
            addCriterion("studio_col_count =", value, "studioColCount");
            return (Criteria) this;
        }

        public Criteria andStudioColCountNotEqualTo(Integer value) {
            addCriterion("studio_col_count <>", value, "studioColCount");
            return (Criteria) this;
        }

        public Criteria andStudioColCountGreaterThan(Integer value) {
            addCriterion("studio_col_count >", value, "studioColCount");
            return (Criteria) this;
        }

        public Criteria andStudioColCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("studio_col_count >=", value, "studioColCount");
            return (Criteria) this;
        }

        public Criteria andStudioColCountLessThan(Integer value) {
            addCriterion("studio_col_count <", value, "studioColCount");
            return (Criteria) this;
        }

        public Criteria andStudioColCountLessThanOrEqualTo(Integer value) {
            addCriterion("studio_col_count <=", value, "studioColCount");
            return (Criteria) this;
        }

        public Criteria andStudioColCountIn(List<Integer> values) {
            addCriterion("studio_col_count in", values, "studioColCount");
            return (Criteria) this;
        }

        public Criteria andStudioColCountNotIn(List<Integer> values) {
            addCriterion("studio_col_count not in", values, "studioColCount");
            return (Criteria) this;
        }

        public Criteria andStudioColCountBetween(Integer value1, Integer value2) {
            addCriterion("studio_col_count between", value1, value2, "studioColCount");
            return (Criteria) this;
        }

        public Criteria andStudioColCountNotBetween(Integer value1, Integer value2) {
            addCriterion("studio_col_count not between", value1, value2, "studioColCount");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionIsNull() {
            addCriterion("studio_introduction is null");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionIsNotNull() {
            addCriterion("studio_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionEqualTo(String value) {
            addCriterion("studio_introduction =", value, "studioIntroduction");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionNotEqualTo(String value) {
            addCriterion("studio_introduction <>", value, "studioIntroduction");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionGreaterThan(String value) {
            addCriterion("studio_introduction >", value, "studioIntroduction");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("studio_introduction >=", value, "studioIntroduction");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionLessThan(String value) {
            addCriterion("studio_introduction <", value, "studioIntroduction");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionLessThanOrEqualTo(String value) {
            addCriterion("studio_introduction <=", value, "studioIntroduction");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionLike(String value) {
            addCriterion("studio_introduction like", value, "studioIntroduction");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionNotLike(String value) {
            addCriterion("studio_introduction not like", value, "studioIntroduction");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionIn(List<String> values) {
            addCriterion("studio_introduction in", values, "studioIntroduction");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionNotIn(List<String> values) {
            addCriterion("studio_introduction not in", values, "studioIntroduction");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionBetween(String value1, String value2) {
            addCriterion("studio_introduction between", value1, value2, "studioIntroduction");
            return (Criteria) this;
        }

        public Criteria andStudioIntroductionNotBetween(String value1, String value2) {
            addCriterion("studio_introduction not between", value1, value2, "studioIntroduction");
            return (Criteria) this;
        }

        public Criteria andStudioFlagIsNull() {
            addCriterion("studio_flag is null");
            return (Criteria) this;
        }

        public Criteria andStudioFlagIsNotNull() {
            addCriterion("studio_flag is not null");
            return (Criteria) this;
        }

        public Criteria andStudioFlagEqualTo(Short value) {
            addCriterion("studio_flag =", value, "studioFlag");
            return (Criteria) this;
        }

        public Criteria andStudioFlagNotEqualTo(Short value) {
            addCriterion("studio_flag <>", value, "studioFlag");
            return (Criteria) this;
        }

        public Criteria andStudioFlagGreaterThan(Short value) {
            addCriterion("studio_flag >", value, "studioFlag");
            return (Criteria) this;
        }

        public Criteria andStudioFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("studio_flag >=", value, "studioFlag");
            return (Criteria) this;
        }

        public Criteria andStudioFlagLessThan(Short value) {
            addCriterion("studio_flag <", value, "studioFlag");
            return (Criteria) this;
        }

        public Criteria andStudioFlagLessThanOrEqualTo(Short value) {
            addCriterion("studio_flag <=", value, "studioFlag");
            return (Criteria) this;
        }

        public Criteria andStudioFlagIn(List<Short> values) {
            addCriterion("studio_flag in", values, "studioFlag");
            return (Criteria) this;
        }

        public Criteria andStudioFlagNotIn(List<Short> values) {
            addCriterion("studio_flag not in", values, "studioFlag");
            return (Criteria) this;
        }

        public Criteria andStudioFlagBetween(Short value1, Short value2) {
            addCriterion("studio_flag between", value1, value2, "studioFlag");
            return (Criteria) this;
        }

        public Criteria andStudioFlagNotBetween(Short value1, Short value2) {
            addCriterion("studio_flag not between", value1, value2, "studioFlag");
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