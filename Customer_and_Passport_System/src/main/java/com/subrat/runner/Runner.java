package com.subrat.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.subrat.entity.Customer;
import com.subrat.entity.Passport;
import com.subrat.service.ImplServ;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private ImplServ serv;

	@Override
	public void run(String... args) throws Exception {
		
		int choice =Integer.parseInt(IO.readln("enter your choice"));
		switch(choice) {
		case 1->{
			Long passportNumber=Long.parseLong(IO.readln("enter passport number"));
			String issueCountry=IO.readln("enter which country to issue");
			
			Passport p=new Passport(passportNumber,issueCountry);
			String customerName=IO.readln("enter customer name");
			String nationality=IO.readln("enter customer nationality");
			Customer c=new Customer(customerName,nationality);
			c.setPassport(p);
			IO.println(serv.addCustomerWithPassport(c));
		}
		case 2->{
			serv.getCustomerDetails().forEach(IO::println);
		}
		}
	}

}
