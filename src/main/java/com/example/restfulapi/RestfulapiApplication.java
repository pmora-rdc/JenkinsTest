package com.example.restfulapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.example.restfulapi.configuration.*;


@SpringBootApplication
public class RestfulapiApplication {

	public static void main(String[] args) {
		// TODO: Understand the following concepts: Spring Beans, Spring Context & Dependency Injection
		SpringApplication.run(RestfulapiApplication.class, args);
	}
}
