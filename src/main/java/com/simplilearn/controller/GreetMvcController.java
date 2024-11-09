package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetMvcController {

	@GetMapping("/greet")
	public String greeting(@RequestParam(name = "name") String name, Model model) {
		System.out.println("Invoked controller");
		// DO your business logic

		// Populate model
		model.addAttribute("name", name);

		return "hello";
	}
}
