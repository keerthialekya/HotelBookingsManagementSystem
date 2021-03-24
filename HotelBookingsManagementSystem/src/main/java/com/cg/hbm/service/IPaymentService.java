package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.dto.Payment;

public interface IPaymentService {
	
	
	
	public Payment addPayment(Payment payment);

	public List<Payment> showAllPayments();

	public Payment showPayment(int payment_id);

	public Payment removePayment(int payment_id);

	public Payment updatePayment(Payment payment);
	


}
	
	
	
	
