package com.subrat.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Student;
import com.subrat.service.Iservice;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Iservice serv;

	@Override
	public void run(String... args) throws Exception {

		List<Long>list=List.of(12345l,677878l,765678923l);
		Student a=new Student(1l,"subrat",list);
		Student b=new Student(2l,"ganesh",list);
		
		serv.saveStudent(List.of(a,b)).forEach(IO::println);
		serv.getStudentDetails(1l);
	}

}
