package com.subrat.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Student;
import com.subrat.repositary.Irepo;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Irepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		Student a=new Student(1l,"subrat","java",100.0);
		Student b=new Student(2l,"rahul","javajhb",100.0);
		Student c=new Student(3l,"raj","java",70.0);
		Student d=new Student(4l,"jhv","java",100.0);
		
		repo.saveAll(List.of(a,b,c,d));
		IO.println(repo.avgMarks());
		IO.println(repo.studentMrkGreaterThen90());
		repo.findStudentByCourse("java").forEach(IO::println);
}}
