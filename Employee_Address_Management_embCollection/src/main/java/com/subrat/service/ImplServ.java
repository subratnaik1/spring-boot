package com.subrat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Employee;
import com.subrat.repositary.EmployeeRepo;
import com.subrat.repositary.Irepo;
@Service
public class ImplServ implements Iservice {
@Autowired
	private Irepo repo;
@Autowired
private EmployeeRepo repos;

	@Override
	public List<Employee> saveAll(List<Employee> e) {
		
		return repos.saveAll(e);
	}

	@Override
	public List<Employee> fetchAll() {
		
		return repos.findAll();
	}

}
