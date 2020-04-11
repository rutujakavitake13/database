package com.example.database.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.database.model.transaction;
import com.example.database.repository.transactionRepository;

public class trans_service {
	
	@Autowired
    private transactionRepository repository;

    public List<transaction> findAll() {

        return (List<transaction>) repository.findAll();

}
}