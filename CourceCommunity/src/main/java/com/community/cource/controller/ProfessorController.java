package com.community.cource.controller;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prof")
@PropertySource("classpath:datasource_prof.properties")
public class ProfessorController {

}
