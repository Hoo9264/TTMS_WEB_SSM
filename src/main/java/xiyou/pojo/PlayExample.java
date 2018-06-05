package xiyou.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayExample() {
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

        public Criteria andPlayTypeIsNull() {
            addCriterion("play_type is null");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIsNotNull() {
            addCriterion("play_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlayTypeEqualTo(String value) {
            addCriterion("play_type =", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotEqualTo(String value) {
            addCriterion("play_type <>", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeGreaterThan(String value) {
            addCriterion("play_type >", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("play_type >=", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLessThan(String value) {
            addCriterion("play_type <", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLessThanOrEqualTo(String value) {
            addCriterion("play_type <=", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLike(String value) {
            addCriterion("play_type like", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotLike(String value) {
            addCriterion("play_type not like", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIn(List<String> values) {
            addCriterion("play_type in", values, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotIn(List<String> values) {
            addCriterion("play_type not in", values, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeBetween(String value1, String value2) {
            addCriterion("play_type between", value1, value2, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotBetween(String value1, String value2) {
            addCriterion("play_type not between", value1, value2, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayLangIsNull() {
            addCriterion("play_lang is null");
            return (Criteria) this;
        }

        public Criteria andPlayLangIsNotNull() {
            addCriterion("play_lang is not null");
            return (Criteria) this;
        }

        public Criteria andPlayLangEqualTo(String value) {
            addCriterion("play_lang =", value, "playLang");
            return (Criteria) this;
        }

        public Criteria andPlayLangNotEqualTo(String value) {
            addCriterion("play_lang <>", value, "playLang");
            return (Criteria) this;
        }

        public Criteria andPlayLangGreaterThan(String value) {
            addCriterion("play_lang >", value, "playLang");
            return (Criteria) this;
        }

        public Criteria andPlayLangGreaterThanOrEqualTo(String value) {
            addCriterion("play_lang >=", value, "playLang");
            return (Criteria) this;
        }

        public Criteria andPlayLangLessThan(String value) {
            addCriterion("play_lang <", value, "playLang");
            return (Criteria) this;
        }

        public Criteria andPlayLangLessThanOrEqualTo(String value) {
            addCriterion("play_lang <=", value, "playLang");
            return (Criteria) this;
        }

        public Criteria andPlayLangLike(String value) {
            addCriterion("play_lang like", value, "playLang");
            return (Criteria) this;
        }

        public Criteria andPlayLangNotLike(String value) {
            addCriterion("play_lang not like", value, "playLang");
            return (Criteria) this;
        }

        public Criteria andPlayLangIn(List<String> values) {
            addCriterion("play_lang in", values, "playLang");
            return (Criteria) this;
        }

        public Criteria andPlayLangNotIn(List<String> values) {
            addCriterion("play_lang not in", values, "playLang");
            return (Criteria) this;
        }

        public Criteria andPlayLangBetween(String value1, String value2) {
            addCriterion("play_lang between", value1, value2, "playLang");
            return (Criteria) this;
        }

        public Criteria andPlayLangNotBetween(String value1, String value2) {
            addCriterion("play_lang not between", value1, value2, "playLang");
            return (Criteria) this;
        }

        public Criteria andPlayNameIsNull() {
            addCriterion("play_name is null");
            return (Criteria) this;
        }

        public Criteria andPlayNameIsNotNull() {
            addCriterion("play_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlayNameEqualTo(String value) {
            addCriterion("play_name =", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameNotEqualTo(String value) {
            addCriterion("play_name <>", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameGreaterThan(String value) {
            addCriterion("play_name >", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameGreaterThanOrEqualTo(String value) {
            addCriterion("play_name >=", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameLessThan(String value) {
            addCriterion("play_name <", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameLessThanOrEqualTo(String value) {
            addCriterion("play_name <=", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameLike(String value) {
            addCriterion("play_name like", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameNotLike(String value) {
            addCriterion("play_name not like", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameIn(List<String> values) {
            addCriterion("play_name in", values, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameNotIn(List<String> values) {
            addCriterion("play_name not in", values, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameBetween(String value1, String value2) {
            addCriterion("play_name between", value1, value2, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameNotBetween(String value1, String value2) {
            addCriterion("play_name not between", value1, value2, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionIsNull() {
            addCriterion("play_introduction is null");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionIsNotNull() {
            addCriterion("play_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionEqualTo(String value) {
            addCriterion("play_introduction =", value, "playIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionNotEqualTo(String value) {
            addCriterion("play_introduction <>", value, "playIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionGreaterThan(String value) {
            addCriterion("play_introduction >", value, "playIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("play_introduction >=", value, "playIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionLessThan(String value) {
            addCriterion("play_introduction <", value, "playIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionLessThanOrEqualTo(String value) {
            addCriterion("play_introduction <=", value, "playIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionLike(String value) {
            addCriterion("play_introduction like", value, "playIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionNotLike(String value) {
            addCriterion("play_introduction not like", value, "playIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionIn(List<String> values) {
            addCriterion("play_introduction in", values, "playIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionNotIn(List<String> values) {
            addCriterion("play_introduction not in", values, "playIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionBetween(String value1, String value2) {
            addCriterion("play_introduction between", value1, value2, "playIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlayIntroductionNotBetween(String value1, String value2) {
            addCriterion("play_introduction not between", value1, value2, "playIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlayImageIsNull() {
            addCriterion("play_image is null");
            return (Criteria) this;
        }

        public Criteria andPlayImageIsNotNull() {
            addCriterion("play_image is not null");
            return (Criteria) this;
        }

        public Criteria andPlayImageEqualTo(String value) {
            addCriterion("play_image =", value, "playImage");
            return (Criteria) this;
        }

        public Criteria andPlayImageNotEqualTo(String value) {
            addCriterion("play_image <>", value, "playImage");
            return (Criteria) this;
        }

        public Criteria andPlayImageGreaterThan(String value) {
            addCriterion("play_image >", value, "playImage");
            return (Criteria) this;
        }

        public Criteria andPlayImageGreaterThanOrEqualTo(String value) {
            addCriterion("play_image >=", value, "playImage");
            return (Criteria) this;
        }

        public Criteria andPlayImageLessThan(String value) {
            addCriterion("play_image <", value, "playImage");
            return (Criteria) this;
        }

        public Criteria andPlayImageLessThanOrEqualTo(String value) {
            addCriterion("play_image <=", value, "playImage");
            return (Criteria) this;
        }

        public Criteria andPlayImageLike(String value) {
            addCriterion("play_image like", value, "playImage");
            return (Criteria) this;
        }

        public Criteria andPlayImageNotLike(String value) {
            addCriterion("play_image not like", value, "playImage");
            return (Criteria) this;
        }

        public Criteria andPlayImageIn(List<String> values) {
            addCriterion("play_image in", values, "playImage");
            return (Criteria) this;
        }

        public Criteria andPlayImageNotIn(List<String> values) {
            addCriterion("play_image not in", values, "playImage");
            return (Criteria) this;
        }

        public Criteria andPlayImageBetween(String value1, String value2) {
            addCriterion("play_image between", value1, value2, "playImage");
            return (Criteria) this;
        }

        public Criteria andPlayImageNotBetween(String value1, String value2) {
            addCriterion("play_image not between", value1, value2, "playImage");
            return (Criteria) this;
        }

        public Criteria andPlayLengthIsNull() {
            addCriterion("play_length is null");
            return (Criteria) this;
        }

        public Criteria andPlayLengthIsNotNull() {
            addCriterion("play_length is not null");
            return (Criteria) this;
        }

        public Criteria andPlayLengthEqualTo(Integer value) {
            addCriterion("play_length =", value, "playLength");
            return (Criteria) this;
        }

        public Criteria andPlayLengthNotEqualTo(Integer value) {
            addCriterion("play_length <>", value, "playLength");
            return (Criteria) this;
        }

        public Criteria andPlayLengthGreaterThan(Integer value) {
            addCriterion("play_length >", value, "playLength");
            return (Criteria) this;
        }

        public Criteria andPlayLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_length >=", value, "playLength");
            return (Criteria) this;
        }

        public Criteria andPlayLengthLessThan(Integer value) {
            addCriterion("play_length <", value, "playLength");
            return (Criteria) this;
        }

        public Criteria andPlayLengthLessThanOrEqualTo(Integer value) {
            addCriterion("play_length <=", value, "playLength");
            return (Criteria) this;
        }

        public Criteria andPlayLengthIn(List<Integer> values) {
            addCriterion("play_length in", values, "playLength");
            return (Criteria) this;
        }

        public Criteria andPlayLengthNotIn(List<Integer> values) {
            addCriterion("play_length not in", values, "playLength");
            return (Criteria) this;
        }

        public Criteria andPlayLengthBetween(Integer value1, Integer value2) {
            addCriterion("play_length between", value1, value2, "playLength");
            return (Criteria) this;
        }

        public Criteria andPlayLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("play_length not between", value1, value2, "playLength");
            return (Criteria) this;
        }

        public Criteria andPlayTicketPriceIsNull() {
            addCriterion("play_ticket_price is null");
            return (Criteria) this;
        }

        public Criteria andPlayTicketPriceIsNotNull() {
            addCriterion("play_ticket_price is not null");
            return (Criteria) this;
        }

        public Criteria andPlayTicketPriceEqualTo(BigDecimal value) {
            addCriterion("play_ticket_price =", value, "playTicketPrice");
            return (Criteria) this;
        }

        public Criteria andPlayTicketPriceNotEqualTo(BigDecimal value) {
            addCriterion("play_ticket_price <>", value, "playTicketPrice");
            return (Criteria) this;
        }

        public Criteria andPlayTicketPriceGreaterThan(BigDecimal value) {
            addCriterion("play_ticket_price >", value, "playTicketPrice");
            return (Criteria) this;
        }

        public Criteria andPlayTicketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("play_ticket_price >=", value, "playTicketPrice");
            return (Criteria) this;
        }

        public Criteria andPlayTicketPriceLessThan(BigDecimal value) {
            addCriterion("play_ticket_price <", value, "playTicketPrice");
            return (Criteria) this;
        }

        public Criteria andPlayTicketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("play_ticket_price <=", value, "playTicketPrice");
            return (Criteria) this;
        }

        public Criteria andPlayTicketPriceIn(List<BigDecimal> values) {
            addCriterion("play_ticket_price in", values, "playTicketPrice");
            return (Criteria) this;
        }

        public Criteria andPlayTicketPriceNotIn(List<BigDecimal> values) {
            addCriterion("play_ticket_price not in", values, "playTicketPrice");
            return (Criteria) this;
        }

        public Criteria andPlayTicketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("play_ticket_price between", value1, value2, "playTicketPrice");
            return (Criteria) this;
        }

        public Criteria andPlayTicketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("play_ticket_price not between", value1, value2, "playTicketPrice");
            return (Criteria) this;
        }

        public Criteria andPlayStatusIsNull() {
            addCriterion("play_status is null");
            return (Criteria) this;
        }

        public Criteria andPlayStatusIsNotNull() {
            addCriterion("play_status is not null");
            return (Criteria) this;
        }

        public Criteria andPlayStatusEqualTo(Short value) {
            addCriterion("play_status =", value, "playStatus");
            return (Criteria) this;
        }

        public Criteria andPlayStatusNotEqualTo(Short value) {
            addCriterion("play_status <>", value, "playStatus");
            return (Criteria) this;
        }

        public Criteria andPlayStatusGreaterThan(Short value) {
            addCriterion("play_status >", value, "playStatus");
            return (Criteria) this;
        }

        public Criteria andPlayStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("play_status >=", value, "playStatus");
            return (Criteria) this;
        }

        public Criteria andPlayStatusLessThan(Short value) {
            addCriterion("play_status <", value, "playStatus");
            return (Criteria) this;
        }

        public Criteria andPlayStatusLessThanOrEqualTo(Short value) {
            addCriterion("play_status <=", value, "playStatus");
            return (Criteria) this;
        }

        public Criteria andPlayStatusIn(List<Short> values) {
            addCriterion("play_status in", values, "playStatus");
            return (Criteria) this;
        }

        public Criteria andPlayStatusNotIn(List<Short> values) {
            addCriterion("play_status not in", values, "playStatus");
            return (Criteria) this;
        }

        public Criteria andPlayStatusBetween(Short value1, Short value2) {
            addCriterion("play_status between", value1, value2, "playStatus");
            return (Criteria) this;
        }

        public Criteria andPlayStatusNotBetween(Short value1, Short value2) {
            addCriterion("play_status not between", value1, value2, "playStatus");
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