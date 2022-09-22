package test2;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int bin = sc.nextInt();
		int rem, power = 1, decimal = 0;
		while (bin > 0) {
			rem = bin % 10;
			if (rem == 1 || rem == 0) {

				decimal = decimal + rem * power;
				power = power * 2;

			} else {
				break;
			}
			bin = bin / 10;
		}
		System.out.print(decimal);
	}

}
