package com.subrat.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.subrat.entity.Employee;

public interface Iservice {
	List<Employee> saveEmployees(List<Employee> e);

	Page<Employee> getEmployeesByPageAndSort(int page, int size, boolean asc, String... props);

}
