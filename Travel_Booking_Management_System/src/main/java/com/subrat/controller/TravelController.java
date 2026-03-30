package com.subrat.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.subrat.entity.Travel;
import com.subrat.service.TravelService;

@Controller
public class TravelController {
	@Autowired
	public TravelService travelService;

	public String addTravel(Travel travel) {
		return travelService.addTravel(travel);
	}

	public Iterable<Travel> getAllTravels() {
		return travelService.getAllTravels();

	}
	public Optional<Travel> findTravelById(Long id){
		return travelService.findTravelById(id);
		
	}

}
