package test2;

import java.util.Scanner;

public class TwinPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int res1, res2;
		int counter = 0;

		for (int i = 2; i <= num1 / 2; i++) {
			res1 = num1 % i;

			if (res1 == 0) {
				counter++;
				System.out.println(num1 + " is not a prime number.");
				break;
			}
		}
		if (counter == 0) {
			for (int j = 2; j <= num2 / 2; j++) {
				res2 = num2 % j;

				if (res2 == 0) {
					counter++;
					System.out.println(num2 + " is not a prime number.");
					break;
				}
			}
		}
		if (counter != 0)
			System.out.println(num1 + " and " + num2 + " are not Twin prime numbers.");
		else {
			if (num1 - num2 == 2 || num2 - num1 == 2)
				System.out.println(num1 + " and " + num2 + " are Twin prime numbers.");
			else
				System.out.println(num1 + " and " + num2 + " are not Twin prime numbers.");
		}

	}

}
