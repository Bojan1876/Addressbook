package com.bojan.addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bojan.addressbook.model.Person;
import com.bojan.addressbook.repository.PersonRepository;

@Component
public class PersonCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		for (Person p : this.personRepository.findAll())
			System.out.println(p.toString());
		
	}
	@Autowired
	PersonRepository personRepository;
	

}

