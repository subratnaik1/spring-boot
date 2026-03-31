package com.subrat.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.subrat.entity.Travel;
import com.subrat.repository.TravelRepository;

@Service
public class TravelService implements ITravelService {

	@Autowired
	public TravelRepository travelRepository;

	@Override
	public String addTravel(Travel travel) {
		Travel t = travelRepository.save(travel);
		if (t != null) {
			return "travell data saved";
		} else {
			return "not save";
		}
	}

	@Override
	public Iterable<Travel> getAllTravels() {
		Iterable<Travel> all = travelRepository.findAll();
		return all;
	}

	@Override
	public Optional<Travel> findTravelById(Long id) {

		return travelRepository.findById(id);
	}

	@Override
	public String deleteTravelById(Long id) {

		travelRepository.deleteById(id);
		return "record deleted";
	}

	@Override
	public boolean existsById(Long id) {

		return travelRepository.existsById(id);
	}

	@Override
	public long count() {

		return travelRepository.count();
	}

	@Override
	public String delete(Travel travel) {

		return null;
	}

	@Override
	public String deleteAll() {

		travelRepository.deleteAll();
		return "all records deleted";
	}

}
