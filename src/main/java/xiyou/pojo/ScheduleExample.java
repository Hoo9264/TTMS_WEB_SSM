package xiyou.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScheduleExample() {
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

        public Criteria andSchedIdIsNull() {
            addCriterion("sched_id is null");
            return (Criteria) this;
        }

        public Criteria andSchedIdIsNotNull() {
            addCriterion("sched_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchedIdEqualTo(Integer value) {
            addCriterion("sched_id =", value, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdNotEqualTo(Integer value) {
            addCriterion("sched_id <>", value, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdGreaterThan(Integer value) {
            addCriterion("sched_id >", value, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sched_id >=", value, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdLessThan(Integer value) {
            addCriterion("sched_id <", value, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdLessThanOrEqualTo(Integer value) {
            addCriterion("sched_id <=", value, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdIn(List<Integer> values) {
            addCriterion("sched_id in", values, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdNotIn(List<Integer> values) {
            addCriterion("sched_id not in", values, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdBetween(Integer value1, Integer value2) {
            addCriterion("sched_id between", value1, value2, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sched_id not between", value1, value2, "schedId");
            return (Criteria) this;
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

        public Criteria andPlayIdIsNull() {
            addCriterion("play_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayIdIsNotNull() {
            addCriterion("play_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayIdEqualTo(Integer value) {
            addCriterion("play_id =", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdNotEqualTo(Integer value) {
            addCriterion("play_id <>", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdGreaterThan(Integer value) {
            addCriterion("play_id >", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_id >=", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdLessThan(Integer value) {
            addCriterion("play_id <", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdLessThanOrEqualTo(Integer value) {
            addCriterion("play_id <=", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdIn(List<Integer> values) {
            addCriterion("play_id in", values, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdNotIn(List<Integer> values) {
            addCriterion("play_id not in", values, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdBetween(Integer value1, Integer value2) {
            addCriterion("play_id between", value1, value2, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("play_id not between", value1, value2, "playId");
            return (Criteria) this;
        }

        public Criteria andSchedTimeIsNull() {
            addCriterion("sched_time is null");
            return (Criteria) this;
        }

        public Criteria andSchedTimeIsNotNull() {
            addCriterion("sched_time is not null");
            return (Criteria) this;
        }

        public Criteria andSchedTimeEqualTo(Date value) {
            addCriterion("sched_time =", value, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeNotEqualTo(Date value) {
            addCriterion("sched_time <>", value, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeGreaterThan(Date value) {
            addCriterion("sched_time >", value, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sched_time >=", value, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeLessThan(Date value) {
            addCriterion("sched_time <", value, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeLessThanOrEqualTo(Date value) {
            addCriterion("sched_time <=", value, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeIn(List<Date> values) {
            addCriterion("sched_time in", values, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeNotIn(List<Date> values) {
            addCriterion("sched_time not in", values, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeBetween(Date value1, Date value2) {
            addCriterion("sched_time between", value1, value2, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeNotBetween(Date value1, Date value2) {
            addCriterion("sched_time not between", value1, value2, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTicketPriceIsNull() {
            addCriterion("sched_ticket_price is null");
            return (Criteria) this;
        }

        public Criteria andSchedTicketPriceIsNotNull() {
            addCriterion("sched_ticket_price is not null");
            return (Criteria) this;
        }

        public Criteria andSchedTicketPriceEqualTo(BigDecimal value) {
            addCriterion("sched_ticket_price =", value, "schedTicketPrice");
            return (Criteria) this;
        }

        public Criteria andSchedTicketPriceNotEqualTo(BigDecimal value) {
            addCriterion("sched_ticket_price <>", value, "schedTicketPrice");
            return (Criteria) this;
        }

        public Criteria andSchedTicketPriceGreaterThan(BigDecimal value) {
            addCriterion("sched_ticket_price >", value, "schedTicketPrice");
            return (Criteria) this;
        }

        public Criteria andSchedTicketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sched_ticket_price >=", value, "schedTicketPrice");
            return (Criteria) this;
        }

        public Criteria andSchedTicketPriceLessThan(BigDecimal value) {
            addCriterion("sched_ticket_price <", value, "schedTicketPrice");
            return (Criteria) this;
        }

        public Criteria andSchedTicketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sched_ticket_price <=", value, "schedTicketPrice");
            return (Criteria) this;
        }

        public Criteria andSchedTicketPriceIn(List<BigDecimal> values) {
            addCriterion("sched_ticket_price in", values, "schedTicketPrice");
            return (Criteria) this;
        }

        public Criteria andSchedTicketPriceNotIn(List<BigDecimal> values) {
            addCriterion("sched_ticket_price not in", values, "schedTicketPrice");
            return (Criteria) this;
        }

        public Criteria andSchedTicketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sched_ticket_price between", value1, value2, "schedTicketPrice");
            return (Criteria) this;
        }

        public Criteria andSchedTicketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sched_ticket_price not between", value1, value2, "schedTicketPrice");
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