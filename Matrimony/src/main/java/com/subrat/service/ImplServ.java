package com.subrat.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.MarraigeSeeker;
import com.subrat.repositary.Irepo;

@Service
public class ImplServ implements Iservice {
	@Autowired
	private Irepo repo;

	@Override
	public String registerMarraigeSeeker(MarraigeSeeker seeker) {
		
		return "marraige seeker info saved with id value"+repo.save(seeker).getId();
	}

	@Override
	public Optional<MarraigeSeeker> searchSeekerById(Long id) {
		
		return repo.findById(id);
	}

}
