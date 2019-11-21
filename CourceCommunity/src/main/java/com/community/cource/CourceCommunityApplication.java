package com.community.cource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
	@PropertySource("classpath:security.properties")
//	, @PropertySource("classpath:datasource.properties")
})
@MapperScan(basePackages = "com.community.cource.mapper")
public class CourceCommunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourceCommunityApplication.class, args);
	}
}
