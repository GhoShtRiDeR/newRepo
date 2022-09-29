package com.day16;

public class TryMainMethodOverloading {

	public static void main(String[] s) {
		// TODO Auto-generated method stub
		System.out.println(true);
		main();
		main(7);
		main(76.78f);
		//main("as",7);
	}
	public static void main() {
		// TODO Auto-generated method stub
		System.out.println(false);
	}
	public static void main(int args) {
		// TODO Auto-generated method stub
		System.out.println(args);
	}
	public static void main(float c) {
		// TODO Auto-generated method stub
		System.out.println(c);
	}
	public static void main(String[] args,int x) {
		// TODO Auto-generated method stub
		System.out.print(true);
	}
}
