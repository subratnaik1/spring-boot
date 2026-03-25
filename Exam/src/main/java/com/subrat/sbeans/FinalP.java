package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("fp")
@Data
public class FinalP {

	@Value("#{prod.price*12+prod.discount}")
	private int finalPrice;
	@Autowired
	private Product p;
}
