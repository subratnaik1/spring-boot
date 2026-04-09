package com.subrat.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Employee;
import com.subrat.service.Iservice;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Iservice serv;

	@Override
	public void run(String... args) throws Exception {
    Employee e=new Employee(1,"subrat","cse",2000, LocalDate.of(2026, 2, 2));
    Employee f=new Employee(2,"sritam","cse",2000, LocalDate.of(2023, 3, 21));
    Employee g=new Employee(3,"rahul","cse",2000, LocalDate.of(2023, 4, 4));
    Employee h=new Employee(4,"ganesh","cse",2000, LocalDate.of(2022, 5, 7));
    Employee i=new Employee(5,"subash","cse",2000, LocalDate.of(2021, 6, 20));
		
    List<Employee> list=List.of(e,f,g,h,i);
    serv.saveEmp(list);
 
    Optional<Employee>o=serv.findById(1);
    if(o.isPresent()) {
    	IO.println(o.get());
    }
    serv.afterJoin(LocalDate.of(2021, 4, 4)).forEach(IO::println);
    IO.println();
    serv.containing("s").forEach(IO::println);
	}

}
