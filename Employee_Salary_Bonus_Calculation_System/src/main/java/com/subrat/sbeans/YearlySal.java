package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("ys")
@Data
public class YearlySal {
	@Value("#{emp.msalary*12+emp.bamount}")
	private  int yearlysalary;
	@Autowired
	private Employee e;
}
