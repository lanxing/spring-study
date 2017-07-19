package com.lanxing.study.service.config;

import com.lanxing.study.service.test.TestBeanClass;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gaofan
 * @version 1.0
 * @date 2017/7/19 下午4:49
 * @desc 功能描述
 */
@Configuration
public class JavaConfig {

    @Value("#{WebConfiguration['testUrl']}")
    private String testUrl;

    @Bean
    public TestBeanClass testBeanClass(){
        TestBeanClass testBeanClass = new TestBeanClass();
        testBeanClass.setUrl(testUrl);

        return testBeanClass;
    }

}
