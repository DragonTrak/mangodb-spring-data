package com.study.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * @Description
 * @Date 2019/5/28
 * @Author myt_ac@163.com
 */
@Configuration
public class MongoConfiguration {

    @Bean
    public MongoDbFactory mongoDbFactory(){
        return new SimpleMongoDbFactory(new MongoClient("129.28.181.219",27017),"study");
    }

    @Bean
    public MongoClientFactoryBean mongo(){
        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        mongo.setHost("129.28.181.219");
        mongo.setPort(27017);
        return mongo;
    }

    @Bean
    public MongoClient mongoClient(){
        return new MongoClient("129.28.181.219",27017);
    }
}
