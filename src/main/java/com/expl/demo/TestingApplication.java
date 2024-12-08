package com.expl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TestingApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
		System.err.println(":::::::::::::::::Running ::::::::::::::::::::;");
	}

}
