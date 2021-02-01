package com.ustc.jobsearch.service.serviceImpl;

import com.ustc.jobsearch.mapper.JobMapper;
import com.ustc.jobsearch.entity.Job;
import com.ustc.jobsearch.entity.JobExample;
import com.ustc.jobsearch.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private JobMapper jobMapper;

    /**
     * 测试查询api(基于职位名称返回信息)
     * @param jobName
     * @return
     */
    @Override
    public Job query(String jobName){
        JobExample example = new JobExample();
        example.createCriteria().andJobNameEqualTo(jobName);
        List<Job> jobList = jobMapper.selectByExample(example);
        if(jobList.size() <= 0) {
            return null;
        }else {
            return  jobList.remove(0);
        }
    }

}
