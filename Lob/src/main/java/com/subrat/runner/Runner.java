package com.subrat.runner;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Employee;
import com.subrat.repositary.EmpRepo;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private EmpRepo Erep;

	@Override
	public void run(String... args) throws Exception {
		IO.println("save employee");
		IO.println("retrive employee");
		IO.println("delete");
		int choice = Integer.parseInt(IO.readln("enter your choice"));
		switch(choice) {
		case 1->{
			Employee employee=new Employee();
			employee.setEmp_id(101l);
			employee.setEmp_name("Rohit");
			employee.setDepartment("IT");
			employee.setSalary(70000d);
			byte[] allBytes = Files.readAllBytes(Paths.get("E:\\Adobe Draw\\PicsArt_01-17-09.08.25.jpg"));
			employee.setProfile_photo(allBytes);
			String resume=new String(Files.readAllBytes(Paths.get("E:\\resume\\subrat resume.pdf")));
		    employee.setResume(resume);
		    Employee emp = Erep.save(employee);
		    System.out.println("Employee Id:"+employee.getEmp_id()+
		    "Employee Name:"+employee.getEmp_name()+
		    "Employee Dept:"+employee.getDepartment()+
		    "Employee Salary:"+employee.getSalary());
		    break;
		}
		case 2->{
			System.out.println("Employee Imformation Retrieved");
			Optional<Employee> byId = Erep.findById(101l);
		    Employee e = byId.get();
		    System.out.println(e.getEmp_id());
		    System.out.println(e.getEmp_name());
		    System.out.println(e.getDepartment());
		    System.out.println(e.getSalary());
		   // Files.write(Paths.get(("D:\\New folder\\photo.jpg"), e.getProfile_photo()));
		    Files.write(Paths.get("C:\\Users\\91814\\OneDrive\\Pictures\\image.jpg"), e.getProfile_photo());
		    Files.write(Paths.get("C:\\Users\\91814\\OneDrive\\Pictures\\Screenshots\\Desktop\\Text.txt"), e.getResume().getBytes());
		   
		   System.out.println("SuccessFully Retrieved");

		}
		case 3->{
			Erep.deleteAll();
			IO.println("deleted");
		}
		}
	}

}
