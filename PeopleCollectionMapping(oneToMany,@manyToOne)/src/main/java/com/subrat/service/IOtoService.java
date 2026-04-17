package com.subrat.service;

import java.util.List;

import com.subrat.entity.Person;
import com.subrat.entity.PhoneNumber;

public interface IOtoService {
	public List<Person> saveDataUsingParent(List<Person>list);

	public List<PhoneNumber> saveDataUsingChild(List<PhoneNumber>list);
	
	public List<Person> loadDataUsingParent();
}
