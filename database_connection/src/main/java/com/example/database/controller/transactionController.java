package com.example.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.database.model.transaction;
import com.example.database.service.itrans_stat;

public class transactionController {
	@Autowired
    private itrans_stat itrans_stat;

    @GetMapping("/transact")
    public String findCities(Model model) {

        List<transaction> stat = (List<transaction>) itrans_stat.findAll();

        model.addAttribute("cities", stat);

        return "transt";
	
}
}