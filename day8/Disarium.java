package com.day8;

import java.util.Scanner;

public class Disarium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int initial = num;
		int rem, sum = 0, count = 0;
		while (num > 0) {
			rem = num % 10;
			count++;
			num = num / 10;
		}
		num = initial;

		for (int i = count; i >= 1; i--) {
			sum = sum + (int) Math.pow(num % 10, i);
			num = num / 10;

		}
		if (sum == initial) {
			System.out.println(initial + " is a Disarium number.");
		} else
			System.out.println(initial + " is not a Disarium number.");

	}

}
