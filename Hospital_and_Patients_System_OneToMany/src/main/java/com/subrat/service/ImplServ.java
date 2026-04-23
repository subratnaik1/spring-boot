package com.subrat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Hospital;
import com.subrat.entity.Patient;
import com.subrat.repositary.IserviceHospital;
import com.subrat.repositary.IservicePatient;

@Service
public class ImplServ implements Iservice {
	@Autowired
	private IserviceHospital Hserv;
	@Autowired
	private IservicePatient Pserv;
	@Override
	public String admitPatients(Patient p) {	
		Pserv.save(p);
		return "patient added";		
	}
	@Override
	public List<Patient> viewPatients() {		
		return Pserv.findAll();
	}
	@Override
	public String addHospital(Hospital h) {
		Hserv.save(h);
		return "Hospital saved";
	}
	@Override
	public List<Hospital> viewHospitals() {

		return Hserv.findAll();
	}
	
	

}
