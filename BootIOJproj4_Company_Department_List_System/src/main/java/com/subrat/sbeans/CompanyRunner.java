package com.subrat.sbeans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cr")
@Data
@ConfigurationProperties(prefix="dep.subrat")
public class CompanyRunner {
	@Autowired
	private List<Department> dept;
}
