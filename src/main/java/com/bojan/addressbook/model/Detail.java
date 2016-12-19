package com.bojan.addressbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author bmartinovic
 *
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "DETAIL")
public class Detail {
	
	public enum Type{
		PHONE, ADDRESS, EMAIL, NOTE
	}
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "DETAILTYPE")
	@Enumerated(EnumType.STRING)
	private Type type;
	
	@Column(name = "DETAILVALUE")
	private String value;
	
	@ManyToOne
	@JoinColumn(name = "DETAILENTRY")
	private AddressEntry entry;
	
	@JsonIgnore
	public AddressEntry getEntry(){
		return entry;
	}
}
