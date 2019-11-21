package com.community.cource.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity https) throws Exception {
		https
			.authorizeRequests()
				.antMatchers("/", "/login", "/sign-up", "/std/test").permitAll()
				// .access(attribute)는 접근 가능 아니면 전부 컷, .hasRole(role)은 접근 가능 아니면 전부 로그인 이동.
				.antMatchers("/std/**").hasRole("student")
				.antMatchers("/prof/**").hasRole("professor")
				.antMatchers("/admin/**").hasRole("admin")
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
//				.usernameParameter("user_id")
//				.passwordParameter("password")
				.and()
			.httpBasic();
	}
}
