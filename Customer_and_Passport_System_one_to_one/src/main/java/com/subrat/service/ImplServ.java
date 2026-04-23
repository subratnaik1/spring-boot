package com.subrat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Customer;
import com.subrat.entity.Passport;
import com.subrat.repositary.ICustomerRepository;
import com.subrat.repositary.IPassportRepository;

@Service
public class ImplServ implements CustomerService {
	@Autowired
	private ICustomerRepository cRepo;
	@Autowired
	private IPassportRepository pRepo;

	@Override
	public String addCustomerWithPassport(Customer c) {
		cRepo.save(c);
		return "customer with passport added";
	}

	@Override
	public List<Customer> getCustomerDetails() {
		return cRepo.findAll();
	}

	@Override
	public String updatePassport(Long id, Long passNum, String country) {

		return null;
	}

	@Override
	public String deleteCustomer(Customer c) {
		cRepo.delete(c);
		return "customer deleted";
	}

}
