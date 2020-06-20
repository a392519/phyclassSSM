package com.demo.model;

import java.util.ArrayList;
import java.util.List;

public class DetailquesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailquesExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andWrongquesIsNull() {
            addCriterion("wrongQues is null");
            return (Criteria) this;
        }

        public Criteria andWrongquesIsNotNull() {
            addCriterion("wrongQues is not null");
            return (Criteria) this;
        }

        public Criteria andWrongquesEqualTo(Integer value) {
            addCriterion("wrongQues =", value, "wrongques");
            return (Criteria) this;
        }

        public Criteria andWrongquesNotEqualTo(Integer value) {
            addCriterion("wrongQues <>", value, "wrongques");
            return (Criteria) this;
        }

        public Criteria andWrongquesGreaterThan(Integer value) {
            addCriterion("wrongQues >", value, "wrongques");
            return (Criteria) this;
        }

        public Criteria andWrongquesGreaterThanOrEqualTo(Integer value) {
            addCriterion("wrongQues >=", value, "wrongques");
            return (Criteria) this;
        }

        public Criteria andWrongquesLessThan(Integer value) {
            addCriterion("wrongQues <", value, "wrongques");
            return (Criteria) this;
        }

        public Criteria andWrongquesLessThanOrEqualTo(Integer value) {
            addCriterion("wrongQues <=", value, "wrongques");
            return (Criteria) this;
        }

        public Criteria andWrongquesIn(List<Integer> values) {
            addCriterion("wrongQues in", values, "wrongques");
            return (Criteria) this;
        }

        public Criteria andWrongquesNotIn(List<Integer> values) {
            addCriterion("wrongQues not in", values, "wrongques");
            return (Criteria) this;
        }

        public Criteria andWrongquesBetween(Integer value1, Integer value2) {
            addCriterion("wrongQues between", value1, value2, "wrongques");
            return (Criteria) this;
        }

        public Criteria andWrongquesNotBetween(Integer value1, Integer value2) {
            addCriterion("wrongQues not between", value1, value2, "wrongques");
            return (Criteria) this;
        }

        public Criteria andStoreIsNull() {
            addCriterion("store is null");
            return (Criteria) this;
        }

        public Criteria andStoreIsNotNull() {
            addCriterion("store is not null");
            return (Criteria) this;
        }

        public Criteria andStoreEqualTo(Integer value) {
            addCriterion("store =", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotEqualTo(Integer value) {
            addCriterion("store <>", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThan(Integer value) {
            addCriterion("store >", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("store >=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThan(Integer value) {
            addCriterion("store <", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThanOrEqualTo(Integer value) {
            addCriterion("store <=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreIn(List<Integer> values) {
            addCriterion("store in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotIn(List<Integer> values) {
            addCriterion("store not in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreBetween(Integer value1, Integer value2) {
            addCriterion("store between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotBetween(Integer value1, Integer value2) {
            addCriterion("store not between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andIscorrectIsNull() {
            addCriterion("iscorrect is null");
            return (Criteria) this;
        }

        public Criteria andIscorrectIsNotNull() {
            addCriterion("iscorrect is not null");
            return (Criteria) this;
        }

        public Criteria andIscorrectEqualTo(Integer value) {
            addCriterion("iscorrect =", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotEqualTo(Integer value) {
            addCriterion("iscorrect <>", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectGreaterThan(Integer value) {
            addCriterion("iscorrect >", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectGreaterThanOrEqualTo(Integer value) {
            addCriterion("iscorrect >=", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectLessThan(Integer value) {
            addCriterion("iscorrect <", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectLessThanOrEqualTo(Integer value) {
            addCriterion("iscorrect <=", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectIn(List<Integer> values) {
            addCriterion("iscorrect in", values, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotIn(List<Integer> values) {
            addCriterion("iscorrect not in", values, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectBetween(Integer value1, Integer value2) {
            addCriterion("iscorrect between", value1, value2, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotBetween(Integer value1, Integer value2) {
            addCriterion("iscorrect not between", value1, value2, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andTransmitIsNull() {
            addCriterion("transmit is null");
            return (Criteria) this;
        }

        public Criteria andTransmitIsNotNull() {
            addCriterion("transmit is not null");
            return (Criteria) this;
        }

        public Criteria andTransmitEqualTo(Integer value) {
            addCriterion("transmit =", value, "transmit");
            return (Criteria) this;
        }

        public Criteria andTransmitNotEqualTo(Integer value) {
            addCriterion("transmit <>", value, "transmit");
            return (Criteria) this;
        }

        public Criteria andTransmitGreaterThan(Integer value) {
            addCriterion("transmit >", value, "transmit");
            return (Criteria) this;
        }

        public Criteria andTransmitGreaterThanOrEqualTo(Integer value) {
            addCriterion("transmit >=", value, "transmit");
            return (Criteria) this;
        }

        public Criteria andTransmitLessThan(Integer value) {
            addCriterion("transmit <", value, "transmit");
            return (Criteria) this;
        }

        public Criteria andTransmitLessThanOrEqualTo(Integer value) {
            addCriterion("transmit <=", value, "transmit");
            return (Criteria) this;
        }

        public Criteria andTransmitIn(List<Integer> values) {
            addCriterion("transmit in", values, "transmit");
            return (Criteria) this;
        }

        public Criteria andTransmitNotIn(List<Integer> values) {
            addCriterion("transmit not in", values, "transmit");
            return (Criteria) this;
        }

        public Criteria andTransmitBetween(Integer value1, Integer value2) {
            addCriterion("transmit between", value1, value2, "transmit");
            return (Criteria) this;
        }

        public Criteria andTransmitNotBetween(Integer value1, Integer value2) {
            addCriterion("transmit not between", value1, value2, "transmit");
            return (Criteria) this;
        }

        public Criteria andQidIsNull() {
            addCriterion("qid is null");
            return (Criteria) this;
        }

        public Criteria andQidIsNotNull() {
            addCriterion("qid is not null");
            return (Criteria) this;
        }

        public Criteria andQidEqualTo(Integer value) {
            addCriterion("qid =", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotEqualTo(Integer value) {
            addCriterion("qid <>", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThan(Integer value) {
            addCriterion("qid >", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qid >=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThan(Integer value) {
            addCriterion("qid <", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThanOrEqualTo(Integer value) {
            addCriterion("qid <=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidIn(List<Integer> values) {
            addCriterion("qid in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotIn(List<Integer> values) {
            addCriterion("qid not in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidBetween(Integer value1, Integer value2) {
            addCriterion("qid between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotBetween(Integer value1, Integer value2) {
            addCriterion("qid not between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
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