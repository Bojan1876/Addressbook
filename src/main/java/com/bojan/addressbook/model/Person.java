package com.bojan.addressbook.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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

	@OneToMany(mappedBy = "person", fetch = FetchType.EAGER)
	private List<Phone> phones;

	/*public Person() {
	}

	public Person(Long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		phones = new ArrayList<>();
	}
*/
	@Override
	public String toString() {
		String res = "Person: " + id + " " + firstName + " " + lastName + "\n ";
		if (phones != null) {
			for (Phone num : phones) {
				res += "Phone:" + num.getNumber() + "\n";
			}
		}
		return res;
	}

}
