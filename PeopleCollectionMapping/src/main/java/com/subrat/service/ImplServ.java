package com.subrat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.subrat.entity.Person;
import com.subrat.entity.PhoneNumber;
import com.subrat.repositary.IPersonRepo;
import com.subrat.repositary.IphnoRepo;

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
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Person> loadDataUsingParent() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
