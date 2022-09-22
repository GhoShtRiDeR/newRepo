package test3;

import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int firstPart, secondPart;
		int sq = num * num;
		int temp = sq;
		int countDigit = 0;
		int div = 1;
		while (temp > 0) {
			countDigit++;
			temp = temp / 10;
		}
		if (num == sq) {
			System.out.println(num + " is a Kaprekar Number.");
		}

		else if (num > 1 && countDigit % 2 == 0) {
			for (int i = 1; i <= countDigit / 2; i++) {
				div = div * 10;
			}
			firstPart = sq / div;
			secondPart = sq % div;

			if (firstPart + secondPart == num)
				System.out.println(num + " is a Kaprekar Number.");
			else
				System.out.println(num + " is not a Kaprekar Number.");
		} else {
			for (int i = 1; i <= countDigit / 2; i++) {
				div = div * 10;
			}
			firstPart = sq / div;
			secondPart = sq % div;
			if (firstPart == 0 || secondPart == 0)
				System.out.println(num + " is not a Kaprekar Number.");
			else if (firstPart + secondPart == num)
				System.out.println(num + " is a Kaprekar Number.");
			else {
				div = div * 10;
				firstPart = sq / div;
				secondPart = sq % div;
				temp = firstPart + secondPart;
				if (firstPart == 0 || secondPart == 0)
					System.out.println(num + " is not a Kaprekar Number.");
				else if (temp == num)
					System.out.println(num + " is a Kaprekar Number.");
				else
					System.out.println(num + " is not a Kaprekar Number.");
			}

		}

	}

}
