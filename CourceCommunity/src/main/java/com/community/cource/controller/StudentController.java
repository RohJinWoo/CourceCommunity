package com.community.cource.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.community.cource.service.UserServiceImpl;

@Controller
@RequestMapping("/std")
@PropertySource("classpath:datasource_std.properties")
public class StudentController {
	
	@Autowired
	UserServiceImpl userService;
	
	@GetMapping("/test")
	public void test(HttpServletRequest request, HttpServletResponse response) {
		userService.getTime();
	}
}
