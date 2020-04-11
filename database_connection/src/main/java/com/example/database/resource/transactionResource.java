package com.example.database.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.model.transaction;
import com.example.database.repository.transactionRepository;

@RestController
@RequestMapping(value = "/rest/transaction")
public class transactionResource {
	
	@Autowired
	transactionRepository transaction_repository;
	
	@GetMapping(value = "/all")
	public List<transaction> getAll(){
		return transaction_repository.findAll();
	}
	
	@PostMapping(value = "/load")
	public List<transaction> persist(@RequestBody final transaction trans){
		transaction_repository.save(trans); 
		return transaction_repository.findAll();

	}
	
}
