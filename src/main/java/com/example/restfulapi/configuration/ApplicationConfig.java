package com.example.restfulapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;


@Configuration
@ComponentScan(basePackages = "com.example.restfulapi.bean")
@EnableMongoRepositories({ "com.example.restfulapi.repositories" })
public class ApplicationConfig {

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {

        String dbURI = "mongodb+srv://admin:mo12QA1!@cluster0-a2uy0.mongodb.net/test";
        MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
        return new SimpleMongoDbFactory(mongoClient, "test");
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {

        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }
}