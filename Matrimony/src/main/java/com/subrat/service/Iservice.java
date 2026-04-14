package com.subrat.service;

import java.util.Optional;

import com.subrat.entity.MarraigeSeeker;

public interface Iservice {

	String registerMarraigeSeeker(MarraigeSeeker seeker);
	 Optional<MarraigeSeeker>searchSeekerById(Long id);
}
