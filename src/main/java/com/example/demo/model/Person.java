package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/*
 * VIDEO 7 annotation used to show that the class is an entity
 * 
 * @Entity 
 *  ⬇ ⬇ ⬇ ⬇ ⬇ ⬇
 */
@Entity 
public class Person {
	
	@Id
	private int idPerson;
	
	@Column(name="name", length=250)
	private String name;
	
	public int getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
