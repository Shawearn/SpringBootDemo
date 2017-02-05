package com.shawearn.demo.service.impl;

import com.shawearn.demo.entity.UserTest;
import com.shawearn.demo.persistence.UserTestMapper;
import com.shawearn.demo.service.UserTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shawearn on 2016/12/30.
 */
@Transactional
@Service("userTestService")
public class UserTestServiceImpl implements UserTestService {

    private final static Logger logger = LoggerFactory.getLogger(UserTestServiceImpl.class);

    @Autowired
    UserTestMapper userTestMapper;

    @Transactional(readOnly = true)
    public UserTest getUserTestById(Integer userId) {
        logger.info("根据 ID 获取用户信息");
        UserTest user = userTestMapper.selectByPrimaryKey(userId);
        return user;
    }
}
