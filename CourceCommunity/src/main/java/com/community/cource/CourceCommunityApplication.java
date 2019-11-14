package com.community.cource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
	@PropertySource("classpath:security.properties"),
	@PropertySource("classpath:datasource.properties")
})
public class CourceCommunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourceCommunityApplication.class, args);
	}
}
