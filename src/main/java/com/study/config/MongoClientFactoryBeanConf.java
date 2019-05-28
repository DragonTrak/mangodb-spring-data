package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

/**
 * @Description
 * @Date 2019/5/28
 * @Author myt_ac@163.com
 */
@Configuration
public class MongoClientFactoryBeanConf {
    @Bean
    public MongoClientFactoryBean mongo(){
        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        mongo.setHost("129.28.181.219");
        mongo.setPort(27017);
        return mongo;
    }


}
