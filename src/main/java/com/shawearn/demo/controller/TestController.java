package com.shawearn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Shawearn on 2017/2/5.
 */
@Controller
@RequestMapping("/hello")
public class TestController {

    @ResponseBody
    @RequestMapping("/test")
    public String test1(HttpServletRequest request) {
        return "Hello World!";
    }

    @ResponseBody
    @RequestMapping("/hehe1")
    public String hehe(HttpServletRequest request, ModelMap modelMap) {
        return "hehe";
    }

    @RequestMapping("/myTest")
    public String myTest() {
        // 跳转到 /WEB-INF/views/hello 下的 myTest.jsp 文件；
        return "/hello/myTest";
    }

}
