package com.mybank.domain;

public class Bank {
	
	//atributos
	
	private Customer[] customers; //le creamos un array.
	private int numberOfCustomers; //un int para contador de nr.clientes.
	
	//constructores
	
	public Bank () { //creamos un constructor, para iniciar con un valor 10.
		customers = new Customer[10];
		numberOfCustomers = 0; //numero actual de clientes.
	}
	
	//metodos 
	public void addCustomer (String firstName, String lastName) {
		int i = numberOfCustomers++;
		customers[i] = new Customer(firstName, lastName);
		
		
		
//		customers[numberOfCustomers++] = c;
	
	}
	
	public int getNumberOfCustomers(){
		return numberOfCustomers;
	}

	public Customer getCustomer(int index) {
		return customers[index];
	}

}
