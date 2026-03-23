package com.subrat.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.subrat.sbeans.Notification;
@Service
@Profile("prod")
public class PushNotificationService implements NotificationService {

	@Override
	public void sendNotification(Notification n) {
	    IO.println("Sending Push to"+n.getRecipient()+" "+n.getMesage());		

	}

}
