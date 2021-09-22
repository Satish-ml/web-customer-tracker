package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Login;

public interface CustomerDAO {


	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomers(int theid);

	public void deleteCustomer(int theid);

	public void saveLog(Login login);

	public Login validate(Login login);


	

	
	
}
