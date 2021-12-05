package com.healthcare.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.healthcare.dao.plug.CustomerProfileI;

@ComponentScan(basePackages = "com.healthcare.*")
@EnableMongoRepositories(basePackageClasses = CustomerProfileI.class)
@EnableAutoConfiguration
@SpringBootApplication
public class HealthcareServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareServiceApplication.class, args);
	}

}
