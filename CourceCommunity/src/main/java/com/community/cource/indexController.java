package com.community.cource;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class indexController {
	
	@GetMapping("/")
	public String index(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "index";
	}
}
