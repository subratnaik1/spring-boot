package com.subrat.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Employee;
import com.subrat.repositary.Irepo;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Irepo irepo;

	@Override
	public void run(String... args) throws Exception {
		while (true) {
			IO.println("=== Employee Salary Menu ===");
			IO.println("1. Add Employee");
			IO.println("2. View All Employees");
			IO.println("3. Find by Department");
			IO.println("4. Find Salary Between Range");
			IO.println("5. Find Experienced Employees");
			IO.println("6. Count Employees in Department");
			IO.println("7. Highest Salary Employee");
			IO.println("8. Increase Salary");
			IO.println("9. Delete Low Salary Employees");
			IO.println("10. Exit");

			int choice = Integer.parseInt(IO.readln("enter your choice"));

			switch (choice) {

			case 1 -> {
				Long id = Long.parseLong(IO.readln("enter id"));
				String name = IO.readln("enter name");
				String department = IO.readln("enter the department");
				Double salary = Double.parseDouble(IO.readln("enter salary"));
				Integer experience = Integer.parseInt(IO.readln("enter experience"));

				Employee e = new Employee();
				e.setId(id);
				e.setName(name);
				e.setDepartment(department);
				e.setSalary(salary);
				e.setExperience(experience);

				irepo.save(e);
				
			}
			case 2 -> {
				List<Employee> all = irepo.findAll();
				all.forEach(IO::println);
			}
			case 3 -> {
				String dept = IO.readln();
				irepo.findByDept(dept).forEach(IO::println);
				;
			}
			case 4 -> {
				int min = Integer.parseInt(IO.readln("enter min range"));
				int max = Integer.parseInt(IO.readln("enter max range"));
				irepo.findEmpBetweenSal(min, max).forEach(IO::println);
			}
			case 5 -> {
				int exp = Integer.parseInt(IO.readln("enter experience years"));
				irepo.expGreater(exp).forEach(IO::println);
			}
			case 6 -> {
				String dept = IO.readln("enter dept");
				IO.println(irepo.count(dept));
			}
			case 7 -> {
				Optional<Employee> maxSal = irepo.maxSal();
				maxSal.ifPresent(IO::println);				
			}
			case 8 -> {
				Long id = Long.parseLong(IO.readln("enter id"));
				Double inc = Double.parseDouble(IO.readln("enter increment"));
				irepo.updateSal(inc, id);
				IO.println("updated");
			}
			case 9 -> {
				Double sal = Double.parseDouble(IO.readln("enter sal"));
				irepo.delEmpSmallSal(sal);
				IO.readln("deleted employee lower then " + sal);
			}
			case 10 -> {
				System.exit(0);
			}

			}
		}
		
	}

}
