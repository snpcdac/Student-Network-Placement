package com.example.snp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/adminlogin")
	public String adminlogin() {
		return "adminlogin";
	}
	@GetMapping("/studentlogin")
	public String studentlogin() {
		return "studentlogin";
	}
	@GetMapping("/recruiterlogin")
	public String recruiterlogin() {
		return "recruiterlogin";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
}
