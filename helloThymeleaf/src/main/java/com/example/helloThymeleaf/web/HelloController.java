package com.example.helloThymeleaf.web;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name") String name, @RequestParam(value = "age") int age, Model model) {
		model.addAttribute("age", age);
		model.addAttribute("name", name);
		return "hello";
	}

}
