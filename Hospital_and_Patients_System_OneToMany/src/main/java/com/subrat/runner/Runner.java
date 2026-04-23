package com.subrat.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Hospital;
import com.subrat.entity.Patient;
import com.subrat.service.ImplServ;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private ImplServ serv;

	@Override
	public void run(String... args) throws Exception {
		int choice = Integer.parseInt(IO.readln("enter your choice"));
		switch (choice) {
		case 1 -> {
			String hospitalName=IO.readln("enter hospital name");
			String location=IO.readln("enter location");
			Hospital h=new Hospital(hospitalName,location);
			
			 String patientName=IO.readln("enter patient name");
			 String disease=IO.readln("enter disease");
			 Double billAmount=Double.parseDouble(IO.readln("enter bill amount"));
			Patient p=new Patient(patientName,disease,billAmount); 
			p.setHospital(h);
			h.setPatients(Arrays.asList(p));
			
			IO.println(serv.admitPatients(p));
		}
		case 2->{
			serv.viewPatients().forEach(IO::println);
		}
		case 3->{
			String hospitalName=IO.readln("enter hospital name");
			String location=IO.readln("enter location");
			Hospital h=new Hospital(hospitalName,location);
			
			 String patientName=IO.readln("enter patient name");
			 String disease=IO.readln("enter disease");
			 Double billAmount=Double.parseDouble(IO.readln("enter bill amount"));
			Patient p=new Patient(patientName,disease,billAmount); 
			p.setHospital(h);
			h.setPatients(Arrays.asList(p));
			
			IO.println(serv.addHospital(h));
		}
		case 4->{
			serv.viewHospitals().forEach(IO::println);
		}
		}
	}

}
