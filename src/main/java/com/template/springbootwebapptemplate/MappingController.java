package com.template.springbootwebapptemplate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MappingController {

@GetMapping("/")
public String thymeleaf(Model model) {
	model.addAttribute("message", "Hello from Spring Boot!");
	return "index"; // Thymeleaf will resolve to src/main/resources/templates/index.html
}
@GetMapping("/jsp")
public String jsp(Model model) {
	model.addAttribute("message", "Hello from JSP!");
	return "index"; // resolves to /WEB-INF/jsp/index.jsp
}
}