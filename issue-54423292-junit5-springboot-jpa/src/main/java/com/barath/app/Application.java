package com.barath.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Application {

	@Autowired
	private IWorkSiteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

