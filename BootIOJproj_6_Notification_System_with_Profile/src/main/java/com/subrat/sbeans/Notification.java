package com.subrat.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Notification {
	private int id;
	private String mesage;
	private String recipient;
}
