package com.subrat.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.subrat.models.Payment;
@Service
@Profile("prod")
public class CreditCardPaymentService implements PaymentService {

	@Override
	public void processPayment(Payment p) {

		IO.println("Processing Credit Card Payment of "+p.getAmount());
	}

}
