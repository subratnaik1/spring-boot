package com.subrat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.subrat.sbeans.Product;

@SpringBootApplication
public class BootIoJproj5ProductCatalogSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootIoJproj5ProductCatalogSystemApplication.class, args);
//		Product bean = run.getBean(Product.class);
//		bean.
	}

}
