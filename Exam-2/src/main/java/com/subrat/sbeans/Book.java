package com.subrat.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component("book")
@Data
public class Book {

	private String name;
}
