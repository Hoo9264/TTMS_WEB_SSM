package xiyou.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SaleItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleItemExample() {
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

        public Criteria andSaleItemIdIsNull() {
            addCriterion("sale_item_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleItemIdIsNotNull() {
            addCriterion("sale_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleItemIdEqualTo(Long value) {
            addCriterion("sale_item_id =", value, "saleItemId");
            return (Criteria) this;
        }

        public Criteria andSaleItemIdNotEqualTo(Long value) {
            addCriterion("sale_item_id <>", value, "saleItemId");
            return (Criteria) this;
        }

        public Criteria andSaleItemIdGreaterThan(Long value) {
            addCriterion("sale_item_id >", value, "saleItemId");
            return (Criteria) this;
        }

        public Criteria andSaleItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_item_id >=", value, "saleItemId");
            return (Criteria) this;
        }

        public Criteria andSaleItemIdLessThan(Long value) {
            addCriterion("sale_item_id <", value, "saleItemId");
            return (Criteria) this;
        }

        public Criteria andSaleItemIdLessThanOrEqualTo(Long value) {
            addCriterion("sale_item_id <=", value, "saleItemId");
            return (Criteria) this;
        }

        public Criteria andSaleItemIdIn(List<Long> values) {
            addCriterion("sale_item_id in", values, "saleItemId");
            return (Criteria) this;
        }

        public Criteria andSaleItemIdNotIn(List<Long> values) {
            addCriterion("sale_item_id not in", values, "saleItemId");
            return (Criteria) this;
        }

        public Criteria andSaleItemIdBetween(Long value1, Long value2) {
            addCriterion("sale_item_id between", value1, value2, "saleItemId");
            return (Criteria) this;
        }

        public Criteria andSaleItemIdNotBetween(Long value1, Long value2) {
            addCriterion("sale_item_id not between", value1, value2, "saleItemId");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNull() {
            addCriterion("ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNotNull() {
            addCriterion("ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketIdEqualTo(Long value) {
            addCriterion("ticket_id =", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotEqualTo(Long value) {
            addCriterion("ticket_id <>", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThan(Long value) {
            addCriterion("ticket_id >", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ticket_id >=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThan(Long value) {
            addCriterion("ticket_id <", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThanOrEqualTo(Long value) {
            addCriterion("ticket_id <=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdIn(List<Long> values) {
            addCriterion("ticket_id in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotIn(List<Long> values) {
            addCriterion("ticket_id not in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdBetween(Long value1, Long value2) {
            addCriterion("ticket_id between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotBetween(Long value1, Long value2) {
            addCriterion("ticket_id not between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNull() {
            addCriterion("sale_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNotNull() {
            addCriterion("sale_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIdEqualTo(Long value) {
            addCriterion("sale_ID =", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotEqualTo(Long value) {
            addCriterion("sale_ID <>", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThan(Long value) {
            addCriterion("sale_ID >", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_ID >=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThan(Long value) {
            addCriterion("sale_ID <", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThanOrEqualTo(Long value) {
            addCriterion("sale_ID <=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIn(List<Long> values) {
            addCriterion("sale_ID in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotIn(List<Long> values) {
            addCriterion("sale_ID not in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdBetween(Long value1, Long value2) {
            addCriterion("sale_ID between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotBetween(Long value1, Long value2) {
            addCriterion("sale_ID not between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleItemPriceIsNull() {
            addCriterion("sale_item_price is null");
            return (Criteria) this;
        }

        public Criteria andSaleItemPriceIsNotNull() {
            addCriterion("sale_item_price is not null");
            return (Criteria) this;
        }

        public Criteria andSaleItemPriceEqualTo(BigDecimal value) {
            addCriterion("sale_item_price =", value, "saleItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleItemPriceNotEqualTo(BigDecimal value) {
            addCriterion("sale_item_price <>", value, "saleItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleItemPriceGreaterThan(BigDecimal value) {
            addCriterion("sale_item_price >", value, "saleItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleItemPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_item_price >=", value, "saleItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleItemPriceLessThan(BigDecimal value) {
            addCriterion("sale_item_price <", value, "saleItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleItemPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_item_price <=", value, "saleItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleItemPriceIn(List<BigDecimal> values) {
            addCriterion("sale_item_price in", values, "saleItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleItemPriceNotIn(List<BigDecimal> values) {
            addCriterion("sale_item_price not in", values, "saleItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleItemPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_item_price between", value1, value2, "saleItemPrice");
            return (Criteria) this;
        }

        public Criteria andSaleItemPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_item_price not between", value1, value2, "saleItemPrice");
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