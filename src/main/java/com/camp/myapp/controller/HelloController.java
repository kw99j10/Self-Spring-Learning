package com.camp.myapp.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.camp.myapp.model.dto.Person;

@Controller
public class HelloController {

//	@RequestMapping(value = {"/hello.do","/hi.do"},method = RequestMethod.GET)
	@GetMapping({"/hello.do","/hi.do"})
	public ModelAndView hello() {
		//service 연동후 데이터 결과 생김
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", "Hello Spring");
		mav.setViewName("hello");
//		mav.setViewName("redirect:hello");
		return mav;
	}
	
	@GetMapping("/hello.camp")
	public String hello2(Model model) {
		model.addAttribute("result", "Hello Spring2");
		return "hello";
	}
	
//	@PostMapping("/param.do")
	public String helloUser(@RequestParam("name") String name,String gender,
			String[] hobby,Model model) {
		model.addAttribute("result", name+"/"+gender+"/"+Arrays.toString(hobby));
		return "hello";
	}
	@PostMapping("/param.do")
	public String helloUser2(Person person,Model model) {
		model.addAttribute("result", person.getName()+"//"+person.getGender()
		+"//"+Arrays.toString(person.getHobby()));
		return "hello";
	}
	
	@GetMapping("/param_form.do")
	public String paramForm() {
		
		return "param";
	}
	
	
	
	
}










