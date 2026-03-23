package com.subrat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.subrat.controller.Runner;

@SpringBootApplication
public class BootIoJproj6NotificationSystemWithProfileApplication {

	public static void main(String[] args) {
		SpringApplication
				.run(BootIoJproj6NotificationSystemWithProfileApplication.class, args);
		
	}

}
