package com.cognixia.jump.arrays;

import java.time.LocalDate;

public class Pet {

	private String name;
	private LocalDate dob; // Like LocalDateTime, but only stores date
	private String type;

	public Pet() {
		this("N/A", LocalDate.now(), "N/A");
	}

	public Pet(String name, LocalDate dob, String type) {
		super();
		this.name = name;
		this.dob = dob;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", dob=" + dob + ", type=" + type + "]";
	}

}
