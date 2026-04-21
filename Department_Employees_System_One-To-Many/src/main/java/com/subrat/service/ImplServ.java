package com.subrat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Department;
import com.subrat.entity.Employee;
import com.subrat.repositary.IDeptRepo;
import com.subrat.repositary.IEmpRepo;

@Service
public class ImplServ implements Iservice{
	@Autowired
	private IEmpRepo Erepo;
	@Autowired
	private IDeptRepo Drepo;
	
	String saveDept(Department d) {
		
		Drepo.save(d);
		return"department saved";
	}

	Optional<Department> findDeptById(Long id){
		Optional<Department> byId = Drepo.findById(id);
		return byId;
	}

	List<Department> findAllDept(){
		List<Department> all = Drepo.findAll();
		return all;
	}

	String saveEmp(Employee e) {
		Erepo.save(e);
		return "Employee saved";
	}

	Optional<Employee> findByDept(String dept){
		Optional<Employee> byDept = Erepo.findByDept(dept);
		return byDept;
	}

	List<Employee> FindEmpSalGreaterThen5000(){
		List<Employee> findEmpSalGreaterThen5000 = Erepo.FindEmpSalGreaterThen5000();
		return findEmpSalGreaterThen5000;
	}


}
