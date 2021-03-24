package com.cg.hbm.controller;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hbm.dto.Payment;
import com.cg.hbm.service.IPaymentService;


@RestController
@RequestMapping("/payment")
public class MyController {
	
	@Autowired
	IPaymentService iservice;
	@GetMapping
	public List<Payment> showAllPayments() {
		return iservice.showAllPayments();
	}
	
	
	@PostMapping
	public Payment addPayment(@RequestBody Payment payment) {
		return iservice.addPayment(payment);
	}
	@DeleteMapping("/{payment_id}")
	public Payment removePayment(@PathVariable int payment_id){
		return iservice.removePayment(payment_id);
	}
	@PutMapping
	public Payment updatePayment(@RequestBody Payment payment){
		return iservice.updatePayment(payment);
	}
	
	@GetMapping("/{payment_id}")
	
	public ResponseEntity<Payment> showPayment(@PathVariable int payment_id) {
		Payment h=iservice.showPayment(payment_id);
		if(h!=null)
			return new ResponseEntity<Payment>(h,HttpStatus.OK); 
		else
			return new ResponseEntity<Payment>(HttpStatus.NOT_FOUND);
	
	}
	
}