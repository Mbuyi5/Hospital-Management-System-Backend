package com.example.Hospital.Management.System;

import com.example.Hospital.Management.System.entity.Contact;
import com.example.Hospital.Management.System.entity.Person;
import com.example.Hospital.Management.System.entity.Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalManagementSystemApplication {

	public static void main(String[] args) {

		Person person = new Person.Builder(234324)
				.setfName("Test").setlName("Pather")
				.setDate("1998/08/21")
				.build();
		System.out.println(person.toString());

		Address address = new Address.Builder("25 Windsor Street")
				.setPostcode("7850")
				.setDetails(person)
				.build();

		System.out.println(address.toString());

		Contact contact = new Contact.Builder(44332434)
				.setHomePhone(54354543)
				.setEmail("mpather47@gmail.com")
				.setDetails(person)
				.build();
		System.out.println(contact.toString());
	}
}