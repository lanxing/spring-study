package com.lanxing.study.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author gaofan
 * @version 1.0
 * @date 2017/7/14 下午7:26
 * @desc 功能描述
 */
@Configuration
@ComponentScan(basePackages = {"com.lanxing.study.web.controller"})
public class WebConfig {
}
