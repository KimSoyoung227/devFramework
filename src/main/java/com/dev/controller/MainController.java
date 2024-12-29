package com.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("data", "data1");
		return "index";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("data", "data2");
		return "/home/home";
	}

}
