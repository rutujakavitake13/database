package com.example.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.database.model.transaction;

public interface transactionRepository extends JpaRepository<transaction, Integer>{

}
