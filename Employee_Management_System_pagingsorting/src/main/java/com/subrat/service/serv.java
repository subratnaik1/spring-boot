package com.subrat.service;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.subrat.entity.Employee;
import com.subrat.repositary.Irepo;
@Service
public class serv implements Iservice {
	@Autowired
	private Irepo irepo;

	public List<Employee> saveEmployees(List<Employee> e) {
		
		 Iterable<Employee> saveAll = irepo.saveAll(e);
		 List<Employee> list = StreamSupport.stream(saveAll.spliterator(), false).toList();
		 return list;
	}

	@Override
	public Page<Employee> getEmployeesByPageAndSort(int page, int size, boolean asc, String... props) {
	
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,props);
		Pageable pageable = PageRequest.of(page, size,sort);
		Page<Employee> all = irepo.findAll(pageable);
		return all;
		
	}
	
	

}
