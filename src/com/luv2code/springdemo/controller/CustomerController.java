package com.luv2code.springdemo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired 
   private CustomerService	customerService;
	@GetMapping("/list")
	public String listCustomers(Model themodel) {
		
		//get customer from dao
		List<Customer> customers=customerService.getCustomers();
		
		//add customer to the model
		themodel.addAttribute("customerss", customers);
		
		return "list-customer";
	}
	
	@GetMapping("/showFormForAdd")
	public String showForm(Model themodel) {
		// to load the empty object of customer we have to create a object of Customer
		//add that to model attribute to use by form to load the bean (all getters of the field)
		Customer thecustomer=new Customer();
		themodel.addAttribute("customer", thecustomer);
		return "cust-form";
		
	}
   @PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
		
		
	}
	@GetMapping("/showFormForUpdate")
	public String update(@RequestParam("customerid") int theid,Model themodel) {
		//get the customer from the database
		
		Customer theCustomer=customerService.getCustomer(theid);
		
		//set a customer as model attribute to pre-populate the form
		themodel.addAttribute("customer", theCustomer);
		
		//send over to our form 
		return "cust-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("customerid") int theid) {
		
		customerService.deleteCustomer(theid);
		
		return "redirect:/customer/list";
	}
	

	
	
	@GetMapping("/log")
	public String login(Model themodel) {
		//Customer thecustomer=new Customer();
	//	themodel.addAttribute("customer", thecustomer);
		return "login";
		
	}
	
	


}
