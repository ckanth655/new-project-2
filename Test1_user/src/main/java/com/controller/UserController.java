package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/")
	public String getIndexPage(){
		return "index";
	}
	
	@RequestMapping("/save")
	public ModelAndView saveUser(@ModelAttribute User user){
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.setViewName("user_data");
		modelAndView.addObject(user);
		
		System.out.println(user.getUserName());
		System.out.println(user.getEmailId());
		
		System.out.println(modelAndView);
		
		return modelAndView;
	}
	
	
}
