package com.community.cource;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@PropertySource("classpath:datasource_guest.properties")
public class indexController {
	
	@GetMapping("/")
	public String index(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "index";
	}
	
	@GetMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "login";
	}
	
	@GetMapping("/login-ad")
	public String login_ad(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("/login-ad");
		return "login";
	}
}
