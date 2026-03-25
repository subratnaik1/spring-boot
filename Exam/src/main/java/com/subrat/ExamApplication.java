package com.subrat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.subrat.sbeans.FinalP;

@SpringBootApplication
public class ExamApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  ctx=SpringApplication.run(ExamApplication.class, args);
		FinalP fp=ctx.getBean("fp",FinalP.class);
		IO.println(fp);
	}

}
