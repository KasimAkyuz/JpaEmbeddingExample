package com.akyuz.embeddable.pojo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PersonelEmbed")
public class Personel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int personelİd;
	@Column
	private String name;
	@Column
	@Embedded
	private Contact contact;

	public Personel(String name, Contact contact) {

		this.name = name;
		this.contact = contact;
	}

	public Personel() {
	}

	public int getPersonelİd() {
		return personelİd;
	}

	public void setPersonelİd(int personelİd) {
		this.personelİd = personelİd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
