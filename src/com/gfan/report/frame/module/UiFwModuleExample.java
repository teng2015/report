package com.gfan.report.frame.module;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UiFwModuleExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public UiFwModuleExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    protected UiFwModuleExample(UiFwModuleExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List values) {
            addCriterion("ID in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List values) {
            addCriterion("ID not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List values) {
            addCriterion("NAME in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List values) {
            addCriterion("NAME not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return this;
        }

        public Criteria andActionUrlIsNull() {
            addCriterion("ACTION_URL is null");
            return this;
        }

        public Criteria andActionUrlIsNotNull() {
            addCriterion("ACTION_URL is not null");
            return this;
        }

        public Criteria andActionUrlEqualTo(String value) {
            addCriterion("ACTION_URL =", value, "actionUrl");
            return this;
        }

        public Criteria andActionUrlNotEqualTo(String value) {
            addCriterion("ACTION_URL <>", value, "actionUrl");
            return this;
        }

        public Criteria andActionUrlGreaterThan(String value) {
            addCriterion("ACTION_URL >", value, "actionUrl");
            return this;
        }

        public Criteria andActionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_URL >=", value, "actionUrl");
            return this;
        }

        public Criteria andActionUrlLessThan(String value) {
            addCriterion("ACTION_URL <", value, "actionUrl");
            return this;
        }

        public Criteria andActionUrlLessThanOrEqualTo(String value) {
            addCriterion("ACTION_URL <=", value, "actionUrl");
            return this;
        }

        public Criteria andActionUrlLike(String value) {
            addCriterion("ACTION_URL like", value, "actionUrl");
            return this;
        }

        public Criteria andActionUrlNotLike(String value) {
            addCriterion("ACTION_URL not like", value, "actionUrl");
            return this;
        }

        public Criteria andActionUrlIn(List values) {
            addCriterion("ACTION_URL in", values, "actionUrl");
            return this;
        }

        public Criteria andActionUrlNotIn(List values) {
            addCriterion("ACTION_URL not in", values, "actionUrl");
            return this;
        }

        public Criteria andActionUrlBetween(String value1, String value2) {
            addCriterion("ACTION_URL between", value1, value2, "actionUrl");
            return this;
        }

        public Criteria andActionUrlNotBetween(String value1, String value2) {
            addCriterion("ACTION_URL not between", value1, value2, "actionUrl");
            return this;
        }

        public Criteria andModuleLevelIsNull() {
            addCriterion("MODULE_LEVEL is null");
            return this;
        }

        public Criteria andModuleLevelIsNotNull() {
            addCriterion("MODULE_LEVEL is not null");
            return this;
        }

        public Criteria andModuleLevelEqualTo(Short value) {
            addCriterion("MODULE_LEVEL =", value, "moduleLevel");
            return this;
        }

        public Criteria andModuleLevelNotEqualTo(Short value) {
            addCriterion("MODULE_LEVEL <>", value, "moduleLevel");
            return this;
        }

        public Criteria andModuleLevelGreaterThan(Short value) {
            addCriterion("MODULE_LEVEL >", value, "moduleLevel");
            return this;
        }

        public Criteria andModuleLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("MODULE_LEVEL >=", value, "moduleLevel");
            return this;
        }

        public Criteria andModuleLevelLessThan(Short value) {
            addCriterion("MODULE_LEVEL <", value, "moduleLevel");
            return this;
        }

        public Criteria andModuleLevelLessThanOrEqualTo(Short value) {
            addCriterion("MODULE_LEVEL <=", value, "moduleLevel");
            return this;
        }

        public Criteria andModuleLevelIn(List values) {
            addCriterion("MODULE_LEVEL in", values, "moduleLevel");
            return this;
        }

        public Criteria andModuleLevelNotIn(List values) {
            addCriterion("MODULE_LEVEL not in", values, "moduleLevel");
            return this;
        }

        public Criteria andModuleLevelBetween(Short value1, Short value2) {
            addCriterion("MODULE_LEVEL between", value1, value2, "moduleLevel");
            return this;
        }

        public Criteria andModuleLevelNotBetween(Short value1, Short value2) {
            addCriterion("MODULE_LEVEL not between", value1, value2, "moduleLevel");
            return this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return this;
        }

        public Criteria andParentIdIn(List values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return this;
        }

        public Criteria andParentIdNotIn(List values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return this;
        }

        public Criteria andSortIsNull() {
            addCriterion("SORT is null");
            return this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("SORT is not null");
            return this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("SORT =", value, "sort");
            return this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("SORT <>", value, "sort");
            return this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("SORT >", value, "sort");
            return this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT >=", value, "sort");
            return this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("SORT <", value, "sort");
            return this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("SORT <=", value, "sort");
            return this;
        }

        public Criteria andSortIn(List values) {
            addCriterion("SORT in", values, "sort");
            return this;
        }

        public Criteria andSortNotIn(List values) {
            addCriterion("SORT not in", values, "sort");
            return this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("SORT between", value1, value2, "sort");
            return this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT not between", value1, value2, "sort");
            return this;
        }

        public Criteria andViewTypeIsNull() {
            addCriterion("VIEW_TYPE is null");
            return this;
        }

        public Criteria andViewTypeIsNotNull() {
            addCriterion("VIEW_TYPE is not null");
            return this;
        }

        public Criteria andViewTypeEqualTo(String value) {
            addCriterion("VIEW_TYPE =", value, "viewType");
            return this;
        }

        public Criteria andViewTypeNotEqualTo(String value) {
            addCriterion("VIEW_TYPE <>", value, "viewType");
            return this;
        }

        public Criteria andViewTypeGreaterThan(String value) {
            addCriterion("VIEW_TYPE >", value, "viewType");
            return this;
        }

        public Criteria andViewTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VIEW_TYPE >=", value, "viewType");
            return this;
        }

        public Criteria andViewTypeLessThan(String value) {
            addCriterion("VIEW_TYPE <", value, "viewType");
            return this;
        }

        public Criteria andViewTypeLessThanOrEqualTo(String value) {
            addCriterion("VIEW_TYPE <=", value, "viewType");
            return this;
        }

        public Criteria andViewTypeLike(String value) {
            addCriterion("VIEW_TYPE like", value, "viewType");
            return this;
        }

        public Criteria andViewTypeNotLike(String value) {
            addCriterion("VIEW_TYPE not like", value, "viewType");
            return this;
        }

        public Criteria andViewTypeIn(List values) {
            addCriterion("VIEW_TYPE in", values, "viewType");
            return this;
        }

        public Criteria andViewTypeNotIn(List values) {
            addCriterion("VIEW_TYPE not in", values, "viewType");
            return this;
        }

        public Criteria andViewTypeBetween(String value1, String value2) {
            addCriterion("VIEW_TYPE between", value1, value2, "viewType");
            return this;
        }

        public Criteria andViewTypeNotBetween(String value1, String value2) {
            addCriterion("VIEW_TYPE not between", value1, value2, "viewType");
            return this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("IMG_URL is null");
            return this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("IMG_URL is not null");
            return this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("IMG_URL =", value, "imgUrl");
            return this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("IMG_URL <>", value, "imgUrl");
            return this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("IMG_URL >", value, "imgUrl");
            return this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_URL >=", value, "imgUrl");
            return this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("IMG_URL <", value, "imgUrl");
            return this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("IMG_URL <=", value, "imgUrl");
            return this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("IMG_URL like", value, "imgUrl");
            return this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("IMG_URL not like", value, "imgUrl");
            return this;
        }

        public Criteria andImgUrlIn(List values) {
            addCriterion("IMG_URL in", values, "imgUrl");
            return this;
        }

        public Criteria andImgUrlNotIn(List values) {
            addCriterion("IMG_URL not in", values, "imgUrl");
            return this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("IMG_URL between", value1, value2, "imgUrl");
            return this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("IMG_URL not between", value1, value2, "imgUrl");
            return this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeIn(List values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotIn(List values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return this;
        }
    }
}