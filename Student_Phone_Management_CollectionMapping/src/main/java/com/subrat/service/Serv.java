package com.subrat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Student;
import com.subrat.repositary.Irepo;

@Service
public class Serv implements Iservice {
	@Autowired
	private Irepo repo;

	
	@Override
	public Optional<Student> getStudentDetails(Long id) {
		
		return repo.findById(id);
	}


	@Override
	public List<Student> saveStudent(List<Student> s) {
	
		return repo.saveAll(s);
	}
	
	
}
