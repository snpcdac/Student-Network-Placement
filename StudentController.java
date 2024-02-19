package com.example.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Student;
import com.example.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/registration")
	public String regsiterStudent() {
		return "registration";
	}
	
	@PostMapping("/registration")
	public String registerAccount(@ModelAttribute("student") Student student ) {
		studentservice.save(student);
		return "redirect:/student/registration?success";
	}
	
	@GetMapping("/studentlist")
	public String getAllStudents(Model model) {
		List<Student> studentList=studentservice.findAll();
		model.addAttribute("students", studentList);
		return "studlist";
	}
	
	@GetMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@PostMapping("/login")
	public String studLogin(@RequestParam("stud_login") String email,@RequestParam("stud_pass") String password, Model model) {	
		System.out.println("Email is:"+email);
	//	System.out.println("First Name is : "+fname);
		List<Student> sl=studentservice.findAll();
		Iterator<Student> itr=sl.iterator();
		while(itr.hasNext())
		{
			Student st=itr.next();
			System.out.println(st.getFirstName());
			if(email.equals(st.getEmail())&& password.equals(st.getPassword())) {
				System.out.println("Student name is:"+st.getFirstName());
				model.addAttribute("studentname","Ajay");
				return "redirect:/student/home";
			}
			
		}
		 return "redirect:/student/login?error";
	}
	
	@GetMapping("/home")
	public String showHome() {	
		return "home";
	}
	
	@GetMapping("/about")
	public String showAbout() {
		return "about";
	}
	
	@GetMapping("/contact")
	public String showContact() {
		return "contact";
	}
	
	@GetMapping("/logout")
	public String showLogout() {
		return "logout";
	}
	
	@GetMapping("/create-profile")
	public String profile() {
		return "redirect:/student/profile-data";
	}
	
}
