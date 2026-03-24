package com.subrat.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.subrat.models.Payment;
@Service
@Profile("tests")
public class UpiPaymentService implements PaymentService {

	@Override
	public void processPayment(Payment p) {
		IO.println("Processing UPI Payment of "+p.getAmount());
	}

}
