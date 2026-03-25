package com.subrat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.subrat.sbeans.Book;
import com.subrat.sbeans.Runner;

@SpringBootApplication
public class Exam2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Exam2Application.class, args);
		Runner r = ctx.getBean(Runner.class);
		IO.println(r);
	}

}
