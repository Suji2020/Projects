package com.agilisium.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages="com.agilisium.*")
@EntityScan(basePackages="com.agilisium.*")
@ComponentScan(basePackages = {"com.agilisium.*"})
public class SpringpocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringpocApplication.class, args);
	}
	
}
