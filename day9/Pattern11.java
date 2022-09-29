package com.day9;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 1;
		char ch = 'A';
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 1) {
					System.out.print(t++ + " ");
				} else
					System.out.print(ch++ + " ");

			}
			t = 1;
			ch = 'A';
			System.out.println();
		}
	}

}
