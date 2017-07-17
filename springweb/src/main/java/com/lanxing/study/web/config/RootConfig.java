package com.lanxing.study.web.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * @author gaofan
 * @version 1.0
 * @date 2017/7/14 下午7:25
 * @desc 功能描述
 */
@Configuration
public class RootConfig {

    @Bean
    public PropertiesFactoryBean WebConfiguration(){
        PropertiesFactoryBean bean = new PropertiesFactoryBean();
        bean.setLocations(new ClassPathResource("base/spring/spring.properties"));
        return bean;
    }
}
