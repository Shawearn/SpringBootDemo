package com.shawearn.demo.persistence;

import com.shawearn.demo.entity.UserTest;
import com.shawearn.demo.entity.UserTestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserTestMapper {
    long countByExample(UserTestExample example);

    int deleteByExample(UserTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTest record);

    int insertSelective(UserTest record);

    List<UserTest> selectByExample(UserTestExample example);

    UserTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTest record, @Param("example") UserTestExample example);

    int updateByExample(@Param("record") UserTest record, @Param("example") UserTestExample example);

    int updateByPrimaryKeySelective(UserTest record);

    int updateByPrimaryKey(UserTest record);
}