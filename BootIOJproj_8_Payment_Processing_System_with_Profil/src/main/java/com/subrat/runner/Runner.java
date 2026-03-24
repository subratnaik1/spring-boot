package com.subrat.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.models.Payment;
import com.subrat.service.PaymentService;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private PaymentService paymentService;
	@Autowired
	private Payment payment;

	@Override
	public void run(String... args) throws Exception {
     int id=Integer.parseInt(IO.readln("enter id"));
     int amount=Integer.parseInt(IO.readln("enter amount"));
     String method=IO.readln("enter method of payment");
     payment.setId(id);
     payment.setAmount(amount);
     payment.setMethod(method);
     
     paymentService.processPayment(payment);
     
	}

}
