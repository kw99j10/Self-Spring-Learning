package com.camp.myapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.camp.myapp.model.dto.User;
import com.camp.myapp.model.service.UserService;

@RequestMapping("/user")
@Controller
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	@GetMapping("/list.do")
	public String getUsers(Model model) {
		model.addAttribute("users", userService.getUsers());
		return "/user/list";
	}
	@GetMapping("/register_form.do")
	public String registerForm() {
		return "/user/register";
	}
	
	@PostMapping("/register.do")
	public String register(User user) {
		userService.register(user);
		return "redirect:/";
	}
	
	
}






