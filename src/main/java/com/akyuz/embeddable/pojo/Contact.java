package com.akyuz.embeddable.pojo;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {

	private int phoneNumber;
	private String email;

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Contact(int phoneNumber, String email) {

		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Contact() {
	}

}
