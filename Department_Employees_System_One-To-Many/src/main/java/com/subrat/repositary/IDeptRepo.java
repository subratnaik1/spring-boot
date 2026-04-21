package com.subrat.repositary;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Department;
import com.subrat.entity.Employee;

public interface IDeptRepo extends JpaRepository<Department, Long> {

	
}
