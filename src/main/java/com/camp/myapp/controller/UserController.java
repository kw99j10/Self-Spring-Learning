package com.camp.myapp.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.camp.myapp.model.dto.User;
import com.camp.myapp.model.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
@Controller
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

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

	@GetMapping("/detail.do")
	public String getUser(@RequestParam String userId, Model model) {
		model.addAttribute("user", userService.getUser(userId));
		return "/user/detail";
	}

	@PostMapping("/modify.do")
	public String modifyUser(User user) {
		try {
			userService.modifyUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/user/list.do";
	}

	@GetMapping("/remove.do")
	public String removeUser(String userId) {
		userService.removeUser(userId);
		return "redirect:/user/list.do";
	}

	@GetMapping("/login_form.do")
	public String loginForm(){
		return "user/login";
	}
	@PostMapping("/login.do")
	public String login(User user, HttpSession session, Model model) {

		String name = userService.login(user);
		if (name != null) {
			session.setAttribute("userName", name);
			session.setAttribute("userId", user.getUserId());

			return "redirect:/";
		} else {
			model.addAttribute("errorMsg", "아이디 또는 비밀번호 불일치");
			return "user/login";
		}
	}

	@GetMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "index";
	}
}






