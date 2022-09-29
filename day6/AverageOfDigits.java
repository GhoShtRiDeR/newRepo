package com.day6;

import java.util.Scanner;

public class AverageOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a multi digit number: ");
		int num = sc.nextInt();
		int count = 0, sum = 0;
		while (num > 0) {

			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			count++;

		}
		double avg = (double) sum / count;
		System.out.println("Average of Digits: " + avg);
	}

}
