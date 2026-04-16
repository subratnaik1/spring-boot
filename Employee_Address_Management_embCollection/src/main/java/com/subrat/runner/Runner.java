package com.subrat.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Address;
import com.subrat.entity.Employee;
import com.subrat.repositary.Irepo;
import com.subrat.service.Iservice;

@Component
public class Runner implements CommandLineRunner{

    private final Irepo irepo;
	@Autowired
	private Iservice serv;

    Runner(Irepo irepo) {
        this.irepo = irepo;
    }

	@Override
	public void run(String... args) throws Exception {
		IO.println("1=save");
		IO.println("1=view");
		
		while(true) {
			int choice=Integer.parseInt(IO.readln("enter your choice"));
			switch(choice) {
			case 1->{
				Address A=new Address();
				A.setCity("sundargarh");
				
				A.setState("Odisha");
				
				Employee emp=new Employee();
				
				emp.setAddress(List.of(A));
				emp.setName("Subrat");
				A.setEmp(emp);
				List<Employee> saveAll = serv.saveAll(List.of(emp));
				if(saveAll.isEmpty()) {
					IO.println("employee not saved");
				}
				else {
					IO.println(" saved");
				}
			}
			case 2->{
				serv.fetchAll().forEach(IO::println);
			}
			}
		}
	}
	
	
}
