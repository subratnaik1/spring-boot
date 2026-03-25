package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("prod")
public class Product {
	@Value("${prod.val.name}")
	private String name;
	@Value("${prod.val.price}")
	private int price;
	@Value("${prod.val.discount}")
	private int discount;
	
}
