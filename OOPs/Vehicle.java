package com.OOPs;

public class Vehicle {

	int modelNo;
	String name;
	double price;

	public static void main(String[] a) {
		Vehicle v = new Vehicle();
		v.modelNo = 1234;
		v.name = "TaTa Nexon";
		v.price = 1500000.00;

		System.out.println("Model Number: " + v.modelNo);
		System.out.println("Name: " + v.name);
		System.out.println("Price: " + v.price);
	}

}
