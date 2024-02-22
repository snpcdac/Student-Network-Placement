package com.example.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Profile;
import com.example.entity.Student;
import com.example.service.ProfileService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/student")
public class ProfileController {

	@Autowired
	private ProfileService profileservice;
	
	@GetMapping("/profile-data")
	public String createProfile(Model model) {
		return "create-profile";
	}
	
	@PostMapping("/profile")
	public String saveProfile(Model model,Profile pf) {
	        String username = pf.getFirstName();
	        profileservice.save(pf);
	        System.out.println("Username: "+username);
	        Profile profile = profileservice.findByFirstName(username);
	        System.out.println("Profile: "+profile);
	        if (profile != null) {
	            model.addAttribute("student", profile);
	        } else {
	            model.addAttribute("student", new Profile());
	        }

	        return "redirect:/student/create-profile";
	    }

		/*
		 * @PostMapping("/home") public String
		 * processProfileForm(@ModelAttribute("profile") Profile profile, Principal
		 * principal) { // Update the existing student or save a new one
		 * profile.setFirstName(principal.getName()); profileservice.save(profile);
		 * return "redirect:/home"; // Redirect to the home page or any other page }
		 */
	    
	    @PostMapping("/save-profile")
		public String showSaveProfile(Model model,Profile pf) {
	    	profileservice.save(pf);
	    	System.out.println("pf firstName: "+pf.getFirstName());
	    	Profile profile=profileservice.findByFirstName(pf.getFirstName());
	    	System.out.println("Profile info "+profile);
			model.addAttribute("savedStudent",profile);	
			return "save-profile";
		}
	    
	    @GetMapping("/save-profile")
		public String createsaveProfile(Model model,Profile pf) {
	    	Profile profile=profileservice.findByFirstName(pf.getFirstName());
	    	System.out.println("Profile info "+profile);
			model.addAttribute("savedStudent",profile);
			return "save-profile";
		}
}
