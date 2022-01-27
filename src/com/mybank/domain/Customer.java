package com.mybank.domain;

public class Customer {

	//Atributos
	private String firstName = "";
	private String lastName = "";
	private Account account;
	
	//Constructores
	public Customer (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = new Account(0);
		
	}
	
	//Metodos
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
		
	}
}