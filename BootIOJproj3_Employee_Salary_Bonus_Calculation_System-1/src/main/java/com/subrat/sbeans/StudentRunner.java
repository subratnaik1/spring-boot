package com.subrat.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("sr")
@Data
@ConfigurationProperties("st.subrat")
public class StudentRunner {
	private int id;
	private String name;
	private String course;
	private int fee;
}
