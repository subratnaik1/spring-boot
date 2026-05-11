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
                List<Employee>empList=new ArrayList<>();
                int emp=Integer.parseInt(IO.readln("enter how many employees u want to add"));
                int pro=Integer.parseInt(IO.readln("enter how many projects u want to add"));
                
				for(int i=0;i<=emp;i++) {
					String empName=IO.readln("enter name");
					String department=IO.readln("enter department");
					Employee e=new Employee(empName,department);
					
					List<Project>projList=new ArrayList<>();
					for(int j=0;j<=pro;j++) {
						String projectName=IO.readln("enter project name");
						String clientName=IO.readln("enter client name");
						Project p=new Project(projectName,clientName);
						p.setEmployees(List.of(e));
						projList.add(p);						
					}
					e.setProjects(projList);
					empList.add(e);
					serv.addEmployees(empList);
				}
				IO.println("employee added ");
			}
			case 2->{
				int pro=Integer.parseInt(IO.readln("enter how many projects u want to add"));
				 int emp=Integer.parseInt(IO.readln("enter how many employees u want to add"));
				List<Project> projectList=new ArrayList<>();
				for(int i=0;i<pro;i++) {
					String projectName=IO.readln("enter project name");
					String clientName=IO.readln("enter client name");
					Project p=new Project(projectName,clientName);
					
					List<Employee>eList=new ArrayList<>();
					for(int j=0;j<emp;j++) {
						String empName=IO.readln("enter name");
						String department=IO.readln("enter department");
						Employee em=new Employee(empName,department);
						em.setProjects(List.of(p));
						eList.add(em);
					}
					p.setEmployees(eList);
					projectList.add(p);
					serv.addProjects(projectList);
					IO.println("project added");
				}
				
				
				
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
				showAllEmployeeWithProjects.forEach(e->{
					List<Project> list = e.getProjects();
					IO.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getDepartment()+" "+list);
				});
			}
			case 5->{
				long id = Long.parseLong(IO.readln("enter Project id"));
				List<Employee> showAllEmpUnderProject = serv.ShowAllEmpUnderProject(id);
				showAllEmpUnderProject.forEach(IO::println);
			}
			}
		}
	}
}
