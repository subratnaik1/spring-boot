package com.subrat.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subrat.entity.Employee;
@Repository
public interface Irepo extends JpaRepository<Employee, Integer> {
	
	List<Employee> findBySalaryGreaterThan(int amt);

    List<Employee> findByJoiningDateAfter(LocalDate date);

    List<Employee> findByNameContaining(String word);
}
