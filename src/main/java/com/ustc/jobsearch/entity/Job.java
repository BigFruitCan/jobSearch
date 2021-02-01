package com.ustc.jobsearch.entity;

import java.io.Serializable;
import java.util.Date;

public class Job implements Serializable {
    private Integer id;

    private String url;

    private String companyName;

    private String jobName;

    private String jobLoccation;

    private String degreeRequest;

    private String expRequest;

    private Integer salaryDown;

    private Integer salaryUp;

    private Integer hireMember;

    private Date creatTime;

    private String content;

    private Date endTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobLoccation() {
        return jobLoccation;
    }

    public void setJobLoccation(String jobLoccation) {
        this.jobLoccation = jobLoccation;
    }

    public String getDegreeRequest() {
        return degreeRequest;
    }

    public void setDegreeRequest(String degreeRequest) {
        this.degreeRequest = degreeRequest;
    }

    public String getExpRequest() {
        return expRequest;
    }

    public void setExpRequest(String expRequest) {
        this.expRequest = expRequest;
    }

    public Integer getSalaryDown() {
        return salaryDown;
    }

    public void setSalaryDown(Integer salaryDown) {
        this.salaryDown = salaryDown;
    }

    public Integer getSalaryUp() {
        return salaryUp;
    }

    public void setSalaryUp(Integer salaryUp) {
        this.salaryUp = salaryUp;
    }

    public Integer getHireMember() {
        return hireMember;
    }

    public void setHireMember(Integer hireMember) {
        this.hireMember = hireMember;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", companyName=").append(companyName);
        sb.append(", jobName=").append(jobName);
        sb.append(", jobLoccation=").append(jobLoccation);
        sb.append(", degreeRequest=").append(degreeRequest);
        sb.append(", expRequest=").append(expRequest);
        sb.append(", salaryDown=").append(salaryDown);
        sb.append(", salaryUp=").append(salaryUp);
        sb.append(", hireMember=").append(hireMember);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", content=").append(content);
        sb.append(", endTime=").append(endTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}