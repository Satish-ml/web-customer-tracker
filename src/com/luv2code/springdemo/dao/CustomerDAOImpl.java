package com.luv2code.springdemo.dao;

import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Login;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	
	public List<Customer> getCustomers() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer order by lastName", Customer.class);
		
		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();
				
		// return the results		
		return customers;
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// get the current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();

		//save the customer
		currentSession.saveOrUpdate(theCustomer);
		
	}

	@Override
	@Transactional
	public Customer getCustomers(int theid) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
     Customer theCustomer=currentSession.get(Customer.class, theid);
     return theCustomer;
		
	}

	@Override
	public void deleteCustomer(int theid) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
		//currentSession.delete(Customer.class, theid);
		Query theQuery=currentSession.createQuery("delete from Customer where id=:customerID");
		theQuery.setParameter("customerID", theid);
		
		theQuery.executeUpdate();
	}

	@Override
	public void saveLog(Login login) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(login);


		
	}

	@Override
	public Login validate(Login login) {
		// TODO Auto-generated method stub
		int theid=2;
		Session currentSession = sessionFactory.getCurrentSession();
		

		 login =currentSession.get(Login.class, theid);

		
		return login;
	}

	
	


}






