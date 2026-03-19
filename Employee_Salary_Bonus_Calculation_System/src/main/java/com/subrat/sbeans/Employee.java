package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("emp")
public class Employee {
	@Value("${emp.val.ename}")
	private String ename;
	@Value("${emp.val.eid}")
	private String eid;
	@Value("${emp.val.msalary}")
	private int msalary;
	@Value("${emp.val.bamount}")
	private int bamount;
	
}
