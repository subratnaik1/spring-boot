package com.subrat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.subrat.service.VehicleService;

@Controller
public class Runner implements CommandLineRunner{
	@Autowired
	private VehicleService vehicleService;

	@Override
	public void run(String... args) throws Exception {
	IO.println(vehicleService.getVehicles());
	}
	
}
