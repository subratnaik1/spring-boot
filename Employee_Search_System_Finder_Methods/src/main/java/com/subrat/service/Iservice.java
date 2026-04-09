package com.subrat.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.subrat.entity.Employee;

public interface Iservice {

	Optional<Employee> findById(int id);
	
	List<Employee> greaterThan(int amt);
	
	List<Employee> afterJoin(LocalDate date);
	
	List<Employee> containing(String word);
	
	List<Employee> saveEmp(List<Employee> e);
	
}
