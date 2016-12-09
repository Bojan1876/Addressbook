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
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String number;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "PERSONID")
	private Person person;

	/*public Phone(String numberphone, Person persons) {
		this.number = numberphone;
		this.person = persons;
	}

	public Phone() {
	}*/

	@Override
	public String toString() {
		return "Phone [" + number + "]";
	}

}