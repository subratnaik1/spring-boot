package com.subrat.service;

import java.util.Optional;

import com.subrat.entity.Travel;

public interface ITravelService {
	String addTravel(Travel travel);

	Iterable<Travel> getAllTravels();

	Optional<Travel> findTravelById(Long id);

	String deleteTravelById(Long id);

	boolean existsById(Long id);

	long count();

	String delete(Travel travel);

	String deleteAll();
}
