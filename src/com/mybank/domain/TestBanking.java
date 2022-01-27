package com.mybank.domain;

public class TestBanking {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("Luis ", "Ramos ");
		Customer c2 = new Customer("Smith ", "Jane ");
		Account a1 = new Account(500);
		Account a2 = new Account(324.88);
		Bank b1= new Bank(); //cremos banco
		
		b1.addCustomer("Simms ", "Jane"); //creamos cliente para el banco con el metodo addcustomer.
		b1.addCustomer("Bryant ", "Owen");
		b1.addCustomer("Soley ", "Tim ");
		b1.addCustomer("Soley ", "Maria ");
		
		System.out.println("Creando el cliente " + c1.getFirstName() + c1.getLastName());
		System.out.println("Creando su cuenta bancaria con saldo " + a1.getBalance());
		
		a1.withdraw(-150.00); 
		
		System.out.println("Sacar " + a1.getBalance());
		
		a1.deposit(22.50);
		
		System.out.println("Ingresar " + a1.getBalance());
		
		a1.withdraw(-47.62); 
		
		System.out.println("Sacar " + a1.getBalance());
		
		a1.withdraw(400);
		
		System.out.println("Sacar " + a1.getBalance());
		
		System.out.println(c2.getFirstName() + " " + c2.getLastName() + " " + "tiene un saldo de " + a2.getBalance());
		
		
		for (int i = 0; i < b1.getNumberOfCustomers(); i++) { //usamos for para recorrer el array.
			
			System.out.println("Cliente " + (i+1) + " es " + b1.getCustomer(i).getFirstName() + b1.getCustomer(i).getLastName());
			
		}
		//publicar en github
		
	}

}