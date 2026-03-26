package com.subrat.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("add")
@Data
public class Address {
	private String city;
	private String state;
	private String pincode;
}
