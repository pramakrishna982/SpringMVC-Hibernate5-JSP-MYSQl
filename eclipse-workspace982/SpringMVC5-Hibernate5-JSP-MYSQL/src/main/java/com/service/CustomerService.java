package com.service;

import java.util.List;

import com.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);
	
	/* public List<Customer> searchCustomer(int theMobile); */

	public void deleteCustomer(int theId);

}
