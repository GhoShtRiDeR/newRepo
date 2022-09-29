package com.day9;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char i = 'A'; i <= 'D'; i++) {
			for (char j = 'D'; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
