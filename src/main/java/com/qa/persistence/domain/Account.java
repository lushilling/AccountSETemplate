package com.qa.persistence.domain;

public class Account {
	
	//This class needs to have:
	//An id
	private int id;
	//An Account Number
	private int accountNumber;
	//A First Name
	private String firstName;
	//A last Name
	private String lastName;
	
	public Account(int id, int accountNumber, String firstName, String lastName) {
		this.id = id;
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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
	
}
