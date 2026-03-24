package com.subrat.models;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Payment {
	private int id;
	private int amount;
	private String method;
}
