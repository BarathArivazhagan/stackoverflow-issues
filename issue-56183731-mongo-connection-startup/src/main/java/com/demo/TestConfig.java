package com.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public CommandLineRunner commandLineRunner(JobRepository jobRepository ){

        return args -> {

            jobRepository.findById("1");
        };
    }
}
