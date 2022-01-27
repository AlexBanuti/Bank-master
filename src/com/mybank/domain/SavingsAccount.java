package com.mybank.domain;

public class SavingsAccount extends Account {
	
	//atributos
	private double interestRate;

	//constructores
	public SavingsAccount(double initBalance, double interestRate){
		
		super(initBalance);
		this.interestRate = interestRate;
	}
	
	//metodos

}
