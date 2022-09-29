package com.day9;

import java.util.Scanner;

public class Sum_ofEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a multiple digit number: ");
		long num = sc.nextLong();
		long temp = num;
		int sum = 0;
		while (num > 0) {
			int r = (int) num % 10;
			if (r % 2 == 0)
				sum = sum + r;
			num = num / 10;

		}
		System.out.println(sum);

	}

}
