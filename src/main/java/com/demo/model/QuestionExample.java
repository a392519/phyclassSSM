package com.demo.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andImagelistIsNull() {
            addCriterion("imageList is null");
            return (Criteria) this;
        }

        public Criteria andImagelistIsNotNull() {
            addCriterion("imageList is not null");
            return (Criteria) this;
        }

        public Criteria andImagelistEqualTo(String value) {
            addCriterion("imageList =", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistNotEqualTo(String value) {
            addCriterion("imageList <>", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistGreaterThan(String value) {
            addCriterion("imageList >", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistGreaterThanOrEqualTo(String value) {
            addCriterion("imageList >=", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistLessThan(String value) {
            addCriterion("imageList <", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistLessThanOrEqualTo(String value) {
            addCriterion("imageList <=", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistLike(String value) {
            addCriterion("imageList like", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistNotLike(String value) {
            addCriterion("imageList not like", value, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistIn(List<String> values) {
            addCriterion("imageList in", values, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistNotIn(List<String> values) {
            addCriterion("imageList not in", values, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistBetween(String value1, String value2) {
            addCriterion("imageList between", value1, value2, "imagelist");
            return (Criteria) this;
        }

        public Criteria andImagelistNotBetween(String value1, String value2) {
            addCriterion("imageList not between", value1, value2, "imagelist");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionIsNull() {
            addCriterion("questionOption is null");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionIsNotNull() {
            addCriterion("questionOption is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionEqualTo(String value) {
            addCriterion("questionOption =", value, "questionoption");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionNotEqualTo(String value) {
            addCriterion("questionOption <>", value, "questionoption");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionGreaterThan(String value) {
            addCriterion("questionOption >", value, "questionoption");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionGreaterThanOrEqualTo(String value) {
            addCriterion("questionOption >=", value, "questionoption");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionLessThan(String value) {
            addCriterion("questionOption <", value, "questionoption");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionLessThanOrEqualTo(String value) {
            addCriterion("questionOption <=", value, "questionoption");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionLike(String value) {
            addCriterion("questionOption like", value, "questionoption");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionNotLike(String value) {
            addCriterion("questionOption not like", value, "questionoption");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionIn(List<String> values) {
            addCriterion("questionOption in", values, "questionoption");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionNotIn(List<String> values) {
            addCriterion("questionOption not in", values, "questionoption");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionBetween(String value1, String value2) {
            addCriterion("questionOption between", value1, value2, "questionoption");
            return (Criteria) this;
        }

        public Criteria andQuestionoptionNotBetween(String value1, String value2) {
            addCriterion("questionOption not between", value1, value2, "questionoption");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andResolvesIsNull() {
            addCriterion("resolves is null");
            return (Criteria) this;
        }

        public Criteria andResolvesIsNotNull() {
            addCriterion("resolves is not null");
            return (Criteria) this;
        }

        public Criteria andResolvesEqualTo(String value) {
            addCriterion("resolves =", value, "resolves");
            return (Criteria) this;
        }

        public Criteria andResolvesNotEqualTo(String value) {
            addCriterion("resolves <>", value, "resolves");
            return (Criteria) this;
        }

        public Criteria andResolvesGreaterThan(String value) {
            addCriterion("resolves >", value, "resolves");
            return (Criteria) this;
        }

        public Criteria andResolvesGreaterThanOrEqualTo(String value) {
            addCriterion("resolves >=", value, "resolves");
            return (Criteria) this;
        }

        public Criteria andResolvesLessThan(String value) {
            addCriterion("resolves <", value, "resolves");
            return (Criteria) this;
        }

        public Criteria andResolvesLessThanOrEqualTo(String value) {
            addCriterion("resolves <=", value, "resolves");
            return (Criteria) this;
        }

        public Criteria andResolvesLike(String value) {
            addCriterion("resolves like", value, "resolves");
            return (Criteria) this;
        }

        public Criteria andResolvesNotLike(String value) {
            addCriterion("resolves not like", value, "resolves");
            return (Criteria) this;
        }

        public Criteria andResolvesIn(List<String> values) {
            addCriterion("resolves in", values, "resolves");
            return (Criteria) this;
        }

        public Criteria andResolvesNotIn(List<String> values) {
            addCriterion("resolves not in", values, "resolves");
            return (Criteria) this;
        }

        public Criteria andResolvesBetween(String value1, String value2) {
            addCriterion("resolves between", value1, value2, "resolves");
            return (Criteria) this;
        }

        public Criteria andResolvesNotBetween(String value1, String value2) {
            addCriterion("resolves not between", value1, value2, "resolves");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistIsNull() {
            addCriterion("answerImageList is null");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistIsNotNull() {
            addCriterion("answerImageList is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistEqualTo(String value) {
            addCriterion("answerImageList =", value, "answerimagelist");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistNotEqualTo(String value) {
            addCriterion("answerImageList <>", value, "answerimagelist");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistGreaterThan(String value) {
            addCriterion("answerImageList >", value, "answerimagelist");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistGreaterThanOrEqualTo(String value) {
            addCriterion("answerImageList >=", value, "answerimagelist");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistLessThan(String value) {
            addCriterion("answerImageList <", value, "answerimagelist");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistLessThanOrEqualTo(String value) {
            addCriterion("answerImageList <=", value, "answerimagelist");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistLike(String value) {
            addCriterion("answerImageList like", value, "answerimagelist");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistNotLike(String value) {
            addCriterion("answerImageList not like", value, "answerimagelist");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistIn(List<String> values) {
            addCriterion("answerImageList in", values, "answerimagelist");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistNotIn(List<String> values) {
            addCriterion("answerImageList not in", values, "answerimagelist");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistBetween(String value1, String value2) {
            addCriterion("answerImageList between", value1, value2, "answerimagelist");
            return (Criteria) this;
        }

        public Criteria andAnswerimagelistNotBetween(String value1, String value2) {
            addCriterion("answerImageList not between", value1, value2, "answerimagelist");
            return (Criteria) this;
        }

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNull() {
            addCriterion("difficulty is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNotNull() {
            addCriterion("difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyEqualTo(Integer value) {
            addCriterion("difficulty =", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotEqualTo(Integer value) {
            addCriterion("difficulty <>", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThan(Integer value) {
            addCriterion("difficulty >", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThanOrEqualTo(Integer value) {
            addCriterion("difficulty >=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThan(Integer value) {
            addCriterion("difficulty <", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThanOrEqualTo(Integer value) {
            addCriterion("difficulty <=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyIn(List<Integer> values) {
            addCriterion("difficulty in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotIn(List<Integer> values) {
            addCriterion("difficulty not in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyBetween(Integer value1, Integer value2) {
            addCriterion("difficulty between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotBetween(Integer value1, Integer value2) {
            addCriterion("difficulty not between", value1, value2, "difficulty");
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