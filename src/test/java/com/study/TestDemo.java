package com.study;

import com.mongodb.MongoClient;
import com.study.entrity.Person;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.springframework.data.mongodb.core.query.Criteria.where;

/**
 * @Description
 * @Date 2019/5/28
 * @Author myt_ac@163.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring.xml"})
public class TestDemo {
    private static Logger log = Logger.getLogger(TestDemo.class);

    @Autowired
    private MongoClient mongoClient;
    @Test
    public void test1() {
        MongoOperations mongoOps = new MongoTemplate(new SimpleMongoDbFactory(mongoClient, "database"));
        mongoOps.insert(new Person("Joe", 34));
        log.info(mongoOps.findOne(new Query(where("name").is("Joe")), Person.class));

//        mongoOps.dropCollection("person");
    }
}
