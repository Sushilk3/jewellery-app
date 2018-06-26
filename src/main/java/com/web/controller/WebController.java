package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebController {

	

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}

	@RequestMapping("/mortgage")
	public String mortgage() {
		return "mortgage";
	}
	
	@RequestMapping("/stock")
	public String stock() {
		return "stock";
	}
	@RequestMapping("/Selling")
	public String Selling() {
		return "Selling";
	}
	
	@RequestMapping("/reports")
	public String reports() {
		return "reports";
	}
	@RequestMapping("/invoice")
	public String invoice() {
		return "invoice";
	}
}
