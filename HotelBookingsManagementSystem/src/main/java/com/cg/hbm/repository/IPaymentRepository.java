package com.cg.hbm.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hbm.dto.Payment;


//payment repository
@Repository
public interface IPaymentRepository extends JpaRepository<Payment,Integer >{

	

	
}