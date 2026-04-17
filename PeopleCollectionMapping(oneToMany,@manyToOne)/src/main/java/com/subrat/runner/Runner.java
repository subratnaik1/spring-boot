package com.subrat.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Person;
import com.subrat.entity.PhoneNumber;
import com.subrat.service.IOtoService;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private IOtoService serv;

	@Override
	public void run(String... args) throws Exception {
		while (true) {
			IO.println("insert using parent");
			IO.println("insert using child");
			IO.println("fetch parent");

			int choice = Integer.parseInt(IO.readln("enter your choice"));
			switch (choice) {
			case 1 -> {
				PhoneNumber a = new PhoneNumber(1873429L, "Airtel", "smart");
				Person p = new Person("subrat", "Odisha");
				a.setPersonInfo(p);
				p.setContactDetails(Set.of(a));

				serv.saveDataUsingParent(List.of(p));
				IO.println("inserted");
			}
			case 2 -> {
				PhoneNumber a = new PhoneNumber(8768768L, "JIO", "not smart");
				Person p = new Person("Rahul", "Jalna");
				a.setPersonInfo(p);
				p.setContactDetails(Set.of(a));
			}
			case 3 -> {
				serv.loadDataUsingParent().forEach(IO::println);
			}
			}
		}
	}

}
