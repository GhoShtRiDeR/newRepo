package com.OOPs;

public class StaticBlock2 {
	static {
		System.out.println("it's static yo");
	}
	//Initializer
	{
		System.out.println("it's the Initializer");
	}

	StaticBlock2() {
		System.out.println("it's the constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock2 ob = new StaticBlock2();
		StaticBlock2 ob1 = new StaticBlock2();
		// StaticBlock2 ob2=new StaticBlock2();

	}

}
