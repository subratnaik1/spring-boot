package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("emp")
public class Employee {
	@Value("${emp.val.ename}")
	public String ename;
	@Value("${emp.val.eid}")
	public String eid;
	@Value("${emp.val.msalary}")
	public int msalary;
	@Value("${emp.val.bamount}")
	public int bamount;
	
}
