package com.cg.hbm.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.hbm.dto.Payment;
import com.cg.hbm.exception.PaymentNotFoundException;
import com.cg.hbm.repository.IPaymentRepository;

@Service
@Transactional
public class IPaymentServiceJpa implements IPaymentService {
	@Autowired
	IPaymentRepository repository;
	@Override
	public Payment addPayment(Payment payment) {
		// TODO Auto-generated method stub
		repository.save(payment);
		
		return payment;
	}
	@Override
	public List<Payment> showAllPayments() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	@Override
	public Payment showPayment(int payment_id) {
		if(repository.findById(payment_id).isPresent()) {
			return repository.findById(payment_id).get();
		}
		else {
		return null;
	}
	}
	@Override
	public Payment removePayment(int payment_id) {
		Optional<Payment>op=repository.findById(payment_id);
		if(op.isPresent()) {
			Payment obj=op.get();
			repository.deleteById(payment_id);
			System.out.println("id is present");
			return null;
		}
		return null;
		
	}
	@Override
	public Payment updatePayment(Payment payment) {
		repository.save(payment);
		return payment;
	}

	
}