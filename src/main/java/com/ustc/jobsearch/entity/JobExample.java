package com.ustc.jobsearch.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobExample() {
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

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobLoccationIsNull() {
            addCriterion("job_loccation is null");
            return (Criteria) this;
        }

        public Criteria andJobLoccationIsNotNull() {
            addCriterion("job_loccation is not null");
            return (Criteria) this;
        }

        public Criteria andJobLoccationEqualTo(String value) {
            addCriterion("job_loccation =", value, "jobLoccation");
            return (Criteria) this;
        }

        public Criteria andJobLoccationNotEqualTo(String value) {
            addCriterion("job_loccation <>", value, "jobLoccation");
            return (Criteria) this;
        }

        public Criteria andJobLoccationGreaterThan(String value) {
            addCriterion("job_loccation >", value, "jobLoccation");
            return (Criteria) this;
        }

        public Criteria andJobLoccationGreaterThanOrEqualTo(String value) {
            addCriterion("job_loccation >=", value, "jobLoccation");
            return (Criteria) this;
        }

        public Criteria andJobLoccationLessThan(String value) {
            addCriterion("job_loccation <", value, "jobLoccation");
            return (Criteria) this;
        }

        public Criteria andJobLoccationLessThanOrEqualTo(String value) {
            addCriterion("job_loccation <=", value, "jobLoccation");
            return (Criteria) this;
        }

        public Criteria andJobLoccationLike(String value) {
            addCriterion("job_loccation like", value, "jobLoccation");
            return (Criteria) this;
        }

        public Criteria andJobLoccationNotLike(String value) {
            addCriterion("job_loccation not like", value, "jobLoccation");
            return (Criteria) this;
        }

        public Criteria andJobLoccationIn(List<String> values) {
            addCriterion("job_loccation in", values, "jobLoccation");
            return (Criteria) this;
        }

        public Criteria andJobLoccationNotIn(List<String> values) {
            addCriterion("job_loccation not in", values, "jobLoccation");
            return (Criteria) this;
        }

        public Criteria andJobLoccationBetween(String value1, String value2) {
            addCriterion("job_loccation between", value1, value2, "jobLoccation");
            return (Criteria) this;
        }

        public Criteria andJobLoccationNotBetween(String value1, String value2) {
            addCriterion("job_loccation not between", value1, value2, "jobLoccation");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestIsNull() {
            addCriterion("degree_request is null");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestIsNotNull() {
            addCriterion("degree_request is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestEqualTo(String value) {
            addCriterion("degree_request =", value, "degreeRequest");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestNotEqualTo(String value) {
            addCriterion("degree_request <>", value, "degreeRequest");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestGreaterThan(String value) {
            addCriterion("degree_request >", value, "degreeRequest");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestGreaterThanOrEqualTo(String value) {
            addCriterion("degree_request >=", value, "degreeRequest");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestLessThan(String value) {
            addCriterion("degree_request <", value, "degreeRequest");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestLessThanOrEqualTo(String value) {
            addCriterion("degree_request <=", value, "degreeRequest");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestLike(String value) {
            addCriterion("degree_request like", value, "degreeRequest");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestNotLike(String value) {
            addCriterion("degree_request not like", value, "degreeRequest");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestIn(List<String> values) {
            addCriterion("degree_request in", values, "degreeRequest");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestNotIn(List<String> values) {
            addCriterion("degree_request not in", values, "degreeRequest");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestBetween(String value1, String value2) {
            addCriterion("degree_request between", value1, value2, "degreeRequest");
            return (Criteria) this;
        }

        public Criteria andDegreeRequestNotBetween(String value1, String value2) {
            addCriterion("degree_request not between", value1, value2, "degreeRequest");
            return (Criteria) this;
        }

        public Criteria andExpRequestIsNull() {
            addCriterion("exp_request is null");
            return (Criteria) this;
        }

        public Criteria andExpRequestIsNotNull() {
            addCriterion("exp_request is not null");
            return (Criteria) this;
        }

        public Criteria andExpRequestEqualTo(String value) {
            addCriterion("exp_request =", value, "expRequest");
            return (Criteria) this;
        }

        public Criteria andExpRequestNotEqualTo(String value) {
            addCriterion("exp_request <>", value, "expRequest");
            return (Criteria) this;
        }

        public Criteria andExpRequestGreaterThan(String value) {
            addCriterion("exp_request >", value, "expRequest");
            return (Criteria) this;
        }

        public Criteria andExpRequestGreaterThanOrEqualTo(String value) {
            addCriterion("exp_request >=", value, "expRequest");
            return (Criteria) this;
        }

        public Criteria andExpRequestLessThan(String value) {
            addCriterion("exp_request <", value, "expRequest");
            return (Criteria) this;
        }

        public Criteria andExpRequestLessThanOrEqualTo(String value) {
            addCriterion("exp_request <=", value, "expRequest");
            return (Criteria) this;
        }

        public Criteria andExpRequestLike(String value) {
            addCriterion("exp_request like", value, "expRequest");
            return (Criteria) this;
        }

        public Criteria andExpRequestNotLike(String value) {
            addCriterion("exp_request not like", value, "expRequest");
            return (Criteria) this;
        }

        public Criteria andExpRequestIn(List<String> values) {
            addCriterion("exp_request in", values, "expRequest");
            return (Criteria) this;
        }

        public Criteria andExpRequestNotIn(List<String> values) {
            addCriterion("exp_request not in", values, "expRequest");
            return (Criteria) this;
        }

        public Criteria andExpRequestBetween(String value1, String value2) {
            addCriterion("exp_request between", value1, value2, "expRequest");
            return (Criteria) this;
        }

        public Criteria andExpRequestNotBetween(String value1, String value2) {
            addCriterion("exp_request not between", value1, value2, "expRequest");
            return (Criteria) this;
        }

        public Criteria andSalaryDownIsNull() {
            addCriterion("salary_down is null");
            return (Criteria) this;
        }

        public Criteria andSalaryDownIsNotNull() {
            addCriterion("salary_down is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryDownEqualTo(Integer value) {
            addCriterion("salary_down =", value, "salaryDown");
            return (Criteria) this;
        }

        public Criteria andSalaryDownNotEqualTo(Integer value) {
            addCriterion("salary_down <>", value, "salaryDown");
            return (Criteria) this;
        }

        public Criteria andSalaryDownGreaterThan(Integer value) {
            addCriterion("salary_down >", value, "salaryDown");
            return (Criteria) this;
        }

        public Criteria andSalaryDownGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary_down >=", value, "salaryDown");
            return (Criteria) this;
        }

        public Criteria andSalaryDownLessThan(Integer value) {
            addCriterion("salary_down <", value, "salaryDown");
            return (Criteria) this;
        }

        public Criteria andSalaryDownLessThanOrEqualTo(Integer value) {
            addCriterion("salary_down <=", value, "salaryDown");
            return (Criteria) this;
        }

        public Criteria andSalaryDownIn(List<Integer> values) {
            addCriterion("salary_down in", values, "salaryDown");
            return (Criteria) this;
        }

        public Criteria andSalaryDownNotIn(List<Integer> values) {
            addCriterion("salary_down not in", values, "salaryDown");
            return (Criteria) this;
        }

        public Criteria andSalaryDownBetween(Integer value1, Integer value2) {
            addCriterion("salary_down between", value1, value2, "salaryDown");
            return (Criteria) this;
        }

        public Criteria andSalaryDownNotBetween(Integer value1, Integer value2) {
            addCriterion("salary_down not between", value1, value2, "salaryDown");
            return (Criteria) this;
        }

        public Criteria andSalaryUpIsNull() {
            addCriterion("salary_up is null");
            return (Criteria) this;
        }

        public Criteria andSalaryUpIsNotNull() {
            addCriterion("salary_up is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryUpEqualTo(Integer value) {
            addCriterion("salary_up =", value, "salaryUp");
            return (Criteria) this;
        }

        public Criteria andSalaryUpNotEqualTo(Integer value) {
            addCriterion("salary_up <>", value, "salaryUp");
            return (Criteria) this;
        }

        public Criteria andSalaryUpGreaterThan(Integer value) {
            addCriterion("salary_up >", value, "salaryUp");
            return (Criteria) this;
        }

        public Criteria andSalaryUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary_up >=", value, "salaryUp");
            return (Criteria) this;
        }

        public Criteria andSalaryUpLessThan(Integer value) {
            addCriterion("salary_up <", value, "salaryUp");
            return (Criteria) this;
        }

        public Criteria andSalaryUpLessThanOrEqualTo(Integer value) {
            addCriterion("salary_up <=", value, "salaryUp");
            return (Criteria) this;
        }

        public Criteria andSalaryUpIn(List<Integer> values) {
            addCriterion("salary_up in", values, "salaryUp");
            return (Criteria) this;
        }

        public Criteria andSalaryUpNotIn(List<Integer> values) {
            addCriterion("salary_up not in", values, "salaryUp");
            return (Criteria) this;
        }

        public Criteria andSalaryUpBetween(Integer value1, Integer value2) {
            addCriterion("salary_up between", value1, value2, "salaryUp");
            return (Criteria) this;
        }

        public Criteria andSalaryUpNotBetween(Integer value1, Integer value2) {
            addCriterion("salary_up not between", value1, value2, "salaryUp");
            return (Criteria) this;
        }

        public Criteria andHireMemberIsNull() {
            addCriterion("hire_member is null");
            return (Criteria) this;
        }

        public Criteria andHireMemberIsNotNull() {
            addCriterion("hire_member is not null");
            return (Criteria) this;
        }

        public Criteria andHireMemberEqualTo(Integer value) {
            addCriterion("hire_member =", value, "hireMember");
            return (Criteria) this;
        }

        public Criteria andHireMemberNotEqualTo(Integer value) {
            addCriterion("hire_member <>", value, "hireMember");
            return (Criteria) this;
        }

        public Criteria andHireMemberGreaterThan(Integer value) {
            addCriterion("hire_member >", value, "hireMember");
            return (Criteria) this;
        }

        public Criteria andHireMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("hire_member >=", value, "hireMember");
            return (Criteria) this;
        }

        public Criteria andHireMemberLessThan(Integer value) {
            addCriterion("hire_member <", value, "hireMember");
            return (Criteria) this;
        }

        public Criteria andHireMemberLessThanOrEqualTo(Integer value) {
            addCriterion("hire_member <=", value, "hireMember");
            return (Criteria) this;
        }

        public Criteria andHireMemberIn(List<Integer> values) {
            addCriterion("hire_member in", values, "hireMember");
            return (Criteria) this;
        }

        public Criteria andHireMemberNotIn(List<Integer> values) {
            addCriterion("hire_member not in", values, "hireMember");
            return (Criteria) this;
        }

        public Criteria andHireMemberBetween(Integer value1, Integer value2) {
            addCriterion("hire_member between", value1, value2, "hireMember");
            return (Criteria) this;
        }

        public Criteria andHireMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("hire_member not between", value1, value2, "hireMember");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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