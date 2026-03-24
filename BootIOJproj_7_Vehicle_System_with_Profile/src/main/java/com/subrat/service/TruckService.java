package com.subrat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service
@Profile("prod")
public class TruckService implements VehicleService {

	@Override
	public List getVehicles() {
		List<String> list = new ArrayList<>();
		list.add("tata truck");
		list.add("Ashoka leyLand");
		return list;
	}

}
