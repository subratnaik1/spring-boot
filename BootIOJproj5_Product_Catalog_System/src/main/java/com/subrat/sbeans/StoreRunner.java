package com.subrat.sbeans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("sr")
@Data
@ConfigurationProperties(prefix="st.subrat")
public class StoreRunner {
	
	private List<Product> products;

}
