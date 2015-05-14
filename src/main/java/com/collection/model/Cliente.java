package com.collection.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Cliente {

	
	@Min(0)
	@Max(120)
	private Integer id;
	
	@Min(0)
	@Max(120)
	private Integer age;
	
	@NotNull
	@Size(min=1,max=20)
	private String name;
	
	@NotNull
	@Size(min=1,max=20)
	private String lastname;
	private String email;
	
	@Min(0)
	@Max(120)
	private String telephone;
	private String address;
	
	@Min(0)
	@Max(120)
	private String dni;
	
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	private Gender gender;

	/*P2*/
	public enum Gender {
		MALE, FEMALE
	}

	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
