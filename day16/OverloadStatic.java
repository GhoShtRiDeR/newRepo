package com.day16;

public class OverloadStatic {
	
	static void method() {
		System.out.println(true);
	}
	static void method(int yo) {
		System.out.println(yo);
	}
	static float method(float yo) {
		return yo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadStatic.method();
		float x=OverloadStatic.method(4.44f);
		System.out.println(x);
		OverloadStatic.method(33);
		

	}

}
