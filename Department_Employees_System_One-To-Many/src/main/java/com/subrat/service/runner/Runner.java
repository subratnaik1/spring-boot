package com.subrat.service.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Department;
import com.subrat.entity.Employee;
import com.subrat.service.Iservice;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Iservice serv;

	@Override
	public void run(String... args) throws Exception {

		IO.println("1-Save Department");
		IO.println("2-Find Department by id");
		IO.println("3-Fetch all Departments");
		IO.println("4-Save Employee");
		IO.println("5-Find Employees by Department");
		IO.println("6-Find Employees with salary > 50,000");
		int choice = Integer.parseInt(IO.readln("enter your choice"));
		
		switch(choice) {
		case 1->{
			Employee e=new Employee();
			e.setId(2l);
			e.setName("raj");
			e.setSalary(2000.0);
			
			Employee f=new Employee();
			f.setId(3l);
			f.setName("raju");
			f.setSalary(80000.0);
			
			Department d=new Department();
			d.setId(1l);
			d.setName("Subrat");
			d.setLocation("Odisha");
			d.setEmployee(List.of(e,f));
			e.setDept(d);
			
			IO.println(serv.saveDept(d));
		}
		case 2->{
			Long id=Long.parseLong(IO.readln("enter id"));
			serv.findDeptById(id).ifPresent(IO::println);
		}
		case 3->{
			serv.findAllDept().forEach(IO::println);
		}
		case 4->{
			Employee g=new Employee();
			g.setId(4l);
			g.setName("sumit");
			g.setSalary(90000.0);
			
			Department d=new Department();
			d.setId(1l);
			d.setName("Subrat");
			d.setLocation("Odisha");
			d.setEmployee(List.of(g));
			g.setDept(d);
			
			IO.println(serv.saveDept(d));
			
		}
		case 5->{
			String dept=IO.readln("enter department");
			Optional<Employee> byDept = serv.findByDept(dept);
			byDept.ifPresent(IO::println);
		}
		case 6->{
			serv.FindEmpSalGreaterThen5000().forEach(IO::println);
		}
		}
		
	}

}
