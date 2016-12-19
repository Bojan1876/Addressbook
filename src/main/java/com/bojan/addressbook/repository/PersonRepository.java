package com.bojan.addressbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bojan.addressbook.model.AddressEntry;

public interface PersonRepository extends JpaRepository<AddressEntry, Long> {
}
