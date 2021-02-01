package com.ustc.jobsearch.mapper;

import com.ustc.jobsearch.entity.UserRecommendation;
import com.ustc.jobsearch.entity.UserRecommendationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRecommendationMapper {
    long countByExample(UserRecommendationExample example);

    int deleteByExample(UserRecommendationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRecommendation record);

    int insertSelective(UserRecommendation record);

    List<UserRecommendation> selectByExample(UserRecommendationExample example);

    UserRecommendation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserRecommendation record, @Param("example") UserRecommendationExample example);

    int updateByExample(@Param("record") UserRecommendation record, @Param("example") UserRecommendationExample example);

    int updateByPrimaryKeySelective(UserRecommendation record);

    int updateByPrimaryKey(UserRecommendation record);
}