package com.subrat.runner;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.subrat.entity.Student;
import com.subrat.repositary.Irepo;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Irepo irepo;

	@Override
	public void run(String... args) throws Exception {
		Student a = new Student(1, "subrat", LocalDate.of(2024, 02, 02));
		Student b = new Student(2, "rohan", LocalDate.of(2021, 05, 04));
		Student c = new Student(3, "subash", LocalDate.of(2022, 07, 06));
		Student d = new Student(4, "raj", LocalDate.of(2026, 03, 07));
		Student e = new Student(5, "ravi", LocalDate.of(2025, 02, 04));

		List<Student> list = List.of(a, b, c, d, e);
		irepo.saveAll(list);

		Sort sort = Sort.by(Direction.ASC, "name");
		Pageable pg=PageRequest.of(0, 2, sort);
		Page<Student>all=irepo.findAll(pg);
		Page<Student> all2 = irepo.findAll(pg);
		all2.forEach(IO::println);
		
		
	}

}
