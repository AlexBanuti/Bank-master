package com.mybank.domain;

public class CheckingAccount extends Account {

	private double overdraftAmount;
	
	public CheckingAccount (double initBalance, double overdraftAmount) {
		super(initBalance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public CheckingAccount(double initBalance) { //Llame al primer constructor con el par�metro initBalance y
		//utilice el valor 0.0 para el par�metro overdraftAmount.
		this(initBalance, 0.0);
		}
	
	//METODOS
	
}
