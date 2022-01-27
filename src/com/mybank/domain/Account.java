package com.mybank.domain;

public class Account {
	
	//atributos
	protected double balance;
	
	//constructores
	
	protected Account (double initBalance) { //creamos este constructor para comprobar siempre que haya saldo mayor que 0.
		if (initBalance > 0) {
			this.balance = initBalance;
		}
	}
	//metodos
	
	public void setBalance(double balancetoset) { //cambiar el valor del balance. / el set es para que en otro clase distina pueda acceder al balance.
		this.balance = balancetoset;
	}
	
	public double getBalance() { //hacemos get para poder sacar el valor privado de balance.
		return balance;
	}
	
	public boolean deposit (double amt) {
		balance = balance + amt;
		return true;
	}

	
	public boolean withdraw (double amt) { //amt = cantidad retirada
		if (amt <= balance) { 
			//si el valor 
			balance = balance - amt;
			return true;
		}else {
			return false;
		}
	}	
}
