package com.day11;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetterMethod obj=new GetterSetterMethod();
		obj.setName("JJ Ghosh");
		System.out.println(obj.getName());
		
		obj.setAccNo(101007465);
		System.out.println("Account Number: "+obj.getAccNo());
		
		obj.setBalance(890012.89f);
		System.out.println("Balance:- "+obj.getBalance());
	}

}
