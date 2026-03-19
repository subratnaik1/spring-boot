package com.subrat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.subrat.sbeans.CompanyRunner;

@SpringBootApplication
public class BootIoJproj4CompanyDepartmentListSystemApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootIoJproj4CompanyDepartmentListSystemApplication.class, args);
	CompanyRunner cr=ctx.getBean("cr",CompanyRunner.class);
	IO.println(cr);
	}

}
