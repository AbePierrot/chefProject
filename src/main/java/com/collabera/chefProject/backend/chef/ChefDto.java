package com.collabera.chefProject.backend.chef;

public class ChefDto {
	private long id;
	private String firstName;
	private String lastName;
	private String address;
	
	public ChefDto() {}

	public ChefDto(long id, String firstName, String lastName, String address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Chef toEntity() {
		return new Chef(id, firstName, lastName, address);
	}
}