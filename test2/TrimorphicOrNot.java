package test2;

import java.util.Scanner;

public class TrimorphicOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		long cube = num * num * num;

		if ((int)cube % 10 == num % 10)
			System.out.println(num + " is a trimorphic number.");
		else
			System.out.println(num + " is not a trimorphic number.");

	}

}
