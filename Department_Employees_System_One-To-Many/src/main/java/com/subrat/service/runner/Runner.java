package com.subrat.service.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Department;
import com.subrat.service.Iservice;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Iservice serv;

	@Override
	public void run(String... args) throws Exception {

		int choice = Integer.parseInt(IO.readln("enter your choice"));
		IO.println("1-Save Department");
		IO.println("2-Find Department by id");
		IO.println("3-Fetch all Departments");
		IO.println("4-Save Employee");
		IO.println("5-Find Employees by Department");
		IO.println("6-Find Employees with salary > 50,000");
		
		switch(choice) {
		case 1->{
			Department d=new Department(1l,"subrat","odisha");
			
			
		}
		}
		
	}

}
