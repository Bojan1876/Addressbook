package com.bojan.addressbook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String address;

	@ManyToOne
	@JoinColumn(name = "PERSONID")
	private Person person;

	@JsonIgnore
	public Person getPerson() {
		return person;
	}

	@Override
	public String toString() {
		return address + "\n";
	}
}
