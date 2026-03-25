package com.subrat.repositary;

import java.util.List;

import com.subrat.sbeans.Employee;

public interface IEmployeeDAO {
	int insertemp(Employee employee)throws Exception;
	List<Employee> getAllemployee() throws Exception;
	int deleteEmp(int empId) throws Exception;


}
