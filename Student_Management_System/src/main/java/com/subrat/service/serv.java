package com.subrat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Student;
import com.subrat.repositary.Irepo;

@Service
public class serv implements Iservice {
	@Autowired
	private Irepo irepo;

	@Override
	public List<Student> findByCourse(String course) {

		return irepo.findByCourse(course);
	}

	@Override
	public List<Student> findByMarksGreaterThan(Double marks) {
		
		return irepo.findByMarksGreaterThan(marks) ;
	}

	@Override
	public List<Student> findByMarksBetween(Double min, Double max) {
		
		return irepo.findByMarksBetween(min, max);
	}

	@Override
	public List<Student> findByGrade(String grade) {
		
		return irepo.findByGrade(grade);
	}

	@Override
	public List<Student> findByCity(String city) {
		return irepo.findByCity(city);
	}

	@Override
	public List<Student> findByPassedTrue() {
		
		return irepo.findByPassedTrue();
	}

	@Override
	public List<Student> findByNameStartingWith(String prefix) {
		
		return irepo.findByNameStartingWith(prefix);
	}

	@Override
	public List<Student> findByCourseAndPassed(String course, Boolean status) {
		
		return irepo.findByCourseAndPassed(course, status);
	}

	@Override
	public List<Student> findTop3ByOrderByMarksDesc() {
		
		return irepo.findTop3ByOrderByMarksDesc();
	}

	@Override
	public List<Student> findByCityNotIn(List<String> cities) {
		
		return irepo.findByCityNotIn(cities);
	}

	public List<Student> saveAll(List<Student> a){
		
		return irepo.saveAll(a);
	}
}
