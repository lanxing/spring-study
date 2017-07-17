package com.lanxing.study.web.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaofan
 * @version 1.0
 * @date 2017/7/14 下午7:48
 * @desc 功能描述
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("#{WebConfiguration['testUrlf]}")
    private String testUrl;

    @RequestMapping("/testurl")
    public JSONObject test(){
        JSONObject object = new JSONObject();
        object.put("url", testUrl);
        return object;
    }

}
