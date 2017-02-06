package com.shawearn.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.shawearn.demo.entity.UserTest;
import com.shawearn.demo.service.UserTestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Shawearn on 2017/2/5.
 */
@Controller
public class TestController {

    @Resource
    UserTestService userTestService;

    /**
     * 测试页面跳转；
     *
     * @param userId   用户 ID；
     * @param modelMap
     * @return
     */
    @RequestMapping("/test/{userId}")
    public String test(@PathVariable("userId") Integer userId, ModelMap modelMap) {
        UserTest user = userTestService.getUserTestById(userId);
        modelMap.put("user", user);
        return "test";
    }

    /**
     * 测试 JSON 接口；
     *
     * @param userId 用户 ID；
     * @return
     */
    @ResponseBody
    @RequestMapping("/json/{userId}")
    public JSONObject testJson(@PathVariable("userId") Integer userId) {
        JSONObject jsonObject = new JSONObject();
        UserTest user = userTestService.getUserTestById(userId);
        jsonObject.put("user", user);
        return jsonObject;
    }
}
