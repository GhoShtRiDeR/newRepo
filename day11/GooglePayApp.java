package com.day11;

public class GooglePayApp {
	
	public void transferAmount(float amount,GetterSetterMethod acc) {
		
		System.out.println("Transaction in Progress.....");
		acc.setBalance(acc.getBalance()-amount);
		System.out.println("Amount transferred successfully."
				+ "\nUpdated Balance:- "+acc.getBalance()+"\nFrom account number "+acc.getAccNo());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetterSetterMethod ob=new GetterSetterMethod();
		
		ob.acceptAccountDetails(1766523, "Savlon Bhai", 999999);
		
		GooglePayApp ob1=new GooglePayApp();
		ob1.transferAmount(50000, ob);
	}

}
