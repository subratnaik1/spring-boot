package com.subrat.service;

import java.util.List;

import com.subrat.entity.Hospital;
import com.subrat.entity.Patient;

public interface Iservice {
	String admitPatients(Patient p);

	List<Patient> viewPatients();

	String addHospital(Hospital h) ;
	
	List<Hospital> viewHospitals();
	
}
