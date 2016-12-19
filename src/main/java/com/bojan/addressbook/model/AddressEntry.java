package com.bojan.addressbook.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "ADDRESSENTRY")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddressEntry {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToMany(mappedBy = "entry")
	private List<Detail> details;

}
