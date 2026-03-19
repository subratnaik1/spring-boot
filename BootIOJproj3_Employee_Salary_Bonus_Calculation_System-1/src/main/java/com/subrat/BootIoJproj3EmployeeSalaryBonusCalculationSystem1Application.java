package com.subrat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.subrat.sbeans.StudentRunner;

@SpringBootApplication
public class BootIoJproj3EmployeeSalaryBonusCalculationSystem1Application {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootIoJproj3EmployeeSalaryBonusCalculationSystem1Application.class, args);
	StudentRunner sr=ctx.getBean("sr",StudentRunner.class);
	IO.println(sr);

	}

}
