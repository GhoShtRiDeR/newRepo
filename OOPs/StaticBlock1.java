package com.OOPs;

public class StaticBlock1 {
	
	static {
		System.out.println("it's static yo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" main ");
	}
	static {
		System.out.println("it's static again yo");
	}
}
