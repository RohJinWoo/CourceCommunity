package com.community.cource.controller;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@PropertySource("classpath:datasource_admin.properties")
public class AdminController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
