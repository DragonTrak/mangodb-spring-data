package com.study.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description mangodb配置累
 * @Date 2019/5/28
 * @Author myt_ac@163.com
 */
@Configuration
public class MongoDBConf {
    @Bean
    public MongoClient mongoClient(){
        return new MongoClient("129.28.181.219",27017);
    }
}
