package com.subrat.runner;

import java.io.FileInputStream;
import java.io.InputStream;

import org.springframework.boot.CommandLineRunner;

public class Runner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Long id = Long.parseLong(IO.readln("enter id"));
		String name = IO.readln("enter string name");
		String address = IO.readln("enter address");
		String photoPath = IO.readln("enter your photopath").replaceAll("?", "");
		String resumePath = IO.readln("enter your resumePath").replaceAll("?", "");
		
		InputStream is=new FileInputStream(photoPath);
		byte[]photoData=new byte[is.available()];
		photoData=is.readAllBytes();
	}

}
