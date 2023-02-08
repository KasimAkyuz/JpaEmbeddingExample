package com.akyuz.embeddable.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.akyuz.embeddable.pojo.Contact;
import com.akyuz.embeddable.pojo.Personel;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		
		Personel personel = new Personel("Kasım", new Contact(553451121, "kasım@gmail.com"));
		
		manager.getTransaction().begin();
		manager.persist(personel);
		manager.getTransaction().commit();
		
	}

}
