package com.subrat.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Employee;
import com.subrat.service.Iservice;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Iservice iservice;

	@Override
	public void run(String... args) throws Exception {
		
		Employee l=new Employee(1l,"subrat","cse",2000);
		Employee m=new Employee(2l,"sritam","science",6000);
		Employee n=new Employee(3l,"gamesh","math",4000);
		Employee o=new Employee(4l,"rahul","bio",1000);
		Employee p=new Employee(5l,"subash","hjb",2040);
		Employee q=new Employee(6l,"dheeraj","plax",8000);
		
		List<Employee>list=List.of(l,m,n,o,p,q);
		iservice.saveEmployees(list);
		
		
		iservice.getEmployeesByPageAndSort(0, 3, true, "empName").forEach(IO::println);
				
	}

}
