package com.subrat.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Profile;
import com.subrat.entity.User;
import com.subrat.service.Iservice;
@Component
public class Runner implements CommandLineRunner {
@Autowired
	private Iservice serv;
	@Override
	public void run(String... args) throws Exception {
	while (true) {
		IO.println("save user");
		IO.print("fetch user");
		int choice=Integer.parseInt(IO.readln("enter your choice"));
		
		switch(choice) {
		case 1->{
			User a=new User("subrat","subrat@gmail");
			Profile b=new Profile("8768754","odisha");
			a.setProfile(b);
			serv.addUser(List.of(a));
			IO.println("inserted");
		}
		case 2->{
			serv.showAllUser().forEach(IO::println);
		}
		}
	}
	}

}
