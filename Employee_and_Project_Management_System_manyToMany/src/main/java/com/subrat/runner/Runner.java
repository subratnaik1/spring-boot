package com.subrat.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Employee;
import com.subrat.entity.Project;
import com.subrat.service.Iservice;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Iservice serv;

	@Override
	public void run(String... args) throws Exception {

		while (true) {
			IO.println("1-Add Employees");
			IO.println("2-Add Projects");
			IO.println("3-Assign Multiple Projects to Employee");
			IO.println("4-Fetch Employee with Projects");
			IO.println("5-Find All Employees under a Project");
			int choice = Integer.parseInt(IO.readln("enter your choice"));
			switch (choice) {
			case 1 -> {

				Employee a = new Employee("subrat", "cse");
				Employee b = new Employee("raj", "machenical");
				Employee c = new Employee("sritam", "cse");
				Employee d = new Employee("rahul", "elect");
				List<Employee> eList = List.of(a, b, c, d);
				
				Project e = new Project("proj1", "rrrr");
				Project f = new Project("proj2", "jhv");
				Project g = new Project("proj3", "jhb");
				Project h = new Project("proj4", "kjb");
				List<Project> pList = List.of(e, f, g, h);
				
				a.setProjects(pList);
				b.setProjects(pList);
				c.setProjects(pList);
				d.setProjects(pList);

				e.setEmployees(eList);
				f.setEmployees(eList);
				g.setEmployees(eList);
				h.setEmployees(eList);
				
				serv.addEmployees(eList);
				IO.println("employees added");
			}
			case 2->{
				Employee a = new Employee("subrat", "cse");
				Employee b = new Employee("raj", "machenical");
				Employee c = new Employee("sritam", "cse");
				Employee d = new Employee("rahul", "elect");
				List<Employee> eList = List.of(a, b, c, d);
				
				Project e = new Project("proj1", "rrrr");
				Project f = new Project("proj2", "jhv");
				Project g = new Project("proj3", "jhb");
				Project h = new Project("proj4", "kjb");
				List<Project> pList = List.of(e, f, g, h);
				
				a.setProjects(pList);
				b.setProjects(pList);
				c.setProjects(pList);
				d.setProjects(pList);

				e.setEmployees(eList);
				f.setEmployees(eList);
				g.setEmployees(eList);
				h.setEmployees(eList);
				
				serv.addProjects(pList);
				IO.println("projects added");
			}
			case 3->{
			long id = Long.parseLong(IO.readln("enter Employee id"));
			
			Employee a = new Employee("subrat", "cse");
			Employee b = new Employee("raj", "machenical");
			Employee c = new Employee("sritam", "cse");
			Employee d = new Employee("rahul", "elect");
			List<Employee> eList = List.of(a, b, c, d);
			
			Project e = new Project("proj1", "rrrr");
			Project f = new Project("proj2", "jhv");
			Project g = new Project("proj3", "jhb");
			Project h = new Project("proj4", "kjb");
			List<Project> pList = List.of(e, f, g, h);
			
			serv.addProjectsToEmployee(id, pList);
			IO.println("Added projects to Employee");
			}
			case 4->{
				List<Employee> showAllEmployeeWithProjects = serv.showAllEmployeeWithProjects();
				showAllEmployeeWithProjects.forEach(IO::println);
			}
			case 5->{
				long id = Long.parseLong(IO.readln("enter Project id"));
				serv.ShowAllEmpUnderProject(id).forEach(IO::println);
			}
			}
		}
	}
}
