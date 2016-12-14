package com.bojan.addressbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bojan.addressbook.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
