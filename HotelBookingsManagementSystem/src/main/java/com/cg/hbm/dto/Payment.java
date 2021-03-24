package com.cg.hbm.dto;

import javax.persistence.*;
@Entity
@Table(name="Payment")


public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(name="payment_id")
	private int payment_id;
	//@Column(name="booking_id")
	private int booking_id;
	//@Column(name="transaction_id")
	private int transaction_id;
	
	
	public  Payment(){
		
	}
	public Payment(int payment_id, int booking_id, int transaction_id) {
		super();
		this.payment_id = payment_id;
		this.booking_id = booking_id;
		this.transaction_id = transaction_id;
	}
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", booking_id=" + booking_id + ", transaction_id=" + transaction_id
				+ "]";
	}
	
	
}


