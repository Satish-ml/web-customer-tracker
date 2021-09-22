package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Login;

@Service
public class CustomerServiceimpl implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.saveCustomer(theCustomer);
		
	}
	@Override
	@Transactional
	public Customer getCustomer(int theid) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers(theid);

	}
	@Override
	@Transactional
	public void deleteCustomer(int theid) {
		// TODO Auto-generated method stub
		customerDAO.deleteCustomer(theid);
		
	}
	@Override
	@Transactional
	public void savLog(Login login) {
		// TODO Auto-generated method stub
		customerDAO.saveLog(login);
		
	}
	@Override
	@Transactional
	public Login validate(Login login) {
		// TODO Auto-generated method stub
		return customerDAO.validate(login);
	}
	
	

}
