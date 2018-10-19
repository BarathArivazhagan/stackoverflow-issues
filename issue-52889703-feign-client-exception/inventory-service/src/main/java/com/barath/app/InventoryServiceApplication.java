package com.barath.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import io.micrometer.core.instrument.Meter.Type;
import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication
@EnableFeignClients
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	
	@Bean
	MeterRegistryCustomizer<MeterRegistry> addPersonRegistry() {
		return registry -> registry.config().namingConvention().name("services.person.add", Type.COUNTER);
	}
	
	@Bean
	MeterRegistryCustomizer<MeterRegistry> deletePersonRegistry() {
		return registry -> registry.config().namingConvention().name("services.person.deleted", Type.COUNTER);
	}
}
