package com.example.Hospital.Management.System;

import com.example.Hospital.Management.System.entity.*;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class HospitalManagementSystemApplication {

	public static void main(String[] args) {

		Person person = new Person.Builder(234324)
				.setfName("Marcell").setlName("Pather")
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

		Account account = new Account();
		account.setAccountId("153 6754 654");
		account.setBalance(2000000.00);
		account.setPaymentMethod("Card payment");

		System.out.println(account.toString());

		Invoice invoice = new Invoice();
		invoice.setInvoiceNum(876-87656-765);
		invoice.setDetails(account);

		System.out.println(invoice.toString());

		Statement statement = new Statement();
		statement.setStatementNum(7454);
		statement.setDetails(account);

		System.out.println(statement.toString());
	}
}