package com.subrat.sbeans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("rr")
@Data
@ConfigurationProperties(prefix = "b.subrat")
public class Runner {
	@Autowired
	private List<Book> b;

}
