package com.subrat.service;

import java.util.List;

import com.subrat.entity.Customer;

public interface CustomerService {

	String addCustomerWithPassport(Customer c);
	
	List<Customer>getCustomerDetails();
	
	String updatePassport(Long id,Long passNum,String country);

	String deleteCustomer(Customer c);


}
