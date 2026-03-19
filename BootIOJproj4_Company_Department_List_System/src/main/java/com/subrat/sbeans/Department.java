package com.subrat.sbeans;


import org.springframework.stereotype.Component;

import lombok.Data;

@Component("dept")
@Data
public class Department {
	
	private int deptId;
	private String deptName;
}
