package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Login;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public  Customer getCustomer(int theid);

	public void deleteCustomer(int theid);

	public void savLog(Login login);

	public Login validate(Login login);




}
