package com.ustc.jobsearch.service;

import com.ustc.jobsearch.entity.Job;

public interface TestService {

    //基于职位名称返回信息
    Job query(String jobName);

}
