package com.subrat.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@ConfigurationProperties(prefix = "emp.info")
@Data
public class Employee {

	private int id;
	private String name;
	private int salary;
	private String skills[];
	private List<String> plist;
	private Set<String> tools;
	private Map<String, Integer> experience;
	private Address address;

}
