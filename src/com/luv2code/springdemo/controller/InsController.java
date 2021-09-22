package com.luv2code.springdemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Login;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/login")

public class InsController {
	
	@Autowired
	   private CustomerService	customerService;
	
	@GetMapping("/log")
	public String login(Model themodel) {
		Login ln=new Login();
		themodel.addAttribute("lon", ln);
		return "login";
		
	}
	 @PostMapping("/login-suc")
	public String loginsuc(@ModelAttribute("lon") Login login,Model themodel) {
			//customerService.savLog(login);
		login=customerService.validate(login);
		
		themodel.addAttribute("lol",login);
		
		System.out.println(login);
 return "login-suc";
	
	}
	 
}
