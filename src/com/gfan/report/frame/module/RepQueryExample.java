package com.gfan.report.frame.module;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RepQueryExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table REP_QUERY
     *
     * @ibatorgenerated Fri Sep 26 11:41:56 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table REP_QUERY
     *
     * @ibatorgenerated Fri Sep 26 11:41:56 CST 2014
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table REP_QUERY
     *
     * @ibatorgenerated Fri Sep 26 11:41:56 CST 2014
     */
    public RepQueryExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table REP_QUERY
     *
     * @ibatorgenerated Fri Sep 26 11:41:56 CST 2014
     */
    protected RepQueryExample(RepQueryExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table REP_QUERY
     *
     * @ibatorgenerated Fri Sep 26 11:41:56 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table REP_QUERY
     *
     * @ibatorgenerated Fri Sep 26 11:41:56 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table REP_QUERY
     *
     * @ibatorgenerated Fri Sep 26 11:41:56 CST 2014
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table REP_QUERY
     *
     * @ibatorgenerated Fri Sep 26 11:41:56 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table REP_QUERY
     *
     * @ibatorgenerated Fri Sep 26 11:41:56 CST 2014
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
     * This method corresponds to the database table REP_QUERY
     *
     * @ibatorgenerated Fri Sep 26 11:41:56 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table REP_QUERY
     *
     * @ibatorgenerated Fri Sep 26 11:41:56 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table REP_QUERY
     *
     * @ibatorgenerated Fri Sep 26 11:41:56 CST 2014
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List dateList = new ArrayList();
            Iterator iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(((Date)iter.next()).getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andReportNameIsNull() {
            addCriterion("REPORT_NAME is null");
            return this;
        }

        public Criteria andReportNameIsNotNull() {
            addCriterion("REPORT_NAME is not null");
            return this;
        }

        public Criteria andReportNameEqualTo(String value) {
            addCriterion("REPORT_NAME =", value, "reportName");
            return this;
        }

        public Criteria andReportNameNotEqualTo(String value) {
            addCriterion("REPORT_NAME <>", value, "reportName");
            return this;
        }

        public Criteria andReportNameGreaterThan(String value) {
            addCriterion("REPORT_NAME >", value, "reportName");
            return this;
        }

        public Criteria andReportNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_NAME >=", value, "reportName");
            return this;
        }

        public Criteria andReportNameLessThan(String value) {
            addCriterion("REPORT_NAME <", value, "reportName");
            return this;
        }

        public Criteria andReportNameLessThanOrEqualTo(String value) {
            addCriterion("REPORT_NAME <=", value, "reportName");
            return this;
        }

        public Criteria andReportNameLike(String value) {
            addCriterion("REPORT_NAME like", value, "reportName");
            return this;
        }

        public Criteria andReportNameNotLike(String value) {
            addCriterion("REPORT_NAME not like", value, "reportName");
            return this;
        }

        public Criteria andReportNameIn(List values) {
            addCriterion("REPORT_NAME in", values, "reportName");
            return this;
        }

        public Criteria andReportNameNotIn(List values) {
            addCriterion("REPORT_NAME not in", values, "reportName");
            return this;
        }

        public Criteria andReportNameBetween(String value1, String value2) {
            addCriterion("REPORT_NAME between", value1, value2, "reportName");
            return this;
        }

        public Criteria andReportNameNotBetween(String value1, String value2) {
            addCriterion("REPORT_NAME not between", value1, value2, "reportName");
            return this;
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

        public Criteria andReportSqlIsNull() {
            addCriterion("REPORT_SQL is null");
            return this;
        }

        public Criteria andReportSqlIsNotNull() {
            addCriterion("REPORT_SQL is not null");
            return this;
        }

        public Criteria andReportSqlEqualTo(String value) {
            addCriterion("REPORT_SQL =", value, "reportSql");
            return this;
        }

        public Criteria andReportSqlNotEqualTo(String value) {
            addCriterion("REPORT_SQL <>", value, "reportSql");
            return this;
        }

        public Criteria andReportSqlGreaterThan(String value) {
            addCriterion("REPORT_SQL >", value, "reportSql");
            return this;
        }

        public Criteria andReportSqlGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_SQL >=", value, "reportSql");
            return this;
        }

        public Criteria andReportSqlLessThan(String value) {
            addCriterion("REPORT_SQL <", value, "reportSql");
            return this;
        }

        public Criteria andReportSqlLessThanOrEqualTo(String value) {
            addCriterion("REPORT_SQL <=", value, "reportSql");
            return this;
        }

        public Criteria andReportSqlLike(String value) {
            addCriterion("REPORT_SQL like", value, "reportSql");
            return this;
        }

        public Criteria andReportSqlNotLike(String value) {
            addCriterion("REPORT_SQL not like", value, "reportSql");
            return this;
        }

        public Criteria andReportSqlIn(List values) {
            addCriterion("REPORT_SQL in", values, "reportSql");
            return this;
        }

        public Criteria andReportSqlNotIn(List values) {
            addCriterion("REPORT_SQL not in", values, "reportSql");
            return this;
        }

        public Criteria andReportSqlBetween(String value1, String value2) {
            addCriterion("REPORT_SQL between", value1, value2, "reportSql");
            return this;
        }

        public Criteria andReportSqlNotBetween(String value1, String value2) {
            addCriterion("REPORT_SQL not between", value1, value2, "reportSql");
            return this;
        }

        public Criteria andCountSqlIsNull() {
            addCriterion("COUNT_SQL is null");
            return this;
        }

        public Criteria andCountSqlIsNotNull() {
            addCriterion("COUNT_SQL is not null");
            return this;
        }

        public Criteria andCountSqlEqualTo(String value) {
            addCriterion("COUNT_SQL =", value, "countSql");
            return this;
        }

        public Criteria andCountSqlNotEqualTo(String value) {
            addCriterion("COUNT_SQL <>", value, "countSql");
            return this;
        }

        public Criteria andCountSqlGreaterThan(String value) {
            addCriterion("COUNT_SQL >", value, "countSql");
            return this;
        }

        public Criteria andCountSqlGreaterThanOrEqualTo(String value) {
            addCriterion("COUNT_SQL >=", value, "countSql");
            return this;
        }

        public Criteria andCountSqlLessThan(String value) {
            addCriterion("COUNT_SQL <", value, "countSql");
            return this;
        }

        public Criteria andCountSqlLessThanOrEqualTo(String value) {
            addCriterion("COUNT_SQL <=", value, "countSql");
            return this;
        }

        public Criteria andCountSqlLike(String value) {
            addCriterion("COUNT_SQL like", value, "countSql");
            return this;
        }

        public Criteria andCountSqlNotLike(String value) {
            addCriterion("COUNT_SQL not like", value, "countSql");
            return this;
        }

        public Criteria andCountSqlIn(List values) {
            addCriterion("COUNT_SQL in", values, "countSql");
            return this;
        }

        public Criteria andCountSqlNotIn(List values) {
            addCriterion("COUNT_SQL not in", values, "countSql");
            return this;
        }

        public Criteria andCountSqlBetween(String value1, String value2) {
            addCriterion("COUNT_SQL between", value1, value2, "countSql");
            return this;
        }

        public Criteria andCountSqlNotBetween(String value1, String value2) {
            addCriterion("COUNT_SQL not between", value1, value2, "countSql");
            return this;
        }

        public Criteria andReplaceFieldIsNull() {
            addCriterion("REPLACE_FIELD is null");
            return this;
        }

        public Criteria andReplaceFieldIsNotNull() {
            addCriterion("REPLACE_FIELD is not null");
            return this;
        }

        public Criteria andReplaceFieldEqualTo(String value) {
            addCriterion("REPLACE_FIELD =", value, "replaceField");
            return this;
        }

        public Criteria andReplaceFieldNotEqualTo(String value) {
            addCriterion("REPLACE_FIELD <>", value, "replaceField");
            return this;
        }

        public Criteria andReplaceFieldGreaterThan(String value) {
            addCriterion("REPLACE_FIELD >", value, "replaceField");
            return this;
        }

        public Criteria andReplaceFieldGreaterThanOrEqualTo(String value) {
            addCriterion("REPLACE_FIELD >=", value, "replaceField");
            return this;
        }

        public Criteria andReplaceFieldLessThan(String value) {
            addCriterion("REPLACE_FIELD <", value, "replaceField");
            return this;
        }

        public Criteria andReplaceFieldLessThanOrEqualTo(String value) {
            addCriterion("REPLACE_FIELD <=", value, "replaceField");
            return this;
        }

        public Criteria andReplaceFieldLike(String value) {
            addCriterion("REPLACE_FIELD like", value, "replaceField");
            return this;
        }

        public Criteria andReplaceFieldNotLike(String value) {
            addCriterion("REPLACE_FIELD not like", value, "replaceField");
            return this;
        }

        public Criteria andReplaceFieldIn(List values) {
            addCriterion("REPLACE_FIELD in", values, "replaceField");
            return this;
        }

        public Criteria andReplaceFieldNotIn(List values) {
            addCriterion("REPLACE_FIELD not in", values, "replaceField");
            return this;
        }

        public Criteria andReplaceFieldBetween(String value1, String value2) {
            addCriterion("REPLACE_FIELD between", value1, value2, "replaceField");
            return this;
        }

        public Criteria andReplaceFieldNotBetween(String value1, String value2) {
            addCriterion("REPLACE_FIELD not between", value1, value2, "replaceField");
            return this;
        }

        public Criteria andCountFieldIsNull() {
            addCriterion("COUNT_FIELD is null");
            return this;
        }

        public Criteria andCountFieldIsNotNull() {
            addCriterion("COUNT_FIELD is not null");
            return this;
        }

        public Criteria andCountFieldEqualTo(String value) {
            addCriterion("COUNT_FIELD =", value, "countField");
            return this;
        }

        public Criteria andCountFieldNotEqualTo(String value) {
            addCriterion("COUNT_FIELD <>", value, "countField");
            return this;
        }

        public Criteria andCountFieldGreaterThan(String value) {
            addCriterion("COUNT_FIELD >", value, "countField");
            return this;
        }

        public Criteria andCountFieldGreaterThanOrEqualTo(String value) {
            addCriterion("COUNT_FIELD >=", value, "countField");
            return this;
        }

        public Criteria andCountFieldLessThan(String value) {
            addCriterion("COUNT_FIELD <", value, "countField");
            return this;
        }

        public Criteria andCountFieldLessThanOrEqualTo(String value) {
            addCriterion("COUNT_FIELD <=", value, "countField");
            return this;
        }

        public Criteria andCountFieldLike(String value) {
            addCriterion("COUNT_FIELD like", value, "countField");
            return this;
        }

        public Criteria andCountFieldNotLike(String value) {
            addCriterion("COUNT_FIELD not like", value, "countField");
            return this;
        }

        public Criteria andCountFieldIn(List values) {
            addCriterion("COUNT_FIELD in", values, "countField");
            return this;
        }

        public Criteria andCountFieldNotIn(List values) {
            addCriterion("COUNT_FIELD not in", values, "countField");
            return this;
        }

        public Criteria andCountFieldBetween(String value1, String value2) {
            addCriterion("COUNT_FIELD between", value1, value2, "countField");
            return this;
        }

        public Criteria andCountFieldNotBetween(String value1, String value2) {
            addCriterion("COUNT_FIELD not between", value1, value2, "countField");
            return this;
        }

        public Criteria andQueryFieldIsNull() {
            addCriterion("QUERY_FIELD is null");
            return this;
        }

        public Criteria andQueryFieldIsNotNull() {
            addCriterion("QUERY_FIELD is not null");
            return this;
        }

        public Criteria andQueryFieldEqualTo(String value) {
            addCriterion("QUERY_FIELD =", value, "queryField");
            return this;
        }

        public Criteria andQueryFieldNotEqualTo(String value) {
            addCriterion("QUERY_FIELD <>", value, "queryField");
            return this;
        }

        public Criteria andQueryFieldGreaterThan(String value) {
            addCriterion("QUERY_FIELD >", value, "queryField");
            return this;
        }

        public Criteria andQueryFieldGreaterThanOrEqualTo(String value) {
            addCriterion("QUERY_FIELD >=", value, "queryField");
            return this;
        }

        public Criteria andQueryFieldLessThan(String value) {
            addCriterion("QUERY_FIELD <", value, "queryField");
            return this;
        }

        public Criteria andQueryFieldLessThanOrEqualTo(String value) {
            addCriterion("QUERY_FIELD <=", value, "queryField");
            return this;
        }

        public Criteria andQueryFieldLike(String value) {
            addCriterion("QUERY_FIELD like", value, "queryField");
            return this;
        }

        public Criteria andQueryFieldNotLike(String value) {
            addCriterion("QUERY_FIELD not like", value, "queryField");
            return this;
        }

        public Criteria andQueryFieldIn(List values) {
            addCriterion("QUERY_FIELD in", values, "queryField");
            return this;
        }

        public Criteria andQueryFieldNotIn(List values) {
            addCriterion("QUERY_FIELD not in", values, "queryField");
            return this;
        }

        public Criteria andQueryFieldBetween(String value1, String value2) {
            addCriterion("QUERY_FIELD between", value1, value2, "queryField");
            return this;
        }

        public Criteria andQueryFieldNotBetween(String value1, String value2) {
            addCriterion("QUERY_FIELD not between", value1, value2, "queryField");
            return this;
        }

        public Criteria andReportResultIsNull() {
            addCriterion("REPORT_RESULT is null");
            return this;
        }

        public Criteria andReportResultIsNotNull() {
            addCriterion("REPORT_RESULT is not null");
            return this;
        }

        public Criteria andReportResultEqualTo(String value) {
            addCriterion("REPORT_RESULT =", value, "reportResult");
            return this;
        }

        public Criteria andReportResultNotEqualTo(String value) {
            addCriterion("REPORT_RESULT <>", value, "reportResult");
            return this;
        }

        public Criteria andReportResultGreaterThan(String value) {
            addCriterion("REPORT_RESULT >", value, "reportResult");
            return this;
        }

        public Criteria andReportResultGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_RESULT >=", value, "reportResult");
            return this;
        }

        public Criteria andReportResultLessThan(String value) {
            addCriterion("REPORT_RESULT <", value, "reportResult");
            return this;
        }

        public Criteria andReportResultLessThanOrEqualTo(String value) {
            addCriterion("REPORT_RESULT <=", value, "reportResult");
            return this;
        }

        public Criteria andReportResultLike(String value) {
            addCriterion("REPORT_RESULT like", value, "reportResult");
            return this;
        }

        public Criteria andReportResultNotLike(String value) {
            addCriterion("REPORT_RESULT not like", value, "reportResult");
            return this;
        }

        public Criteria andReportResultIn(List values) {
            addCriterion("REPORT_RESULT in", values, "reportResult");
            return this;
        }

        public Criteria andReportResultNotIn(List values) {
            addCriterion("REPORT_RESULT not in", values, "reportResult");
            return this;
        }

        public Criteria andReportResultBetween(String value1, String value2) {
            addCriterion("REPORT_RESULT between", value1, value2, "reportResult");
            return this;
        }

        public Criteria andReportResultNotBetween(String value1, String value2) {
            addCriterion("REPORT_RESULT not between", value1, value2, "reportResult");
            return this;
        }

        public Criteria andReportTitleIsNull() {
            addCriterion("REPORT_TITLE is null");
            return this;
        }

        public Criteria andReportTitleIsNotNull() {
            addCriterion("REPORT_TITLE is not null");
            return this;
        }

        public Criteria andReportTitleEqualTo(String value) {
            addCriterion("REPORT_TITLE =", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleNotEqualTo(String value) {
            addCriterion("REPORT_TITLE <>", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleGreaterThan(String value) {
            addCriterion("REPORT_TITLE >", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_TITLE >=", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleLessThan(String value) {
            addCriterion("REPORT_TITLE <", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleLessThanOrEqualTo(String value) {
            addCriterion("REPORT_TITLE <=", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleLike(String value) {
            addCriterion("REPORT_TITLE like", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleNotLike(String value) {
            addCriterion("REPORT_TITLE not like", value, "reportTitle");
            return this;
        }

        public Criteria andReportTitleIn(List values) {
            addCriterion("REPORT_TITLE in", values, "reportTitle");
            return this;
        }

        public Criteria andReportTitleNotIn(List values) {
            addCriterion("REPORT_TITLE not in", values, "reportTitle");
            return this;
        }

        public Criteria andReportTitleBetween(String value1, String value2) {
            addCriterion("REPORT_TITLE between", value1, value2, "reportTitle");
            return this;
        }

        public Criteria andReportTitleNotBetween(String value1, String value2) {
            addCriterion("REPORT_TITLE not between", value1, value2, "reportTitle");
            return this;
        }

        public Criteria andReportUsedIsNull() {
            addCriterion("REPORT_USED is null");
            return this;
        }

        public Criteria andReportUsedIsNotNull() {
            addCriterion("REPORT_USED is not null");
            return this;
        }

        public Criteria andReportUsedEqualTo(Short value) {
            addCriterion("REPORT_USED =", value, "reportUsed");
            return this;
        }

        public Criteria andReportUsedNotEqualTo(Short value) {
            addCriterion("REPORT_USED <>", value, "reportUsed");
            return this;
        }

        public Criteria andReportUsedGreaterThan(Short value) {
            addCriterion("REPORT_USED >", value, "reportUsed");
            return this;
        }

        public Criteria andReportUsedGreaterThanOrEqualTo(Short value) {
            addCriterion("REPORT_USED >=", value, "reportUsed");
            return this;
        }

        public Criteria andReportUsedLessThan(Short value) {
            addCriterion("REPORT_USED <", value, "reportUsed");
            return this;
        }

        public Criteria andReportUsedLessThanOrEqualTo(Short value) {
            addCriterion("REPORT_USED <=", value, "reportUsed");
            return this;
        }

        public Criteria andReportUsedIn(List values) {
            addCriterion("REPORT_USED in", values, "reportUsed");
            return this;
        }

        public Criteria andReportUsedNotIn(List values) {
            addCriterion("REPORT_USED not in", values, "reportUsed");
            return this;
        }

        public Criteria andReportUsedBetween(Short value1, Short value2) {
            addCriterion("REPORT_USED between", value1, value2, "reportUsed");
            return this;
        }

        public Criteria andReportUsedNotBetween(Short value1, Short value2) {
            addCriterion("REPORT_USED not between", value1, value2, "reportUsed");
            return this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("INSERT_TIME is null");
            return this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("INSERT_TIME is not null");
            return this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterionForJDBCDate("INSERT_TIME =", value, "insertTime");
            return this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("INSERT_TIME <>", value, "insertTime");
            return this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("INSERT_TIME >", value, "insertTime");
            return this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INSERT_TIME >=", value, "insertTime");
            return this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterionForJDBCDate("INSERT_TIME <", value, "insertTime");
            return this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INSERT_TIME <=", value, "insertTime");
            return this;
        }

        public Criteria andInsertTimeIn(List values) {
            addCriterionForJDBCDate("INSERT_TIME in", values, "insertTime");
            return this;
        }

        public Criteria andInsertTimeNotIn(List values) {
            addCriterionForJDBCDate("INSERT_TIME not in", values, "insertTime");
            return this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INSERT_TIME between", value1, value2, "insertTime");
            return this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INSERT_TIME not between", value1, value2, "insertTime");
            return this;
        }
    }
}