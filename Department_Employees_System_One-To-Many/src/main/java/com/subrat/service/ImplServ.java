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
	
	public String saveDept(Department d) {
		
		Drepo.save(d);
		return"department saved";
	}

	public Optional<Department> findDeptById(Long id){
		Optional<Department> byId = Drepo.findById(id);
		return byId;
	}

	public List<Department> findAllDept(){
		List<Department> all = Drepo.findAll();
		return all;
	}

	public String saveEmp(Employee e) {
		Erepo.save(e);
		return "Employee saved";
	}

	public Optional<Employee> findByDept(String dept){
		Optional<Employee> byDept = Erepo.findByDept(dept);
		return byDept;
	}

	public List<Employee> FindEmpSalGreaterThen5000(){
		List<Employee> findEmpSalGreaterThen5000 = Erepo.findByEmpsalaryGreaterThan();
		return findEmpSalGreaterThen5000;
	}


}
