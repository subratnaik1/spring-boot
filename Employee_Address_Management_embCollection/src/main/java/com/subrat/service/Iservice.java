package com.subrat.service;

import java.util.List;

import com.subrat.entity.Employee;

public interface Iservice {

	List<Employee> saveAll(List<Employee> e);

	List<Employee> fetchAll();
}
