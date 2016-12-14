package com.bojan.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bojan.addressbook.model.Person;
import com.bojan.addressbook.repository.PersonRepository;

@RestController
public class PersonRestController {
	@Autowired
	PersonRepository personRepository;

	@RequestMapping("/persons")
	List<Person> persons() {
		return personRepository.findAll();
	}
}
