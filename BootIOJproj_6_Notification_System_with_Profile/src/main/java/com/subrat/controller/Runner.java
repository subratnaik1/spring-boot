package com.subrat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.sbeans.Notification;
import com.subrat.service.NotificationService;

@Component
public class Runner implements CommandLineRunner{
	@Autowired
	private NotificationService notificationService;
	@Autowired
	private Notification n;
	
	@Override
	public void run(String... args) throws Exception {
		
		n.setId(1);
		n.setMesage("hello");
		n.setRecipient("hellow Subrat");
		notificationService.sendNotification(n);
		
	}
	
}
