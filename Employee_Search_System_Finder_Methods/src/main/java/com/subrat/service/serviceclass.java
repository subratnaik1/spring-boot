package com.subrat.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Employee;
import com.subrat.repository.Irepo;

@Service
public class serviceclass implements Iservice {
	@Autowired
	private Irepo irepo;

	@Override
	public Optional<Employee> findById(int id) {

		return irepo.findById(id);
	}

	@Override
	public List<Employee> greaterThan(int amt) {

		return irepo.findBySalaryGreaterThan(amt);
	}

	@Override
	public List<Employee> afterJoin(LocalDate date) {

		return irepo.findByJoiningDateAfter(date);
	}

	@Override
	public List<Employee> containing(String word) {
		
		return irepo.findByNameContaining(word);
	}

	@Override
	public List<Employee> saveEmp(List<Employee> e) {
	
		return irepo.saveAll(e);
	}

	
}
