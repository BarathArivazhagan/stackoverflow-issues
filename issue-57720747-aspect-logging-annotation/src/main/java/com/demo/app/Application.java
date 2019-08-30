package com.demo.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private ArithmeticCalculator arithmeticCalculator;
	
	@PostConstruct
	public void init() {
		System.out.println("test");
		arithmeticCalculator.add(12.0, 12.0);
	}

}
