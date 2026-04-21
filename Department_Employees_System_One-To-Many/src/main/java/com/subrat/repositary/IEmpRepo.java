package com.subrat.repositary;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Employee;

public interface IEmpRepo extends JpaRepository<Employee, Long> {
	Optional<Employee> findByDept(String dept);
	List<Employee> FindEmpSalGreaterThen5000();
}
