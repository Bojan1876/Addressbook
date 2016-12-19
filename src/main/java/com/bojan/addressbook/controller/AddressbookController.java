package com.bojan.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bojan.addressbook.repository.PersonRepository;

@Controller
public class AddressbookController {
	@Autowired
	PersonRepository entryRepository;

	@GetMapping("/addressbook-mvc")
	public String handle(Model model) {
		model.addAttribute("entries", entryRepository.findAll()); 
		return "addressbook-mvc";
	}
}
