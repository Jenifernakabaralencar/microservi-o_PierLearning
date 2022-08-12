package com.ricardo.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.ricardo.hrpayroll.entities.Payment;
import com.ricardo.hrpayroll.entities.Worker;

@Service
public class PaymentService {

	public Payment getPayment(int workerId, int days) {
		Worker worker;

		throw new UnsupportedOperationException("not implemented!");

//		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
