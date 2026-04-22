package com.subrat.repositary;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.subrat.entity.Employee;

public interface IEmpRepo extends JpaRepository<Employee, Long> {
	Optional<Employee> findByDept(String dept);
	@Query("SELECT e FROM Employee e WHERE e.salary > 5000")
	List<Employee> findByEmpsalaryGreaterThan();
}
