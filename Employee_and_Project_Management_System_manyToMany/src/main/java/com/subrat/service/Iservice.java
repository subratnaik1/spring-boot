package com.subrat.service;

import java.util.List;

import com.subrat.entity.Employee;
import com.subrat.entity.Project;

public interface Iservice {

	List<Employee> addEmployees(List<Employee>e);
	
	List<Project> addProjects(List<Project>p);
	
	List <Employee> addProjectsToEmployee(Long id,List <Project> e);
	
	List<Employee> showAllEmployeeWithProjects();
	
	List<Employee> ShowAllEmpUnderProject(Long id);
	
}
