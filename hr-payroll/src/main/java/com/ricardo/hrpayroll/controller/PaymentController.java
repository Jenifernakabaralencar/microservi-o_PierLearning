package com.ricardo.hrpayroll.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.ricardo.hrpayroll.entities.Payment;
import com.ricardo.hrpayroll.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	@Autowired
	private PaymentService payment;	

	@GetMapping("/{id}/{days}")
	public ResponseEntity<Payment> get(@PathVariable int id, @PathVariable int days) {
		Payment payment = this.payment.getPayment(id, days);
	
		return ResponseEntity.ok(payment);
	}
}
