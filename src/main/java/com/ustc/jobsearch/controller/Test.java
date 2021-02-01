package com.ustc.jobsearch.controller;

import com.ustc.jobsearch.entity.Job;
import com.ustc.jobsearch.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "TestApi", description = "测试接口")
@RequestMapping("/test")
public class Test {

    @Autowired
    private TestService testService;

    @ApiOperation("测试查询api")
    @RequestMapping(path = "/query",produces = "application/json",method = RequestMethod.GET)
    @ResponseBody
    public Job fuzzyQuery(@RequestParam("jobName") String jobName){
        return testService.query(jobName);
    }

}
