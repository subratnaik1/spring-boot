package com.subrat.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pr")
@Data
public class Product {
	private int id;
	private String name;
	private int price;
}
