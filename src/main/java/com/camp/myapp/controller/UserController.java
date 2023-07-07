package com.camp.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.camp.myapp.model.dto.User;
import com.camp.myapp.model.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
	private UserService userService; 
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/list.do")
	public String getUsers(Model model) {
		model.addAttribute("users", userService.getUsers());
		return "user/list";
	}
	@GetMapping("/register_form.do")
	public String registerForm() {
		return "user/register";
	}
	
	@PostMapping("/register.do")
	public String regiter(User user) {
		userService.register(user);
		return "redirect:/";
	}
	
	
}






