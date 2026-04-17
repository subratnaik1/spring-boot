package com.subrat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Person;
import com.subrat.entity.PhoneNumber;
import com.subrat.repositary.IPersonRepo;
import com.subrat.repositary.IphnoRepo;
@Service
public class ImplServ implements IOtoService {
	@Autowired
	private IPersonRepo iperRepo;
	@Autowired
	private IphnoRepo iphrepo;
	@Override
	public List<Person> saveDataUsingParent(List<Person> list) {
		
		return iperRepo.saveAll(list);
	}
	@Override
	public List<PhoneNumber> saveDataUsingChild(List<PhoneNumber> list) {
		
		return iphrepo.saveAll(list);
	}
	@Override
	public List<Person> loadDataUsingParent() {
		
		return iperRepo.findAll();
	}

	
	
	
	
}
