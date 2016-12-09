package com.bojan.addressbook.repository;



import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bojan.addressbook.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
	List<Person> findAll();
	
	//List<Person> findById();

}

