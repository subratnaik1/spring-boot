package com.subrat.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Employee;
import com.subrat.repositary.Irepo;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Irepo repo;

	@Override
	public void run(String... args) throws Exception {
		while (true) {
		String msg = """
				1-Add Employee
				2-View All Employees
				3-Find by Department (JPQL)
				4-Find Above Salary (JPQL)
				5-Search by Name (JPQL)
				6-Count by Department (JPQL)
				7-Find by Designation & Dept
				8-Salary Range (Native)
				9-Top 5 Highest Paid
				10-Total Employees
				11-Average Salary
				12-Dept-wise Count
				13-Update Salary
				14-Increment Salary by Dept
				15-Delete by Department
				16-Exit
								""";
		IO.println(msg);

		int choice = Integer.parseInt(IO.readln("enter your choice"));

		switch (choice) {

		case 1 -> {
			Employee a = new Employee(1l, "subrat", "cse", 20000.0, "kolkata");
			Employee b = new Employee(2l, "rahul", "ece", 30000.0, "chennai");
			Employee c = new Employee(3l, "sritam", "ece", 40000.0, "hyd");
			Employee d = new Employee(4l, "dheeraj", "cse", 50000.0, "Odisha");
			Employee e = new Employee(5l, "anjali", "ece", 30000.0, "Mumbai");
			Employee f = new Employee(6l, "ananya", "cse", 80000.0, "Hyd");
			Employee g = new Employee(7l, "pratiksha", "esc", 60000.0, "chennai");
			Employee h = new Employee(8l, "rohan", "cse", 10000.0, "hydS");

			List<Employee> list = List.of(a, b, c, d, e, f, g, h);

			repo.saveAll(list);

		}
		case 2 -> {
			repo.findAll().forEach(IO::println);

		}
		case 3 -> {
			String dept = IO.readln("enter department name");
			repo.findEmployeeByDepartment(dept).forEach(IO::println);
		}
		case 4 -> {
			Double sal = Double.parseDouble(IO.readln("enter salary"));
			repo.findSalaryGreaterThen(sal).forEach(IO::println);
		}
		case 5 -> {
			String name = IO.readln("enter name");
			repo.searchByName(name).forEach(IO::println);
		}
		case 6 -> {
			String dept = IO.readln("enter department");
			IO.println(repo.countByDept(dept));
		}
		case 7 -> {
			String desg = IO.readln("enter designation");
			String dept = IO.readln("enter department");
			repo.findEmpByDesgDept(desg, dept).forEach(IO::println);
		}
		case 8 -> {
			Double min = Double.parseDouble(IO.readln("enter min salary"));
			Double max = Double.parseDouble(IO.readln("enter max salary"));
			repo.findEmpBetween(min, max).forEach(IO::println);
		}
		case 9 -> {
			repo.findTopFive().forEach(IO::println);
		}
		case 10 -> {
			IO.println(repo.countEmp());
		}
		case 11 -> {
			IO.println(repo.getAvgSal());
		}
		case 12 -> {
			String dept = IO.readln("enter department");
			IO.println(repo.countByDept(dept));
		}
		case 13 -> {
			Double sal = Double.parseDouble(IO.readln("enter salary to update"));
			Long id = Long.parseLong(IO.readln("enter id"));
			IO.println(repo.UpdEmpSalById(id, sal) + "updated");
		}
		case 14 -> {
			String dept = IO.readln("enter department");
			IO.println(repo.incSalBy5000(dept) + "updated");
		}
		case 15 -> {
			String dept = IO.readln("enter department");
			IO.println(repo.delBydept(dept) + "deleted");
		}
		}

	}
	}
}