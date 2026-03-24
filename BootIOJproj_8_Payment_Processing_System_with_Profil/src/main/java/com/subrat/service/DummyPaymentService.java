package com.subrat.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.subrat.models.Payment;
@Service
@Profile("dev")
public class DummyPaymentService implements PaymentService {

	@Override
	public void processPayment(Payment p) {
		IO.println("Processing Dummy Payment of "+p.getAmount());

	}

}
