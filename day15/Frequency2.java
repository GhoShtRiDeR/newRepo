package com.day15;

import java.util.Scanner;

public class Frequency2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long temp = num;
		int f = 0;
		for (long i = num; i > 0; i = i / 10) {
			long r1 = i % 10;
			f = 0;

			boolean flag = false;
			for (long k = i / 10; k > 0; k = k / 10) {
				long r = k % 10;
				if (r == r1) {
					flag = true;
					break;
				}
			}
			if (flag == false) {

				for (long j = temp; j > 0; j /= 10) {
					long r2 = j % 10;
					if (r1 == r2) {
						f++;
					}
				}
			}
			if (f > 0) {
				System.out.println(r1 + " = frequency is " + f);
			}

		}
	}

}
