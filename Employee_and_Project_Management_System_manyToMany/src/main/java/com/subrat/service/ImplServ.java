package com.subrat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Employee;
import com.subrat.entity.Project;
import com.subrat.repositary.IEmployee;
import com.subrat.repositary.Iproject;

@Service
public class ImplServ implements Iservice {
	@Autowired
	private IEmployee Eserv;
	@Autowired
	private Iproject Pserv;

	@Override
	public List<Employee> addEmployees(List<Employee> e) {

		return Eserv.saveAll(e);
	}

	@Override
	public List<Project> addProjects(List<Project> p) {

		return Pserv.saveAll(p);
	}

	@Override
	public List<Employee> addProjectsToEmployee(Long id, List<Project> e) {
		Optional<Employee> byId = Eserv.findById(id);
		if (byId.isPresent()) {
			Employee emp = byId.get();
			emp.setProjects(e);
			return List.of(emp);
		}
		else {
			return null;
		}

	}

	@Override
	public List<Employee> showAllEmployeeWithProjects() {
		
		return Eserv.findAll();
	}

	@Override
	public List<Employee> ShowAllEmpUnderProject(Long id) {
		Optional<Project> byId = Pserv.findById(id);
		if(byId.isPresent()) {
			Project pro=byId.get();
			List<Employee> employees = pro.getEmployees();
			return employees;
		}
		else {
			return null;
		}
	}

}
