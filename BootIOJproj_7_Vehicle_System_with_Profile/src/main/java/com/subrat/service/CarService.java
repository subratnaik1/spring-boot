package com.subrat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service
@Profile("test")
public class CarService implements VehicleService {

	@Override
	public List getVehicles() {
		List<String> list = new ArrayList<>();
		list.add("swift");
		list.add("Innova");
		return list;
	}

}
