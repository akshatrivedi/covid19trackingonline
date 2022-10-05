package com.capgemini.coronavirustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.capgemini.coronavirustracker.repository"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@SpringBootApplication
public class Covid19projectApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.capgemini.coronavirustracker.Covid19projectApplication.class, args);
	}

}
