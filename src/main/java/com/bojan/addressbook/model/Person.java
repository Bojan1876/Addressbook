package com.bojan.addressbook.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstName;

	private String lastName;

	@OneToMany(mappedBy = "person")
	private List<Phone> phones;
	
	@OneToMany(mappedBy = "person")
	private List<Email> emails;
	
	@OneToMany(mappedBy = "person")
	private List<Address> addresses;
	
	@OneToMany(mappedBy = "person")
	private List<Note> notes;

	

}
