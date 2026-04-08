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
	private Iservice iservice;

	@Override
	public void run(String... args) throws Exception {

		Student s = new Student(1l,"subrat", "java", 50.0, "A", true,"hyd");
		Student s1 = new Student(2l,"sritam", "html", 53.0, "A", false,"Odisha");
		Student s2 = new Student(3l,"rahul", "css", 52.0, "A", false,"maharastra");
		Student s3 = new Student(4l,"dhereej", "javascript", 50.0, "A", true,"delhi");
		Student s4 = new Student(5l,"anjali", "c", 40.0, "A", false,"mumbai");
		Student s5 = new Student(6l,"subash", "c++", 20.0, "A", true,"kerla");
		List<Student>l=List.of(s,s1,s2,s3,s4,s5);
		iservice.saveAll(l);
		
		String course=IO.readln("enter course");
		List<Student> list=iservice.findByCourse(course);
		list.forEach(IO::println);
		
	}

}
