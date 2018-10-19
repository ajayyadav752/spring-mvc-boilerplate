package com.aj.components;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value = "/sayHello")
	public String sayHello(Model model) {
		System.out.println("Hello.....");
		model.addAttribute("name", "Ajay");
		return "hello";
	}

}
