package com.subrat.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.subrat.sbeans.Employee;

@Controller
public class Runner implements CommandLineRunner{
	@Autowired
	private Employee emp;

	@Override
	public void run(String... args) throws Exception {
		IO.println(emp);
	}
}
