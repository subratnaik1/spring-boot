package com.subrat;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.subrat.sbeans.Employee;
import com.subrat.sbeans.YearlySal;

@SpringBootApplication
public class EmployeeSalaryBonusCalculationSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  ctx=SpringApplication.run(EmployeeSalaryBonusCalculationSystemApplication.class, args);
		YearlySal e=ctx.getBean("ys",YearlySal.class);
//		String beanids[]=ctx.getBeanDefinitionNames();
//		IO.println(Arrays.toString(beanids));
		IO.println(e);
	}

}
