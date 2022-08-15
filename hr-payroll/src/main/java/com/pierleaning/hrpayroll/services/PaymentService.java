package com.pierleaning.hrpayroll.services;

import com.pierleaning.hrpayroll.entities.Payment;
import com.pierleaning.hrpayroll.entities.Worker;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

	public Payment getPayment(int workerId, int days) {
		Worker worker;

		throw new UnsupportedOperationException("not implemented!");

//		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
