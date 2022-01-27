package com.mybank.domain;

public class CheckingAccount extends Account {

	private double overdraftAmount;
	
	public CheckingAccount (double initBalance, double overdraftAmount) {
		super(initBalance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public CheckingAccount(double initBalance) { //Llame al primer constructor con el parámetro initBalance y
		//utilice el valor 0.0 para el parámetro overdraftAmount.
		this(initBalance, 0.0);
		}
	
	//METODOS
	public boolean withdraw(double amount) {
		boolean result = true;
		if ( balance < amount ) {
		double overdraftNeeded = amount - balance;
		if ( overdraftAmount < overdraftNeeded ) {
		result = false;
		} else {
		balance = 0.0;
		overdraftAmount -= overdraftNeeded;
		}
		} else {
		balance -= amount;
		}
		return result;

	}
}