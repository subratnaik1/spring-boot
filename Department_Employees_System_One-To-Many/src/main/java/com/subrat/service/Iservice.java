package com.subrat.service;

import java.util.List;
import java.util.Optional;

import com.subrat.entity.Department;
import com.subrat.entity.Employee;

public interface Iservice {
	String saveDept(Department d);

	Optional<Department> findDeptById(Long id);

	List<Department> findAllDept();

	String saveEmp(Employee e);

	Optional<Employee> findByDept(String dept);

	List<Employee> FindEmpSalGreaterThen5000();

}
